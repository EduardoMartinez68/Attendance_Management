/* This project, along with all of its elements and content, is protected by copyright and belongs exclusively to its author, 
    Ana Karen Castillo López.*/
package proyectop3;
import desplazable.Desface;//Librería para el movimiento del panel del menú
import javax.swing.JOptionPane; //Librerías para las ventanas de mensajes emergentes
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer; // Libería para hacer uso de un contador
import java.util.TimerTask; // Libería para hacer uso de un contador parte 2
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class Inicio extends javax.swing.JFrame implements Runnable{
    Desface desplace;
    private ImageIcon foto, foto2, foto3;
    private Icon fondo, fondo2, fondo3;
    private final Thread hilo1, hilo2, hilo3;
    private boolean sigue = true;
    private int num1 = 0, num2 = 0, num3 = 0, random=0;
    
    public Inicio() {
        hilo1 = new Thread(this, "Hilo Barra1");
        hilo2 = new Thread(this, "Hilo Barra2");
        hilo3 = new Thread(this, "Hilo Barra3");
        initComponents();
        hilo1.start();
        hilo2.start();
        hilo3.start();
        pintarBarras();
        UsuarioAd abrir = new UsuarioAd(); //Permite acceder a las variables globales de la clase UsuarioAd
        desplace = new Desface();
        iconos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        menuPlegable = new javax.swing.JPanel();
        lbAsistencias = new javax.swing.JLabel();
        lbMenu = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbCursos = new javax.swing.JLabel();
        lbEstudiantes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barra3 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        barra1 = new javax.swing.JProgressBar();
        barra2 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lbUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoUser.png"))); // NOI18N
        lbUsuario.setText("USUARIO");
        lbUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lbUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbUsuario.setIconTextGap(11);
        lbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUsuarioMouseClicked(evt);
            }
        });
        menuPlegable.add(lbUsuario);
        lbUsuario.setBounds(0, 100, 130, 50);

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

        jPanel1.add(menuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-78, 0, 133, 427));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/palmera.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 200, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tituloHOTEL.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 370, 80));

        barra3.setForeground(new java.awt.Color(111, 215, 85));
        barra3.setStringPainted(true);
        jPanel1.add(barra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 220, 200, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CONTAGIOS COVID-19");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, -1));

        barra1.setForeground(new java.awt.Color(218, 133, 239));
        barra1.setStringPainted(true);
        jPanel1.add(barra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 160, 200, 20));

        barra2.setForeground(new java.awt.Color(99, 174, 174));
        barra2.setStringPainted(true);
        jPanel1.add(barra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 190, 200, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anuncio.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 280, 280, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prevCOVID.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 290, 222));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void iconos(){
        if(UsuarioAd.bandera==true){
            foto = new ImageIcon(getClass().getResource("/images/iconoCliente.png"));
            fondo = new ImageIcon(foto.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
            lbEstudiantes.setIcon(fondo);
            foto2 = new ImageIcon(getClass().getResource("/images/iconoRegistro.png"));
            fondo2 = new ImageIcon(foto2.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
            lbCursos.setIcon(fondo2);
            foto3 = new ImageIcon(getClass().getResource("/images/iconoPaquete.png"));
            fondo3 = new ImageIcon(foto3.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
            lbAsistencias.setIcon(fondo3);
        }
    }
    
    private void lbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseClicked
        if(menuPlegable.getX() == 0){
            desplace.desplazarIzquierda(menuPlegable, menuPlegable.getX(), -78, 2, 2);
            //componente_java, posición_x_inicial, posición_x_final, número de pasos y tiempo en segundos
        }else if(menuPlegable.getX() == -78){
            desplace.desplazarDerecha(menuPlegable, menuPlegable.getX(), 0, 2, 2);
        }
    }//GEN-LAST:event_lbMenuMouseClicked

    private void lbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUsuarioMouseClicked
       new UsuarioAd().setVisible(true); //Hace visible la ventana donde se pide el acceso
       this.setVisible(false); // Oculta la ventana actual
    }//GEN-LAST:event_lbUsuarioMouseClicked

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

    private void lbAsistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAsistenciasMouseClicked
        if(UsuarioAd.bandera==true){
            new Asistencias().setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(jPanel1, "No ha ingresado sesión como administrador");
        }
    }//GEN-LAST:event_lbAsistenciasMouseClicked

    private void lbInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInicioMouseClicked
        JOptionPane.showMessageDialog(jPanel1, "Actualmente está en la ventana de Inicio");
        //Muestra una ventana de diálogo, párametros: Componente,Mensaje
    }//GEN-LAST:event_lbInicioMouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        jPanel1.setSize(new Dimension(this.getWidth(), this.getHeight()));
        menuPlegable.setSize(new Dimension(menuPlegable.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formComponentResized

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Función de botón SALIR
        this.setVisible(false);
        UsuarioAd.bandera=false;
        Timer timer = new Timer(); //Función para contar
        TimerTask task = new TimerTask(){
            public void run(){
                new Inicio().setVisible(true);
            }
        };
        timer.schedule(task, 500); //Establece el tiempo en 500 milisegundos
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void run(){
        while (sigue) {
            if(Thread.currentThread().getName().equals("Hilo Barra1")){
                try{
                    barra1.setValue(num1);
                    Thread.sleep(1000);
                    if(num1==100 && num2==100 && num3==100){
                        sigue=false;
                    }else{
                        random = (int)(Math.random()*100+1);
                        if(random%2==0){
                            num1--;
                        }
                        num1++;
                    }
                }catch(InterruptedException e){}
            }
            if(Thread.currentThread().getName().equals("Hilo Barra2")){
                try{
                    barra2.setValue(num2);
                    Thread.sleep(3000);
                    if(num1==100 && num2==100 && num3==100){
                        sigue=false;
                    }else{
                        random = (int)(Math.random()*100+1);
                        if(random%5==0){
                            num2--;
                        }
                        num2++;
                    }
                }catch(InterruptedException e){}
            }
            if(Thread.currentThread().getName().equals("Hilo Barra3")){
                try{
                    barra3.setValue(num3);
                    Thread.sleep(2500);
                    if(num1==100 && num2==100 && num3==100){
                        sigue=false;
                    }else{
                        if(random%3==0){
                            num3--;
                        }
                        num3++;
                    }
                }catch(InterruptedException e){}
            }
        }
    }
    
    public void pintarBarras(){
        barra1.setUI(new BasicProgressBarUI() {
            
        });
        barra2.setUI(new BasicProgressBarUI() {
           
        });
        barra3.setUI(new BasicProgressBarUI(){
            
        });
    }
    
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra1;
    private javax.swing.JProgressBar barra2;
    private javax.swing.JProgressBar barra3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbAsistencias;
    public static javax.swing.JLabel lbCursos;
    public static javax.swing.JLabel lbEstudiantes;
    public static javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbMenu;
    public static javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel menuPlegable;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends javax.swing.JPanel{
        private java.awt.Image imagen;
        
        @Override
        public void paint(java.awt.Graphics g){
            imagen = new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
