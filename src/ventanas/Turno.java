/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author MAFOWS21
 */
public class Turno extends javax.swing.JDialog {

    //creacion de los 2 usuarios
    private String user1,user2;
    private String turno;
    
    
    
    public Turno(java.awt.Frame parent, boolean modal,String user1,String user2) {
        super(parent, modal);
        this.user1  = user1;
        this.user2  = user2;
        initComponents();
        setLocationRelativeTo(null);
    }

    public String getTurno() {
        return turno;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BJ1 = new javax.swing.JButton();
        BJ2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ESCOGER TURNO");
        setBackground(new java.awt.Color(0, 204, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BJ1.setBackground(new java.awt.Color(255, 0, 0));
        BJ1.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        BJ1.setText(user1);
        if(BJ1.getText().isEmpty()){
            BJ1.setText("Jugador 1");
        }
        BJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJ1ActionPerformed(evt);
            }
        });
        jPanel1.add(BJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, 130));

        BJ2.setBackground(new java.awt.Color(0, 0, 204));
        BJ2.setFont(new java.awt.Font("Jokerman", 0, 20)); // NOI18N
        BJ2.setText(user2);
        if(BJ2.getText().isEmpty()){
            BJ2.setText("Jugador 2");
        }
        BJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJ2ActionPerformed(evt);
            }
        });
        jPanel1.add(BJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 150, 130));

        jLabel1.setFont(new java.awt.Font("Jokerman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPIEZA...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 700, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJ1ActionPerformed
        // TODO add your handling code here:

        turno = "user1";
        
        dispose();

    }//GEN-LAST:event_BJ1ActionPerformed

    private void BJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJ2ActionPerformed
        // TODO add your handling code here:

        turno = "user2";
        dispose();

    }//GEN-LAST:event_BJ2ActionPerformed

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
            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Turno dialog = new Turno(new javax.swing.JFrame(), true,null,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BJ1;
    private javax.swing.JButton BJ2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
