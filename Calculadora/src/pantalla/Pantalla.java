/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantalla;

/**
 *
 * @author juanc
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setPreferredSize(new java.awt.Dimension(20, 5));
        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setText("Ingrese la Operación:");
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 14));
        jPanel1.add(jLabel1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel19);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(4, 4));

        jPanel3.setLayout(new java.awt.GridLayout());

        jButton1.setText("1");
        jPanel3.add(jButton1);

        jPanel2.add(jPanel3);

        jPanel8.setLayout(new java.awt.GridLayout());

        jButton2.setText("2");
        jPanel8.add(jButton2);

        jPanel2.add(jPanel8);

        jPanel17.setLayout(new java.awt.GridLayout());

        jButton3.setText("3");
        jPanel17.add(jButton3);

        jPanel2.add(jPanel17);

        jPanel13.setLayout(new java.awt.GridLayout());

        jButton4.setText("AC");
        jPanel13.add(jButton4);

        jPanel2.add(jPanel13);

        jPanel7.setLayout(new java.awt.GridLayout());

        jButton5.setText("4");
        jPanel7.add(jButton5);

        jPanel2.add(jPanel7);

        jPanel4.setLayout(new java.awt.GridLayout());

        jButton6.setText("5");
        jPanel4.add(jButton6);

        jPanel2.add(jPanel4);

        jPanel14.setLayout(new java.awt.GridLayout());

        jButton7.setText("6");
        jPanel14.add(jButton7);

        jPanel2.add(jPanel14);

        jPanel12.setLayout(new java.awt.GridLayout());

        jButton8.setText("+");
        jPanel12.add(jButton8);

        jPanel2.add(jPanel12);

        jPanel15.setLayout(new java.awt.GridLayout());

        jButton9.setText("7");
        jPanel15.add(jButton9);

        jPanel2.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout());

        jButton10.setText("8");
        jPanel16.add(jButton10);

        jPanel2.add(jPanel16);

        jPanel5.setLayout(new java.awt.GridLayout());

        jButton11.setText("9");
        jPanel5.add(jButton11);

        jPanel2.add(jPanel5);

        jPanel18.setLayout(new java.awt.GridLayout());

        jButton12.setText("-");
        jPanel18.add(jButton12);

        jPanel2.add(jPanel18);

        jPanel10.setLayout(new java.awt.GridLayout());

        jButton16.setText("0");
        jPanel10.add(jButton16);

        jPanel2.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout());

        jButton15.setText("*");
        jPanel11.add(jButton15);

        jPanel2.add(jPanel11);

        jPanel9.setLayout(new java.awt.GridLayout());

        jButton14.setText("/");
        jPanel9.add(jButton14);

        jPanel2.add(jPanel9);

        jPanel6.setLayout(new java.awt.GridLayout());

        jButton13.setText("=");
        jPanel6.add(jButton13);

        jPanel2.add(jPanel6);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}