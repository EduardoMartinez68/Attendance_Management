/* This project, along with all of its elements and content, is protected by copyright and belongs exclusively to its author, 
    Ana Karen Castillo López.*/
package proyectop3;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import desplazable.Desface;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.util.Properties;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import static javax.mail.Session.getDefaultInstance;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Estudiantes extends javax.swing.JFrame{
    Desface desplace;
    ArrayList combo = new ArrayList();
    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/proyectobd";
    private static boolean valida = false;
    
    public Estudiantes() throws ClassNotFoundException {
        initComponents();
        desplace = new Desface();
        consultaClientes();
        combo();
        UsuarioAd abrir = new UsuarioAd();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        menuPlegable = new javax.swing.JPanel();
        lbAsistencias = new javax.swing.JLabel();
        lbMenu = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbCursos = new javax.swing.JLabel();
        lbEstudiantes = new javax.swing.JLabel();
        jTabbed1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScroll4 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellidosCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtciudadCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdireccionCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttelefonoCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcorreoCliente = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        desktopModi = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();
        txtComboID = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtNombreUP = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtApellidosUP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCiudadUP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDireccionUP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelefonoUP = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCorreoUP = new javax.swing.JTextField();
        btnBuscarID = new javax.swing.JButton();
        btnlimpiarUP = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtComboReportID = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtNombreReport = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtApellidosReport = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        btnReporte = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualiza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(760, 575));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPlegable.setBackground(new java.awt.Color(255, 255, 255));
        menuPlegable.setLayout(null);

        lbAsistencias.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbAsistencias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAsistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoPaquete.png"))); // NOI18N
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
        lbCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoRegistro.png"))); // NOI18N
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
        lbEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoCliente.png"))); // NOI18N
        lbEstudiantes.setText("ESTUDIANTES");
        lbEstudiantes.setToolTipText("");
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

        jPanel2.add(menuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-78, 0, 133, 570));

        jTabbed1.setPreferredSize(new java.awt.Dimension(630, 460));

        jPanel1.setPreferredSize(new java.awt.Dimension(629, 515));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA CLIENTES");

        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaConsulta.setCellSelectionEnabled(true);
        jScroll4.setViewportView(tablaConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScroll4, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScroll4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbed1.addTab("Consulta Clientes", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO DE CLIENTE");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Ciudad:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Teléfono:");

        jLabel8.setText("Correo Electrónico:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtcorreoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                .addComponent(txttelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdireccionCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtciudadCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtapellidosCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnombreCliente, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtapellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtciudadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbed1.addTab("Registrar Clientes", jPanel3);

        jPanel5.setPreferredSize(new java.awt.Dimension(595, 410));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MODIFICAR DATOS DEL CLIENTE");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        desktopModi.setBackground(new java.awt.Color(255, 204, 255));

        jLabel10.setText("Seleccione ID del Cliente:");

        jLabel13.setText("Nombre:");

        jLabel14.setText("Apellidos:");

        jLabel15.setText("Ciudad:");

        jLabel16.setText("Dirección:");

        jLabel17.setText("Teléfono:");

        jLabel18.setText("Correo Electrónico:");

        btnBuscarID.setText("Búsqueda por ID");
        btnBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDActionPerformed(evt);
            }
        });

        btnlimpiarUP.setText("Limpiar");
        btnlimpiarUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarUPActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        desktopModi.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(txtComboID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(txtNombreUP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(txtApellidosUP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(txtCiudadUP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(txtDireccionUP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(txtTelefonoUP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(txtCorreoUP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(btnBuscarID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(btnlimpiarUP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopModi.setLayer(btnModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopModiLayout = new javax.swing.GroupLayout(desktopModi);
        desktopModi.setLayout(desktopModiLayout);
        desktopModiLayout.setHorizontalGroup(
            desktopModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopModiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(desktopModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopModiLayout.createSequentialGroup()
                        .addGroup(desktopModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(desktopModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCorreoUP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(txtTelefonoUP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccionUP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCiudadUP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellidosUP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreUP, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(desktopModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarID, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(btnlimpiarUP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(desktopModiLayout.createSequentialGroup()
                        .addGroup(desktopModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(desktopModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtComboID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel18))
                        .addContainerGap(516, Short.MAX_VALUE))))
        );
        desktopModiLayout.setVerticalGroup(
            desktopModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopModiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComboID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desktopModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopModiLayout.createSequentialGroup()
                        .addComponent(txtNombreUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidosUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCiudadUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonoUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreoUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(desktopModiLayout.createSequentialGroup()
                        .addComponent(btnBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiarUP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopModi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopModi)
        );

        jScrollPane3.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbed1.addTab("Modificar Datos del Cliente", jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("REPORTAR CLIENTES");

        jLabel12.setText("Seleccione el ID del cliente:");

        txtComboReportID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComboReportIDActionPerformed(evt);
            }
        });

        jLabel19.setText("Nombre:");

        jLabel20.setText("Apellidos:");

        jLabel21.setText("Motivo del Reporte:");

        txtMotivo.setColumns(20);
        txtMotivo.setRows(5);
        jScrollPane1.setViewportView(txtMotivo);

        btnReporte.setText("REPORTAR");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(26, 26, 26)))
                                            .addComponent(txtNombreReport, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtComboReportID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellidosReport, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComboReportID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidosReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreReport, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        jTabbed1.addTab("Reportar Cliente", jPanel7);

        jPanel2.add(jTabbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 630, 460));

        btnActualiza.setText("Actualizar");
        btnActualiza.setToolTipText("");
        btnActualiza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizaMouseClicked(evt);
            }
        });
        jPanel2.add(btnActualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 150, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void combo(){
        con=null;
        int i=0;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT IDcliente FROM cliente ");
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    Object num = (Object)rs.getInt("IDcliente");
                    combo.add(num);
                    i++;
                }
                for(int j=0; j<combo.size(); j++){
                    txtComboID.addItem(combo.get(j).toString());
                    txtComboReportID.addItem(combo.get(j).toString());
                }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void lbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenuMouseClicked
        if(menuPlegable.getX() == 0){
            desplace.desplazarIzquierda(menuPlegable, menuPlegable.getX(), -78, 2, 2);
        }else if(menuPlegable.getX() == -78){
            desplace.desplazarDerecha(menuPlegable, menuPlegable.getX(), 0, 2, 2);
        }
    }//GEN-LAST:event_lbMenuMouseClicked

    private void lbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUsuarioMouseClicked
        new UsuarioAd().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbUsuarioMouseClicked

    private void lbInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInicioMouseClicked
        new Inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbInicioMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            int cont = 0;
            if(txtnombreCliente.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")
                    && txtapellidosCliente.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")
                    && txtciudadCliente.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")){
                if(txtcorreoCliente.getText().matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+.[a-zA-Z]+$")){
                    if(txtdireccionCliente.getText().isEmpty()!=true){
                        if(txttelefonoCliente.getText().length()==10){
                            for(int i=0; i<txttelefonoCliente.getText().length(); i++){
                                if(Character.isDigit(txttelefonoCliente.getText().charAt(i))==false){
                                    cont++;
                                }
                            }
                            if(cont>0){
                                JOptionPane.showMessageDialog(jPanel2, "Su teléfono no se compone solo de números");
                                txttelefonoCliente.setText("");
                            }else{
                                valida=true;
                            }
                        }else{
                            if(txttelefonoCliente.getText().isEmpty()==true){
                                JOptionPane.showMessageDialog(jPanel2, "Llene el campo de teléfono"); 
                            }else{
                                JOptionPane.showMessageDialog(jPanel2, "El formato del teléfono no es correcto, recuerde ingresar 10 dígitos"); 
                                txttelefonoCliente.setText("");
                            }
                        }
                    }else{
                     JOptionPane.showMessageDialog(jPanel2, "Llene el campo de dirección");   
                    }
                }else{
                    if(txtcorreoCliente.getText().isEmpty()==true){
                        JOptionPane.showMessageDialog(jPanel2, "Llene el campo de correo");
                    }else{
                        JOptionPane.showMessageDialog(jPanel2, "El formato del correo no es el correcto");
                        txtcorreoCliente.setText("");
                    }
                }
            }else{
                throw new JustStringException(txtnombreCliente.getText(),txtapellidosCliente.getText(), txtciudadCliente.getText());
            }
        }catch(JustStringException e){
            txtnombreCliente.setText("");
            txtapellidosCliente.setText("");
            txtciudadCliente.setText("");
        }
        System.out.println("Bandera es: " + valida);
        if(valida==true){
            con=null;
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(jPanel4, "¿Está seguro de guardar los anteriores datos?", "Confirmar Envío", dialog);
            if(result==0){
                try{
                    Class.forName(driver);
                    Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                    if(con!=null){
                        JOptionPane.showMessageDialog(null, "Conectado");
                        Statement sts = con.createStatement();
                        sts.addBatch("INSERT INTO cliente (IDcliente, nombreC, apellidosC, direccionC, ciudad, telefono, correo)" + " VALUES (NULL,'"
                                +txtnombreCliente.getText()+"','"+txtapellidosCliente.getText()+"','"+txtdireccionCliente.getText()+"','"
                        +txtciudadCliente.getText()+"','"+txttelefonoCliente.getText()+"','"+txtcorreoCliente.getText()+"')");
                        sts.executeBatch();
                        con.close();
                    }
                }catch(SQLException ex){
                    System.out.println(ex.getNextException());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(jPanel2, e.getMessage());
                }
                txtnombreCliente.setText("");
                txtapellidosCliente.setText("");
                txtciudadCliente.setText("");
                txtdireccionCliente.setText("");
                txttelefonoCliente.setText("");
                txtcorreoCliente.setText("");
            }
        }
        valida=false;
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtnombreCliente.setText("");
        txtapellidosCliente.setText("");
        txtdireccionCliente.setText("");
        txtciudadCliente.setText("");
        txttelefonoCliente.setText("");
        txtcorreoCliente.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDActionPerformed
        con=null;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                int num = Integer.parseInt(txtComboID.getSelectedItem().toString());
                sts.execute("SELECT * FROM cliente WHERE IDcliente = "+num);
                System.out.println(txtComboID.getSelectedItem().toString());
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    txtNombreUP.setText(rs.getString("nombreC"));
                    txtApellidosUP.setText(rs.getString("apellidosC"));
                    txtCiudadUP.setText(rs.getString("ciudad"));
                    txtDireccionUP.setText(rs.getString("direccionC"));
                    txtTelefonoUP.setText(rs.getString("telefono"));
                    txtCorreoUP.setText(rs.getString("correo"));
                }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarIDActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            int cont = 0, repeat=0;
            if(txtNombreUP.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")
                    && txtApellidosUP.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")
                    && txtCiudadUP.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")){
                if(txtCorreoUP.getText().matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+.[a-zA-Z]+$")){
                    if(txtDireccionUP.getText().isEmpty()!=true){
                        if(txtTelefonoUP.getText().length()==10){
                            for(int i=0; i<txtTelefonoUP.getText().length(); i++){
                                if(Character.isDigit(txtTelefonoUP.getText().charAt(i))==false){
                                    cont++;
                                }
                                if(cont>0){
                                    JOptionPane.showMessageDialog(jPanel2, "Su teléfono no se compone solo de números"); 
                                }else{
                                    valida=true;
                                }
                            }
                        }else{
                            if(txtTelefonoUP.getText().isEmpty()==true){
                                JOptionPane.showMessageDialog(jPanel2, "Llene el campo de teléfono"); 
                            }else{
                                JOptionPane.showMessageDialog(jPanel2, "El formato del teléfono no es correcto, recuerde ingresar 10 dígitos");
                            }
                        }
                    }else{
                     JOptionPane.showMessageDialog(jPanel2, "Llene el campo de dirección");   
                    }
                }else{
                    if(txtCorreoUP.getText().isEmpty()==true){
                        JOptionPane.showMessageDialog(jPanel2, "Llene el campo de correo");
                    }else{
                        JOptionPane.showMessageDialog(jPanel2, "El formato del correo no es el correcto");
                    }
                }
            }else{
                throw new JustStringException(txtNombreUP.getText(),txtApellidosUP.getText(), txtCiudadUP.getText());
            }
        }catch(JustStringException e){
            txtNombreUP.setText("");
            txtApellidosUP.setText("");
            txtCiudadUP.setText("");
        }
        
        if(valida==true){
            con=null;
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(jPanel4, "¿Está seguro de modificar los anteriores datos?", "Confirmar Modificación", dialog);
            if(result==0){
                try{
                    Class.forName(driver);
                    Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                    if(con!=null){
                        Statement sts = con.createStatement();
                        int num = Integer.parseInt(txtComboID.getSelectedItem().toString());
                        sts.executeUpdate("UPDATE cliente SET nombreC = '"+txtNombreUP.getText()+"', apellidosC = '"+txtApellidosUP.getText()
                        +"', direccionC = '"+txtDireccionUP.getText()+"', ciudad = '"+txtCiudadUP.getText()+"', telefono = '"
                                +txtTelefonoUP.getText()+"', correo = '"+txtCorreoUP.getText()+"' WHERE IDcliente = "+num);
                        con.close();
                    }
                }catch(SQLException ex){
                    System.out.println(ex.getNextException());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtNombreUP.setText("");
                txtApellidosUP.setText("");
                txtCiudadUP.setText("");
                txtDireccionUP.setText("");
                txtTelefonoUP.setText("");
                txtCorreoUP.setText("");
            }
        }
        valida=false;
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnlimpiarUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarUPActionPerformed
        txtNombreUP.setText("");
        txtApellidosUP.setText("");
        txtCiudadUP.setText("");
        txtDireccionUP.setText("");
        txtTelefonoUP.setText("");
        txtCorreoUP.setText("");
    }//GEN-LAST:event_btnlimpiarUPActionPerformed

    private void btnActualizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizaMouseClicked
        this.setVisible(false);
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                try {
                    new Estudiantes().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        timer.schedule(task, 1000);
    }//GEN-LAST:event_btnActualizaMouseClicked

    private void abrir(){
        this.setVisible(true);
    }
    
    private void lbAsistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAsistenciasMouseClicked
        new Asistencias().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbAsistenciasMouseClicked

    private void lbEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstudiantesMouseClicked
        JOptionPane.showMessageDialog(jPanel2, "Actualmente estas en la ventana de Clientes");
    }//GEN-LAST:event_lbEstudiantesMouseClicked

    private void lbCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCursosMouseClicked
        new Cursos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbCursosMouseClicked

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        
        Session sesion = Session.getDefaultInstance(propiedad);
        
        String correoEnvia = "***";
        String password = "***";
        String destinatario = "***";
        String asunto = "Reporte de Cliente: " + txtNombreReport.getText() + " " + txtApellidosReport.getText();
        String mensaje = txtMotivo.getText();
        
        MimeMessage mail = new MimeMessage(sesion);
        try { 
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, password);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            JOptionPane.showMessageDialog(null, "Correo Enviado");
        } catch (AddressException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtComboReportIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComboReportIDActionPerformed
        con=null;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                int num = Integer.parseInt(txtComboReportID.getSelectedItem().toString());
                sts.execute("SELECT * FROM cliente WHERE IDcliente = "+num);
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    txtNombreReport.setText(rs.getString("nombreC"));
                    txtApellidosReport.setText(rs.getString("apellidosC"));
                }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtComboReportIDActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(jPanel4, "¿Está seguro de eliminar al cliente?", "Eliminar Clientes", dialog);
        if(result==0){
            try{
                Class.forName(driver);
                Connection con = (Connection) DriverManager.getConnection(url,user,pass);
                if(con!=null){
                    Statement sts = con.createStatement();
                    int num = Integer.parseInt(txtComboReportID.getSelectedItem().toString());
                    String eliminar = "DELETE FROM cliente WHERE IDcliente = "+num+"";
                    sts.executeUpdate(eliminar);
                    con.close();
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    public void consultaClientes() throws ClassNotFoundException{
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){ 
                return false;
            }
        };
        ArrayList<ArrayList<Object>> lista = new ArrayList<>();
        Object datos[] = new Object[7];
        int i=0;
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Dirección");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Correo electrónico");
        this.tablaConsulta.setModel(modelo);
        
        try{
            Class.forName(driver);
            Connection con = (Connection)DriverManager.getConnection(url,user,pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT * from cliente");
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    lista.add(new ArrayList<>());
                    lista.get(i).add(rs.getInt("IDcliente"));
                    lista.get(i).add(rs.getString("nombreC"));
                    lista.get(i).add(rs.getString("apellidosC"));
                    lista.get(i).add(rs.getString("direccionC"));
                    lista.get(i).add(rs.getString("ciudad"));
                    lista.get(i).add(rs.getString("telefono"));
                    lista.get(i).add(rs.getString("correo"));
                    i++;
                }
                for(int j=0; j<lista.size(); j++){
                    datos[0] = lista.get(j).get(0);
                    datos[1] = lista.get(j).get(1);
                    datos[2] = lista.get(j).get(2);
                    datos[3] = lista.get(j).get(3);
                    datos[4] = lista.get(j).get(4);
                    datos[5] = lista.get(j).get(5);
                    datos[6] = lista.get(j).get(6);
                    modelo.addRow(datos);
                }
                Iterator miIterator = lista.iterator();
                while(miIterator.hasNext()){
                   System.out.println(miIterator.next() + "\t");
               }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        }
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
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Estudiantes().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiza;
    private javax.swing.JButton btnBuscarID;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnlimpiarUP;
    private javax.swing.JDesktopPane desktopModi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScroll4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbed1;
    public static javax.swing.JLabel lbAsistencias;
    public static javax.swing.JLabel lbCursos;
    public static javax.swing.JLabel lbEstudiantes;
    public static javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbMenu;
    public static javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel menuPlegable;
    private javax.swing.JTable tablaConsulta;
    private javax.swing.JTextField txtApellidosReport;
    private javax.swing.JTextField txtApellidosUP;
    private javax.swing.JTextField txtCiudadUP;
    private javax.swing.JComboBox<String> txtComboID;
    private javax.swing.JComboBox<String> txtComboReportID;
    private javax.swing.JTextField txtCorreoUP;
    private javax.swing.JTextField txtDireccionUP;
    private javax.swing.JTextArea txtMotivo;
    private javax.swing.JTextField txtNombreReport;
    private javax.swing.JTextField txtNombreUP;
    private javax.swing.JTextField txtTelefonoUP;
    private javax.swing.JTextField txtapellidosCliente;
    private javax.swing.JTextField txtciudadCliente;
    private javax.swing.JTextField txtcorreoCliente;
    private javax.swing.JTextField txtdireccionCliente;
    private javax.swing.JTextField txtnombreCliente;
    private javax.swing.JTextField txttelefonoCliente;
    // End of variables declaration//GEN-END:variables

}
