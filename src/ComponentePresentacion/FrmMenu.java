package ComponentePresentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;



public abstract class FrmMenu extends javax.swing.JFrame {

   
    public FrmMenu() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        // FECHA DEL SISTEMA 
        Date sistFecha = new Date();
        SimpleDateFormat formato  = new SimpleDateFormat("dd-MMM-YYYY");
        fecha.setText(formato.format(sistFecha));
        this.setLocationRelativeTo(null);
        
        Timer tiempo = new Timer(100, new FrmMenu.horas());
        tiempo.start();
        
    }
    
    // HORA
    class horas implements ActionListener {
        public void actionPerformed (ActionEvent e ){
            Date sistHora = new Date();
            String pmAm="hh:mm:ss a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy =  Calendar.getInstance();
            hora.setText(String.format(format.format(sistHora),hoy));
        }

 
    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        lblNomUserlogeado = new javax.swing.JLabel();
        lblApUsuariologeado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMInicio = new javax.swing.JMenu();
        JMISalir = new javax.swing.JMenuItem();
        JMVenta = new javax.swing.JMenu();
        JMIGenerarVenta = new javax.swing.JMenuItem();
        JMMantenimiento = new javax.swing.JMenu();
        JMICategoria = new javax.swing.JMenuItem();
        JMICliente = new javax.swing.JMenuItem();
        JMIEmpleado = new javax.swing.JMenuItem();
        JMIProducto = new javax.swing.JMenuItem();
        JMIProveedor = new javax.swing.JMenuItem();
        JMIDetProv = new javax.swing.JMenuItem();
        JMIUsuario = new javax.swing.JMenuItem();
        JMAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Farmacias ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/imageToMP.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel4.setText("BRINDAR UN BUEN SERVICIO AL CLIENTE ES LO PRIMORDIAL ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel8.setText("POR ESO ATIENDELO BIEN Y SERAS RECOMPENSADO.....");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BIENVENIDOS AL SISTEMA");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/p031_1_00.jpg"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.red));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DE ALCIMARS MEDIC SAC ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora :");

        fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("<<FECHA>>");

        hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setText("00h:00m:00s");

        lblNomUserlogeado.setFont(new java.awt.Font("Californian FB", 0, 16)); // NOI18N
        lblNomUserlogeado.setForeground(new java.awt.Color(255, 255, 255));
        lblNomUserlogeado.setText("Nombrel Usuario");

        lblApUsuariologeado.setFont(new java.awt.Font("Californian FB", 0, 16)); // NOI18N
        lblApUsuariologeado.setForeground(new java.awt.Color(255, 255, 255));
        lblApUsuariologeado.setText("datos compltos del usuario que se logeo");

        jLabel11.setFont(new java.awt.Font("Californian FB", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(fecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(hora))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomUserlogeado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblApUsuariologeado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)))
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fecha)
                            .addComponent(jLabel2)
                            .addComponent(hora))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomUserlogeado)
                            .addComponent(jLabel11)
                            .addComponent(lblApUsuariologeado))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JMInicio.setText("INICIO");

        JMISalir.setText("Salir");
        JMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMISalirActionPerformed(evt);
            }
        });
        JMInicio.add(JMISalir);

        jMenuBar1.add(JMInicio);

        JMVenta.setText("VENTA");

        JMIGenerarVenta.setText("Generar Venta");
        JMIGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGenerarVentaActionPerformed(evt);
            }
        });
        JMVenta.add(JMIGenerarVenta);

        jMenuBar1.add(JMVenta);

        JMMantenimiento.setText("MANTENIMIENTO");

        JMICategoria.setText("CATEGORIA");
        JMICategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICategoriaActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMICategoria);

        JMICliente.setText("CLIENTE");
        JMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIClienteActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMICliente);

        JMIEmpleado.setText("EMPLEADO");
        JMIEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIEmpleadoActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIEmpleado);

        JMIProducto.setText("PRODUCTO");
        JMIProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIProductoActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIProducto);

        JMIProveedor.setText("PROVEEDOR");
        JMIProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIProveedorActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIProveedor);

        JMIDetProv.setText("DETALLE-PROVEEDOR");
        JMIDetProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIDetProvActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIDetProv);

        JMIUsuario.setText("USUARIO");
        JMIUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIUsuarioActionPerformed(evt);
            }
        });
        JMMantenimiento.add(JMIUsuario);

        jMenuBar1.add(JMMantenimiento);

        JMAyuda.setText("AYUDA");
        jMenuBar1.add(JMAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMICategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICategoriaActionPerformed
        // TODO add your handling code here:
        FrmCategoria Frmc= new FrmCategoria();
        Frmc.setVisible(true);
    }//GEN-LAST:event_JMICategoriaActionPerformed

    private void JMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIClienteActionPerformed
        // TODO add your handling code here:
        FrmCliente Frmcl= new FrmCliente();
        Frmcl.setVisible(true);
    }//GEN-LAST:event_JMIClienteActionPerformed

    private void JMIEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIEmpleadoActionPerformed
        // TODO add your handling code here:
        FrmEmpleado Frme= new FrmEmpleado();
        Frme.setVisible(true);
    }//GEN-LAST:event_JMIEmpleadoActionPerformed

    private void JMIProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIProductoActionPerformed
        // TODO add your handling code here:
        FrmProducto Frmp= new FrmProducto();
        Frmp.setVisible(true);
    }//GEN-LAST:event_JMIProductoActionPerformed

    private void JMIProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIProveedorActionPerformed
        // TODO add your handling code here:
        FrmProveedor Frmp= new FrmProveedor();
        Frmp.setVisible(true);
    }//GEN-LAST:event_JMIProveedorActionPerformed

    private void JMIUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIUsuarioActionPerformed
        // TODO add your handling code here:
        FrmUsuario FrmUs= new FrmUsuario();
        FrmUs.setVisible(true);
    }//GEN-LAST:event_JMIUsuarioActionPerformed

    private void JMIGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGenerarVentaActionPerformed
        // TODO add your handling code here:
        FrmNuevaCompra FrmComp= new FrmNuevaCompra();
        FrmComp.setVisible(true);
    }//GEN-LAST:event_JMIGenerarVentaActionPerformed

    private void JMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMISalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JMISalirActionPerformed

    private void JMIDetProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIDetProvActionPerformed
        // TODO add your handling code here:
        FrmDetalleProveedor frmdp= new FrmDetalleProveedor();
        frmdp.setVisible(true);

    }//GEN-LAST:event_JMIDetProvActionPerformed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMenu() {}.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMAyuda;
    private javax.swing.JMenuItem JMICategoria;
    private javax.swing.JMenuItem JMICliente;
    private javax.swing.JMenuItem JMIDetProv;
    private javax.swing.JMenuItem JMIEmpleado;
    private javax.swing.JMenuItem JMIGenerarVenta;
    private javax.swing.JMenuItem JMIProducto;
    private javax.swing.JMenuItem JMIProveedor;
    private javax.swing.JMenuItem JMISalir;
    private javax.swing.JMenuItem JMIUsuario;
    private javax.swing.JMenu JMInicio;
    private javax.swing.JMenu JMMantenimiento;
    private javax.swing.JMenu JMVenta;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblApUsuariologeado;
    public static javax.swing.JLabel lblNomUserlogeado;
    // End of variables declaration//GEN-END:variables

}
