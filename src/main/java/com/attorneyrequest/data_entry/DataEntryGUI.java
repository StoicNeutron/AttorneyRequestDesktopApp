package com.attorneyrequest.data_entry;

import java.awt.Color;

/**
 * This class is the GUI component of Data entry part of the application.
 * @author Samnang Thorn
 */
public class DataEntryGUI extends javax.swing.JInternalFrame {

    // Variables declaration - do not modify                     
    private javax.swing.JLabel aNumber;
    private javax.swing.JTextField aNumberInput;
    private javax.swing.JLabel states;
    private javax.swing.JTextField statesInput;
    private javax.swing.JLabel city;
    private javax.swing.JTextField cityInput;
    private javax.swing.JLabel countryOfBirth;
    private javax.swing.JTextField countryOfBirthInput;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JTextField dateOfBirthInput;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel infoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel phoneNUmber;
    private javax.swing.JTextField phoneNumberInput;
    private javax.swing.JLabel streetAddress;
    private javax.swing.JTextField streetAddressInput;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeInput;
    // End of variables declaration

    /**
     * Creates new form DataEntryGUI
     */
    public DataEntryGUI() {
        initComponents();
        infoTxt.setVisible(false);
        DataBase_DataEntry.resetDataBase();
    }

    /**
     * Initailize all components within DataEntry GUI.
     */
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        dateOfBirthInput = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        lastNameInput = new javax.swing.JTextField();
        countryOfBirth = new javax.swing.JLabel();
        countryOfBirthInput = new javax.swing.JTextField();
        aNumber = new javax.swing.JLabel();
        aNumberInput = new javax.swing.JTextField();
        streetAddress = new javax.swing.JLabel();
        streetAddressInput = new javax.swing.JTextField();
        states = new javax.swing.JLabel();
        statesInput = new javax.swing.JTextField();
        city = new javax.swing.JLabel();
        cityInput = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        zipCodeInput = new javax.swing.JTextField();
        phoneNUmber = new javax.swing.JLabel();
        phoneNumberInput = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        infoTxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 29, 31));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 510));

        // The layout of the Data Entry GUI
        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Immigrant Information");

        // firstName lable
        firstName.setBackground(new java.awt.Color(255, 255, 255));
        firstName.setForeground(new java.awt.Color(255, 255, 255));
        firstName.setText("First Name:");
        // firstName input field
        firstNameInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstNameInput.setSize(new java.awt.Dimension(64, 23));
        firstNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // lastName lable
        lastName.setBackground(new java.awt.Color(255, 255, 255));
        lastName.setForeground(new java.awt.Color(255, 255, 255));
        lastName.setText("Last Name:");
        // lastName input field
        lastNameInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lastNameInput.setSize(new java.awt.Dimension(64, 23));
        lastNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // dateOfBirth lable
        dateOfBirth.setBackground(new java.awt.Color(255, 255, 255));
        dateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        dateOfBirth.setText("Date of Birth:");
        // dateOfBirthInput
        dateOfBirthInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dateOfBirthInput.setPreferredSize(new java.awt.Dimension(64, 23));
        dateOfBirthInput.setSize(new java.awt.Dimension(64, 23));
        dateOfBirthInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // countryOfBirth lable
        countryOfBirth.setBackground(new java.awt.Color(255, 255, 255));
        countryOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        countryOfBirth.setText("Country of Birth:");
        // countryOfBirth inout field
        countryOfBirthInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        countryOfBirthInput.setSize(new java.awt.Dimension(64, 23));
        countryOfBirthInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // aNumber lable
        aNumber.setBackground(new java.awt.Color(255, 255, 255));
        aNumber.setForeground(new java.awt.Color(255, 255, 255));
        aNumber.setText("A-Number:");
        // aNumber input field
        aNumberInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        aNumberInput.setSize(new java.awt.Dimension(64, 23));
        aNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // streetAddress lable
        streetAddress.setBackground(new java.awt.Color(255, 255, 255));
        streetAddress.setForeground(new java.awt.Color(255, 255, 255));
        streetAddress.setText("Street Address:");
        // streetAddress input field
        streetAddressInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        streetAddressInput.setSize(new java.awt.Dimension(64, 23));
        streetAddressInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // aptSuit lable
        states.setBackground(new java.awt.Color(255, 255, 255));
        states.setForeground(new java.awt.Color(255, 255, 255));
        states.setText("State:");
        // aptSuit input field
        statesInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        statesInput.setSize(new java.awt.Dimension(64, 23));
        statesInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // city lable
        city.setBackground(new java.awt.Color(255, 255, 255));
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setText("City:");
        // city input field
        cityInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cityInput.setSize(new java.awt.Dimension(64, 23));
        cityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // zipCode lable
        zipCode.setBackground(new java.awt.Color(255, 255, 255));
        zipCode.setForeground(new java.awt.Color(255, 255, 255));
        zipCode.setText("Zip/Postcode:");
        // zipCode input field
        zipCodeInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        zipCodeInput.setSize(new java.awt.Dimension(64, 23));
        zipCodeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // phoneNUmber lable
        phoneNUmber.setBackground(new java.awt.Color(255, 255, 255));
        phoneNUmber.setForeground(new java.awt.Color(255, 255, 255));
        phoneNUmber.setText("Phone number:");
        // phoneNumber input field
        phoneNumberInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        phoneNumberInput.setSize(new java.awt.Dimension(64, 23));
        phoneNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // email lable
        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email address:");
        // email input field
        emailInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        emailInput.setSize(new java.awt.Dimension(64, 23));
        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        // submitButton
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        // infoTxt
        infoTxt.setBackground(new java.awt.Color(255, 255, 255));
        infoTxt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        infoTxt.setForeground(new java.awt.Color(0, 153, 0));
        infoTxt.setText("Ready: Click the Validation Tab to start the next process!");

        // alignment and grouping
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zipCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zipCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(countryOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(states, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(countryOfBirthInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(179, 179, 179))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(phoneNUmber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(phoneNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateOfBirthInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(streetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(streetAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(558, 558, 558))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoTxt)
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName)
                    .addComponent(firstName)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirth)
                    .addComponent(dateOfBirthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryOfBirth)
                    .addComponent(countryOfBirthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aNumber)
                    .addComponent(aNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetAddress)
                    .addComponent(streetAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(states)
                    .addComponent(statesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city)
                    .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCode)
                    .addComponent(zipCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNUmber)
                    .addComponent(phoneNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(infoTxt))
                .addGap(39, 39, 39))
        );
        pack();
    }                                      

    /**
     * Handle all the logic when the submit button clicked.
     * @param evt
     */
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // reset the border first
        lastNameInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        firstNameInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        dateOfBirthInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        countryOfBirthInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        aNumberInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        streetAddressInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        cityInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        zipCodeInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        statesInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        phoneNumberInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        emailInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        // mark border read if blank
        if(lastNameInput.getText().isBlank()){
            lastNameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.lastName = lastNameInput.getText();
        if(firstNameInput.getText().isBlank()){
            firstNameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.firstName = firstNameInput.getText();
        if(dateOfBirthInput.getText().isBlank()){
            dateOfBirthInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.dateOfBirth = dateOfBirthInput.getText();
        if(countryOfBirthInput.getText().isBlank()){
            countryOfBirthInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.countryOfBirth = countryOfBirthInput.getText();
        if(aNumberInput.getText().isBlank()){
            aNumberInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.aNumber = aNumberInput.getText();
        if(streetAddressInput.getText().isBlank()){
            streetAddressInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.streetAddress = streetAddressInput.getText();
        if(statesInput.getText().isBlank()){
            statesInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.states = statesInput.getText();
        if(cityInput.getText().isBlank()){
            cityInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.city = cityInput.getText();
        if(zipCodeInput.getText().isBlank()){
            zipCodeInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.zipCode = zipCodeInput.getText();
        if(phoneNumberInput.getText().isBlank()){
            phoneNumberInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.phoneNUmber = phoneNumberInput.getText();
        if(emailInput.getText().isBlank()){
            emailInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        DataBase_DataEntry.email = emailInput.getText();
        // check if ready for the process.
        infoTxt.setVisible(true);
        if(DataBase_DataEntry.getCounter() == 0){
            infoTxt.setText("Ready: Click the Validation Tab to start the next process!");
            infoTxt.setForeground(Color.green);
        }else{
            infoTxt.setText("Incomplete! Infomation Require!" + DataBase_DataEntry.getCounter());
            infoTxt.setForeground(Color.red);
        }
        infoTxt.repaint();
    }                                                               
}