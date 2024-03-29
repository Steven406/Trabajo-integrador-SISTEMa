
package ComponentePresentacion;

import ComponenteClase.Empleado;
import ComponenteDatos.BDEmpleado;
import ComponenteOtros.*;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class FrmEmpleado extends javax.swing.JFrame {

    public FrmEmpleado() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
   
    }
    metodos m = new metodos() {};
    String ImagenURL;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    public void Mostrar(JPanel p) {
        try {
            //se asigna a "url" el archivo de imagen seleccionado
            URL url = m.getObtener();
            //se lo coloca en memoria
            m.cargar_imagen(url);
            //se aÃ±ade al contenedor
            p.add(new mipanel(m.Obtener_imagen_de_Buffer(), p.getSize()) {});
            p.setVisible(true);
            p.repaint();
        } catch (Exception ex) {
            Logger.getLogger(metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
     * Metodo para Buscar:
     */
     public void buscarEmpleado()
     {
         Empleado emp = null;
        try {
            emp = BDEmpleado.buscarEmpleadoDNI(Integer.parseInt(txtDniE.getText()));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
        if (emp != null) {
            try {
                txtNroEmpleado.setText(String.valueOf(emp.getNroEmpleado()));
                txtDniE.setText(String.valueOf(emp.getDni()));
                txtNombreE.setText(emp.getNombre());
                txtApellidoE.setText(emp.getApellido());
                txtEdadE.setText(String.valueOf(emp.getEdad()));
                txtTelefonoE.setText(emp.getTelefono());
                cboSexoE.setSelectedItem(emp.getSexo());
                txtCelularE.setText(emp.getCelular());
                txtEmailE.setText(emp.getEmail());
                txtDireccionE.setText(emp.getDireccion());
                URL url = new URL(emp.getImagen());
                m.setObtener(url);
                m.Mostrar(JPImagen);
            } catch (MalformedURLException ex) {
                Logger.getLogger(FrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No exite");
        }
     }
    public void LimpiarTextos()
    {
        txtNroEmpleado.setText("");
        txtDniE.setText("");
        txtNombreE.setText("");
        txtApellidoE.setText("");
        txtEdadE.setText("");
        txtEmailE.setText("");
        txtTelefonoE.setText("");
        txtCelularE.setText("");
        txtDireccionE.setText("");
        JPImagen.removeAll();
    }

    public void EstadoButton(boolean b)
    {
        btnNuevoE.setEnabled(!b);
        btnAgregarE.setEnabled(b);
        btnAbrirE.setEnabled(b);
        btnCancelarE.setEnabled(b);
        btnBuscarE.setEnabled(!b);
        btnEditarE.setEnabled(!b);
        btnEliminarE.setEnabled(!b);
        btnMostrarE.setEnabled(!b);

    }
    public void activarTextos(boolean t)
    {
        txtNombreE.setEditable(t);
        txtApellidoE.setEditable(t);
        txtEdadE.setEditable(t);
        cboSexoE.setEnabled(t);
        txtEmailE.setEditable(t);
        txtTelefonoE.setEditable(t);
        txtCelularE.setEditable(t);
        txtDireccionE.setEditable(t);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNroEmpleado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        JPImagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDniE = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDireccionE = new javax.swing.JTextField();
        txtEdadE = new javax.swing.JTextField();
        txtEmailE = new javax.swing.JTextField();
        txtTelefonoE = new javax.swing.JFormattedTextField();
        txtCelularE = new javax.swing.JFormattedTextField();
        cboSexoE = new javax.swing.JComboBox();
        btnBuscarE = new javax.swing.JButton();
        btnSalirE = new javax.swing.JButton();
        btnEditarE = new javax.swing.JButton();
        btnEliminarE = new javax.swing.JButton();
        btnNuevoE = new javax.swing.JButton();
        btnAbrirE = new javax.swing.JButton();
        btnMostrarE = new javax.swing.JButton();
        btnAgregarE = new javax.swing.JButton();
        btnCancelarE = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(81, 105, 138));

        jPanel1.setBackground(new java.awt.Color(247, 254, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Nro Empleado:");

        txtNroEmpleado.setEditable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        JPImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout JPImagenLayout = new javax.swing.GroupLayout(JPImagen);
        JPImagen.setLayout(JPImagenLayout);
        JPImagenLayout.setHorizontalGroup(
            JPImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        JPImagenLayout.setVerticalGroup(
            JPImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Dni:");

        try {
            txtDniE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDniE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniEActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Nombre:");

        txtNombreE.setEditable(false);
        txtNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel4.setText("Apellido:");

        txtApellidoE.setEditable(false);
        txtApellidoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel5.setText("Edad:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel7.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel6.setText("Sexo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel8.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel9.setText("Celular:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel10.setText("Direccion:");

        txtDireccionE.setEditable(false);

        txtEdadE.setEditable(false);

        txtEmailE.setEditable(false);
        txtEmailE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailEActionPerformed(evt);
            }
        });

        txtTelefonoE.setEditable(false);
        try {
            txtTelefonoE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCelularE.setEditable(false);
        try {
            txtCelularE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)-#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cboSexoE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F", "M" }));
        cboSexoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoEActionPerformed(evt);
            }
        });

        btnBuscarE.setText("...");
        btnBuscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEActionPerformed(evt);
            }
        });

        btnSalirE.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnSalirE.setText("Salir");
        btnSalirE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirEActionPerformed(evt);
            }
        });

        btnEditarE.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnEditarE.setText("Editar");
        btnEditarE.setEnabled(false);
        btnEditarE.setPreferredSize(new java.awt.Dimension(75, 23));
        btnEditarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEActionPerformed(evt);
            }
        });

        btnEliminarE.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnEliminarE.setText("Eliminar");
        btnEliminarE.setEnabled(false);
        btnEliminarE.setMaximumSize(new java.awt.Dimension(75, 23));
        btnEliminarE.setMinimumSize(new java.awt.Dimension(75, 23));
        btnEliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEActionPerformed(evt);
            }
        });

        btnNuevoE.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnNuevoE.setText("Nuevo");
        btnNuevoE.setPreferredSize(new java.awt.Dimension(65, 23));
        btnNuevoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEActionPerformed(evt);
            }
        });

        btnAbrirE.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnAbrirE.setText("Examinar");
        btnAbrirE.setEnabled(false);
        btnAbrirE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirEActionPerformed(evt);
            }
        });

        btnMostrarE.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnMostrarE.setText("Mostrar");
        btnMostrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEActionPerformed(evt);
            }
        });

        btnAgregarE.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnAgregarE.setText("Agregrar");
        btnAgregarE.setEnabled(false);
        btnAgregarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEActionPerformed(evt);
            }
        });

        btnCancelarE.setText("Cancelar");
        btnCancelarE.setEnabled(false);
        btnCancelarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalirE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDniE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscarE))
                                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cboSexoE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(14, 14, 14)
                                                    .addComponent(jLabel9))
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtTelefonoE)
                                                .addComponent(txtCelularE, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtEmailE, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(txtDireccionE, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtApellidoE, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAbrirE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoE, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDniE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnBuscarE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(cboSexoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtCelularE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDireccionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbrirE, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnAgregarE, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnEditarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalirE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REGISTRO DE EMPLEADO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirEActionPerformed
        // TODO add your handling code here:
        JPImagen.removeAll();
        m.Abrir_Dialogo(JPImagen);
        ImagenURL = m.ObtenerUrl();
    }//GEN-LAST:event_btnAbrirEActionPerformed

    private void txtDniEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniEActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDniEActionPerformed

    private void txtNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEKeyTyped
        // TODO add your handling code here:
        if (!String.valueOf(evt.getKeyChar()).matches("[a-zA-Z]|\\s")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreEKeyTyped

    private void txtApellidoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEKeyTyped
        // TODO add your handling code here:
        if (!String.valueOf(evt.getKeyChar()).matches("[a-zA-Z]|\\s")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoEKeyTyped

    private void txtEmailEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailEActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_txtEmailEActionPerformed

    private void btnAgregarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEActionPerformed
        // TODO add your handling code here:
   if(txtDniE.getText().compareTo("")!=0 && txtNombreE.getText().compareTo("")!=0&& txtApellidoE.getText().compareTo("")!=0 
      && txtEdadE.getText().compareTo("")!=0 && (txtCelularE.getText().compareTo("")!=0 || txtTelefonoE.getText().compareTo("")!=0)
      && txtDireccionE.getText().compareTo("")!=0){
        Empleado em = new Empleado() {};
        em.setDni(Integer.parseInt(txtDniE.getText()));
        em.setNombre(txtNombreE.getText());
        em.setApellido(txtApellidoE.getText());
        em.setEdad(Integer.parseInt(txtEdadE.getText()));
        em.setTelefono((txtTelefonoE.getText()));
        em.setSexo((String) cboSexoE.getSelectedItem());
        em.setCelular(txtCelularE.getText());
        em.setEmail(txtEmailE.getText());
        em.setDireccion(txtDireccionE.getText());
        em.setImagen(ImagenURL);
        try {
            BDEmpleado.insertarEmpleado(em);
            LimpiarTextos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "[ Datos Agregados ]");
   }else{
       JOptionPane.showMessageDialog(null, "Llene los Campos Obligatorios");
   }

    }//GEN-LAST:event_btnAgregarEActionPerformed

    private void btnBuscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEActionPerformed
        // TODO add your handling code here:
        if (txtDniE.getText().compareTo("")!= 0) {
            int result = JOptionPane.showConfirmDialog(
                    this, "Deseas Buscar al Empleado para Modificarlo?",
                    "Mensaje..!!",
                    JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                buscarEmpleado();
                btnNuevoE.setEnabled(false);
                btnMostrarE.setEnabled(false);
                btnCancelarE.setEnabled(true);
                btnAbrirE.setEnabled(true);
                btnEditarE.setEnabled(true);
                activarTextos(true);
            }
            if (result == JOptionPane.NO_OPTION) {
                buscarEmpleado();
                btnEliminarE.setEnabled(true);
                btnNuevoE.setEnabled(false);
                btnCancelarE.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese DNI que Desea Buscar");
        }
    }//GEN-LAST:event_btnBuscarEActionPerformed

    private void btnEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEActionPerformed
        // TODO add your handling code here:
        try {
            Empleado emp = BDEmpleado.buscarEmpleadoDNI(Integer.parseInt(txtDniE.getText()));
            if (emp == null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
                BDEmpleado.eliminarEmpleadoDNI(emp.getDni());
                JOptionPane.showMessageDialog(null, "Se Elimino Exitosamente..OKz!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        LimpiarTextos();
    }//GEN-LAST:event_btnEliminarEActionPerformed

    private void btnMostrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEActionPerformed
        // TODO add your handling code here:
        JDListaEmpleados LE = new JDListaEmpleados(this, true);
        LE.setVisible(true);
    }//GEN-LAST:event_btnMostrarEActionPerformed

    private void btnNuevoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEActionPerformed
        // TODO add your handling code here:
        LimpiarTextos();
        EstadoButton(true);
        activarTextos(true);
    }//GEN-LAST:event_btnNuevoEActionPerformed

    private void btnEditarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEActionPerformed
        // TODO add your handling code here:
        Empleado emp;
            try {
                emp = BDEmpleado.buscarEmpleadoSinIM(Integer.parseInt(txtNroEmpleado.getText()));
                emp.setDni(Integer.parseInt(txtDniE.getText()));
                emp.setNombre(txtNombreE.getText());
                emp.setApellido(txtApellidoE.getText());
                emp.setEdad(Integer.parseInt(txtEdadE.getText()));
                emp.setTelefono(txtTelefonoE.getText());
                emp.setSexo((String) cboSexoE.getSelectedItem());
                emp.setCelular(txtCelularE.getText());
                emp.setEmail(txtEmailE.getText());
                emp.setDireccion(txtDireccionE.getText());
                emp.setImagen(ImagenURL);
                BDEmpleado.actualizarEmpleado(emp);
                JOptionPane.showMessageDialog(null, " [ Datos Actualizados ]");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
        LimpiarTextos();
    }//GEN-LAST:event_btnEditarEActionPerformed

    private void btnSalirEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirEActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirEActionPerformed

    private void btnCancelarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEActionPerformed
        // TODO add your handling code here:
        LimpiarTextos();
        activarTextos(false);
        btnCancelarE.setEnabled(false);
        btnEliminarE.setEnabled(false);
        btnNuevoE.setEnabled(true);
        btnMostrarE.setEnabled(true);
        btnBuscarE.setEnabled(true);
        btnAgregarE.setEnabled(false);
        btnAbrirE.setEnabled(false);
        btnEditarE.setEnabled(false);
    }//GEN-LAST:event_btnCancelarEActionPerformed

    private void cboSexoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSexoEActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmEmpleado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPImagen;
    private javax.swing.JButton btnAbrirE;
    private javax.swing.JButton btnAgregarE;
    private javax.swing.JButton btnBuscarE;
    private javax.swing.JButton btnCancelarE;
    private javax.swing.JButton btnEditarE;
    private javax.swing.JButton btnEliminarE;
    private javax.swing.JButton btnMostrarE;
    private javax.swing.JButton btnNuevoE;
    private javax.swing.JButton btnSalirE;
    private javax.swing.JComboBox cboSexoE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JFormattedTextField txtCelularE;
    private javax.swing.JTextField txtDireccionE;
    private javax.swing.JFormattedTextField txtDniE;
    private javax.swing.JTextField txtEdadE;
    private javax.swing.JTextField txtEmailE;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNroEmpleado;
    private javax.swing.JFormattedTextField txtTelefonoE;
    // End of variables declaration//GEN-END:variables
}
