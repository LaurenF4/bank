package banksystem;

/**
 *
 * @author 22013691
 */
public class BankInterface extends javax.swing.JFrame {

    /**
     * Creates new form BankInterface
     */
    
    
    public BankInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_welcomeScreen = new javax.swing.JPanel();
        btn_start = new javax.swing.JButton();
        txt_welcome = new javax.swing.JLabel();
        pnl_accountSelection = new javax.swing.JPanel();
        btn_currentAccount = new javax.swing.JButton();
        btn_overdraftAccount = new javax.swing.JButton();
        txt_selection = new javax.swing.JLabel();
        btn_SelectionBack = new javax.swing.JButton();
        pnl_overdraftAccount = new javax.swing.JPanel();
        btn_overdraftBack = new javax.swing.JButton();
        btn_amount = new javax.swing.JLabel();
        txt_inputBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_withdraw = new javax.swing.JButton();
        btn_deposit = new javax.swing.JButton();
        pnl_currentAccount = new javax.swing.JPanel();
        btn_currentBack = new javax.swing.JButton();
        pnl_overdraftAccount1 = new javax.swing.JPanel();
        btn_overdraftBack2 = new javax.swing.JButton();
        btn_amount2 = new javax.swing.JLabel();
        txt_inputBox2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btn_withdraw2 = new javax.swing.JButton();
        btn_deposit2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("pnl_welcome");
        getContentPane().setLayout(new java.awt.CardLayout());

        btn_start.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btn_start.setText("Start");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        txt_welcome.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        txt_welcome.setText("Welcome to the Bank!");

        javax.swing.GroupLayout pnl_welcomeScreenLayout = new javax.swing.GroupLayout(pnl_welcomeScreen);
        pnl_welcomeScreen.setLayout(pnl_welcomeScreenLayout);
        pnl_welcomeScreenLayout.setHorizontalGroup(
            pnl_welcomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_welcomeScreenLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(pnl_welcomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_welcomeScreenLayout.createSequentialGroup()
                        .addComponent(txt_welcome)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_welcomeScreenLayout.createSequentialGroup()
                        .addComponent(btn_start, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        pnl_welcomeScreenLayout.setVerticalGroup(
            pnl_welcomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_welcomeScreenLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(txt_welcome)
                .addGap(100, 100, 100)
                .addComponent(btn_start)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_welcomeScreen, "card2");

        btn_currentAccount.setText("Current Account");
        btn_currentAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_currentAccountActionPerformed(evt);
            }
        });

