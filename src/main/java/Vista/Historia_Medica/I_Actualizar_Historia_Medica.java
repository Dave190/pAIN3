package Vista.Historia_Medica;

public class I_Actualizar_Historia_Medica extends javax.swing.JFrame {

    private static I_Actualizar_Historia_Medica Instance;

     public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }
    private String Sucursal;

    public String getSucursal() {
        return Sucursal;
    }
    
    private I_Actualizar_Historia_Medica() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    public static I_Actualizar_Historia_Medica GetInstance()
    {
        if (Instance == null)
            Instance = new I_Actualizar_Historia_Medica();
        
        return Instance;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TextImdc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextTensionMaxima = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TextTensionMinima = new javax.swing.JTextField();
        TextPulso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextPeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextTalla = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Actualizar Historia Médica");

        TextImdc.setBackground(new java.awt.Color(153, 153, 153));
        TextImdc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextImdc.setForeground(new java.awt.Color(255, 255, 255));
        TextImdc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextImdcKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Tensión Arterial Mínima (mmHG):");

        TextTensionMaxima.setBackground(new java.awt.Color(153, 153, 153));
        TextTensionMaxima.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextTensionMaxima.setForeground(new java.awt.Color(255, 255, 255));
        TextTensionMaxima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTensionMaximaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Pulso (en Pulsasiones por Minuto):");

        TextTensionMinima.setBackground(new java.awt.Color(153, 153, 153));
        TextTensionMinima.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextTensionMinima.setForeground(new java.awt.Color(255, 255, 255));
        TextTensionMinima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTensionMinimaKeyTyped(evt);
            }
        });

        TextPulso.setBackground(new java.awt.Color(153, 153, 153));
        TextPulso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextPulso.setForeground(new java.awt.Color(255, 255, 255));
        TextPulso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextPulsoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Peso (En Kg):");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Talla (en Metros):");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Tensión Arterial Máxima (mmHG):");

        TextPeso.setBackground(new java.awt.Color(153, 153, 153));
        TextPeso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextPeso.setForeground(new java.awt.Color(255, 255, 255));
        TextPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextPesoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Índice de Masa Corporal: ");

        TextTalla.setBackground(new java.awt.Color(153, 153, 153));
        TextTalla.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextTalla.setForeground(new java.awt.Color(255, 255, 255));
        TextTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextTallaKeyTyped(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Atrás");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextTalla, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addComponent(TextImdc)
                                .addComponent(TextTensionMaxima)
                                .addComponent(TextTensionMinima)
                                .addComponent(TextPulso))
                            .addComponent(TextPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextImdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextTensionMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextTensionMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextPulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(241, 241, 241)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // boton a I_Exito 
    
        String peso = TextPeso.getText();
        String talla = TextTalla.getText();
        String imdc = TextImdc.getText();
        String TensionMaxima = TextTensionMaxima.getText();
        String TensionMinima = TextTensionMinima.getText();
        String pulso = TextPulso.getText();
        
        
        
            I_Exito a = I_Exito.GetInstance();
            a.setVisible(true);
            this.setVisible(false);
        
        
//            I_Error_Generico Interfaz = I_Error_Generico.GetInstance();
//            Interfaz.setVisible(true);
//            this.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // boton para atras a I_Actualizar_Hisoria_Medica_CI
        I_Actualizar_Historia_Medica_CI a = I_Actualizar_Historia_Medica_CI.GetInstance();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TextPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPesoKeyTyped
        // Que no pueda escribir letras
        char c = evt.getKeyChar();
        
        if (!(c == '1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0' || c==',' || c=='.')) evt.consume();
    }//GEN-LAST:event_TextPesoKeyTyped

    private void TextTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTallaKeyTyped
        // Que no pueda escribir letras
        char c = evt.getKeyChar();
        
        if (!(c == '1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0' || c==',' || c=='.')) evt.consume();
    }//GEN-LAST:event_TextTallaKeyTyped

    private void TextImdcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextImdcKeyTyped
        // Que no pueda escribir letras
        char c = evt.getKeyChar();
        
        if (!(c == '1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0' || c==',' || c=='.')) evt.consume();
    }//GEN-LAST:event_TextImdcKeyTyped

    private void TextTensionMaximaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTensionMaximaKeyTyped
        // Que no pueda escribir letras
        char c = evt.getKeyChar();
        
        if (!(c == '1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0' || c==',' || c=='.')) evt.consume();
    }//GEN-LAST:event_TextTensionMaximaKeyTyped

    private void TextTensionMinimaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextTensionMinimaKeyTyped
        // Que no pueda escribir letras
        char c = evt.getKeyChar();
        
        if (!(c == '1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0' || c==',' || c=='.')) evt.consume();
    }//GEN-LAST:event_TextTensionMinimaKeyTyped

    private void TextPulsoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPulsoKeyTyped
        // Que no pueda escribir letras
        char c = evt.getKeyChar();
        
        if (!(c == '1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0' || c==',' || c=='.')) evt.consume();
    }//GEN-LAST:event_TextPulsoKeyTyped

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(I_Actualizar_Historia_Medica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(I_Actualizar_Historia_Medica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(I_Actualizar_Historia_Medica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(I_Actualizar_Historia_Medica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new I_Actualizar_Historia_Medica().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextImdc;
    private javax.swing.JTextField TextPeso;
    private javax.swing.JTextField TextPulso;
    private javax.swing.JTextField TextTalla;
    private javax.swing.JTextField TextTensionMaxima;
    private javax.swing.JTextField TextTensionMinima;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
