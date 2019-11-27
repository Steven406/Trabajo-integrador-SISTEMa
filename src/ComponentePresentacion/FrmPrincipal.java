
package ComponentePresentacion;

import java.awt.Color;
import javax.swing.UIManager;
import java.awt.BorderLayout;

/**
 *
 * @author Steven
 */
public abstract  class  FrmPrincipal extends javax.swing.JFrame {
    FrmPanelFondoPrincipal fondoprinc = new FrmPanelFondoPrincipal();
    /** Creates new form FrmPrincipal */
    public FrmPrincipal() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setUndecorated(true);
        initComponents();
        iniciarCarga();
        iniciarSplash();
        this.setSize(500, 300);
        this.add(fondoprinc, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.pack();
    }

    public void iniciarCarga() { //Utilizando Hilos
        new Thread() {

            @Override
            public void run() {
                int i = 0;
                while (i <= 100) {
                    i++;
                    progreso.setValue(i);
                    try {
                        sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }.start();
    }

   public void iniciarSplash() {
        this.getjProgressBar().setBorderPainted(true);
        this.getjProgressBar().setForeground(new Color(100, 120, 50, 50));
        this.getjProgressBar().setStringPainted(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setResizable(false);

        progreso.setForeground(new java.awt.Color(252, 193, 64));
        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged
        // TODO add your handling code here:
        if (progreso.getValue()== 100) {
            FrmLogin logearse = new FrmLogin() {};
            logearse.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_progresoStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FrmPrincipal() {}.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables

   public javax.swing.JProgressBar getjProgressBar() {
       return progreso;
    }
}
