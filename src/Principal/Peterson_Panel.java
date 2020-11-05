
package Principal;

public class Peterson_Panel extends javax.swing.JInternalFrame {

    public Peterson_Panel() {
        initComponents();
        rc = new RcCC();
        h1 = new Peterson_Brain(0, Area1, rc, 0, "perrito 1");
        h1.setName("Perrito 1");
        
        h2 = new Peterson_Brain(1, Area2, rc, 1, "perrito 2");
        h2.setName("Perrito 2");
        
        h3 = new Peterson_Brain(0, Area3, rc, 0, "perrito 3");
        h3.setName("perrito 3");
        
        h4 = new Peterson_Brain(1, Area4, rc, 1, "perrito 4");
        h4.setName("perrito 4");
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Area3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Area4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ejecutar = new javax.swing.JButton();
        Kill = new javax.swing.JButton();

        setBorder(null);

        jLabel1.setText("Peterson");

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        Area2.setColumns(20);
        Area2.setRows(5);
        jScrollPane2.setViewportView(Area2);

        Area3.setColumns(20);
        Area3.setRows(5);
        jScrollPane3.setViewportView(Area3);

        Area4.setColumns(20);
        Area4.setRows(5);
        jScrollPane4.setViewportView(Area4);

        jLabel2.setText("Perrito 1");

        jLabel3.setText("Perrito 2");

        jLabel4.setText("Perrito 3");

        jLabel5.setText("Perrito 4");

        Ejecutar.setText("Ejecutar");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });

        Kill.setText("Kill");
        Kill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ejecutar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Kill, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel3)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4)))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ejecutar)
                    .addComponent(Kill))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed
            h1.start();
            h2.start();
            h3.start();
            h4.start();
    }//GEN-LAST:event_EjecutarActionPerformed

    private void KillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KillActionPerformed
        if(Kills == 0){
            h1.detener();
            Kills++;
        }else if(Kills == 1){
            h2.detener();
            Kills++;
        }else if(Kills == 2){
            h3.detener();
            Kills++;
        }else if(Kills == 3){
            h4.detener();
            Kills++;
        }
    }//GEN-LAST:event_KillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JTextArea Area2;
    private javax.swing.JTextArea Area3;
    private javax.swing.JTextArea Area4;
    private javax.swing.JButton Ejecutar;
    private javax.swing.JButton Kill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
    
    //Declaracion de nuestras variables
    Peterson_Brain h1, h2, h3, h4;
    RcCC rc;
    int Kills = 0;
}
