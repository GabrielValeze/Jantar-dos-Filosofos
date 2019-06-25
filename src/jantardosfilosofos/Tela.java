package jantardosfilosofos;

// @author Gabriel Valeze e Juan Carlos

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        labelFundo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setText("Filósofo 3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 430, 46, 14);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Filósofo 1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 10, 80, 20);

        jLabel5.setText("Filósofo 2");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 200, 46, 14);

        jLabel6.setText("Filósofo 4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 460, 46, 14);

        jLabel7.setText("Filósofo 5");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 170, 46, 14);

        jToggleButton1.setText("Comendo");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(610, 230, 77, 23);

        jToggleButton2.setText("Conversando");
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(310, 40, 97, 23);

        jToggleButton3.setText("Conversando");
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(10, 200, 97, 23);

        jToggleButton4.setText("Comendo");
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(80, 490, 77, 23);

        jToggleButton5.setText("Conversando");
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(580, 460, 97, 23);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jantar.jpg"))); // NOI18N
        getContentPane().add(labelFundo);
        labelFundo.setBounds(100, 60, 500, 500);

        jLabel2.setText("Informações por escrito");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(810, 40, 140, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(770, 60, 180, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JLabel labelFundo;
    // End of variables declaration//GEN-END:variables
}
