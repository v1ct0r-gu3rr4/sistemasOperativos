package view;

import controller.Controller;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Edgar Telles
 */
public class ControlPanel extends javax.swing.JFrame {
    private Controller controlador;
    private int tamPrincipal, tamSecundaria, tamPaginas;
    private int x, y;

    public ControlPanel(Controller controlador, int tamPrincipal, int tamSecundaria, int tamPaginas) {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        this.jPanel1.setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("images/MemorySlot.png")).getImage());
        this.controlador = controlador;
        this.tamPrincipal = tamPrincipal;
        this.tamSecundaria = tamSecundaria;
        this.tamPaginas = tamPaginas;
        
        this.controlador.initDatosDelPanelDeControl(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenido = new javax.swing.JPanel();
        fieldTamañoProceso = new javax.swing.JTextField();
        fieldNombreProceso = new javax.swing.JTextField();
        botonAux = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePrincipal = new javax.swing.JTable();
        progressSecundaria = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSecundaria = new javax.swing.JTable();
        botonAcceder6 = new javax.swing.JButton();
        progressPrincipal = new javax.swing.JProgressBar();
        labelTamUsadaSecundaria = new javax.swing.JLabel();
        labelEspaciosSecundaria = new javax.swing.JLabel();
        labelTamDisponiblePrincipal1 = new javax.swing.JLabel();
        labelTamTotalSecundaria = new javax.swing.JLabel();
        labelTamUsadaPrincipal = new javax.swing.JLabel();
        labelTamDisponiblePrincipal = new javax.swing.JLabel();
        labelTamDisponibleSecundaria = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        labelTamDisponiblePrincipal4 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal5 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal6 = new javax.swing.JLabel();
        labelTamTotalPrincipal = new javax.swing.JLabel();
        labelProcesosCreados = new javax.swing.JLabel();
        labelMarcosPagina = new javax.swing.JLabel();
        labelTamañoPagina = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLista = new javax.swing.JTable();
        botonAcceder10 = new javax.swing.JButton();
        botonAcceder9 = new javax.swing.JButton();
        botonAcceder5 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        labelTamDisponiblePrincipal7 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal8 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal9 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal10 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal11 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal12 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal13 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal14 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal15 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal16 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal18 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal19 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal20 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal17 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal21 = new javax.swing.JLabel();
        labelTamDisponiblePrincipal22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);

        panelContenido.setBackground(new java.awt.Color(102, 255, 102));
        panelContenido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelContenidoMouseDragged(evt);
            }
        });
        panelContenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelContenidoMousePressed(evt);
            }
        });
        panelContenido.setLayout(null);

        fieldTamañoProceso.setBackground(new java.awt.Color(51, 153, 0));
        fieldTamañoProceso.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fieldTamañoProceso.setForeground(new java.awt.Color(51, 51, 51));
        fieldTamañoProceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamaño del Proceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 10))); // NOI18N
        fieldTamañoProceso.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldTamañoProceso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldTamañoProcesoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTamañoProcesoFocusLost(evt);
            }
        });
        fieldTamañoProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamañoProcesoActionPerformed(evt);
            }
        });
        fieldTamañoProceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTamañoProcesoKeyTyped(evt);
            }
        });
        panelContenido.add(fieldTamañoProceso);
        fieldTamañoProceso.setBounds(1030, 20, 160, 50);

        fieldNombreProceso.setBackground(new java.awt.Color(51, 153, 0));
        fieldNombreProceso.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fieldNombreProceso.setForeground(new java.awt.Color(51, 51, 51));
        fieldNombreProceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Proceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 10))); // NOI18N
        fieldNombreProceso.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldNombreProceso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldNombreProcesoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNombreProcesoFocusLost(evt);
            }
        });
        fieldNombreProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreProcesoActionPerformed(evt);
            }
        });
        fieldNombreProceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNombreProcesoKeyTyped(evt);
            }
        });
        panelContenido.add(fieldNombreProceso);
        fieldNombreProceso.setBounds(1030, 80, 160, 50);
        panelContenido.add(botonAux);
        botonAux.setBounds(8, 0, 0, 1);

        tablePrincipal.setAutoCreateRowSorter(true);
        tablePrincipal.setBackground(new java.awt.Color(81, 81, 81));
        tablePrincipal.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablePrincipal.setForeground(new java.awt.Color(220, 220, 220));
        tablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "As. fisica", "Marco", "Id p.", "Nombre de p.", "Pag.", "Tam. pag (MB)", "Tam. Frag (MB)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablePrincipal.setFocusable(false);
        tablePrincipal.setGridColor(new java.awt.Color(120, 120, 120));
        tablePrincipal.setSelectionBackground(new java.awt.Color(203, 155, 107));
        tablePrincipal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablePrincipalMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablePrincipal);

        panelContenido.add(jScrollPane2);
        jScrollPane2.setBounds(30, 330, 550, 200);

        progressSecundaria.setBackground(new java.awt.Color(204, 204, 204));
        progressSecundaria.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        progressSecundaria.setForeground(new java.awt.Color(255, 0, 0));
        progressSecundaria.setValue(65);
        progressSecundaria.setStringPainted(true);
        panelContenido.add(progressSecundaria);
        progressSecundaria.setBounds(1020, 400, 170, 30);

        tableSecundaria.setBackground(new java.awt.Color(81, 81, 81));
        tableSecundaria.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tableSecundaria.setForeground(new java.awt.Color(220, 220, 220));
        tableSecundaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disco", "ID Proceso", "Nombre Proceso", "Pagina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSecundaria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableSecundaria.setFocusable(false);
        tableSecundaria.setGridColor(new java.awt.Color(120, 120, 120));
        tableSecundaria.setSelectionBackground(new java.awt.Color(203, 155, 107));
        tableSecundaria.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSecundaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableSecundariaMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tableSecundaria);

        panelContenido.add(jScrollPane3);
        jScrollPane3.setBounds(600, 210, 550, 170);

        botonAcceder6.setBackground(new java.awt.Color(0, 153, 153));
        botonAcceder6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonAcceder6.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder6.setText("Crear proceso");
        botonAcceder6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAcceder6.setFocusPainted(false);
        botonAcceder6.setFocusable(false);
        botonAcceder6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder6ActionPerformed(evt);
            }
        });
        panelContenido.add(botonAcceder6);
        botonAcceder6.setBounds(890, 60, 130, 50);

        progressPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        progressPrincipal.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        progressPrincipal.setForeground(new java.awt.Color(0, 0, 204));
        progressPrincipal.setValue(65);
        progressPrincipal.setStringPainted(true);
        panelContenido.add(progressPrincipal);
        progressPrincipal.setBounds(1020, 470, 170, 30);

        labelTamUsadaSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelTamUsadaSecundaria.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamUsadaSecundaria.setForeground(new java.awt.Color(51, 51, 51));
        labelTamUsadaSecundaria.setText("jLabel11");
        panelContenido.add(labelTamUsadaSecundaria);
        labelTamUsadaSecundaria.setBounds(760, 420, 100, 28);

        labelEspaciosSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelEspaciosSecundaria.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelEspaciosSecundaria.setForeground(new java.awt.Color(81, 81, 81));
        labelEspaciosSecundaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEspaciosSecundaria.setText("8000");
        panelContenido.add(labelEspaciosSecundaria);
        labelEspaciosSecundaria.setBounds(820, 70, 70, 28);

        labelTamDisponiblePrincipal1.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal1.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal1.setText("Espacio:");
        panelContenido.add(labelTamDisponiblePrincipal1);
        labelTamDisponiblePrincipal1.setBounds(690, 70, 140, 23);

        labelTamTotalSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalSecundaria.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamTotalSecundaria.setForeground(new java.awt.Color(51, 51, 51));
        labelTamTotalSecundaria.setText("1000000");
        panelContenido.add(labelTamTotalSecundaria);
        labelTamTotalSecundaria.setBounds(630, 420, 90, 28);

        labelTamUsadaPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        labelTamUsadaPrincipal.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamUsadaPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        labelTamUsadaPrincipal.setText("25");
        panelContenido.add(labelTamUsadaPrincipal);
        labelTamUsadaPrincipal.setBounds(780, 480, 90, 28);

        labelTamDisponiblePrincipal.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamDisponiblePrincipal.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal.setText("jLabel11");
        panelContenido.add(labelTamDisponiblePrincipal);
        labelTamDisponiblePrincipal.setBounds(880, 480, 100, 28);

        labelTamDisponibleSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponibleSecundaria.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamDisponibleSecundaria.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponibleSecundaria.setText("jLabel11");
        panelContenido.add(labelTamDisponibleSecundaria);
        labelTamDisponibleSecundaria.setBounds(880, 420, 100, 28);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel13);
        jPanel13.setBounds(0, 0, 2, 602);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel14);
        jPanel14.setBounds(1198, 0, 2, 602);

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        panelContenido.add(jPanel15);
        jPanel15.setBounds(0, 601, 1200, 2);

        labelTamDisponiblePrincipal4.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal4.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal4.setText("Proceso Creado:");
        panelContenido.add(labelTamDisponiblePrincipal4);
        labelTamDisponiblePrincipal4.setBounds(690, 50, 140, 23);

        labelTamDisponiblePrincipal5.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal5.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal5.setText("ESTADO:");
        panelContenido.add(labelTamDisponiblePrincipal5);
        labelTamDisponiblePrincipal5.setBounds(730, 10, 130, 30);

        labelTamDisponiblePrincipal6.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal6.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal6.setText("Tamaño de Página");
        panelContenido.add(labelTamDisponiblePrincipal6);
        labelTamDisponiblePrincipal6.setBounds(690, 90, 140, 23);

        labelTamTotalPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamTotalPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        labelTamTotalPrincipal.setText("8000");
        panelContenido.add(labelTamTotalPrincipal);
        labelTamTotalPrincipal.setBounds(640, 480, 90, 28);

        labelProcesosCreados.setBackground(new java.awt.Color(51, 51, 51));
        labelProcesosCreados.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelProcesosCreados.setForeground(new java.awt.Color(81, 81, 81));
        labelProcesosCreados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProcesosCreados.setText("8000");
        panelContenido.add(labelProcesosCreados);
        labelProcesosCreados.setBounds(820, 50, 70, 28);

        labelMarcosPagina.setBackground(new java.awt.Color(51, 51, 51));
        labelMarcosPagina.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelMarcosPagina.setForeground(new java.awt.Color(81, 81, 81));
        labelMarcosPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMarcosPagina.setText("8000");
        panelContenido.add(labelMarcosPagina);
        labelMarcosPagina.setBounds(820, 110, 70, 28);

        labelTamañoPagina.setBackground(new java.awt.Color(51, 51, 51));
        labelTamañoPagina.setFont(new java.awt.Font("Calibri Light", 1, 22)); // NOI18N
        labelTamañoPagina.setForeground(new java.awt.Color(81, 81, 81));
        labelTamañoPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTamañoPagina.setText("8000");
        panelContenido.add(labelTamañoPagina);
        labelTamañoPagina.setBounds(820, 90, 70, 28);

        tableLista.setAutoCreateRowSorter(true);
        tableLista.setBackground(new java.awt.Color(81, 81, 81));
        tableLista.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tableLista.setForeground(new java.awt.Color(220, 220, 220));
        tableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tamaño (MB)", "Pagina", "Estado del P.", "Memoria Fisica", "Memoria Virtual"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableLista.setFocusable(false);
        tableLista.setGridColor(new java.awt.Color(120, 120, 120));
        tableLista.setSelectionBackground(new java.awt.Color(203, 155, 107));
        tableLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableListaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableLista);

        botonAcceder10.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botonAcceder10.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder10.setText("Liberar");
        botonAcceder10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAcceder10.setFocusPainted(false);
        botonAcceder10.setFocusable(false);
        botonAcceder10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder10ActionPerformed(evt);
            }
        });

        botonAcceder9.setBackground(new java.awt.Color(51, 51, 51));
        botonAcceder9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botonAcceder9.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder9.setText("STOP (Pausar)");
        botonAcceder9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAcceder9.setFocusPainted(false);
        botonAcceder9.setFocusable(false);
        botonAcceder9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder9ActionPerformed(evt);
            }
        });

        botonAcceder5.setBackground(new java.awt.Color(102, 0, 102));
        botonAcceder5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botonAcceder5.setForeground(new java.awt.Color(255, 255, 255));
        botonAcceder5.setText("Borrar");
        botonAcceder5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAcceder5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAcceder5.setFocusPainted(false);
        botonAcceder5.setFocusable(false);
        botonAcceder5.setVerifyInputWhenFocusTarget(false);
        botonAcceder5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcceder5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAcceder10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(botonAcceder9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAcceder5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAcceder10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAcceder5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAcceder9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
        );

        panelContenido.add(jPanel1);
        jPanel1.setBounds(10, 0, 540, 280);

        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        panelContenido.add(jToggleButton2);
        jToggleButton2.setBounds(10, 0, 20, 0);

        labelTamDisponiblePrincipal7.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal7.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal7.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal7.setText("Marco de pagina:");
        panelContenido.add(labelTamDisponiblePrincipal7);
        labelTamDisponiblePrincipal7.setBounds(690, 110, 140, 23);

        labelTamDisponiblePrincipal8.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal8.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal8.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal8.setText("\"Conocerís la verdad y la verdad os hara libres\" ");
        panelContenido.add(labelTamDisponiblePrincipal8);
        labelTamDisponiblePrincipal8.setBounds(450, 560, 470, 20);

        labelTamDisponiblePrincipal9.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal9.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal9.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal9.setText("MEMORIA FISICA");
        panelContenido.add(labelTamDisponiblePrincipal9);
        labelTamDisponiblePrincipal9.setBounds(1020, 500, 210, 30);

        labelTamDisponiblePrincipal10.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal10.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal10.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal10.setText("QUANTUM: 1000 ms");
        panelContenido.add(labelTamDisponiblePrincipal10);
        labelTamDisponiblePrincipal10.setBounds(810, 20, 200, 20);

        labelTamDisponiblePrincipal11.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal11.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal11.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal11.setText("MB TOTAL USADO");
        panelContenido.add(labelTamDisponiblePrincipal11);
        labelTamDisponiblePrincipal11.setBounds(870, 400, 180, 20);

        labelTamDisponiblePrincipal12.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal12.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal12.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal12.setText("MEMORIA PRINCIPAL");
        panelContenido.add(labelTamDisponiblePrincipal12);
        labelTamDisponiblePrincipal12.setBounds(200, 300, 210, 20);

        labelTamDisponiblePrincipal13.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal13.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal13.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal13.setText("Edgar Telles y Victor Guerra");
        panelContenido.add(labelTamDisponiblePrincipal13);
        labelTamDisponiblePrincipal13.setBounds(490, 580, 260, 20);

        labelTamDisponiblePrincipal14.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal14.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal14.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal14.setText("MB USADO");
        panelContenido.add(labelTamDisponiblePrincipal14);
        labelTamDisponiblePrincipal14.setBounds(760, 400, 180, 30);

        labelTamDisponiblePrincipal15.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal15.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal15.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal15.setText("MB ASIGANDO");
        panelContenido.add(labelTamDisponiblePrincipal15);
        labelTamDisponiblePrincipal15.setBounds(620, 460, 180, 20);

        labelTamDisponiblePrincipal16.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal16.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal16.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal16.setText("MB USADO");
        panelContenido.add(labelTamDisponiblePrincipal16);
        labelTamDisponiblePrincipal16.setBounds(770, 460, 180, 20);

        labelTamDisponiblePrincipal18.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal18.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal18.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal18.setText("MB TOTAL USADO");
        panelContenido.add(labelTamDisponiblePrincipal18);
        labelTamDisponiblePrincipal18.setBounds(880, 460, 180, 20);

        labelTamDisponiblePrincipal19.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal19.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal19.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal19.setText("PROCESO NUEVO:");
        panelContenido.add(labelTamDisponiblePrincipal19);
        labelTamDisponiblePrincipal19.setBounds(1050, 0, 140, 20);

        labelTamDisponiblePrincipal20.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal20.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal20.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal20.setText("LISTA DE PROCESOS");
        panelContenido.add(labelTamDisponiblePrincipal20);
        labelTamDisponiblePrincipal20.setBounds(560, 10, 180, 23);

        labelTamDisponiblePrincipal17.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal17.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal17.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal17.setText("MEMORIA VIRTUAL");
        panelContenido.add(labelTamDisponiblePrincipal17);
        labelTamDisponiblePrincipal17.setBounds(600, 190, 210, 20);

        labelTamDisponiblePrincipal21.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal21.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal21.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal21.setText("MEMORIA VIRTUAL");
        panelContenido.add(labelTamDisponiblePrincipal21);
        labelTamDisponiblePrincipal21.setBounds(1020, 430, 210, 30);

        labelTamDisponiblePrincipal22.setBackground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal22.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        labelTamDisponiblePrincipal22.setForeground(new java.awt.Color(51, 51, 51));
        labelTamDisponiblePrincipal22.setText("MB ASIGANDO");
        panelContenido.add(labelTamDisponiblePrincipal22);
        labelTamDisponiblePrincipal22.setBounds(620, 397, 180, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelContenidoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContenidoMouseDragged
    }//GEN-LAST:event_panelContenidoMouseDragged

    private void panelContenidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContenidoMousePressed
        this.controlador.clearTableSelection(this.tableLista, this.tablePrincipal, this.tableSecundaria);
        this.botonAux.requestFocus();
    }//GEN-LAST:event_panelContenidoMousePressed

    private void botonAcceder5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder5ActionPerformed
        this.controlador.eliminarProceso(this);
    }//GEN-LAST:event_botonAcceder5ActionPerformed

    private void fieldTamañoProcesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoFocusGained
        this.fieldTamañoProceso.selectAll();
        if(fieldTamañoProceso.getText().trim().equals("4096") == true){
            fieldTamañoProceso.setText("");
        }
    }//GEN-LAST:event_fieldTamañoProcesoFocusGained

    private void fieldTamañoProcesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoFocusLost
        if(fieldTamañoProceso.getText().trim().equals("") == true){
            fieldTamañoProceso.setText("4096");
        }
    }//GEN-LAST:event_fieldTamañoProcesoFocusLost

    private void fieldTamañoProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoActionPerformed

    }//GEN-LAST:event_fieldTamañoProcesoActionPerformed

    private void fieldTamañoProcesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoKeyTyped
        char tecla = evt.getKeyChar();
