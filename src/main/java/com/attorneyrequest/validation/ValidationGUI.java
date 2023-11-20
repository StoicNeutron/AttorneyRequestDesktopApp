package com.attorneyrequest.validation;

/**
 *
 * @author stoicneutron
 * @author Nash Leaptrot
 */
public class ValidationGUI extends javax.swing.JInternalFrame {


    private javax.swing.JLabel infoLable;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel statusLable;
    private javax.swing.JLabel statusTxt;
    private javax.swing.JButton validationButton;
    private javax.swing.JLabel validationLable;

    /**
     * Contructor.
     */
    public ValidationGUI() {
        initComponents();
    }

    /**
     * All components of the GUI Validation.
     */
    private void initComponents() {

        infoLable = new javax.swing.JLabel();
        validationLable = new javax.swing.JLabel();
        validationButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        statusTxt = new javax.swing.JLabel();
        statusLable = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 29, 31));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 510));

        infoLable.setBackground(new java.awt.Color(255, 255, 255));
        infoLable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        infoLable.setForeground(new java.awt.Color(255, 255, 255));
        infoLable.setText("( Click the Validate button to start the Validation Process. )");

        validationLable.setBackground(new java.awt.Color(255, 255, 255));
        validationLable.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        validationLable.setForeground(new java.awt.Color(255, 255, 255));
        validationLable.setText("Validation Screen");

        validationButton.setText("Validate");
        validationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationButtonActionPerformed(evt);
            }
        });

        statusTxt.setBackground(new java.awt.Color(255, 255, 255));
        statusTxt.setForeground(new java.awt.Color(255, 255, 255));
        statusTxt.setText("No current status at the moment! Click Validate to see feedback result of the Validation.");
        statusTxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        statusLable.setBackground(new java.awt.Color(255, 255, 255));
        statusLable.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        statusLable.setForeground(new java.awt.Color(255, 255, 255));
        statusLable.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(statusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statusLable, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(infoLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(279, 279, 279)
                .addComponent(validationButton)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(validationLable, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addGap(613, 613, 613)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoLable)
                    .addComponent(validationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(statusLable)
                .addGap(18, 18, 18)
                .addComponent(statusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(validationLable)
                    .addContainerGap(429, Short.MAX_VALUE)))
        );

        pack();
    }                     

    private void validationButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Thread thread = new Thread(() -> {
            try {
                // diable validation button
                validationButton.setEnabled(false);
                progressBar.setValue(10);
                progressBar.repaint();
                Thread.sleep(1000);
                progressBar.setValue(50);
                progressBar.repaint();
                Thread.sleep(2000);
                progressBar.setValue(80);
                progressBar.repaint();
                Thread.sleep(1000);
                progressBar.setValue(100);
                // enable validation button back
                validationButton.setEnabled(true);
                statusTxt.setText("Feedback Here");
            } catch (InterruptedException e) {
            }
        });
        thread.start();
    }                                                                  
}

