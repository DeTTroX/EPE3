/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import BaseDeDatos.Gestion;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DeTTroX
 */
public class PanelPR extends javax.swing.JFrame {

    Gestion  g;
    
    public PanelPR() {
        initComponents();
        configurarRBEstado();
        configurarRBNacion();
        configurarRBTipo();
        g = new Gestion();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/icono.png")).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void configurarRBEstado(){

    ButtonGroup estado = new ButtonGroup();
    estado.add(viejo);
    estado.add(rest);
    estado.add(total);
    
    
    rest.setSelected(true);

}
    private void configurarRBNacion(){

    ButtonGroup nacion = new ButtonGroup();
    nacion.add(estado);
    nacion.add(aleman);
    
    estado.setSelected(true);

}
    private void configurarRBTipo(){

    ButtonGroup tipo = new ButtonGroup();
    tipo.add(avion);
    tipo.add(tanque);
    tipo.add(barco);
    
    avion.setSelected(true);

}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DATOS = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Acept = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        idsede = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btningresar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ida = new javax.swing.JTextField();
        nomb = new javax.swing.JTextField();
        rest = new javax.swing.JRadioButton();
        viejo = new javax.swing.JRadioButton();
        total = new javax.swing.JRadioButton();
        estado = new javax.swing.JRadioButton();
        aleman = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        color = new javax.swing.JCheckBox();
        armamento = new javax.swing.JCheckBox();
        art = new javax.swing.JCheckBox();
        manejable = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        idcla = new javax.swing.JTextField();
        idsed = new javax.swing.JTextField();
        btingresar2 = new javax.swing.JButton();
        btnver2 = new javax.swing.JButton();
        btnactualizar2 = new javax.swing.JButton();
        btneliminar2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id_clase = new javax.swing.JTextField();
        avion = new javax.swing.JRadioButton();
        tanque = new javax.swing.JRadioButton();
        barco = new javax.swing.JRadioButton();
        fabricante = new javax.swing.JTextField();
        anno = new javax.swing.JTextField();
        btningresar3 = new javax.swing.JButton();
        btnactualizar3 = new javax.swing.JButton();
        btnver3 = new javax.swing.JButton();
        btneliminar3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TABLAPR1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TABLAPR2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MusYamat");
        setBackground(new java.awt.Color(204, 153, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DATOS.setBackground(new java.awt.Color(204, 153, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel23.setText("INICIO");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Bienvenido a MusYamat.exe, este software almacenara sus datos segun usted lo necesite ");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        Acept.setText("QUIENES SOMOS ");
        Acept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptActionPerformed(evt);
            }
        });
        jPanel1.add(Acept, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 160, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.jpg"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 570));

        DATOS.addTab("INICIO", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(idsede, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, -1));

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 150, -1));
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 150, -1));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_SEDE", "NOMBRE", "TELEFONO", "CORREO"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 670, 460));

        btningresar.setText("INGRESAR");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel2.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 230, -1));

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, -1));

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("SEDE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID_SEDE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEFONO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("CORREO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        btnver.setText("VER");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });
        jPanel2.add(btnver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1012, -1));

        DATOS.addTab("SEDE", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel14.setText("ARTICULO");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel15.setText("ID_ARTICULO");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel16.setText("NOMBRE");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel17.setText("ESTADO");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel18.setText("NACION");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel19.setText("OBSERVACION");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel3.add(ida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 180, -1));

        nomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombActionPerformed(evt);
            }
        });
        jPanel3.add(nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, -1));

        rest.setText("RESTAURADO");
        jPanel3.add(rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 180, -1));

        viejo.setText("VIEJO_SIN_MODIFCAR");
        jPanel3.add(viejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 180, -1));

        total.setText("TOTAL_CHATARRA");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 180, -1));

        estado.setText("ESTADO_UNIDENSE");
        jPanel3.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 180, -1));

        aleman.setText("ALEMAN");
        jPanel3.add(aleman, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 180, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 290, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 290, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 348, 290, -1));

        color.setText("COLOR_LLAMATIVO");
        jPanel3.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 180, -1));

        armamento.setText("ARMAMENTO_FUNCIONAL");
        jPanel3.add(armamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 180, -1));

        art.setText("ART_PERSONALIZADO");
        jPanel3.add(art, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 180, -1));

        manejable.setText("MANEJABLE");
        jPanel3.add(manejable, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 180, -1));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_ARTICULO", "NOMBRE", "ESTADO", "NACION", "OBSERVACION", "ID_SEDE_FK", "ID_CLASE_FK"
            }
        ));
        jScrollPane3.setViewportView(tabla2);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 660, 410));

        jLabel20.setText("ID_CLASE_FK");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        jLabel21.setText("ID_SEDE_FK");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        idcla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idclaActionPerformed(evt);
            }
        });
        jPanel3.add(idcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 140, -1));
        jPanel3.add(idsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 140, -1));

        btingresar2.setText("INGRESAR");
        btingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btingresar2ActionPerformed(evt);
            }
        });
        jPanel3.add(btingresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 140, -1));

        btnver2.setText("VER");
        btnver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnver2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 140, -1));

        btnactualizar2.setText("ACTUALIZAR");
        btnactualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnactualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 140, -1));

        btneliminar2.setText("ELIMINAR");
        btneliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar2ActionPerformed(evt);
            }
        });
        jPanel3.add(btneliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 140, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tanque2.jpg"))); // NOI18N
        jLabel13.setText(" ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1008, 568));

        DATOS.addTab("ARTICULO", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel8.setText("CLASE");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ID_CLASE");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("AÑO");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("TIPO");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("FABRICANTE");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        id_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_claseActionPerformed(evt);
            }
        });
        jPanel4.add(id_clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, -1));

        avion.setText("AVION");
        jPanel4.add(avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 110, -1));

        tanque.setText("TANQUE");
        jPanel4.add(tanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, -1));

        barco.setText("BARCO");
        jPanel4.add(barco, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 110, -1));
        jPanel4.add(fabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, -1));
        jPanel4.add(anno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 160, -1));

        btningresar3.setText("INGRESAR");
        btningresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresar3ActionPerformed(evt);
            }
        });
        jPanel4.add(btningresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 160, -1));

        btnactualizar3.setText("ACTUALIZAR");
        btnactualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnactualizar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 160, -1));

        btnver3.setText("VER");
        btnver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnver3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnver3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 160, -1));

        btneliminar3.setText("ELIMINAR");
        btneliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar3ActionPerformed(evt);
            }
        });
        jPanel4.add(btneliminar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 160, -1));

        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_CLASE", "TIPO", "FABRICANTE", "AÑO"
            }
        ));
        jScrollPane2.setViewportView(tabla3);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 610, 430));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avion2.jpg"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1008, 570));

        DATOS.addTab("CLASE", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TABLAPR1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE_SEDE", "NOMBRE_ARTICULO", "OBSERVACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TABLAPR1);
        if (TABLAPR1.getColumnModel().getColumnCount() > 0) {
            TABLAPR1.getColumnModel().getColumn(0).setResizable(false);
            TABLAPR1.getColumnModel().getColumn(1).setResizable(false);
            TABLAPR1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 900, 230));

        TABLAPR2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "ESTADO", "NACION", "TIPO", "FABRICANTE", "NOMBRE_SEDE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TABLAPR2);
        if (TABLAPR2.getColumnModel().getColumnCount() > 0) {
            TABLAPR2.getColumnModel().getColumn(0).setResizable(false);
            TABLAPR2.getColumnModel().getColumn(1).setResizable(false);
            TABLAPR2.getColumnModel().getColumn(2).setResizable(false);
            TABLAPR2.getColumnModel().getColumn(3).setResizable(false);
            TABLAPR2.getColumnModel().getColumn(4).setResizable(false);
            TABLAPR2.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 900, 240));

        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avion.jpg"))); // NOI18N
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 570));

        DATOS.addTab("DATOS_PRINCIPALES", jPanel5);

        getContentPane().add(DATOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1013, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void id_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_claseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_claseActionPerformed

    private void nombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombActionPerformed

    private void btnactualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar2ActionPerformed
    g.updateDatosTabla2();
        
        
    }//GEN-LAST:event_btnactualizar2ActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
      
        String id_clase = idsede.getText();
        String nomb = nombre.getText();
        int fono = Integer.parseInt(telefono.getText());
        String mail = correo.getText();
        
        g.insertarDatosTablaUno(id_clase, nomb, fono, mail);
    }//GEN-LAST:event_btningresarActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        
    }//GEN-LAST:event_telefonoActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        g.updateDatosTabla1();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        
        String borrar= JOptionPane.showInputDialog(null," ingrese id de la columna que desea borrar");
        g.deleteDatosTabla1(borrar);
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
       g.mostrarDatos(tabla1);
    }//GEN-LAST:event_btnverActionPerformed

    private void btingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btingresar2ActionPerformed
        String estados="";
        String nacion="";
        String selec="";
        String id= ida.getText();
        String nombre = nomb.getText();
        
        if (rest.isSelected())
            estados="Restaurado";
            if (viejo.isSelected())
                estados="Viejo sin modificar";
                if (total.isSelected())
                    estados="Chatarra total";
                
        if (estado.isSelected())
            nacion="Estado_Unidense";
            if (aleman.isSelected())
                nacion="Aleman";
            
        if(color.isSelected())
            selec = selec+"Color llamativo"+", ";
            if(armamento.isSelected())
                selec = selec+"Armamento"+", ";
                else
                if(art.isSelected())
                    selec = selec+"Art_Modificado"+", "; 
                        if(manejable.isSelected())
                        selec = selec+"Manejable"+" ";
        
        String sede = idsed.getText();
        int clas = Integer.parseInt(idcla.getText());
        
        g.insertarDatosTablaDos(id, nombre, estados, nacion, selec, sede, clas);
    }//GEN-LAST:event_btingresar2ActionPerformed

    private void idclaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idclaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idclaActionPerformed

    private void btnver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnver2ActionPerformed
       g.mostrarDatos2(tabla2);
    }//GEN-LAST:event_btnver2ActionPerformed

    private void btneliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar2ActionPerformed
       g.deleteDatosTabla2();
    }//GEN-LAST:event_btneliminar2ActionPerformed

    private void btningresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresar3ActionPerformed
        String tipo="";
        int idc = Integer.parseInt(id_clase.getText());
        String fab=fabricante.getText();
        int year = Integer.parseInt(anno.getText());
        
        if (avion.isSelected())
            tipo="Avion";
            if (tanque.isSelected())
                tipo="Tanque";
                if(barco.isSelected())
                    tipo="Barco";
                
        g.insertarDatosTablaTres(idc, tipo, fab, year);
    }//GEN-LAST:event_btningresar3ActionPerformed

    private void btnactualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar3ActionPerformed
        g.updateDatosTabla3();
    }//GEN-LAST:event_btnactualizar3ActionPerformed

    private void btneliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar3ActionPerformed
        g.deleteDatosTabla3();
    }//GEN-LAST:event_btneliminar3ActionPerformed

    private void btnver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnver3ActionPerformed
       g.mostrarDatos3(tabla3);
    }//GEN-LAST:event_btnver3ActionPerformed

    private void AceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptActionPerformed
     
    Quienes q=new Quienes();
    q.setVisible(true);
        
    }//GEN-LAST:event_AceptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        g.mostrarDatosPR1(TABLAPR1);
        g.mostrarDatosPR2(TABLAPR2);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PanelPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acept;
    private javax.swing.JTabbedPane DATOS;
    private javax.swing.JTable TABLAPR1;
    private javax.swing.JTable TABLAPR2;
    private javax.swing.JRadioButton aleman;
    private javax.swing.JTextField anno;
    private javax.swing.JCheckBox armamento;
    private javax.swing.JCheckBox art;
    private javax.swing.JRadioButton avion;
    private javax.swing.JRadioButton barco;
    private javax.swing.JButton btingresar2;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnactualizar2;
    private javax.swing.JButton btnactualizar3;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btneliminar2;
    private javax.swing.JButton btneliminar3;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btningresar3;
    private javax.swing.JButton btnver;
    private javax.swing.JButton btnver2;
    private javax.swing.JButton btnver3;
    private javax.swing.JCheckBox color;
    private javax.swing.JTextField correo;
    private javax.swing.JRadioButton estado;
    private javax.swing.JTextField fabricante;
    private javax.swing.JTextField id_clase;
    private javax.swing.JTextField ida;
    private javax.swing.JTextField idcla;
    private javax.swing.JTextField idsed;
    private javax.swing.JTextField idsede;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox manejable;
    private javax.swing.JTextField nomb;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton rest;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    private javax.swing.JRadioButton tanque;
    private javax.swing.JTextField telefono;
    private javax.swing.JRadioButton total;
    private javax.swing.JRadioButton viejo;
    // End of variables declaration//GEN-END:variables
}
