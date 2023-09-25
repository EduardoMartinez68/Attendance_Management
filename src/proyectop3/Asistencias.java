/* This project, along with all of its elements and content, is protected by copyright and belongs exclusively to its author, 
    Ana Karen Castillo López.*/
package proyectop3;
import com.mysql.jdbc.Connection;
import desplazable.Desface;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;

public class Asistencias extends javax.swing.JFrame {
    Desface desplace;
    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/proyectobd";
    private static boolean valida = false;
    
    public Asistencias() {
        initComponents();
        desplace = new Desface();
        tablaPaquete();
        combo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuPlegable = new javax.swing.JPanel();
        lbAsistencias = new javax.swing.JLabel();
        lbMenu = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbCursos = new javax.swing.JLabel();
        lbEstudiantes = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPaquete = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSpinnerH = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtnombrePaquete = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripcionPaquete = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtpreciomaPaquete = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtpreciomePaquete = new javax.swing.JTextField();
        btnGuardarP = new javax.swing.JButton();
        btnLimpiarP = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtComboIDP = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtNombrePUP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcionPUP = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        txtPreciomaPUP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        txtPreciomePUP = new javax.swing.JTextField();
        btnBuscarIDP = new javax.swing.JButton();
        LimpiarPUP = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtSpinnerPUP = new javax.swing.JSpinner();
        btnActualizaP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(695, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(menuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-78, 0, 133, 530));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA PAQUETE");

        tablaPaquete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPaquete);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Consulta Paquetes", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRAR PAQUETE");

        jLabel3.setText("ID Hotel:");

        jLabel4.setText("Nombre del Paquete:");

        jLabel5.setText("Descripción:");

        txtdescripcionPaquete.setColumns(20);
        txtdescripcionPaquete.setRows(5);
        jScrollPane2.setViewportView(txtdescripcionPaquete);

        jLabel6.setText("Precio Mayor:");

        jLabel7.setText("Precio Menor:");

        btnGuardarP.setText("Guardar");
        btnGuardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPActionPerformed(evt);
            }
        });

        btnLimpiarP.setText("Limpiar");
        btnLimpiarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarPActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("$");
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);
        jTextField1.setOpaque(false);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("$");
        jTextField2.setBorder(null);
        jTextField2.setFocusable(false);
        jTextField2.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSpinnerH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnombrePaquete)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpreciomaPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpreciomePaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarP, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btnLimpiarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSpinnerH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombrePaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnGuardarP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpreciomaPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpreciomePaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registrar Paquete", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MODIFICAR DATOS DEL PAQUETE");

        jLabel9.setText("Seleccione ID del Paquete:");

        jLabel10.setText("Nombre del Paquete:");

        jLabel11.setText("Descripción:");

        txtDescripcionPUP.setColumns(20);
        txtDescripcionPUP.setRows(5);
        jScrollPane4.setViewportView(txtDescripcionPUP);

        jLabel12.setText("Precio Mayor:");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("$");
        jTextField3.setBorder(null);
        jTextField3.setFocusable(false);
        jTextField3.setOpaque(false);

        jLabel13.setText("Precio Menor:");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("$");
        jTextField4.setBorder(null);
        jTextField4.setFocusable(false);
        jTextField4.setOpaque(false);

        btnBuscarIDP.setText("Búsqueda por ID");
        btnBuscarIDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDPActionPerformed(evt);
            }
        });

        LimpiarPUP.setText("Limpiar");
        LimpiarPUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarPUPActionPerformed(evt);
            }
        });

        btnModificarP.setText("Modificar");
        btnModificarP.setToolTipText("");
        btnModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPActionPerformed(evt);
            }
        });

        jLabel14.setText("ID Hotel:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtComboIDP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(190, 190, 190))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPreciomaPUP))
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPreciomePUP, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNombrePUP, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarIDP, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(LimpiarPUP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpinnerPUP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarIDP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtComboIDP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSpinnerPUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LimpiarPUP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombrePUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPreciomaPUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(txtPreciomePUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar Paquete", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 580, 400));

        btnActualizaP.setText("Actualizar");
        btnActualizaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizaPMouseClicked(evt);
            }
        });
        jPanel1.add(btnActualizaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 160, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void combo(){
        ArrayList combo = new ArrayList();
        con=null;
        int i=0;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT IDpaquete FROM paquete ");
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    Object num = (Object)rs.getInt("IDpaquete");
                    combo.add(num);
                    i++;
                }
                for(int j=0; j<combo.size(); j++){
                    txtComboIDP.addItem(combo.get(j).toString());
                }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Asistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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

    private void lbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUsuarioMouseClicked
        new UsuarioAd().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbUsuarioMouseClicked

    private void btnGuardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPActionPerformed
        try{
            int cont = 0, cont2=0;
            if(txtnombrePaquete.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")){
                if(txtdescripcionPaquete.getText().isEmpty()){
                    JOptionPane.showMessageDialog(jPanel1, "Llene el campo de descripción del paquete");
                }else{
                    for(int i=0; i<txtpreciomaPaquete.getText().length(); i++){
                        if(Character.isDigit(txtpreciomaPaquete.getText().charAt(i))==false){
                            cont++;
                        }
                    }
                    if(cont>0){
                        JOptionPane.showMessageDialog(jPanel1, "Debe ser solo números");
                        txtpreciomaPaquete.setText("");
                    }else{
                        if(txtpreciomaPaquete.getText().isEmpty()){
                            JOptionPane.showMessageDialog(jPanel1, "Llene el campo de precio para mayores");
                        }else{
                            for(int j=0; j<txtpreciomePaquete.getText().length(); j++){
                                if(Character.isDigit(txtpreciomePaquete.getText().charAt(j))==false){
                                    cont2++;
                                }
                            }
                             if(cont2>0){
                                JOptionPane.showMessageDialog(jPanel1, "Debe ser solo números");
                                txtpreciomePaquete.setText("");
                            }else{
                                 if(txtpreciomePaquete.getText().isEmpty()){
                                    JOptionPane.showMessageDialog(jPanel1, "Llene el campo de precio para menores");
                                }else{
                                     valida=true;
                                 }
                             }
                        }
                    }
                }
            }else{
                if(txtnombrePaquete.getText().isEmpty()){
                    JOptionPane.showMessageDialog(jPanel1, "Llene el campo del nombre del paquete");
                }else{
                    JOptionPane.showMessageDialog(jPanel1, "El formato del nombre no es el correcto, solo letras");
                    txtnombrePaquete.setText("");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(jPanel1, e.getMessage());
        }
        if(valida==true){
            con=null;
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(jPanel3, "¿Está seguro de guardar los anteriores datos?", "Confirmar Envío", dialog);
            if(result==0){
                try{
                    Class.forName(driver);
                    Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                    double precioMa = Double.parseDouble(txtpreciomaPaquete.getText());
                    double precioMe = Double.parseDouble(txtpreciomePaquete.getText());
                    if(con!=null){
                        Statement sts = con.createStatement();
                        sts.addBatch("INSERT INTO paquete (IDhotel, IDpaquete, nombrePaquete, descripcion, precioMayor, precioMenor)"
                        + "VALUES ("+txtSpinnerH.getValue()+", NULL, '"+txtnombrePaquete.getText()+"','"+txtdescripcionPaquete.getText()
                        +"', "+precioMa+", "+precioMe+")");
                        sts.executeBatch();
                        con.close();
                    }
                }catch(SQLException ex){
                    System.out.println(ex.getNextException());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Asistencias.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtSpinnerH.setValue(0);
                txtnombrePaquete.setText("");
                txtdescripcionPaquete.setText("");
                txtpreciomaPaquete.setText("");
                txtpreciomePaquete.setText("");
            }
        }
        valida=false;
    }//GEN-LAST:event_btnGuardarPActionPerformed

    private void btnLimpiarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarPActionPerformed
        txtSpinnerH.setValue(0);
        txtnombrePaquete.setText("");
        txtdescripcionPaquete.setText("");
        txtpreciomaPaquete.setText("");
        txtpreciomePaquete.setText("");
    }//GEN-LAST:event_btnLimpiarPActionPerformed

    private void btnActualizaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizaPMouseClicked
        this.setVisible(false);
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                new Asistencias().setVisible(true);
            }
        };
        timer.schedule(task, 1000);
    }//GEN-LAST:event_btnActualizaPMouseClicked

    private void btnBuscarIDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDPActionPerformed
        con=null;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                int num = Integer.parseInt(txtComboIDP.getSelectedItem().toString());
                sts.execute("SELECT * FROM paquete WHERE IDpaquete = "+num);
                System.out.println(txtComboIDP.getSelectedItem().toString());
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    txtSpinnerPUP.setValue(rs.getInt("IDhotel"));
                    txtNombrePUP.setText(rs.getString("nombrePaquete"));
                    txtDescripcionPUP.setText(rs.getString("descripcion"));
                    txtPreciomaPUP.setText(String.valueOf(rs.getDouble("precioMayor")));
                    txtPreciomePUP.setText(String.valueOf(rs.getDouble("precioMenor")));
                }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Asistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarIDPActionPerformed

    private void LimpiarPUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarPUPActionPerformed
        txtSpinnerPUP.setValue(0);
        txtNombrePUP.setText("");
        txtDescripcionPUP.setText("");
        txtPreciomaPUP.setText("");
        txtPreciomePUP.setText("");
    }//GEN-LAST:event_LimpiarPUPActionPerformed

    private void btnModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPActionPerformed
        try{
            int cont = 0, cont2=0;
            if(txtNombrePUP.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")){
                if(txtDescripcionPUP.getText().isEmpty()){
                    JOptionPane.showMessageDialog(jPanel1, "Llene el campo de descripción del paquete");
                }else{
                    for(int i=0; i<txtPreciomaPUP.getText().length(); i++){
                        if(Character.isDigit(txtPreciomaPUP.getText().charAt(i))==false){
                            cont++;
                        }
                    }
                    if(cont>1){
                        JOptionPane.showMessageDialog(jPanel1, "Debe ser solo números");
                        txtPreciomaPUP.setText("");
                    }else{
                        if(txtPreciomaPUP.getText().isEmpty()){
                            JOptionPane.showMessageDialog(jPanel1, "Llene el campo de precio para mayores");
                        }else{
                            for(int j=0; j<txtPreciomePUP.getText().length(); j++){
                                if(Character.isDigit(txtPreciomePUP.getText().charAt(j))==false){
                                    cont2++;
                                }
                            }
                             if(cont2>1){
                                JOptionPane.showMessageDialog(jPanel1, "Debe ser solo números");
                                txtPreciomePUP.setText("");
                            }else{
                                 if(txtPreciomePUP.getText().isEmpty()){
                                    JOptionPane.showMessageDialog(jPanel1, "Llene el campo de precio para menores");
                                }else{
                                     valida=true;
                                 }
                             }
                        }
                    }
                }
            }else{
                if(txtNombrePUP.getText().isEmpty()){
                    JOptionPane.showMessageDialog(jPanel1, "Llene el campo del nombre del paquete");
                }else{
                    JOptionPane.showMessageDialog(jPanel1, "El formato del nombre no es el correcto, solo letras");
                    txtNombrePUP.setText("");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(jPanel1, e.getMessage());
        }
        if(valida==true){
            con=null;
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(jPanel6, "¿Está seguro de modificar los anteriores datos?", "Confirmar Modificación", dialog);
            if(result==0){
                try{
                    Class.forName(driver);
                    Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                    if(con!=null){
                       Statement sts = con.createStatement();
                       double precioMa = Double.parseDouble(txtPreciomaPUP.getText());
                       double precioMe = Double.parseDouble(txtPreciomePUP.getText());
                       int num = Integer.parseInt(txtComboIDP.getSelectedItem().toString());
                       sts.executeUpdate("UPDATE paquete SET IDhotel = "+txtSpinnerPUP.getValue()+", nombrePaquete = '"
                               +txtNombrePUP.getText()+"', descripcion = '"+txtDescripcionPUP.getText()+"', precioMayor = "+precioMa+", precioMenor = "
                       +precioMe+" WHERE IDpaquete = "+num);
                       con.close();
                    }
                }catch(SQLException ex){
                    System.out.println(ex.getNextException());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Asistencias.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtSpinnerPUP.setValue(0);
                txtNombrePUP.setText("");
                txtDescripcionPUP.setText("");
                txtPreciomaPUP.setText("");
                txtPreciomePUP.setText("");
            }
        }
    }//GEN-LAST:event_btnModificarPActionPerformed

    private void lbEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstudiantesMouseClicked
        try {
            new Estudiantes().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Asistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_lbEstudiantesMouseClicked

    private void lbAsistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAsistenciasMouseClicked
       JOptionPane.showMessageDialog(jPanel1, "Actualmente está en la ventana de Paquete");
    }//GEN-LAST:event_lbAsistenciasMouseClicked

    private void lbCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCursosMouseClicked
        new Cursos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbCursosMouseClicked

    public void tablaPaquete(){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        ArrayList<ArrayList<Object>> lista = new ArrayList<>();
        Object datos[] = new Object[6];
        int i=0;
        modelo.addColumn("ID Hotel");
        modelo.addColumn("ID Paquete");
        modelo.addColumn("Nombre del Paquete");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio Mayor");
        modelo.addColumn("Precio Menor");
        this.tablaPaquete.setModel(modelo);
        
        try{
            Class.forName(driver);
            Connection con = (Connection)DriverManager.getConnection(url,user,pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT * FROM paquete");
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    lista.add(new ArrayList<>());
                    lista.get(i).add(rs.getInt("IDhotel"));
                    lista.get(i).add(rs.getInt("IDpaquete"));
                    lista.get(i).add(rs.getString("nombrePaquete"));
                    lista.get(i).add(rs.getString("descripcion"));
                    lista.get(i).add(rs.getString("precioMayor"));
                    lista.get(i).add(rs.getString("precioMenor"));
                    i++;
                }
                for(int j=0; j<lista.size(); j++){
                    datos[0] = lista.get(j).get(0);
                    datos[1] = lista.get(j).get(1);
                    datos[2] = lista.get(j).get(2);
                    datos[3] = lista.get(j).get(3);
                    datos[4] = lista.get(j).get(4);
                    datos[5] = lista.get(j).get(5);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Asistencias.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimpiarPUP;
    private javax.swing.JButton btnActualizaP;
    private javax.swing.JButton btnBuscarIDP;
    private javax.swing.JButton btnGuardarP;
    private javax.swing.JButton btnLimpiarP;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JLabel lbAsistencias;
    public static javax.swing.JLabel lbCursos;
    public static javax.swing.JLabel lbEstudiantes;
    public static javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbMenu;
    public static javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel menuPlegable;
    private javax.swing.JTable tablaPaquete;
    private javax.swing.JComboBox<String> txtComboIDP;
    private javax.swing.JTextArea txtDescripcionPUP;
    private javax.swing.JTextField txtNombrePUP;
    private javax.swing.JTextField txtPreciomaPUP;
    private javax.swing.JTextField txtPreciomePUP;
    public static javax.swing.JSpinner txtSpinnerH;
    private javax.swing.JSpinner txtSpinnerPUP;
    private javax.swing.JTextArea txtdescripcionPaquete;
    private javax.swing.JTextField txtnombrePaquete;
    private javax.swing.JTextField txtpreciomaPaquete;
    private javax.swing.JTextField txtpreciomePaquete;
    // End of variables declaration//GEN-END:variables
}
