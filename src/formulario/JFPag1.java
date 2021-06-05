/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author reisa
 */
public class JFPag1 extends javax.swing.JFrame {

   
    public JFPag1() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup RGroupPag1 = new javax.swing.ButtonGroup();
        LblPag1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ChkPreg1 = new javax.swing.JCheckBox();
        ChkPreg2 = new javax.swing.JCheckBox();
        ChkPreg3 = new javax.swing.JCheckBox();
        ChkPreg4 = new javax.swing.JCheckBox();
        BtnSiguientePag1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 600));
        setSize(new java.awt.Dimension(650, 600));

        LblPag1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LblPag1.setText("Pagina 1");

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Las dos preguntas tienen un valor del 20%");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pregunta 1");

        jLabel3.setText("¿Cuáles de las siguientes instrucciones permiten imprimir los números desde 5 hasta 1 en java?");

        ChkPreg1.setText("for(int i=5;i>=1;i--){ System.out.println(i); } ");
        ChkPreg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkPreg1ActionPerformed(evt);
            }
        });

        ChkPreg2.setText("for(int i=5;i>0;i--){ System.out.println(i); } ");

        ChkPreg3.setText("for(int i=1;i>=5;i++){ System.out.println(i); } ");

        ChkPreg4.setText("for(int i=5;i>=5;i--){System.out.println(i); } ");

        BtnSiguientePag1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnSiguientePag1.setText("-->");
        BtnSiguientePag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguientePag1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Pregunta 2");

        jLabel5.setText("Dado el arreglo A [1, 2, 3, 4, 5] y el arreglo B [6, 7, 8, 9, 0]. Ambos tipo entero y de 5 posiciones.");

        jLabel6.setText("La instrucción “int suma = A[3] + B[7];”, dará como resultado que variable suma tendrá el valor:");

        RGroupPag1.add(jRadioButton1);
        jRadioButton1.setText("12");

        RGroupPag1.add(jRadioButton2);
        jRadioButton2.setText("10");

        RGroupPag1.add(jRadioButton3);
        jRadioButton3.setText("Un error en tiempo de ejecución");

        RGroupPag1.add(jRadioButton4);
        jRadioButton4.setText("Ninguna de las anteriores.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnSiguientePag1)
                        .addGap(55, 55, 55))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ChkPreg2)
                                .addGap(65, 65, 65)
                                .addComponent(ChkPreg4))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ChkPreg1)
                                .addGap(57, 57, 57)
                                .addComponent(ChkPreg3))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(42, 42, 42)
                                .addComponent(jRadioButton2)
                                .addGap(48, 48, 48)
                                .addComponent(jRadioButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(LblPag1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LblPag1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkPreg1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChkPreg3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkPreg2)
                    .addComponent(ChkPreg4))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(BtnSiguientePag1)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChkPreg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkPreg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkPreg1ActionPerformed

    private void BtnSiguientePag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguientePag1ActionPerformed
      boolean salir = false;
      Datos data = new Datos();
        while(!salir)
        {
            if(ChkPreg1.isSelected()||ChkPreg2.isSelected()||ChkPreg3.isSelected()||ChkPreg4.isSelected())
            {
                data.setPregunta1_1(ChkPreg1.isSelected());
                data.setPregunta1_2(ChkPreg2.isSelected());
                
            }else
            {
                JOptionPane.showMessageDialog(null, "Debes elegir una respuesta");
            }
       }
        
        
    }//GEN-LAST:event_BtnSiguientePag1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFPag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPag1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSiguientePag1;
    private javax.swing.JCheckBox ChkPreg1;
    private javax.swing.JCheckBox ChkPreg2;
    private javax.swing.JCheckBox ChkPreg3;
    private javax.swing.JCheckBox ChkPreg4;
    private javax.swing.JLabel LblPag1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
