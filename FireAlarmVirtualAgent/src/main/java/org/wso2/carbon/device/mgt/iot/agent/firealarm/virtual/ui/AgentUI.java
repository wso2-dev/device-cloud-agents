/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.wso2.carbon.device.mgt.iot.agent.firealarm.virtual.ui;

import org.wso2.carbon.device.mgt.iot.agent.firealarm.virtual.core.AgentManager;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;

public class AgentUI extends javax.swing.JFrame {

    boolean isTemperatureRandomized, isHumidityRandomized;

    private javax.swing.JButton btnControl;
    private javax.swing.JButton btnView;
    private javax.swing.JCheckBox chkbxTemperatureRandom;
    private javax.swing.JCheckBox chkbxHumidityRandom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel pnlBulbStatus;
    private javax.swing.JSpinner spinnerHumidity;
    private javax.swing.JSpinner spinnerInterval;
    private javax.swing.JSpinner spinnerTemperature;
    private javax.swing.JTextField txtTemperatureMax;
    private javax.swing.JTextField txtHumidityMax;
    private javax.swing.JTextField txtTemperatureMin;
    private javax.swing.JTextField txtHumidityMin;
    // End of variables declaration

    /**
     * Creates new form AgentUI
     */
    public AgentUI() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlBulbStatus = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        chkbxTemperatureRandom = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTemperatureMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTemperatureMax = new javax.swing.JTextField();
        spinnerTemperature = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnControl = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        chkbxHumidityRandom = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtHumidityMin = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtHumidityMax = new javax.swing.JTextField();
        spinnerHumidity = new javax.swing.JSpinner();
        spinnerInterval = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virtual Agent");
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - 650 / 2, dim.height / 2 - 440 / 2);

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WSO2 IoT Virtual Agent");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Copyright (c) 2015, WSO2 Inc.");

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bulb Status");

        pnlBulbStatus.setBackground(new java.awt.Color(220, 220, 220));

        javax.swing.GroupLayout pnlBulbStatusLayout = new javax.swing.GroupLayout(pnlBulbStatus);
        pnlBulbStatus.setLayout(pnlBulbStatusLayout);
        pnlBulbStatusLayout.setHorizontalGroup(
                pnlBulbStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlBulbStatusLayout.setVerticalGroup(
                pnlBulbStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addComponent(pnlBulbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                  .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addComponent(jLabel3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(pnlBulbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(220, 220, 220));

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Temperature");

        chkbxTemperatureRandom.setText("Randomize Data");
        chkbxTemperatureRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxTemperatureRandomActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel7.setBackground(new java.awt.Color(220, 220, 220));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Min");

        txtTemperatureMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTemperatureMin.setText("20");
        txtTemperatureMin.setEnabled(false);
        txtTemperatureMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureMinActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Max");

        txtTemperatureMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTemperatureMax.setText("50");
        txtTemperatureMax.setEnabled(false);
        txtTemperatureMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureMaxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addComponent(jLabel5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(txtTemperatureMin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jLabel6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(txtTemperatureMax, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(txtTemperatureMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(txtTemperatureMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel6)
                                                  .addComponent(jLabel5))
                                .addGap(35, 35, 35))
        );

        spinnerTemperature.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        spinnerTemperature.setModel(new javax.swing.SpinnerNumberModel(30, 0, 100, 1));
        spinnerTemperature.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerTemperatureStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(spinnerTemperature))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(chkbxTemperatureRandom))
                                          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jSeparator1)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                              .addComponent(chkbxTemperatureRandom)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                              .addGap(0, 1, Short.MAX_VALUE))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(spinnerTemperature)))
                                          .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(253, 254, 209));

        jLabel20.setText("Agent Status:");
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        btnView.setText("View Device Data");
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });

        btnControl.setText("Control Device");
        btnControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnControlMouseClicked(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        lblStatus.setText("Not Connected");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addComponent(jLabel20)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(btnControl)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(btnView)
                                          .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                  .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                  .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(btnControl)
                                                                    .addComponent(lblStatus)))
                                .addContainerGap())
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Data Push Interval:");

        jLabel22.setText("Seconds");

        jPanel8.setBackground(new java.awt.Color(220, 220, 220));

        jLabel23.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Humidity");

        chkbxHumidityRandom.setText("Randomize Data");
        chkbxHumidityRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxHumidityRandomActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel9.setBackground(new java.awt.Color(220, 220, 220));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Min");

        txtHumidityMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHumidityMin.setText("20");
        txtHumidityMin.setEnabled(false);
        txtHumidityMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHumidityMinActionPerformed(evt);
            }
        });

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Max");

        txtHumidityMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHumidityMax.setText("50");
        txtHumidityMax.setEnabled(false);
        txtHumidityMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHumidityMaxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addComponent(jLabel24)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(txtHumidityMin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jLabel25)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(txtHumidityMax, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(txtHumidityMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(txtHumidityMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel25)
                                                  .addComponent(jLabel24))
                                .addGap(35, 35, 35))
        );

        spinnerHumidity.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        spinnerHumidity.setModel(new javax.swing.SpinnerNumberModel(30, 0, 100, 1));
        spinnerHumidity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerHumidityStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(spinnerHumidity))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(chkbxHumidityRandom))
                                          .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jSeparator5)
                                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                                              .addComponent(chkbxHumidityRandom)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                              .addGap(0, 1, Short.MAX_VALUE))
                                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                                              .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(spinnerHumidity)))
                                          .addContainerGap())
        );

        spinnerInterval.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        spinnerInterval.setModel(new javax.swing.SpinnerNumberModel(30, 5, 300, 5));
        spinnerInterval.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerIntervalStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                              .addComponent(jLabel7)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(spinnerInterval, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(jLabel22)
                                                                              .addGap(0, 0, Short.MAX_VALUE))
                                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                          .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(spinnerInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(12, 12, 12)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                              .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addContainerGap())
        );

        pack();

        setBulbStatus(false);
    }

    private void btnControlMouseClicked(java.awt.event.MouseEvent evt) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URI uri = new URI(AgentManager.getInstance().getDeviceMgtControlUrl());
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URI uri = new URI(AgentManager.getInstance().getDeviceMgtAnalyticUrl());
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void spinnerIntervalStateChanged(javax.swing.event.ChangeEvent evt) {
        try {
            int interval = Integer.parseInt(spinnerInterval.getValue().toString());
            AgentManager.getInstance().setInterval(interval);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid interval value", "Error", JOptionPane.ERROR_MESSAGE);
            spinnerTemperature.setValue(AgentManager.getInstance().getTemperature());
        }
    }

    private void chkbxTemperatureRandomActionPerformed(java.awt.event.ActionEvent evt) {
        isTemperatureRandomized = chkbxTemperatureRandom.isSelected();
        AgentManager.getInstance().setIsTemperatureRandomized(isTemperatureRandomized);
        spinnerTemperature.setEnabled(!isTemperatureRandomized);
        txtTemperatureMax.setEnabled(isTemperatureRandomized);
        txtTemperatureMin.setEnabled(isTemperatureRandomized);
    }

    private void chkbxHumidityRandomActionPerformed(java.awt.event.ActionEvent evt) {
        isHumidityRandomized = chkbxHumidityRandom.isSelected();
        AgentManager.getInstance().setIsHumidityRandomized(isHumidityRandomized);
        spinnerHumidity.setEnabled(!isHumidityRandomized);
        txtHumidityMax.setEnabled(isHumidityRandomized);
        txtHumidityMin.setEnabled(isHumidityRandomized);
    }

    private void spinnerTemperatureStateChanged(javax.swing.event.ChangeEvent evt) {
        if (!isTemperatureRandomized) {
            try {
                int temperature = Integer.parseInt(spinnerTemperature.getValue().toString());
                AgentManager.getInstance().setTemperature(temperature);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid temperature value", "Error", JOptionPane.ERROR_MESSAGE);
                spinnerTemperature.setValue(AgentManager.getInstance().getTemperature());
            }
        }
    }

    private void spinnerHumidityStateChanged(javax.swing.event.ChangeEvent evt) {
        if (!isHumidityRandomized) {
            try {
                int humidity = Integer.parseInt(spinnerHumidity.getValue().toString());
                AgentManager.getInstance().setHumidity(humidity);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid humidity value", "Error", JOptionPane.ERROR_MESSAGE);
                spinnerHumidity.setValue(AgentManager.getInstance().getHumidity());
            }
        }
    }

    private void txtTemperatureMinActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int temperature = Integer.parseInt(txtTemperatureMin.getText());
            AgentManager.getInstance().setTemperatureMin(temperature);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid temperature value", "Error", JOptionPane.ERROR_MESSAGE);
            txtTemperatureMin.setText("20");
        }
    }

    private void txtTemperatureMaxActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int temperature = Integer.parseInt(txtTemperatureMax.getText());
            AgentManager.getInstance().setTemperatureMax(temperature);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid temperature value", "Error", JOptionPane.ERROR_MESSAGE);
            txtTemperatureMax.setText("50");
        }
    }

    private void txtHumidityMinActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int humidity = Integer.parseInt(txtHumidityMin.getText());
            AgentManager.getInstance().setHumidity(humidity);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid humidity value", "Error", JOptionPane.ERROR_MESSAGE);
            txtHumidityMin.setText("20");
        }
    }

    private void txtHumidityMaxActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int humidity = Integer.parseInt(txtHumidityMax.getText());
            AgentManager.getInstance().setHumidity(humidity);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid humidity value", "Error", JOptionPane.ERROR_MESSAGE);
            txtHumidityMax.setText("50");
        }
    }

    public void setBulbStatus(boolean isOn) {
        try {
            pnlBulbStatus.removeAll();
            BufferedImage imgBulb = ImageIO.read(this.getClass().getResource(isOn ? "/bulb-on.jpg" : "/bulb-off.jpg"));
            Image scaled = imgBulb.getScaledInstance(pnlBulbStatus.getWidth(), pnlBulbStatus.getHeight(),
                                                     Image.SCALE_SMOOTH);
            JLabel picLabel = new JLabel(new ImageIcon(scaled));
            picLabel.setSize(pnlBulbStatus.getSize());
            pnlBulbStatus.add(picLabel);
            pnlBulbStatus.updateUI();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setAgentStatus(String status) {
        lblStatus.setText(status);
    }

    public void updateTemperature(int temperature) {
        spinnerTemperature.setValue(temperature);
        spinnerTemperature.updateUI();
    }

    public void updateHumidity(int humidity) {
        spinnerHumidity.setValue(humidity);
        spinnerHumidity.updateUI();
    }

}
