/* This project, along with all of its elements and content, is protected by copyright and belongs exclusively to its author, 
    Ana Karen Castillo López.*/
package proyectop3;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import desplazable.Desface;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Cursos extends javax.swing.JFrame {
    Desface desplace;
    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/asistencia";
    private static String estado="ACTIVO";
    private static double subtotal1, subtotal2;
    private static double total=0;
    private static boolean valida = false;
    
    public Cursos() {
        initComponents();
        desplace = new Desface();
        tablaConsultaMaestros();
        tablaConsultaCursos();
        tablaConsultaClases();
        comboIDMaestro();
        comboIDCurso();
        comboIDTemporada();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCursos = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ConsultaMa = new javax.swing.JPanel();
        TitMaestros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaestros = new javax.swing.JTable();
        ConsultaCur = new javax.swing.JPanel();
        TitCursos = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        ConsultaClas = new javax.swing.JPanel();
        TitClases = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaClases = new javax.swing.JTable();
        MC_Registrar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarRM = new javax.swing.JButton();
        txtLimpiarRM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombreMaestro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoMaestro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIDCurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CMB_SemCurso = new javax.swing.JComboBox<>();
        btnGuardarRCS = new javax.swing.JButton();
        txtLimpiarRCS = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CMB_idTeacher = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CMB_idCourse = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        CMB_idSeason = new javax.swing.JComboBox<>();
        btnGuardarRCL = new javax.swing.JButton();
        txtLimpiarRCL = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnModificaR = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        btnBuscaR = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtComboIDR = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtComboIDCUP = new javax.swing.JComboBox<>();
        txtComboIDPUP = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtComboDiaUP = new javax.swing.JComboBox<>();
        txtComboMesUP = new javax.swing.JComboBox<>();
        txtComboAnioUP = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txtNoMenoresUP = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtNoMayoresUP = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        txtSubTotalUP = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtComboDia2UP = new javax.swing.JComboBox<>();
        txtComboMes2UP = new javax.swing.JComboBox<>();
        txtComboAnio2UP = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        txtComboDia3UP = new javax.swing.JComboBox<>();
        txtComboMes3UP = new javax.swing.JComboBox<>();
        txtComboAnio3UP = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtComboHoraEUP = new javax.swing.JComboBox<>();
        txtComboMinutosEUP = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtComboHoraSUP = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        txtComboMinutosSUP = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtReservaPDF = new javax.swing.JComboBox<>();
        btnPDF = new javax.swing.JButton();
        menuPlegable = new javax.swing.JPanel();
        lbAsistencias = new javax.swing.JLabel();
        lbMenu = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbCursos = new javax.swing.JLabel();
        lbEstudiantes = new javax.swing.JLabel();
        btnActualizaR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCursos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCursos.setPreferredSize(new java.awt.Dimension(790, 530));
        jPanelCursos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitMaestros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitMaestros.setText("CONSULTA MAESTROS");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablaMaestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMaestros);

        javax.swing.GroupLayout ConsultaMaLayout = new javax.swing.GroupLayout(ConsultaMa);
        ConsultaMa.setLayout(ConsultaMaLayout);
        ConsultaMaLayout.setHorizontalGroup(
            ConsultaMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaMaLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(TitMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaMaLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        ConsultaMaLayout.setVerticalGroup(
            ConsultaMaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaMaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitMaestros, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta Maestros", ConsultaMa);

        TitCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitCursos.setText("CONSULTA CURSOS");

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaCursos);

        javax.swing.GroupLayout ConsultaCurLayout = new javax.swing.GroupLayout(ConsultaCur);
        ConsultaCur.setLayout(ConsultaCurLayout);
        ConsultaCurLayout.setHorizontalGroup(
            ConsultaCurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaCurLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(ConsultaCurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaCurLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaCurLayout.createSequentialGroup()
                        .addComponent(TitCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))))
        );
        ConsultaCurLayout.setVerticalGroup(
            ConsultaCurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaCurLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Consulta Cursos", ConsultaCur);

        TitClases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitClases.setText("CONSULTA CLASES");

        tablaClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tablaClases);

        javax.swing.GroupLayout ConsultaClasLayout = new javax.swing.GroupLayout(ConsultaClas);
        ConsultaClas.setLayout(ConsultaClasLayout);
        ConsultaClasLayout.setHorizontalGroup(
            ConsultaClasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaClasLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(ConsultaClasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaClasLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaClasLayout.createSequentialGroup()
                        .addComponent(TitClases, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))))
        );
        ConsultaClasLayout.setVerticalGroup(
            ConsultaClasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaClasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitClases, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Consulta Clases", ConsultaClas);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTRAR MAESTRO");

        btnGuardarRM.setText("GUARDAR");
        btnGuardarRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRMActionPerformed(evt);
            }
        });

        txtLimpiarRM.setText("LIMPIAR");
        txtLimpiarRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarRMActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRAR CURSO");

        jLabel9.setText("ID_Curso:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Semestre:");

        CMB_SemCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        btnGuardarRCS.setText("GUARDAR");
        btnGuardarRCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRCSActionPerformed(evt);
            }
        });

        txtLimpiarRCS.setText("LIMPIAR");
        txtLimpiarRCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarRCSActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REGISTRAR CLASE");

        jLabel8.setText("ID Maestro:");

        jLabel10.setText("ID Curso:");

        jLabel11.setText("ID Temporada:");

        btnGuardarRCL.setText("GUARDAR");
        btnGuardarRCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRCLActionPerformed(evt);
            }
        });

        txtLimpiarRCL.setText("LIMPIAR");
        txtLimpiarRCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarRCLActionPerformed(evt);
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
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnGuardarRCS, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtLimpiarRCS, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CMB_SemCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CMB_idTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(42, 42, 42)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CMB_idCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CMB_idSeason, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnGuardarRM, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLimpiarRM, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnGuardarRCL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLimpiarRCL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellidoMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarRM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimpiarRM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CMB_SemCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarRCS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimpiarRCS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMB_idTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CMB_idCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CMB_idSeason, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarRCL, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimpiarRCL, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout MC_RegistrarLayout = new javax.swing.GroupLayout(MC_Registrar);
        MC_Registrar.setLayout(MC_RegistrarLayout);
        MC_RegistrarLayout.setHorizontalGroup(
            MC_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        MC_RegistrarLayout.setVerticalGroup(
            MC_RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registrar", MC_Registrar);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("MODIFICAR RESERVACIÓN");

        btnModificaR.setText("MODIFICAR");
        btnModificaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaRActionPerformed(evt);
            }
        });

        btnActivar.setText("ACTIVAR");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        btnBuscaR.setText("BUSCAR");
        btnBuscaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaRActionPerformed(evt);
            }
        });

        jLabel21.setText("ID Reservación:");

        jLabel22.setText("ID Cliente:");

        jLabel23.setText("ID Paquete:");

        jLabel24.setText("Fecha de Reservación: ");

        jLabel25.setText("Día:");

        jLabel26.setText("Mes:");

        jLabel27.setText("Año:");

        txtComboDiaUP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        txtComboMesUP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        txtComboAnioUP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel28.setText("Número de menores de edad:");

        jLabel29.setText("Número de mayores de edad:");

        jLabel30.setText("Total:");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("$");
        jTextField2.setBorder(null);
        jTextField2.setFocusable(false);
        jTextField2.setOpaque(false);

        txtSubTotalUP.setEditable(false);
        txtSubTotalUP.setFocusable(false);
        txtSubTotalUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSubTotalUPMouseClicked(evt);
            }
        });

        jLabel31.setText("Fecha de Entrada:");

        txtComboDia2UP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        txtComboMes2UP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        txtComboAnio2UP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel32.setText("Fecha de Salida:");

        txtComboDia3UP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        txtComboMes3UP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        txtComboAnio3UP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel33.setText("Hora de Entrada:");

        jLabel34.setText("Hora:");

        jLabel35.setText("Minutos:");

        txtComboHoraEUP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        txtComboMinutosEUP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel36.setText("Hora de Salida:");

        jLabel37.setText("Hora:");

        txtComboHoraSUP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel38.setText("Minutos:");

        txtComboMinutosSUP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(txtComboIDR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComboIDCUP, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtComboIDPUP, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSubTotalUP, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNoMenoresUP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNoMayoresUP)
                                    .addComponent(jLabel29)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtComboDiaUP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComboMesUP, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComboAnioUP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComboHoraEUP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(txtComboMinutosEUP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComboHoraSUP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(txtComboMinutosSUP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificaR, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnActivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscaR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtComboMes3UP, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtComboDia2UP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtComboMes2UP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComboAnio2UP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(txtComboDia3UP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(txtComboAnio3UP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComboIDR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComboIDPUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComboIDCUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComboAnioUP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtComboDiaUP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtComboMesUP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNoMayoresUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNoMenoresUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSubTotalUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComboAnio2UP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComboMes2UP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComboDia2UP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComboAnio3UP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComboMes3UP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComboDia3UP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComboHoraEUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComboMinutosEUP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComboHoraSUP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComboMinutosSUP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnModificaR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscaR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar", jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("GENERAR PDF");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("ID Reservación:");

        btnPDF.setText("GENERAR PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtReservaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReservaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Generar PDF", jPanel7);

        jPanelCursos.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 680, 380));

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

        jPanelCursos.add(menuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-78, 0, 133, 530));

        btnActualizaR.setText("Actualizar");
        btnActualizaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaRActionPerformed(evt);
            }
        });
        jPanelCursos.add(btnActualizaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 160, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void comboIDMaestro(){
        ArrayList combo = new ArrayList();
        con=null;
        int i=0;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT id FROM teachers ");
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    Object num = (Object)rs.getInt("id");
                    combo.add(num);
                    i++;
                }
                for(int j=0; j<combo.size(); j++){
                    CMB_idTeacher.addItem(combo.get(j).toString());
                }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void comboIDCurso(){
        ArrayList combo = new ArrayList();
        con=null;
        int i=0;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT id FROM courses ");
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    Object num = (Object)rs.getInt("id");
                    combo.add(num);
                    i++;
                }
                for(int j=0; j<combo.size(); j++){
                    CMB_idCourse.addItem(combo.get(j).toString());
                }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void comboIDTemporada(){
        ArrayList combo = new ArrayList();
        con=null;
        int i=0;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT id FROM seasons ");
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    Object num = (Object)rs.getInt("id");
                    combo.add(num);
                    i++;
                }
                for(int j=0; j<combo.size(); j++){
                    CMB_idSeason.addItem(combo.get(j).toString());
                }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    private void lbAsistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAsistenciasMouseClicked
        new Asistencias().setVisible(true);
        this.setVisible(false);
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

    private void lbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUsuarioMouseClicked
        new UsuarioAd().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbUsuarioMouseClicked

    private void lbEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstudiantesMouseClicked
        try {
            new Estudiantes().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Asistencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_lbEstudiantesMouseClicked

    private void btnGuardarRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRMActionPerformed
        try{
            if(txtNombreMaestro.getText().isEmpty()==true){
                JOptionPane.showMessageDialog(jPanelCursos, "Rellene el campo de Nombre");
            }else{
                if(txtApellidoMaestro.getText().isEmpty()==true){
                    JOptionPane.showMessageDialog(jPanelCursos, "Rellene el campo de Apellido");
                }else{
                    if(txtNombreMaestro.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$") && 
                            txtApellidoMaestro.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")){
                        valida=true;
                    }else{
                        JOptionPane.showMessageDialog(jPanelCursos, "No se sigue el formato indicado");
                    }
                }
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(jPanelCursos, e.getMessage());
        }
        if(valida==true){
            con=null;
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(jPanelCursos, "¿Está seguro de guardar los anteriores datos?", "Confirmar Envío", dialog);
            if(result==0){
                try{
                    Class.forName(driver);
                    Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                    if(con!=null){
                        Statement sts = con.createStatement();
                        sts.addBatch("INSERT INTO teachers(id,name,last_name) VALUES (NULL, '"
                        + txtNombreMaestro.getText() + "', '" + txtApellidoMaestro.getText() + "')");
                        sts.executeBatch();
                        con.close();
                    }
                }catch(SQLException ex){
                    System.out.println(ex.getNextException());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        valida=false;
    }//GEN-LAST:event_btnGuardarRMActionPerformed

    private void txtLimpiarRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarRMActionPerformed
        txtNombreMaestro.setText("");
        txtApellidoMaestro.setText("");
    }//GEN-LAST:event_txtLimpiarRMActionPerformed

    private void btnModificaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaRActionPerformed
        valida=false;
        try{
            int cont = 0, cont2 = 0;
            if(txtNoMenoresUP.getText().isEmpty()==false){
                for(int i=0; i<txtNoMenoresUP.getText().length(); i++){
                    if(Character.isDigit(txtNoMenoresUP.getText().charAt(i))==false){
                        cont++;
                    }
                }
                if(cont>0){
                    JOptionPane.showMessageDialog(jPanelCursos, "Debe ser solo números");
                    txtNoMenoresUP.setText("");
                }else{
                    if(txtNoMayoresUP.getText().isEmpty()==false){
                        for(int i=0; i<txtNoMayoresUP.getText().length(); i++){
                            if(Character.isDigit(txtNoMayoresUP.getText().charAt(i))==false){
                                cont2++;
                            }
                        }
                        if(cont2>0){
                            JOptionPane.showMessageDialog(jPanelCursos, "Debe ser solo números");
                            txtNoMayoresUP.setText("");
                        }else{
                            if(txtSubTotalUP.getText().isEmpty()){
                                JOptionPane.showMessageDialog(jPanelCursos, "Calcule el total");
                            }else{
                                double subtotal2 = Double.parseDouble(txtSubTotalUP.getText());
                                if(subtotal2<=0){
                                    JOptionPane.showMessageDialog(jPanelCursos, "No puede ser un total de 0");
                                }else{
                                    valida = true;
                                }
                            }
                        }
                    }else{
                        JOptionPane.showMessageDialog(jPanelCursos, "LLene el campo de número de adultos");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(jPanelCursos, "LLene el campo de número de menores");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(jPanelCursos, e.getMessage());
        }
        
        if(valida=true){
            con=null;
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(jPanelCursos, "¿Está seguro de modificar los anteriores datos?", "Confirmar Modificación", dialog);
            if(result==0){
                try{
                    Class.forName(driver);
                    Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                    int comboCliente = Integer.parseInt(txtComboIDCUP.getSelectedItem().toString());
                    int comboPaquete = Integer.parseInt(txtComboIDPUP.getSelectedItem().toString());
                    int menores = Integer.parseInt(txtNoMenoresUP.getText());
                    int mayores = Integer.parseInt(txtNoMayoresUP.getText());
                    int IDreserva = Integer.parseInt(txtComboIDR.getSelectedItem().toString());
                    double subtotalUP = Double.parseDouble(txtSubTotalUP.getText());
                    if(con!=null){
                        Statement sts = con.createStatement();
                        sts.executeUpdate("UPDATE reserva SET IDcliente = " + comboCliente + ", IDpaquete = " + comboPaquete
                        + ", fechaReservacion = '" + txtComboDiaUP.getSelectedItem().toString() + "/" + txtComboMesUP.getSelectedItem().toString()
                        + "/" + txtComboAnioUP.getSelectedItem().toString() + "', noMenores = " + menores + ", noMayores = " + mayores
                        + ", subTotal = " + subtotalUP + ", fechaEntrada = '" + txtComboDia2UP.getSelectedItem().toString() + "/"
                        + txtComboMes2UP.getSelectedItem().toString() + "/" + txtComboAnio2UP.getSelectedItem().toString() + "', "
                        + "horaEntrada = '" + txtComboHoraEUP.getSelectedItem().toString() + ":" + txtComboMinutosEUP.getSelectedItem()
                        + "', fechaSalida = '" + txtComboDia3UP.getSelectedItem().toString() + "/" + txtComboMes3UP.getSelectedItem().toString()
                        + "/" + txtComboAnio3UP.getSelectedItem().toString() + "', horaSalida = '" + txtComboHoraSUP.getSelectedItem().toString()
                        + ":" + txtComboMinutosSUP.getSelectedItem().toString() + "', estado = '" + estado + "' WHERE IDreserva = " + IDreserva);
                        con.close();
                    }
                }catch(SQLException ex){
                    System.out.println(ex.getNextException());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        valida=false;
    }//GEN-LAST:event_btnModificaRActionPerformed

    private void txtSubTotalUPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubTotalUPMouseClicked
        try{
            int cont = 0, cont2 = 0;
            if(txtNoMenoresUP.getText().isEmpty()==false){
                for(int i=0; i<txtNoMenoresUP.getText().length(); i++){
                    if(Character.isDigit(txtNoMenoresUP.getText().charAt(i))==false){
                        cont++;
                    }
                }
                if(cont>0){
                    JOptionPane.showMessageDialog(jPanelCursos, "Debe ser solo números");
                    txtNoMenoresUP.setText("");
                }else{
                    if(txtNoMayoresUP.getText().isEmpty()==false){
                        for(int i=0; i<txtNoMayoresUP.getText().length(); i++){
                            if(Character.isDigit(txtNoMayoresUP.getText().charAt(i))==false){
                                cont2++;
                            }
                        }
                        if(cont2>0){
                            JOptionPane.showMessageDialog(jPanelCursos, "Debe ser solo números");
                            txtNoMayoresUP.setText("");
                        }else{
                            //generarprePaqueteUP();
                        }
                    }else{
                        JOptionPane.showMessageDialog(jPanelCursos, "LLene el campo de número de adultos");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(jPanelCursos, "LLene el campo de número de menores");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(jPanelCursos, e.getMessage());
        }
        txtSubTotalUP.setText(total + "");
        subtotal1=0;
        subtotal2=0;
        total=0;
    }//GEN-LAST:event_txtSubTotalUPMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        con=null;
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(jPanelCursos, "¿Está seguro de cancelar la reservación?", "Cancelar reservación", dialog);
        if(result==0){
            JOptionPane.showMessageDialog(jPanelCursos, "Reservación cancelada");
            estado = "CANCELADO";
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaRActionPerformed
        //Permite actualizar los datos de la ventana actual
        this.setVisible(false);
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                new Cursos().setVisible(true);
            }
        };
        timer.schedule(task, 1000);
    }//GEN-LAST:event_btnActualizaRActionPerformed

    private void lbCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCursosMouseClicked
        JOptionPane.showMessageDialog(jPanelCursos, "Actualmente estas en la ventana de cursos");
    }//GEN-LAST:event_lbCursosMouseClicked

    private void btnBuscaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaRActionPerformed
        con=null;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                int num = Integer.parseInt(txtComboIDR.getSelectedItem().toString());
                sts.execute("SELECT * FROM reserva WHERE IDreserva = "+num);
                System.out.println(txtComboIDR.getSelectedItem().toString());
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    txtComboIDCUP.addItem(String.valueOf(rs.getInt("IDcliente")));
                    txtComboIDPUP.addItem(String.valueOf(rs.getInt("IDpaquete")));
                    String[] split = rs.getString("fechaReservacion").split("/");
                    for(int i=0; i<split.length; i++){
                        if(i==0){
                            txtComboDiaUP.setSelectedItem(split[i]);
                        }
                        if(i==1){
                            txtComboMesUP.setSelectedItem(split[i]);
                        }
                        if(i==2){
                            txtComboAnioUP.setSelectedItem(split[i]);
                        }
                    }
                    txtNoMenoresUP.setText(String.valueOf(rs.getInt("noMenores")));
                    txtNoMayoresUP.setText(String.valueOf(rs.getInt("noMayores")));
                    txtSubTotalUP.setText(String.valueOf(rs.getDouble("subTotal")));
                    String[] split2 = rs.getString("fechaEntrada").split("/");
                    System.out.println(rs.getString("fechaEntrada"));
                    for(int j=0; j<split2.length; j++){
                        if(j==0){
                            txtComboDia2UP.setSelectedItem(split2[j]);
                        }
                        if(j==1){
                            txtComboMes2UP.setSelectedItem(split2[j]);
                        }
                        if(j==2){
                            txtComboAnio2UP.setSelectedItem(split2[j]);
                        }
                    }
                    String[] split3 = rs.getString("fechaSalida").split("/");
                    for(int k=0; k<split3.length; k++){
                        if(k==0){
                            txtComboDia3UP.setSelectedItem(split3[k]);
                        }
                        if(k==1){
                            txtComboMes3UP.setSelectedItem(split3[k]);
                        }
                        if(k==2){
                            txtComboAnio3UP.setSelectedItem(split3[k]);
                        }
                    }
                    String[] horaE = rs.getString("horaEntrada").split(":");
                    for(int a=0; a<horaE.length; a++){
                        if(a==0){
                            txtComboHoraEUP.setSelectedItem(horaE[a]);
                        }
                        if(a==1){
                            txtComboMinutosEUP.setSelectedItem(horaE[a]);
                        }
                    }
                    String[] horaS = rs.getString("horaSalida").split(":");
                    for(int b=0; b<horaS.length; b++){
                        if(b==0){
                            txtComboHoraSUP.setSelectedItem(horaS[b]);
                        }
                        if(b==1){
                            txtComboMinutosSUP.setSelectedItem(horaS[b]);
                        }
                    }
                }
                con.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscaRActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        con=null;
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(jPanelCursos, "¿Está seguro de activar la reservación?", "Activar reservación", dialog);
        if(result==0){
            JOptionPane.showMessageDialog(jPanelCursos, "Reservación activada");
            estado = "ACTIVO";
        }
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        con=null;
        try{
            Class.forName(driver);
            Connection con  = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                Statement sts = con.createStatement();
                Statement sts2 = con.createStatement();
                Statement sts3 = con.createStatement();
                int num = Integer.parseInt(txtReservaPDF.getSelectedItem().toString());
                sts.execute("SELECT * FROM reserva WHERE IDreserva = "+num);
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    try{
                        String ruta = System.getProperty("user.home");
                        FileOutputStream archivo = new FileOutputStream(ruta + "/Desktop/Netbeans/Proyectos_clase/"
                                + "Proyecto1/ProyectoP3/pdfs/Reserva"+ String.valueOf(num) + ".pdf");
                        
                        Document documento = new Document();
                        PdfWriter.getInstance(documento, archivo);
                        documento.open();
                        
                        documento.add(new Paragraph("Reservación Hotelera"));
                        documento.add(new Paragraph(" "));
                        Paragraph parrafo = new Paragraph("Datos de la Reserva: ");
                        documento.add(parrafo);
                        documento.add(new Paragraph(" "));
                        
                        documento.add(new Paragraph("ID Reservación: " + String.valueOf(num)));
                        System.out.println(String.valueOf(num));
                        documento.add(new Paragraph("ID Cliente: " + String.valueOf(rs.getInt("IDcliente")) 
                        + "Fecha de Reservación: " + rs.getString("fechaReservacion")));
                        System.out.println("ID Cliente: " + String.valueOf(rs.getInt("IDcliente")) 
                        + "     Fecha de Reservación: " + rs.getString("fechaReservacion"));
                        documento.add(new Paragraph(" "));
                        documento.add(new Paragraph("Datos del Cliente"));
                        
                        sts2.execute("SELECT * FROM cliente WHERE IDcliente = " + rs.getInt("IDcliente"));
                        ResultSet rs2 = sts2.getResultSet();
                        while(rs2.next()){
                            documento.add(new Paragraph("Nombre: " + rs2.getString("nombreC") + " " + rs2.getString("apellidosC")));
                            System.out.println("Nombre: " + rs2.getString("nombreC") + " " + rs2.getString("apellidosC"));
                            documento.add(new Paragraph("Dirección: " + rs2.getString("direccionC")));
                            System.out.println("Dirección: " + rs2.getString("direccionC"));
                            documento.add(new Paragraph("Ciudad: " + rs2.getString("ciudad")));
                            System.out.println("Ciudad: " + rs2.getString("ciudad"));
                            documento.add(new Paragraph("Teléfono: " + rs2.getString("telefono")));
                            System.out.println("Teléfono: " + rs2.getString("telefono"));
                            documento.add(new Paragraph("Correo Electrónico: " + rs2.getString("correo")));
                            System.out.println("Correo Electrónico: " + rs2.getString("correo"));
                        }
                        documento.add(new Paragraph(" "));
                        documento.add(new Paragraph("Hotel Coral: "));
                        sts3.execute("SELECT * FROM paquete WHERE IDpaquete = " + rs.getInt("IDpaquete"));
                        ResultSet rs3 = sts3.getResultSet();
                        
                        while(rs3.next()){
                            double sub1 = rs.getInt("noMayores") * rs3.getDouble("precioMayor");
                            double sub2 = rs.getInt("noMenores") * rs3.getDouble("precioMenor");
                            
                            documento.add(new Paragraph("Paquete contratado: " + String.valueOf(rs3.getInt("IDpaquete")) + 
                            " " + rs3.getString("nombrePaquete")));
                            System.out.println("Paquete contratado: " + String.valueOf(rs3.getInt("IDpaquete")) + 
                            " " + rs3.getString("nombrePaquete"));
                            documento.add(new Paragraph(rs3.getString("descripcion")));
                            System.out.println(rs3.getString("descripcion"));
                            documento.add(new Paragraph(" "));
                            documento.add(new Paragraph("Fecha Entrada: " + rs.getString("fechaEntrada") 
                                    + "     Hora Entrada: " + rs.getString("horaEntrada") + " hrs"));
                            System.out.println("Fecha Entrada: " + rs.getString("fechaEntrada") 
                                    + "     Hora Entrada: " + rs.getString("horaEntrada") + " hrs");
                                documento.add(new Paragraph("Fecha Salida: " + rs.getString("fechaSalida") 
                                    + "     Hora Entrada: " + rs.getString("horaSalida") + " hrs"));
                             System.out.println("Fecha Salida: " + rs.getString("fechaSalida") 
                                    + "     Hora Entrada: " + rs.getString("horaSalida") + " hrs");
                            documento.add(new Paragraph("Adultos: " + String.valueOf(rs.getInt("noMayores")) + 
                                    "       Costo unitario: $" + rs3.getString("precioMayor") 
                                    + "     Subtotal: $" + String.valueOf(sub1)));
                            System.out.println("Adultos: " + String.valueOf(rs.getInt("noMayores")) + 
                                    "       Costo unitario: $" + rs3.getString("precioMayor") 
                                    + "     Subtotal: $" + String.valueOf(sub1));
                            documento.add(new Paragraph("Menores: " + String.valueOf(rs.getInt("noMenores")) +
                                    "       Costo unitario: $" + rs3.getString("precioMenor")
                                    +"      Subtotal: $" + String.valueOf(sub2)));
                            System.out.println("Menores: " + String.valueOf(rs.getInt("noMenores")) +
                                    "       Costo unitario: $" + rs3.getString("precioMenor")
                                    +"      Subtotal: $" + String.valueOf(sub2));
                            documento.add(new Paragraph("Total: " + String.valueOf(rs.getDouble("subTotal"))));
                            documento.add(new Paragraph(" "));
                            System.out.println("Total: " + String.valueOf(rs.getDouble("subTotal")));
                        }
                        documento.close();
                    }catch (FileNotFoundException ex) {
                        Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (DocumentException ex) {
                        Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }catch(SQLException ex){
            System.out.println(ex.getNextException());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnGuardarRCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRCSActionPerformed
        try{
            if(txtNombreCurso.getText().isEmpty()==true){
                JOptionPane.showMessageDialog(jPanelCursos, "Rellene el campo de Nombre");
            }else{
                if(txtNombreCurso.getText().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑ]+)*$")){
                    if(txtIDCurso.getText().isEmpty()==true){
                        JOptionPane.showMessageDialog(jPanelCursos, "Rellene el campo de ID");
                    }else{
                        int cont=0;
                        for(int i=0; i<txtIDCurso.getText().length(); i++){
                            if(Character.isDigit(txtIDCurso.getText().charAt(i))==false){
                                cont++;
                            }
                        }
                        if(cont>0){
                            JOptionPane.showMessageDialog(jPanelCursos, "Debe ser solo números en el campo ID");
                            txtIDCurso.setText("");
                        }else{
                            valida=true;
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(jPanelCursos, "No se sigue el formato correspondiente");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(jPanelCursos, e.getMessage());
        }
        if(valida==true){
            con=null;
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(jPanelCursos, "¿Está seguro de guardar los anteriores datos?", "Confirmar Envío", dialog);
            if(result==0){
                try{
                    Class.forName(driver);
                    Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                    int id = Integer.parseInt(txtIDCurso.getText());
                    int semester = Integer.parseInt(CMB_SemCurso.getSelectedItem().toString());
                    if(con!=null){
                        Statement sts = con.createStatement();
                        sts.addBatch("INSERT INTO courses(id,name,semester) VALUES ("
                        + id + ", '"+ txtNombreCurso.getText() + "', " + semester + ")");
                        sts.executeBatch();
                        con.close();
                    }
                }catch(SQLException ex){
                    System.out.println(ex.getNextException());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        valida=false;
    }//GEN-LAST:event_btnGuardarRCSActionPerformed

    private void txtLimpiarRCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarRCSActionPerformed
        txtIDCurso.setText("");
        txtNombreCurso.setText("");
        CMB_SemCurso.setSelectedIndex(0);
    }//GEN-LAST:event_txtLimpiarRCSActionPerformed

    private void btnGuardarRCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRCLActionPerformed
        valida=true;
        if(valida==true){
            con=null;
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(jPanelCursos, "¿Está seguro de guardar los anteriores datos?", "Confirmar Envío", dialog);
            if(result==0){
                try{
                    Class.forName(driver);
                    Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                    int id_teacher = Integer.parseInt(CMB_idTeacher.getSelectedItem().toString());
                    int id_course = Integer.parseInt(CMB_idCourse.getSelectedItem().toString());
                    int id_season = Integer.parseInt(CMB_idSeason.getSelectedItem().toString());
                    if(con!=null){
                        Statement sts = con.createStatement();
                        sts.addBatch("INSERT INTO courses(id,id_teacher,id_course,id_season) VALUES (NULL,"
                        + id_teacher + ", " + id_course + ", " + id_season + ")");
                        sts.executeBatch();
                        con.close();
                    }
                }catch(SQLException ex){
                    System.out.println(ex.getNextException());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        valida=false;
    }//GEN-LAST:event_btnGuardarRCLActionPerformed

    private void txtLimpiarRCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarRCLActionPerformed
        CMB_idTeacher.setSelectedIndex(0);
        CMB_idCourse.setSelectedIndex(0);
        CMB_idSeason.setSelectedIndex(0);
    }//GEN-LAST:event_txtLimpiarRCLActionPerformed
    
    public void tablaConsultaMaestros(){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        ArrayList<ArrayList<Object>> lista = new ArrayList<>();
        Object datos[] = new Object[3];
        int i=0;
        modelo.addColumn("ID Maestro");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        this.tablaMaestros.setModel(modelo);
        
        try{
            Class.forName(driver);
            Connection con = (Connection)DriverManager.getConnection(url,user,pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT * FROM teachers");
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    lista.add(new ArrayList<>());
                    lista.get(i).add(rs.getInt("id"));
                    lista.get(i).add(rs.getString("name"));
                    lista.get(i).add(rs.getString("last_name"));
                    i++;
                }
                for(int j=0; j<lista.size(); j++){
                    datos[0] = lista.get(j).get(0);
                    datos[1] = lista.get(j).get(1);
                    datos[2] = lista.get(j).get(2);
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
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
    public void tablaConsultaCursos(){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        ArrayList<ArrayList<Object>> lista = new ArrayList<>();
        Object datos[] = new Object[3];
        int i=0;
        modelo.addColumn("ID Curso");
        modelo.addColumn("Nombre");
        modelo.addColumn("Semestre");
        this.tablaCursos.setModel(modelo);
        
        try{
            Class.forName(driver);
            Connection con = (Connection)DriverManager.getConnection(url,user,pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT * FROM courses");
                ResultSet rs = sts.getResultSet();
                while(rs.next()){
                    lista.add(new ArrayList<>());
                    lista.get(i).add(rs.getInt("id"));
                    lista.get(i).add(rs.getString("name"));
                    lista.get(i).add(rs.getInt("semester"));
                    i++;
                }
                for(int j=0; j<lista.size(); j++){
                    datos[0] = lista.get(j).get(0);
                    datos[1] = lista.get(j).get(1);
                    datos[2] = lista.get(j).get(2);
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
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
    public void tablaConsultaClases(){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        ArrayList<ArrayList<Object>> lista = new ArrayList<>();
        Object datos[] = new Object[4];
        int i=0;
        modelo.addColumn("ID Clase");
        modelo.addColumn("Maestro");
        modelo.addColumn("Curso");
        modelo.addColumn("Temporada");
        this.tablaClases.setModel(modelo);
        
        try{
            Class.forName(driver);
            Connection con = (Connection)DriverManager.getConnection(url,user,pass);
            if(con!=null){
                Statement sts = con.createStatement();
                sts.execute("SELECT * FROM classroom");
                ResultSet rs = sts.getResultSet();
                Statement sts2 = con.createStatement();
                sts2.execute("SELECT * FROM teachers INNER JOIN classroom ON teachers.id=classroom.id_teacher;");
                ResultSet rs2 = sts2.getResultSet();
                Statement sts3 = con.createStatement();
                sts3.execute("SELECT * FROM courses INNER JOIN classroom ON courses.id=classroom.id_course;");
                ResultSet rs3 = sts3.getResultSet();
                Statement sts4 = con.createStatement();
                sts4.execute("SELECT * FROM seasons INNER JOIN classroom ON seasons.id=classroom.id_season;");
                ResultSet rs4 = sts4.getResultSet();
                while(rs.next() && rs2.next() && rs3.next() && rs4.next()){
                    lista.add(new ArrayList<>());
                    lista.get(i).add(rs.getInt("id"));
                    lista.get(i).add(rs2.getString("name"));
                    lista.get(i).add(rs3.getString("name"));
                    lista.get(i).add(rs4.getString("name"));
                    i++;
                }
                for(int j=0; j<lista.size(); j++){
                    datos[0] = lista.get(j).get(0);
                    datos[1] = lista.get(j).get(1);
                    datos[2] = lista.get(j).get(2);
                    datos[3] = lista.get(j).get(3);
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
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CMB_SemCurso;
    private javax.swing.JComboBox<String> CMB_idCourse;
    private javax.swing.JComboBox<String> CMB_idSeason;
    private javax.swing.JComboBox<String> CMB_idTeacher;
    private javax.swing.JPanel ConsultaClas;
    private javax.swing.JPanel ConsultaCur;
    private javax.swing.JPanel ConsultaMa;
    private javax.swing.JPanel MC_Registrar;
    private javax.swing.JLabel TitClases;
    private javax.swing.JLabel TitCursos;
    private javax.swing.JLabel TitMaestros;
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnActualizaR;
    private javax.swing.JButton btnBuscaR;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarRCL;
    private javax.swing.JButton btnGuardarRCS;
    private javax.swing.JButton btnGuardarRM;
    private javax.swing.JButton btnModificaR;
    private javax.swing.JButton btnPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelCursos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    public static javax.swing.JLabel lbAsistencias;
    public static javax.swing.JLabel lbCursos;
    public static javax.swing.JLabel lbEstudiantes;
    public static javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbMenu;
    public static javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel menuPlegable;
    private javax.swing.JTable tablaClases;
    private javax.swing.JTable tablaCursos;
    private javax.swing.JTable tablaMaestros;
    private javax.swing.JTextField txtApellidoMaestro;
    private javax.swing.JComboBox<String> txtComboAnio2UP;
    private javax.swing.JComboBox<String> txtComboAnio3UP;
    private javax.swing.JComboBox<String> txtComboAnioUP;
    private javax.swing.JComboBox<String> txtComboDia2UP;
    private javax.swing.JComboBox<String> txtComboDia3UP;
    private javax.swing.JComboBox<String> txtComboDiaUP;
    private javax.swing.JComboBox<String> txtComboHoraEUP;
    private javax.swing.JComboBox<String> txtComboHoraSUP;
    private javax.swing.JComboBox<String> txtComboIDCUP;
    private javax.swing.JComboBox<String> txtComboIDPUP;
    private javax.swing.JComboBox<String> txtComboIDR;
    private javax.swing.JComboBox<String> txtComboMes2UP;
    private javax.swing.JComboBox<String> txtComboMes3UP;
    private javax.swing.JComboBox<String> txtComboMesUP;
    private javax.swing.JComboBox<String> txtComboMinutosEUP;
    private javax.swing.JComboBox<String> txtComboMinutosSUP;
    private javax.swing.JTextField txtIDCurso;
    private javax.swing.JButton txtLimpiarRCL;
    private javax.swing.JButton txtLimpiarRCS;
    private javax.swing.JButton txtLimpiarRM;
    private javax.swing.JTextField txtNoMayoresUP;
    private javax.swing.JTextField txtNoMenoresUP;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtNombreMaestro;
    private javax.swing.JComboBox<String> txtReservaPDF;
    private javax.swing.JTextField txtSubTotalUP;
    // End of variables declaration//GEN-END:variables
}
