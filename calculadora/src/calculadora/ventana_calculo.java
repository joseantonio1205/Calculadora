package calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JOptionPane;



public class ventana_calculo extends javax.swing.JFrame {
    
    ScriptEngineManager sem= new ScriptEngineManager();
    ScriptEngine se= sem.getEngineByName("JavaScript");
    
    
    public ventana_calculo() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtproceso = new javax.swing.JLabel();
        txtresultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        limpiar = new javax.swing.JButton();
        porcentaje = new javax.swing.JButton();
        entre = new javax.swing.JButton();
        btn_siete = new javax.swing.JButton();
        elevado = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_ocho = new javax.swing.JButton();
        btn_nueve = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_uno = new javax.swing.JButton();
        btn_dos = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        btn_cero = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        txtproceso.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtproceso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtresultado.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtproceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtresultado, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtproceso, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtresultado, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        limpiar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        limpiar.setText("C");
        limpiar.setBorderPainted(false);
        limpiar.setFocusPainted(false);
        limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        porcentaje.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        porcentaje.setText("%");
        porcentaje.setBorderPainted(false);
        porcentaje.setFocusPainted(false);
        porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeActionPerformed(evt);
            }
        });

        entre.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        entre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        entre.setText("/");
        entre.setBorderPainted(false);
        entre.setFocusPainted(false);
        entre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        entre.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        entre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreActionPerformed(evt);
            }
        });

        btn_siete.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_siete.setText("7");
        btn_siete.setBorderPainted(false);
        btn_siete.setFocusPainted(false);
        btn_siete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_siete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_siete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sieteActionPerformed(evt);
            }
        });

        elevado.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        elevado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        elevado.setText("ce");
        elevado.setBorderPainted(false);
        elevado.setFocusPainted(false);
        elevado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        elevado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        elevado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        elevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadoActionPerformed(evt);
            }
        });

        multiplicacion.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        multiplicacion.setText("X");
        multiplicacion.setBorderPainted(false);
        multiplicacion.setFocusPainted(false);
        multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorderPainted(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_ocho.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_ocho.setText("8");
        btn_ocho.setBorderPainted(false);
        btn_ocho.setFocusPainted(false);
        btn_ocho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ocho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_ocho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ochoActionPerformed(evt);
            }
        });

        btn_nueve.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_nueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_nueve.setText("9");
        btn_nueve.setBorderPainted(false);
        btn_nueve.setFocusPainted(false);
        btn_nueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_nueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueveActionPerformed(evt);
            }
        });

        btn_cinco.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_cinco.setText("5");
        btn_cinco.setBorderPainted(false);
        btn_cinco.setFocusPainted(false);
        btn_cinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_cinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cincoActionPerformed(evt);
            }
        });

        resta.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        resta.setText("-");
        resta.setBorderPainted(false);
        resta.setFocusPainted(false);
        resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorderPainted(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_uno.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_uno.setText("1");
        btn_uno.setBorderPainted(false);
        btn_uno.setFocusPainted(false);
        btn_uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_uno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_uno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unoActionPerformed(evt);
            }
        });

        btn_dos.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_dos.setText("2");
        btn_dos.setBorderPainted(false);
        btn_dos.setFocusPainted(false);
        btn_dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_dos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorderPainted(false);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        suma.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        suma.setText("+");
        suma.setBorderPainted(false);
        suma.setFocusPainted(false);
        suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        btn_cero.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btn_cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_cero.setText("0");
        btn_cero.setBorderPainted(false);
        btn_cero.setFocusPainted(false);
        btn_cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        btn_cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceroActionPerformed(evt);
            }
        });

        punto.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        punto.setText(".");
        punto.setBorderPainted(false);
        punto.setFocusPainted(false);
        punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt1.jpg"))); // NOI18N
        punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        igual.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        igual.setText("=");
        igual.setBorderPainted(false);
        igual.setFocusPainted(false);
        igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnn2.jpg"))); // NOI18N
        igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.jpg"))); // NOI18N
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(elevado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(entre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elevado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 300, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //este metodo nos recogera la variale que contiene cada boto numerico
    public void enviarNumero(String variable){
        
        //con esta linea de codigo solo nos deja recoger un valor
        //txtresultado.setText(variable);
        
        //con este nos permite seleccionar cuantas veces queremos el mismo valor
        txtproceso.setText(txtproceso.getText()+variable);
    }
    
    
    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
    
        try{
            
        String resultado = se.eval(txtproceso.getText()).toString();
        txtresultado.setText(resultado);
        }catch(Exception e){JOptionPane.showMessageDialog(null, "error");}
    }//GEN-LAST:event_igualActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // limpia los dos textField
        
        txtproceso.setText("");
        txtresultado.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void btn_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unoActionPerformed
        enviarNumero("1");
        
    }//GEN-LAST:event_btn_unoActionPerformed

    private void btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceroActionPerformed
        enviarNumero("0");
        
    }//GEN-LAST:event_btn_ceroActionPerformed

    private void btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosActionPerformed
        enviarNumero("2");
        
    }//GEN-LAST:event_btn_dosActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        enviarNumero("3");
        
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        enviarNumero("4");
        
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cincoActionPerformed
        enviarNumero("5");
        
    }//GEN-LAST:event_btn_cincoActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
       enviarNumero("6");
       
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sieteActionPerformed
        enviarNumero("7");
        
    }//GEN-LAST:event_btn_sieteActionPerformed

    private void btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ochoActionPerformed
        enviarNumero("8");
        
    }//GEN-LAST:event_btn_ochoActionPerformed

    private void btn_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueveActionPerformed
        enviarNumero("9");
        
    }//GEN-LAST:event_btn_nueveActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        enviarNumero(".");
        
    }//GEN-LAST:event_puntoActionPerformed

    private void elevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadoActionPerformed
        String texto= txtproceso.getText().substring(0,txtproceso.getText().length()-1);
        txtproceso.setText(texto);
    }//GEN-LAST:event_elevadoActionPerformed

    private void porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeActionPerformed
        enviarNumero("%");
    }//GEN-LAST:event_porcentajeActionPerformed

    private void entreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreActionPerformed
        enviarNumero("/");
    }//GEN-LAST:event_entreActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        enviarNumero("*");
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        enviarNumero("-");
    }//GEN-LAST:event_restaActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        enviarNumero("+");
    }//GEN-LAST:event_sumaActionPerformed

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
            java.util.logging.Logger.getLogger(ventana_calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_calculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_siete;
    private javax.swing.JButton btn_uno;
    private javax.swing.JButton elevado;
    private javax.swing.JButton entre;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton porcentaje;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    private javax.swing.JLabel txtproceso;
    private javax.swing.JLabel txtresultado;
    // End of variables declaration//GEN-END:variables
}
