package com.attorneyrequest.main;

import com.attorneyrequest.data_entry.DataBase_DataEntry;
import com.attorneyrequest.data_entry.DataEntryGUI;
import com.attorneyrequest.data_entry.DataEntryWorkflow;
import com.attorneyrequest.validation.ValidationGUI;
import com.attorneyrequest.verification.VerificationGUI;

/**
 * This is the main class of this project.
 * @author Samnang Thorn
 */
public class RequestAttorneyApp extends javax.swing.JFrame {

    // Variables declaration
    private javax.swing.JButton dataEntry;
    private javax.swing.JDesktopPane displayArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton validation;
    private javax.swing.JButton verification;
    javax.swing.JInternalFrame[] uIList = new javax.swing.JInternalFrame[3];

    /**
     * Constructor.
     */
    public RequestAttorneyApp() {
        initComponents();
        // set the start with Data Entry Screen
        javax.swing.JInternalFrame dataEntryGUI = new DataEntryGUI();
        displayArea.add(dataEntryGUI);
        dataEntryGUI.setVisible(true);
        // construct Validation and Verification GUI but do not set it to visible
        javax.swing.JInternalFrame validationGUI = new ValidationGUI();
        javax.swing.JInternalFrame verificationGUI = new VerificationGUI();
        uIList[0] = (dataEntryGUI);
        uIList[1] = (validationGUI);
        uIList[2] = (verificationGUI);
    }

    /**
     * Initialize all the componets inside the Application.
     */
    private void initComponents() {

        displayArea = new javax.swing.JDesktopPane();
        dataEntry = new javax.swing.JButton();
        validation = new javax.swing.JButton();
        verification = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USCIS | Attorney Request");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        displayArea.setPreferredSize(new java.awt.Dimension(1000, 510));

        javax.swing.GroupLayout displayAreaLayout = new javax.swing.GroupLayout(displayArea);
        displayArea.setLayout(displayAreaLayout);
        displayAreaLayout.setHorizontalGroup(
            displayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        displayAreaLayout.setVerticalGroup(
            displayAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        dataEntry.setText("Data Entry");
        dataEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataEntryActionPerformed(evt);
            }
        });

        validation.setText("Validation");
        validation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationActionPerformed(evt);
            }
        });

        verification.setText("Verification");
        verification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificationActionPerformed(evt);
            }
        });

        jLabel1.setText("->");

        jLabel2.setText("->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(displayArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataEntry)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(validation)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(verification)
                .addGap(302, 302, 302))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataEntry)
                    .addComponent(validation)
                    .addComponent(verification)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(displayArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void dataEntryActionPerformed(java.awt.event.ActionEvent evt) {
        this.displayArea.removeAll();
        this.displayArea.add(uIList[0]);
        uIList[0].setVisible(true);
    }

    private void verificationActionPerformed(java.awt.event.ActionEvent evt) {
        this.displayArea.removeAll();
        this.displayArea.add(uIList[2]);
        uIList[2].setVisible(true);
    }

    private void validationActionPerformed(java.awt.event.ActionEvent evt) {
        if(DataBase_DataEntry.getCounter() == 0){
            DataEntryWorkflow.runDataEntryWorkFlow();
            this.displayArea.removeAll();
            this.displayArea.add(uIList[1]);
            uIList[1].setVisible(true);
        }
    }

    /**
     * Main function of the Application.
     */
    public static void main(String args[]) {
        
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame App = new RequestAttorneyApp();
                App.setVisible(true);
            }
        });
    }
}
