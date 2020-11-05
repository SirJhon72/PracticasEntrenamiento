
package Principal;

public class PanelPrincipal extends javax.swing.JFrame {

    public PanelPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CondicionesCompeteciaMenu = new javax.swing.JMenuItem();
        DekkerMenu = new javax.swing.JMenuItem();
        PetersonMenu = new javax.swing.JMenuItem();
        MutexMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        jMenu1.setText("Algoritmo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        CondicionesCompeteciaMenu.setText("Condiciones de Competencia");
        CondicionesCompeteciaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CondicionesCompeteciaMenuActionPerformed(evt);
            }
        });
        jMenu1.add(CondicionesCompeteciaMenu);

        DekkerMenu.setText("Dekker");
        DekkerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DekkerMenuActionPerformed(evt);
            }
        });
        jMenu1.add(DekkerMenu);

        PetersonMenu.setText("Peterson");
        PetersonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetersonMenuActionPerformed(evt);
            }
        });
        jMenu1.add(PetersonMenu);

        MutexMenu.setText("Mutex");
        MutexMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutexMenuActionPerformed(evt);
            }
        });
        jMenu1.add(MutexMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Test");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void MutexMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutexMenuActionPerformed
        Mutex_Panel cc = new Mutex_Panel();
        Escritorio.add(cc);
        Escritorio.setSize(cc.getWidth(), cc.getHeight());
        this.setSize(cc.getWidth(), cc.getHeight()+50);
        cc.setLocation(0,-23);
        cc.show();
    }//GEN-LAST:event_MutexMenuActionPerformed

    private void PetersonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetersonMenuActionPerformed
        Peterson_Panel cc = new Peterson_Panel();
        Escritorio.add(cc);
        Escritorio.setSize(cc.getWidth(), cc.getHeight());
        this.setSize(cc.getWidth(), cc.getHeight()+50);
        cc.setLocation(0,-23);
        cc.show();
    }//GEN-LAST:event_PetersonMenuActionPerformed

    private void DekkerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DekkerMenuActionPerformed
        Dekker_Panel cc = new Dekker_Panel();
        Escritorio.add(cc);
        Escritorio.setSize(cc.getWidth(), cc.getHeight());
        this.setSize(cc.getWidth(), cc.getHeight()+50);
        cc.setLocation(0,-23);
        cc.show();
    }//GEN-LAST:event_DekkerMenuActionPerformed

    //Condiciones de competencia MENU
    private void CondicionesCompeteciaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CondicionesCompeteciaMenuActionPerformed
        CondicionesCompetencia cc = new CondicionesCompetencia();
        Escritorio.add(cc);
        Escritorio.setSize(cc.getWidth(), cc.getHeight());
        this.setSize(cc.getWidth(), cc.getHeight()+50);
        cc.setLocation(0,-23);
        cc.show();

    }//GEN-LAST:event_CondicionesCompeteciaMenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CondicionesCompeteciaMenu;
    private javax.swing.JMenuItem DekkerMenu;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem MutexMenu;
    private javax.swing.JMenuItem PetersonMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
