/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author JESSY
 */
public class GestionarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form GestionarEmpleado
     */
    public GestionarEmpleado() {
        initComponents();
        
        //Descactivas la opción de ampliar pantalla
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_RegistrarEmpleado_GestionarEmpleado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_MostrarEmpleado_GestionarEmpleado = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btn_ModificarEmpleado_GestionarEmpleado = new javax.swing.JButton();
        btn_Salir_GestionarEmpleado = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("© 2024. Creado y diseñado por Peter Son Alcoser");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrar Empleado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 120, 20));

        btn_RegistrarEmpleado_GestionarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btn_RegistrarEmpleado_GestionarEmpleado.setIcon(new javax.swing.ImageIcon("C:\\Users\\JESSY\\OneDrive - Universidad Tecnologica del Peru\\ciclo 7\\integrador 1\\proyecto 1\\SupertPet\\src\\main\\java\\Imagenes\\interfaz\\ImgGestionarEmpleado\\imagen2.png")); // NOI18N
        btn_RegistrarEmpleado_GestionarEmpleado.setBorder(null);
        btn_RegistrarEmpleado_GestionarEmpleado.setBorderPainted(false);
        btn_RegistrarEmpleado_GestionarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarEmpleado_GestionarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_RegistrarEmpleado_GestionarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JESSY\\OneDrive - Universidad Tecnologica del Peru\\ciclo 7\\integrador 1\\proyecto 1\\SupertPet\\src\\main\\java\\Imagenes\\interfaz\\ImgGestionarEmpleado\\cat1-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 430, 210));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_MostrarEmpleado_GestionarEmpleado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tbl_MostrarEmpleado_GestionarEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Código", "Nombre", "Apellido", "Sexo", "DNI", "Número Contacto", "Puesto Trabajo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_MostrarEmpleado_GestionarEmpleado);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 870, 350));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Editar Empleado");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 100, 20));

        btn_ModificarEmpleado_GestionarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btn_ModificarEmpleado_GestionarEmpleado.setIcon(new javax.swing.ImageIcon("C:\\Users\\JESSY\\OneDrive - Universidad Tecnologica del Peru\\ciclo 7\\integrador 1\\proyecto 1\\SupertPet\\src\\main\\java\\Imagenes\\interfaz\\ImgGestionarEmpleado\\imagen2.png")); // NOI18N
        btn_ModificarEmpleado_GestionarEmpleado.setBorder(null);
        btn_ModificarEmpleado_GestionarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarEmpleado_GestionarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ModificarEmpleado_GestionarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 870, 490));

        btn_Salir_GestionarEmpleado.setBackground(new java.awt.Color(30, 60, 101));
        btn_Salir_GestionarEmpleado.setForeground(new java.awt.Color(30, 60, 101));
        btn_Salir_GestionarEmpleado.setIcon(new javax.swing.ImageIcon("C:\\Users\\JESSY\\OneDrive - Universidad Tecnologica del Peru\\ciclo 7\\integrador 1\\proyecto 1\\SupertPet\\src\\main\\java\\Imagenes\\interfaz\\ImgGestionarEmpleado\\imagen5.jpg")); // NOI18N
        btn_Salir_GestionarEmpleado.setBorder(null);
        btn_Salir_GestionarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_GestionarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Salir_GestionarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 50));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel12.setText("REGRESAR");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JESSY\\OneDrive - Universidad Tecnologica del Peru\\ciclo 7\\integrador 1\\proyecto 1\\SupertPet\\src\\main\\java\\Imagenes\\interfaz\\ImgGestionarEmpleado\\imagen1.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Salir_GestionarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_GestionarEmpleadoActionPerformed

        VistaPrevia vp = new VistaPrevia();
        vp.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_Salir_GestionarEmpleadoActionPerformed

    private void btn_RegistrarEmpleado_GestionarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarEmpleado_GestionarEmpleadoActionPerformed
        
        RegistrarEmpleado re = new RegistrarEmpleado();
        re.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_RegistrarEmpleado_GestionarEmpleadoActionPerformed

    private void btn_ModificarEmpleado_GestionarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarEmpleado_GestionarEmpleadoActionPerformed
       
        ModificarEmpleado me = new ModificarEmpleado();
        me.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_ModificarEmpleado_GestionarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ModificarEmpleado_GestionarEmpleado;
    private javax.swing.JButton btn_RegistrarEmpleado_GestionarEmpleado;
    private javax.swing.JButton btn_Salir_GestionarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_MostrarEmpleado_GestionarEmpleado;
    // End of variables declaration//GEN-END:variables
}
