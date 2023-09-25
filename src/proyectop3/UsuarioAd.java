/* This project, along with all of its elements and content, is protected by copyright and belongs exclusively to its author, 
    Ana Karen Castillo López.*/
package proyectop3;
import javax.swing.JOptionPane; //Librería para mostrar mensajes emergentes
import java.awt.Image; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon; // Clase utilizada para los iconos del menú desplegable
import javax.swing.ImageIcon; // Clase utilizada para los iconos del menú desplegable
import java.util.Timer; // Librería para hacer uso del contador de tiempo
import java.util.TimerTask; // Librería para hacer uso del contador de tiempo
import desplazable.Desface;
import java.awt.Dimension;
import static proyectop3.Inicio.lbCursos;
import static proyectop3.Inicio.lbEstudiantes;
import static proyectop3.Inicio.lbAsistencias;

public class UsuarioAd extends javax.swing.JFrame {
    Desface desplace; // Objeto para menú desplegable
    private final String user;
    protected final String pass;
    public static boolean bandera=false;
    private ImageIcon foto, foto2, foto3;
    private Icon fondo, fondo2, fondo3;
    
    public UsuarioAd() {
        user = "Karen";
        pass = "4801";
        initComponents();
        desplace = new Desface();
        iconos();
        txtUser.requestFocus();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        menuPlegable = new javax.swing.JPanel();
        lbAsistencias = new javax.swing.JLabel();
        lbMenu = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        lbUsuario1 = new javax.swing.JLabel();
        lbCursos = new javax.swing.JLabel();
        lbEstudiantes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbImage1 = new javax.swing.JLabel();
        lbUPSLPimg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbUserIcon = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lbUnlockImg = new javax.swing.JLabel();
        lbUserImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 440));
        jPanel4.setVerifyInputWhenFocusTarget(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPlegable.setBackground(new java.awt.Color(255, 255, 255));
        menuPlegable.setLayout(null);

        lbAsistencias.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbAsistencias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAsistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoPaqueteBlock.png"))); // NOI18N
        lbAsistencias.setText("ASISTENCIAS");
        lbAsistencias.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbAsistencias.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbAsistencias.setIconTextGap(11);
        lbAsistencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAsistenciasMouseClicked(evt);
            }
        });
        menuPlegable.add(lbAsistencias);
        lbAsistencias.setBounds(0, 250, 130, 50);

        lbMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoMenu.png"))); // NOI18N
        lbMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMenuMouseClicked(evt);
            }
        });
        menuPlegable.add(lbMenu);
        lbMenu.setBounds(0, 0, 130, 50);

        lbInicio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoHome.png"))); // NOI18N
        lbInicio.setText("INICIO");
        lbInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbInicio.setIconTextGap(11);
        lbInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInicioMouseClicked(evt);
            }
        });
        menuPlegable.add(lbInicio);
        lbInicio.setBounds(0, 50, 130, 50);

        lbUsuario1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoUser.png"))); // NOI18N
        lbUsuario1.setText("USUARIO");
        lbUsuario1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbUsuario1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbUsuario1.setIconTextGap(11);
        lbUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUsuario1MouseClicked(evt);
            }
        });
        menuPlegable.add(lbUsuario1);
        lbUsuario1.setBounds(0, 100, 130, 50);

        lbCursos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbCursos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoRegistroBlock.png"))); // NOI18N
        lbCursos.setText("CURSOS");
        lbCursos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbCursos.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbCursos.setIconTextGap(11);
        lbCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCursosMouseClicked(evt);
            }
        });
        menuPlegable.add(lbCursos);
        lbCursos.setBounds(0, 150, 130, 50);

        lbEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoClienteBlock.png"))); // NOI18N
        lbEstudiantes.setText("ESTUDIANTES");
        lbEstudiantes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbEstudiantes.setIconTextGap(11);
        lbEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEstudiantesMouseClicked(evt);
            }
        });
        menuPlegable.add(lbEstudiantes);
        lbEstudiantes.setBounds(0, 200, 130, 50);

        jPanel4.add(menuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-78, 0, 133, 440));

        jPanel1.setBackground(new java.awt.Color(255, 190, 94));

        lbImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/florDecoration.png"))); // NOI18N
        lbImage1.setAutoscrolls(true);
        lbImage1.setMaximumSize(new java.awt.Dimension(800, 800));
        lbImage1.setMinimumSize(new java.awt.Dimension(500, 500));

        lbUPSLPimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upslpLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUPSLPimg)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbUPSLPimg))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 0, 164, 440));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbUserIcon.setBackground(new java.awt.Color(255, 204, 204));
        lbUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconUser.png"))); // NOI18N

        lbUsuario.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 153, 0));
        lbUsuario.setText("Usuario");

        txtUser.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("Escriba su usuario");
        txtUser.setBorder(null);

        lbPassword.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(255, 153, 0));
        lbPassword.setText("Contraseña");

        txtPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("contraseña");
        txtPassword.setBorder(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonIngresar.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lbUnlockImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unlockIcon.png"))); // NOI18N

        lbUserImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userProfileIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(lbUserIcon))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbUserImg))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbPassword))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbUnlockImg)
                .addGap(10, 10, 10)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbUserIcon)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUserImg))))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbPassword)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUnlockImg)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 430, 378));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void iconos(){
        if(bandera==true){ //Evalúa que se inició como administrador
            foto = new ImageIcon(getClass().getResource("/images/iconoCliente.png")); // Dirección de las imágenes dentro del proyecto
            fondo = new ImageIcon(foto.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT)); // Modifica la luminosidad del icono
            lbEstudiantes.setIcon(fondo); // Lo establce en el componente java correspondiente
            foto2 = new ImageIcon(getClass().getResource("/images/iconoRegistro.png"));
            fondo2 = new ImageIcon(foto2.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
            lbCursos.setIcon(fondo2);
            foto3 = new ImageIcon(getClass().getResource("/images/iconoPaquete.png"));
            fondo3 = new ImageIcon(foto3.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
            lbAsistencias.setIcon(fondo3);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if((txtUser.getText().equals(user)) && (txtPassword.getText().equals(pass))){
            JOptionPane.showMessageDialog(jPanel4, "Bienvenido Administrador");
            txtUser.setText("");
            txtPassword.setText("");
            bandera=true;
            iconos();
        }else{
            JOptionPane.showMessageDialog(null, "Acceso no Permitido");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbAsistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAsistenciasMouseClicked
        if(UsuarioAd.bandera==true){
            new Asistencias().setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(jPanel1, "No ha ingresado sesión como administrador");
        }
    }//GEN-LAST:event_lbAsistenciasMouseClicked

    private void lbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseClicked
        if(menuPlegable.getX() == 0){
            desplace.desplazarIzquierda(menuPlegable, menuPlegable.getX(), -78, 2, 2);
        }else if(menuPlegable.getX() == -78){
            desplace.desplazarDerecha(menuPlegable, menuPlegable.getX(), 0, 2, 2);
        }
    }//GEN-LAST:event_lbMenuMouseClicked

    private void lbInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInicioMouseClicked
        new Inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbInicioMouseClicked

    private void lbUsuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUsuario1MouseClicked
        JOptionPane.showMessageDialog(jPanel4, "Actualmente estás en la ventana de Usuario");
    }//GEN-LAST:event_lbUsuario1MouseClicked

    private void lbCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCursosMouseClicked
        if(UsuarioAd.bandera==true){
            new Cursos().setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(jPanel1, "No ha ingresado sesión como administrador");
        }
    }//GEN-LAST:event_lbCursosMouseClicked

    private void lbEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstudiantesMouseClicked
        if(UsuarioAd.bandera==true){
            try {
                new Estudiantes().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(jPanel1, "No ha ingresado sesión como administrador");
        }
    }//GEN-LAST:event_lbEstudiantesMouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        menuPlegable.setSize(new Dimension(menuPlegable.getWidth(), this.getHeight()));
        jPanel4.setSize(new Dimension(this.getWidth(), this.getHeight()));
        jPanel1.setSize(new Dimension(jPanel1.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formComponentResized

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuarioAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioAd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel lbAsistencias;
    public static javax.swing.JLabel lbCursos;
    public static javax.swing.JLabel lbEstudiantes;
    private javax.swing.JLabel lbImage1;
    public static javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUPSLPimg;
    private javax.swing.JLabel lbUnlockImg;
    private javax.swing.JLabel lbUserIcon;
    private javax.swing.JLabel lbUserImg;
    private javax.swing.JLabel lbUsuario;
    public static javax.swing.JLabel lbUsuario1;
    private javax.swing.JPanel menuPlegable;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
