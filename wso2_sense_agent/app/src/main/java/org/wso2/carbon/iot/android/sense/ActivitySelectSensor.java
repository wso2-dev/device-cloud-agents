/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 */
package org.wso2.carbon.iot.android.sense;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import org.wso2.carbon.iot.android.sense.constants.AvailableSensors;
import org.wso2.carbon.iot.android.sense.constants.SenseConstants;
import org.wso2.carbon.iot.android.sense.events.input.Sensor.RealTimeSensorReader;
import org.wso2.carbon.iot.android.sense.register.RegisterActivity;
import org.wso2.carbon.iot.android.sense.register.SenseDeEnroll;
import org.wso2.carbon.iot.android.sense.scheduler.DataUploaderReceiver;
import org.wso2.carbon.iot.android.sense.scheduler.RealTimeSensorChangeReceiver;
import org.wso2.carbon.iot.android.sense.service.SenseScheduleReceiver;
import org.wso2.carbon.iot.android.sense.util.LocalRegister;
import org.wso2.carbon.iot.android.sense.util.SensorViewAdaptor;
import org.wso2.carbon.iot.android.sense.util.TempStore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import agent.sense.android.iot.carbon.wso2.org.wso2_senseagent.R;


/**
 * Activity for selecting sensors available in the device
 */

public class ActivitySelectSensor extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, SelectSensorDialog.SensorListListener {

    SharedPreferences sharedPreferences;
    SelectSensorDialog sensorDialog = new SelectSensorDialog();
    Set<String> selectedSensorSet = new HashSet<>();
    FloatingActionButton fbtnPublishData;
    FloatingActionButton fbtnAddSensors;
    ListView listView;
    SensorManager sensorManager;
    ArrayList<Sensor> sensors = new ArrayList<>();
    boolean check;

    RealTimeSensorReader sensorReader = null;
    RealTimeSensorChangeReceiver realTimeSensorChangeReceiver = new RealTimeSensorChangeReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_select_sensor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        listView = (ListView) findViewById(R.id.senseListContainer);

        registerReceiver(realTimeSensorChangeReceiver, new IntentFilter("sensorDataMap"));

        //Publish data
        fbtnPublishData = (FloatingActionButton) findViewById(R.id.publish);

        fbtnPublishData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Publishing data started", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                check = true;
                DataUploaderReceiver dataUploaderReceiver = new DataUploaderReceiver();
                dataUploaderReceiver.clearAbortBroadcast();
                dataUploaderReceiver.onReceive(getApplicationContext(), null);
            }
        });

        fbtnAddSensors = (FloatingActionButton) findViewById(R.id.addSensors);
        fbtnAddSensors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensorDialog.show(getFragmentManager(), "Sensor List");
            }
        });

        sharedPreferences = getSharedPreferences(SenseConstants.SELECTED_SENSORS, 0);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_select_sensor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            /**
             * unregister the sensors and broadcast receivers.
             * */
            unregisterSensors();
            unregisterReceivers();

            if (!LocalRegister.isExist(getApplicationContext())) {
                Intent activity = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(activity);
            }

            LocalRegister.removeUsername(getApplicationContext());
            LocalRegister.removeDeviceId(getApplicationContext());
            LocalRegister.removeServerURL(getApplicationContext());
            LocalRegister.setExist(false);
            Intent activity = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(activity);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.select) {
            sensorDialog.show(getFragmentManager(), "Sensor List");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onDialogPositiveClick(SelectSensorDialog dialog) {

        Log.d("Selected sensors", dialog.getSet().toString());
        selectedSensorSet = dialog.getSet();
        update();
        unregisterSensors();

        SenseScheduleReceiver senseScheduleReceiver = new SenseScheduleReceiver();
        senseScheduleReceiver.clearAbortBroadcast();
        senseScheduleReceiver.onReceive(this, null);

        /**
         * Get the selected sensors
         * Register them
         * */
        SensorViewAdaptor adaptor1 = new SensorViewAdaptor(getApplicationContext(), TempStore.realTimeSensors);
        adaptor1.notifyDataSetChanged();

        sensorReader = new RealTimeSensorReader(this, adaptor1);
        getSensors();

        for (Sensor s : sensors) {
            sensorManager.registerListener(sensorReader, s, SensorManager.SENSOR_DELAY_NORMAL);
        }


        realTimeSensorChangeReceiver.updateOnChange(adaptor1);
        listView.setAdapter(adaptor1);

    }

    public boolean update() {
        try {
            Log.d("Update", "Set the values to Shared Preferences");

            TempStore.realTimeSensors.clear();
            TempStore.sensorDataMap.clear();

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putStringSet(SenseConstants.SELECTED_SENSORS_BY_USER, selectedSensorSet);
            editor.apply();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void getSensors() {
        sensors.clear();
        for (String sensor : selectedSensorSet.toArray(new String[selectedSensorSet.size()])) {
            sensors.add(sensorManager.getDefaultSensor(AvailableSensors.getType(sensor.toLowerCase())));
        }
    }

    /**
     * This method will unregister all the registered sensors.
     * */
    public void unregisterSensors(){
        if (sensors.size()>0){
            for (Sensor s : sensors) {
                System.out.println(s.getName() +" Unregistered!");
                sensorManager.unregisterListener(sensorReader, s);
            }
        }
    }

    /**
     * This method unregisters the real-time broadcast receiver.
     * */
    public void unregisterReceivers(){
        unregisterReceiver(realTimeSensorChangeReceiver);
    }
}
