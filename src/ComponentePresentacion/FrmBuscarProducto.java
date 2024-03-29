
package ComponentePresentacion;

import ComponenteClase.Producto;
import ComponenteDatos.BDProducto;
import java.awt.event.*;
import java.net.*;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Steven
 */
public abstract class FrmBuscarProducto extends javax.swing.JFrame {
    DefaultTableModel LProductos = new DefaultTableModel();
    private FrmTransaccion frmt;

    /** Creates new form FrmBuscarProducto */
    public FrmBuscarProducto(final FrmTransaccion frmt) {
        /*
         *
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        this.frmt = frmt;
        /*
         */
        String titulos[] = {"IdPROD.", "NOMBRE", "PRECIO UND.", "STOCK", "UNID.MED"};
        LProductos.setColumnIdentifiers(titulos);
        try {
            for (Producto p : BDProducto.mostrarProducto()) {
                /* String.valueOf(p.getSexo())*/
                String Datos[] = {String.valueOf(p.getIdProducto()), p.getNombre(), String.valueOf(p.getPreciounidad()), String.valueOf(p.getStock()), p.getUnidadMed()};
                LProductos.addRow(Datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        /*
         */
        /*
         * Metodo que me permitira poder obtener los elementos de una fila, cuando es seleccionada de un JTABLE
         */
        jtproductos.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = jtproductos.rowAtPoint(e.getPoint());
                int columna = jtproductos.columnAtPoint(e.getPoint());
                if ((fila > -1) && (columna > -1)) {
                    try {
                        //System.out.println(LProductos.getValueAt(fila, 0));
                        Producto u = BDProducto.buscarProducto(Integer.parseInt(String.valueOf(LProductos.getValueAt(fila, 0))));
                        frmt.txtNombrePT.setText(u.getNombre());
                        frmt.txtIdProdT.setText(String.valueOf(u.getIdProducto()));
                        frmt.txtPrecioUndT.setText(String.valueOf(u.getPreciounidad()));
                        frmt.txtStockT.setText(String.valueOf(u.getStock()));
                        frmt.txtUnidadMedT.setText(u.getUnidadMed());
                        frmt.jpImageProd.removeAll();
                        try {
                            URL url = new URL(u.getImagen());
                            frmt.m.setObtener(url);
                            frmt.m.Mostrar(frmt.jpImageProd);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(JDListaProductos.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(FrmBuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtproductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(81, 105, 138));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE PRODUCTOS");

        jtproductos.setBackground(new java.awt.Color(247, 254, 255));
        jtproductos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtproductos.setModel(LProductos);
        jScrollPane1.setViewportView(jtproductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrmBuscarProducto(null) {
                }.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtproductos;
    // End of variables declaration//GEN-END:variables
}
