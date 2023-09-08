/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Conexion;

/**
 *
 * @author Cristian
 */
public class Inscripcion extends javax.swing.JFrame {
     Conexion con = new Conexion();
    Connection cn = con.conectar();
    /**
     * Creates new form Inscripcion
     */
    public Inscripcion() {
        initComponents();
        llenarComboBoxAlumno();
        llenarComboMateria();
        txtIdAlumno.setVisible(false);
        txtIdMateria.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboAlumno = new javax.swing.JComboBox<>();
        comboMateria = new javax.swing.JComboBox<>();
        txtIdAlumno = new javax.swing.JTextField();
        txtIdMateria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboNota = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Inscripción"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Id Inscripción");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 150, 29));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 60, 40));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Alumno");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 121, 29));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Materia");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 121, 29));

        comboAlumno.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        comboAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        comboAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(comboAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 199, 190, 40));

        comboMateria.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        comboMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        comboMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMateriaActionPerformed(evt);
            }
        });
        jPanel1.add(comboMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 259, 190, 40));
        jPanel1.add(txtIdAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 20, -1));
        jPanel1.add(txtIdMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 20, -1));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nota");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 121, 29));

        comboNota.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        comboNota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(comboNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 319, 190, 40));

        btnRegistrar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        btnSalir.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 93, -1));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/63144(achicada).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 14, 780, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlumnoActionPerformed
        
        String sql = "select * from alumno where nombre = '"+comboAlumno.getSelectedItem()+"'";
        Statement st;
        
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
          rs.next();
          this.txtIdAlumno.setText(rs.getString("idAlumno"));
        } catch (Exception e) {
            System.out.println("Error al mostrar datos " + e);
        }
    
    }//GEN-LAST:event_comboAlumnoActionPerformed

    private void comboMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMateriaActionPerformed
        String sql = "select * from materia where nombre = '"+comboMateria.getSelectedItem()+"'";
        Statement st;
        
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
          rs.next();
          this.txtIdMateria.setText(rs.getString("idMateria"));
        } catch (Exception e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }//GEN-LAST:event_comboMateriaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        int idAlumno = Integer.parseInt(txtIdAlumno.getText());
        int idMateria = Integer.parseInt(txtIdMateria.getText());
        int nota = Integer.parseInt(comboNota.getSelectedItem().toString());
        
        String sql = "INSERT INTO inscripción (idAlumno,idMateria,nota) VALUES (?,?,?)";
        try {

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.setInt(3, nota);
            //seteo Date en la BD parseando el String a Date.  
        

            ps.execute();
            JOptionPane.showMessageDialog(this, "Ingreso Exitoso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No se cargó correctamente " + e);
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboAlumno;
    private javax.swing.JComboBox<String> comboMateria;
    private javax.swing.JComboBox<String> comboNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtIdMateria;
    // End of variables declaration//GEN-END:variables

    public void llenarComboBoxAlumno(){
        
        String sql = "select * from alumno";
        Statement st;
        
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
              this.comboAlumno.addItem(rs.getString("nombre"));
//               String nombre = rs.getString("nombre");
//              System.out.println(nombre);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }
    
    public void llenarComboMateria(){
        
        String sql = "select * from materia";
        Statement st;
        
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
              this.comboMateria.addItem(rs.getString("nombre"));
//              String nombre = rs.getString("nombre");
//                System.out.println(nombre);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }
}