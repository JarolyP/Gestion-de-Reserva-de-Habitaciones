/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;

/**
 *
 * @author Acer
 */
public class frmInicio extends javax.swing.JFrame {

    /**
     * Creates new form frmInicio
     */
    public frmInicio() {
        initComponents();
        this.setExtendedState(frmInicio.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Reserva de Habitaciones y Gestión de ventas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        lblIdPersona = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblAPaterno = new javax.swing.JLabel();
        lblAMaterno = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        btnSisReserva = new javax.swing.JMenu();
        btnArchivo = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        btnReservas = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnConsultas = new javax.swing.JMenu();
        btnConfiguraciones = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnHerramientas = new javax.swing.JMenu();
        btnAyuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(51, 255, 255));

        lblIdPersona.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIdPersona.setForeground(new java.awt.Color(0, 0, 0));
        lblIdPersona.setText("jLabel1");
        Escritorio.add(lblIdPersona);
        lblIdPersona.setBounds(10, 20, 120, 19);

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("jLabel2");
        Escritorio.add(lblNombre);
        lblNombre.setBounds(10, 60, 130, 19);

        lblAPaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAPaterno.setForeground(new java.awt.Color(0, 0, 0));
        lblAPaterno.setText("jLabel3");
        Escritorio.add(lblAPaterno);
        lblAPaterno.setBounds(10, 100, 130, 19);

        lblAMaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAMaterno.setForeground(new java.awt.Color(0, 0, 0));
        lblAMaterno.setText("jLabel4");
        Escritorio.add(lblAMaterno);
        lblAMaterno.setBounds(10, 150, 120, 19);

        lblAcceso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAcceso.setForeground(new java.awt.Color(0, 0, 0));
        lblAcceso.setText("jLabel5");
        Escritorio.add(lblAcceso);
        lblAcceso.setBounds(10, 200, 120, 19);

        btnSisReserva.setMnemonic('f');
        btnSisReserva.setText("SisReseva");
        menuBar.add(btnSisReserva);

        btnArchivo.setMnemonic('e');
        btnArchivo.setText("Archivo");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Habitaciones");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        btnArchivo.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Productos");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        btnArchivo.add(copyMenuItem);

        menuBar.add(btnArchivo);

        btnReservas.setMnemonic('h');
        btnReservas.setText("Reservas");

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Reservas y Consumos");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        btnReservas.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Clientes");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        btnReservas.add(aboutMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Pagos");
        btnReservas.add(jMenuItem1);

        menuBar.add(btnReservas);

        btnConsultas.setText("Consultas");
        menuBar.add(btnConsultas);

        btnConfiguraciones.setText("Configuraciones");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Usuarios y Accesos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnConfiguraciones.add(jMenuItem2);

        menuBar.add(btnConfiguraciones);

        btnHerramientas.setText("Herraminetas");
        menuBar.add(btnHerramientas);

        btnAyuda.setText("Ayuda");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Acerca de...");
        btnAyuda.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Ayuda");
        btnAyuda.add(jMenuItem4);

        menuBar.add(btnAyuda);

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        menuBar.add(btnSalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        frmHabitacion form = new frmHabitacion();
        Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        frmProducto form = new frmProducto();
        Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        frmCliente form = new frmCliente();
        Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmTrabajador form = new frmTrabajador();
        Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        frmReserva form = new frmReserva();
        Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        frmReserva.txtIdTrabajador.setText(lblIdPersona.getText());
        frmReserva.txtTrabajador.setText(lblNombre.getText()+ " " + lblAPaterno.getText());
        frmReserva.idusuario=Integer.parseInt(lblIdPersona.getText());
    }//GEN-LAST:event_contentMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem aboutMenuItem;
    public static javax.swing.JMenu btnArchivo;
    private javax.swing.JMenu btnAyuda;
    public static javax.swing.JMenu btnConfiguraciones;
    private javax.swing.JMenu btnConsultas;
    private javax.swing.JMenu btnHerramientas;
    private javax.swing.JMenu btnReservas;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JMenu btnSisReserva;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JLabel lblAMaterno;
    public static javax.swing.JLabel lblAPaterno;
    public static javax.swing.JLabel lblAcceso;
    public static javax.swing.JLabel lblIdPersona;
    public static javax.swing.JLabel lblNombre;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
