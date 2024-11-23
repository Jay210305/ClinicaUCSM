package gdi_04.clinica_odontologica.pages;

public class Gestion_de_estudiantes extends javax.swing.JPanel {

    private void InitStyles() {
        
    }
    
    public Gestion_de_estudiantes() {
        initComponents();
        InitStyles();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Background = new javax.swing.JPanel();
        APaternoInput = new javax.swing.JTextField();
        NombresInput = new javax.swing.JTextField();
        NombresLabel = new javax.swing.JLabel();
        APaternoLabel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        APaternoLabel1 = new javax.swing.JLabel();
        APaternoInput1 = new javax.swing.JTextField();
        APaternoInput2 = new javax.swing.JTextField();
        APaternoLabel2 = new javax.swing.JLabel();
        APaternoInput3 = new javax.swing.JTextField();
        APaternoLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        NombresLabel1 = new javax.swing.JLabel();
        NombresInput1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(960, 620));

        Background.setPreferredSize(new java.awt.Dimension(960, 620));

        APaternoInput.setPreferredSize(new java.awt.Dimension(325, 35));
        APaternoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APaternoInputActionPerformed(evt);
            }
        });

        NombresInput.setPreferredSize(new java.awt.Dimension(325, 35));
        NombresInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresInputActionPerformed(evt);
            }
        });

        NombresLabel.setText("Nombre(s)");

        APaternoLabel.setText("Apellido Paterno");

        Title.setText("Gestión de Estudiantes");

        jLabel1.setText("Nuevo Estudiante");

        APaternoLabel1.setText("Apellido Paterno");

        APaternoInput1.setPreferredSize(new java.awt.Dimension(325, 35));
        APaternoInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APaternoInput1ActionPerformed(evt);
            }
        });

        APaternoInput2.setPreferredSize(new java.awt.Dimension(325, 35));
        APaternoInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APaternoInput2ActionPerformed(evt);
            }
        });

        APaternoLabel2.setText("Codigo estudiante");

        APaternoInput3.setPreferredSize(new java.awt.Dimension(325, 35));
        APaternoInput3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APaternoInput3ActionPerformed(evt);
            }
        });

        APaternoLabel3.setText("Email");

        NombresLabel1.setText("Número de telefono");

        NombresInput1.setPreferredSize(new java.awt.Dimension(325, 35));
        NombresInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresInput1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Editar info. Estudiante");

        jPanel1.setBackground(new java.awt.Color(29, 90, 126));
        jPanel1.setPreferredSize(new java.awt.Dimension(1, 221));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombresInput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombresLabel1)
                    .addComponent(jLabel1)
                    .addComponent(Title)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(NombresLabel)
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(NombresInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(APaternoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(APaternoInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(APaternoLabel)
                                .addGap(85, 85, 85)
                                .addComponent(APaternoLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(APaternoInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(APaternoLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(APaternoLabel3)
                            .addComponent(APaternoInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombresLabel)
                    .addComponent(APaternoLabel)
                    .addComponent(APaternoLabel1)
                    .addComponent(APaternoLabel2)
                    .addComponent(APaternoLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APaternoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APaternoInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APaternoInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APaternoInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombresInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombresLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombresInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void APaternoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APaternoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APaternoInputActionPerformed

    private void NombresInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombresInputActionPerformed

    private void APaternoInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APaternoInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APaternoInput1ActionPerformed

    private void APaternoInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APaternoInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APaternoInput2ActionPerformed

    private void APaternoInput3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APaternoInput3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APaternoInput3ActionPerformed

    private void NombresInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombresInput1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APaternoInput;
    private javax.swing.JTextField APaternoInput1;
    private javax.swing.JTextField APaternoInput2;
    private javax.swing.JTextField APaternoInput3;
    private javax.swing.JLabel APaternoLabel;
    private javax.swing.JLabel APaternoLabel1;
    private javax.swing.JLabel APaternoLabel2;
    private javax.swing.JLabel APaternoLabel3;
    private javax.swing.JPanel Background;
    private javax.swing.JTextField NombresInput;
    private javax.swing.JTextField NombresInput1;
    private javax.swing.JLabel NombresLabel;
    private javax.swing.JLabel NombresLabel1;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