//        if(tecla == KeyEvent.VK_ENTER){
//            botonInstalarSO.doClick();
//        }
        controlador.validarSoloNumeros(evt, this);
    }//GEN-LAST:event_fieldTamañoProcesoKeyTyped

    private void fieldNombreProcesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNombreProcesoFocusGained
        this.fieldNombreProceso.selectAll();
        if(fieldNombreProceso.getText().contains("Proceso #") == true){
            fieldNombreProceso.setText("");
        }
    }//GEN-LAST:event_fieldNombreProcesoFocusGained

    private void fieldNombreProcesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNombreProcesoFocusLost
        if(fieldNombreProceso.getText().trim().equals("") == true){
            fieldNombreProceso.setText("Proceso #" + (Controller.procesos.size() + 1));
        }
    }//GEN-LAST:event_fieldNombreProcesoFocusLost

    private void fieldNombreProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreProcesoActionPerformed
    }//GEN-LAST:event_fieldNombreProcesoActionPerformed

    private void fieldNombreProcesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNombreProcesoKeyTyped
    }//GEN-LAST:event_fieldNombreProcesoKeyTyped

    private void botonAcceder6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder6ActionPerformed
        this.controlador.crearProceso(this);
    }//GEN-LAST:event_botonAcceder6ActionPerformed

    private void botonAcceder9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder9ActionPerformed
        this.controlador.suspenderProceso(this);
    }//GEN-LAST:event_botonAcceder9ActionPerformed

    private void botonAcceder10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcceder10ActionPerformed
        this.controlador.bloquearProceso(this);
    }//GEN-LAST:event_botonAcceder10ActionPerformed

    private void tablePrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePrincipalMousePressed
        this.tableLista.clearSelection();
        this.tableSecundaria.clearSelection();
    }//GEN-LAST:event_tablePrincipalMousePressed

    private void tableSecundariaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSecundariaMousePressed
        this.tableLista.clearSelection();
        this.tablePrincipal.clearSelection();
    }//GEN-LAST:event_tableSecundariaMousePressed

    private void tableListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListaMousePressed
        this.tablePrincipal.clearSelection();
        this.tableSecundaria.clearSelection();
    }//GEN-LAST:event_tableListaMousePressed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcceder10;
    private javax.swing.JButton botonAcceder5;
    private javax.swing.JButton botonAcceder6;
    private javax.swing.JButton botonAcceder9;
    private javax.swing.JToggleButton botonAux;
    public javax.swing.JTextField fieldNombreProceso;
    public javax.swing.JTextField fieldTamañoProceso;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JLabel labelEspaciosSecundaria;
    public javax.swing.JLabel labelMarcosPagina;
    public javax.swing.JLabel labelProcesosCreados;
    public javax.swing.JLabel labelTamDisponiblePrincipal;
    private javax.swing.JLabel labelTamDisponiblePrincipal1;
    private javax.swing.JLabel labelTamDisponiblePrincipal10;
    private javax.swing.JLabel labelTamDisponiblePrincipal11;
    private javax.swing.JLabel labelTamDisponiblePrincipal12;
    private javax.swing.JLabel labelTamDisponiblePrincipal13;
    private javax.swing.JLabel labelTamDisponiblePrincipal14;
    private javax.swing.JLabel labelTamDisponiblePrincipal15;
    private javax.swing.JLabel labelTamDisponiblePrincipal16;
    private javax.swing.JLabel labelTamDisponiblePrincipal17;
    private javax.swing.JLabel labelTamDisponiblePrincipal18;
    private javax.swing.JLabel labelTamDisponiblePrincipal19;
    private javax.swing.JLabel labelTamDisponiblePrincipal20;
    private javax.swing.JLabel labelTamDisponiblePrincipal21;
    private javax.swing.JLabel labelTamDisponiblePrincipal22;
    private javax.swing.JLabel labelTamDisponiblePrincipal4;
    private javax.swing.JLabel labelTamDisponiblePrincipal5;
    private javax.swing.JLabel labelTamDisponiblePrincipal6;
    private javax.swing.JLabel labelTamDisponiblePrincipal7;
    private javax.swing.JLabel labelTamDisponiblePrincipal8;
    private javax.swing.JLabel labelTamDisponiblePrincipal9;
    public javax.swing.JLabel labelTamDisponibleSecundaria;
    public javax.swing.JLabel labelTamTotalPrincipal;
    public javax.swing.JLabel labelTamTotalSecundaria;
    public javax.swing.JLabel labelTamUsadaPrincipal;
    public javax.swing.JLabel labelTamUsadaSecundaria;
    public javax.swing.JLabel labelTamañoPagina;
    public javax.swing.JPanel panelContenido;
    public javax.swing.JProgressBar progressPrincipal;
    public javax.swing.JProgressBar progressSecundaria;
    public javax.swing.JTable tableLista;
    public javax.swing.JTable tablePrincipal;
    public javax.swing.JTable tableSecundaria;
    // End of variables declaration//GEN-END:variables
}
