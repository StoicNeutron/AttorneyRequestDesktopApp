package com.attorneyrequest.verification;
import com.attorneyrequest.verification.VerificationWorkflow;

/**
 *
 * @author stoicneutron
 * @author Thierry
 */
public class VerificationGUI extends javax.swing.JInternalFrame {

    private javax.swing.JLabel infoTxtLable;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLable;
    private javax.swing.JLabel resultLable;
    private javax.swing.JLabel resultTxtField;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel verificationLable;    

    /**
     * VerificationGUI Contructor.
     */
    public VerificationGUI() {
        initComponents();
    }
                         
    /**
     * Components initialization.
     */
    private void initComponents() {

        infoTxtLable = new javax.swing.JLabel();
        verificationLable = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        progressLable = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        resultLable = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        resultTxtField = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 29, 31));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 510));

        infoTxtLable.setBackground(new java.awt.Color(255, 255, 255));
        infoTxtLable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        infoTxtLable.setForeground(new java.awt.Color(255, 255, 255));
        infoTxtLable.setText("( Click the Start button to start the verification process! )");

        verificationLable.setBackground(new java.awt.Color(255, 255, 255));
        verificationLable.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        verificationLable.setForeground(new java.awt.Color(255, 255, 255));
        verificationLable.setText("Verification Screen");

        progressBar.setBackground(new java.awt.Color(204, 204, 204));

        progressLable.setBackground(new java.awt.Color(255, 255, 255));
        progressLable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        progressLable.setForeground(new java.awt.Color(255, 255, 255));
        progressLable.setText("Progress Information");

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        resultLable.setBackground(new java.awt.Color(255, 255, 255));
        resultLable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        resultLable.setForeground(new java.awt.Color(255, 255, 255));
        resultLable.setText("Result: ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        resultTxtField.setBackground(new java.awt.Color(255, 255, 255));
        resultTxtField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        resultTxtField.setForeground(new java.awt.Color(255, 255, 255));
        resultTxtField.setText("Not Yet Availiable! Click Start to generate!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultLable, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(infoTxtLable, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(startButton))
                    .addComponent(progressLable, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(verificationLable, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(748, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(infoTxtLable)
                .addGap(46, 46, 46)
                .addComponent(progressLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLable)
                    .addComponent(resultTxtField))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(165, 165, 165))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(verificationLable)
                    .addContainerGap(426, Short.MAX_VALUE)))
        );

        pack();
    }                      

    /**
     * Action handle fir start button.
     * @param evt
     */
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // animation thread
        Thread thread = new Thread(() -> {
            try {
                // diable validation button
                startButton.setEnabled(false);
                for(int i = 1; i <= 100; i++){
                    if(i > 40 && i < 70){
                        Thread.sleep(500);
                        if(i % 2 == 0){
                            progressLable.setText("Assigning Attorney to the Case ..");
                        }else{
                            progressLable.setText("Assigning Attorney to the Case . .");
                        }
                    }else{
                        Thread.sleep(100);
                        if(i % 2 == 0){
                            if(i <= 40){
                                progressLable.setText("Starting Verification Process ..");
                            }else{
                                progressLable.setText("Wrapping up Verification Process ..");
                            }
                        }else{
                            if(i < 40){
                                progressLable.setText("Starting Verification Process . .");
                            }else{
                                progressLable.setText("Wrapping up Verification Process . .");
                            }
                        }
                    }
                    progressBar.setValue(i);
                }
                progressLable.setText("Process Finished!");
                // enable validation button back
                startButton.setEnabled(true);
                resultTxtField.setText("Result either accept or reject should update here!");
        //                resultTxtField.setText();

            } catch (InterruptedException e) {
            }
        });
        thread.start();
    }                                                   
}
