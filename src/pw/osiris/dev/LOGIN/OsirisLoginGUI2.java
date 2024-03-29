/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev.LOGIN;

import java.text.Normalizer.Form;

/**
 *
 * @author FFY00
 */
public class OsirisLoginGUI2 extends javax.swing.JFrame {

    /**
     * Creates new form OsirisLoginGUI2
     */
    public OsirisLoginGUI2() {
        initComponents();
    }
    
    public static void esconder(){
        formLogin.setVisible(false);
    }
    
    public static OsirisLoginGUI2 formLogin = new OsirisLoginGUI2();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        butaoLogin = new javax.swing.JButton();
        inputUser = new javax.swing.JTextField();
        inputPassword = new javax.swing.JPasswordField();
        labelErrou = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OsirisBot");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frameLogin"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("OsirisBot Login");

        labelUser.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        labelUser.setText("User:");

        labelPassword.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        labelPassword.setText("Password:");

        butaoLogin.setText("Login");
        butaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoLoginActionPerformed(evt);
            }
        });

        inputUser.setText("User");

        inputPassword.setText("Password");

        labelErrou.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        labelErrou.setForeground(new java.awt.Color(246, 66, 66));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butaoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelUser)
                            .addComponent(labelPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputUser)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelErrou)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUser)
                    .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrou)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(butaoLogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoLoginActionPerformed
        boolean autenticou = pw.osiris.dev.LOGIN.Login.autenticar(inputUser.getText(), inputPassword.getText());
        if(autenticou){
            System.out.println("Sucess Login\n");
            labelErrou.setText("");
        } else {
            System.err.println("Invalid Password");
            labelErrou.setText("Invalid Password");
        }
    }//GEN-LAST:event_butaoLoginActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OsirisLoginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OsirisLoginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OsirisLoginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OsirisLoginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formLogin.setLocationRelativeTo(null);
                formLogin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butaoLogin;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUser;
    private javax.swing.JLabel labelErrou;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUser;
    // End of variables declaration//GEN-END:variables
}