        btn_overdraftAccount.setText("Overdraft Account");
        btn_overdraftAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_overdraftAccountActionPerformed(evt);
            }
        });

        txt_selection.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        txt_selection.setText("Which account?");

        btn_SelectionBack.setText("Back");
        btn_SelectionBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectionBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_accountSelectionLayout = new javax.swing.GroupLayout(pnl_accountSelection);
        pnl_accountSelection.setLayout(pnl_accountSelectionLayout);
        pnl_accountSelectionLayout.setHorizontalGroup(
            pnl_accountSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_accountSelectionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(pnl_accountSelectionLayout.createSequentialGroup()
                .addGroup(pnl_accountSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_accountSelectionLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_currentAccount)
                        .addGap(191, 191, 191)
                        .addComponent(btn_overdraftAccount))
                    .addGroup(pnl_accountSelectionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_SelectionBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_accountSelectionLayout.setVerticalGroup(
            pnl_accountSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accountSelectionLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(txt_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(pnl_accountSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_currentAccount)
                    .addComponent(btn_overdraftAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btn_SelectionBack)
                .addContainerGap())
        );

        getContentPane().add(pnl_accountSelection, "card3");

        btn_overdraftBack.setText("Back");
        btn_overdraftBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_overdraftBackActionPerformed(evt);
            }
        });

        btn_amount.setText("Amount:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btn_withdraw.setText("Withdraw");
        btn_withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_withdrawActionPerformed(evt);
            }
        });

        btn_deposit.setText("Deposit");
        btn_deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_overdraftAccountLayout = new javax.swing.GroupLayout(pnl_overdraftAccount);
        pnl_overdraftAccount.setLayout(pnl_overdraftAccountLayout);
        pnl_overdraftAccountLayout.setHorizontalGroup(
            pnl_overdraftAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overdraftAccountLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btn_withdraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_deposit)
                .addGap(139, 139, 139))
            .addGroup(pnl_overdraftAccountLayout.createSequentialGroup()
                .addGroup(pnl_overdraftAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_overdraftAccountLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_overdraftAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_overdraftBack)
                            .addComponent(btn_amount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_overdraftAccountLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnl_overdraftAccountLayout.setVerticalGroup(
            pnl_overdraftAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overdraftAccountLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_overdraftAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_amount)
                    .addComponent(txt_inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pnl_overdraftAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_withdraw)
                    .addComponent(btn_deposit))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btn_overdraftBack)
                .addContainerGap())
        );

        getContentPane().add(pnl_overdraftAccount, "card5");

        btn_currentBack.setText("Back");
        btn_currentBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_currentBackActionPerformed(evt);
            }
        });

        btn_overdraftBack2.setText("Back");
        btn_overdraftBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_overdraftBack2ActionPerformed(evt);
            }
        });

        btn_amount2.setText("Amount:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        btn_withdraw2.setText("Withdraw");
        btn_withdraw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_withdraw2ActionPerformed(evt);
            }
        });

        btn_deposit2.setText("Deposit");
        btn_deposit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deposit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_overdraftAccount1Layout = new javax.swing.GroupLayout(pnl_overdraftAccount1);
        pnl_overdraftAccount1.setLayout(pnl_overdraftAccount1Layout);
        pnl_overdraftAccount1Layout.setHorizontalGroup(
            pnl_overdraftAccount1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overdraftAccount1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btn_withdraw2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_deposit2)
                .addGap(139, 139, 139))
            .addGroup(pnl_overdraftAccount1Layout.createSequentialGroup()
                .addGroup(pnl_overdraftAccount1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_overdraftAccount1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_overdraftAccount1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_overdraftBack2)
                            .addComponent(btn_amount2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_inputBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_overdraftAccount1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnl_overdraftAccount1Layout.setVerticalGroup(
            pnl_overdraftAccount1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overdraftAccount1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_overdraftAccount1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_amount2)
                    .addComponent(txt_inputBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pnl_overdraftAccount1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_withdraw2)
                    .addComponent(btn_deposit2))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btn_overdraftBack2)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_currentAccountLayout = new javax.swing.GroupLayout(pnl_currentAccount);
        pnl_currentAccount.setLayout(pnl_currentAccountLayout);
        pnl_currentAccountLayout.setHorizontalGroup(
            pnl_currentAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_currentAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_currentBack)
                .addContainerGap(480, Short.MAX_VALUE))
            .addGroup(pnl_currentAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_currentAccountLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnl_overdraftAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl_currentAccountLayout.setVerticalGroup(
            pnl_currentAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_currentAccountLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(btn_currentBack)
                .addContainerGap())
            .addGroup(pnl_currentAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_currentAccountLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnl_overdraftAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(pnl_currentAccount, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_currentAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_currentAccountActionPerformed
       pnl_accountSelection.setVisible(false);
       pnl_currentAccount.setVisible(true);
    }//GEN-LAST:event_btn_currentAccountActionPerformed

    private void btn_SelectionBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectionBackActionPerformed
        pnl_accountSelection.setVisible(false);
        pnl_welcomeScreen.setVisible(true);
    }//GEN-LAST:event_btn_SelectionBackActionPerformed

    private void btn_overdraftAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_overdraftAccountActionPerformed
        pnl_accountSelection.setVisible(false);
        pnl_overdraftAccount.setVisible(true);
    }//GEN-LAST:event_btn_overdraftAccountActionPerformed

    private void btn_overdraftBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_overdraftBackActionPerformed
        pnl_overdraftAccount.setVisible(false);
        pnl_accountSelection.setVisible(true);
    }//GEN-LAST:event_btn_overdraftBackActionPerformed

    private void btn_currentBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_currentBackActionPerformed
        pnl_currentAccount.setVisible(false);
        pnl_accountSelection.setVisible(true);
    }//GEN-LAST:event_btn_currentBackActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        pnl_welcomeScreen.setVisible(false);
        pnl_accountSelection.setVisible(true);
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_withdrawActionPerformed
        
    }//GEN-LAST:event_btn_withdrawActionPerformed

    private void btn_depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_depositActionPerformed

    private void btn_overdraftBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_overdraftBack2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_overdraftBack2ActionPerformed

    private void btn_withdraw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_withdraw2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_withdraw2ActionPerformed

    private void btn_deposit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deposit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deposit2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SelectionBack;
    private javax.swing.JLabel btn_amount;
    private javax.swing.JLabel btn_amount2;
    private javax.swing.JButton btn_currentAccount;
    private javax.swing.JButton btn_currentBack;
    private javax.swing.JButton btn_deposit;
    private javax.swing.JButton btn_deposit2;
    private javax.swing.JButton btn_overdraftAccount;
    private javax.swing.JButton btn_overdraftBack;
    private javax.swing.JButton btn_overdraftBack2;
    private javax.swing.JButton btn_start;
    private javax.swing.JButton btn_withdraw;
    private javax.swing.JButton btn_withdraw2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel pnl_accountSelection;
    private javax.swing.JPanel pnl_currentAccount;
    private javax.swing.JPanel pnl_overdraftAccount;
    private javax.swing.JPanel pnl_overdraftAccount1;
    private javax.swing.JPanel pnl_welcomeScreen;
    private javax.swing.JTextField txt_inputBox;
    private javax.swing.JTextField txt_inputBox2;
    private javax.swing.JLabel txt_selection;
    private javax.swing.JLabel txt_welcome;
    // End of variables declaration//GEN-END:variables
}
