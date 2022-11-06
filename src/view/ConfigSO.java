package view;

import controller.Controller;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Edgar Telles
 */
public class ConfigSO extends javax.swing.JFrame {
    private Controller controlador;
    private int x,y;
    
    public ConfigSO(Controller controlador) {
        initComponents();
        this.controlador = controlador;
        setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("images/MemorySlot.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JLabel();
        botonInstalarSO = new javax.swing.JButton();
        separador1 = new javax.swing.JSeparator();
        fieldTamPrincipal = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        fieldTamSecundaria = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        fieldTamPaginas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 300));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 300));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/EquisBlanca.png"))); // NOI18N
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
        });

        botonInstalarSO.setBackground(new java.awt.Color(153, 255, 255));
        botonInstalarSO.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        botonInstalarSO.setForeground(new java.awt.Color(51, 51, 51));
        botonInstalarSO.setText("ASIGNAR");
        botonInstalarSO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonInstalarSO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonInstalarSO.setFocusPainted(false);
        botonInstalarSO.setFocusable(false);
        botonInstalarSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInstalarSOActionPerformed(evt);
            }
        });

        separador1.setBackground(new java.awt.Color(102, 102, 102));
        separador1.setForeground(new java.awt.Color(102, 102, 102));

        fieldTamPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        fieldTamPrincipal.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        fieldTamPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        fieldTamPrincipal.setText("25600");
        fieldTamPrincipal.setBorder(null);
        fieldTamPrincipal.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldTamPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldTamPrincipalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTamPrincipalFocusLost(evt);
            }
        });
        fieldTamPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamPrincipalActionPerformed(evt);
            }
        });
        fieldTamPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTamPrincipalKeyTyped(evt);
            }
        });

        separador2.setBackground(new java.awt.Color(102, 102, 102));
        separador2.setForeground(new java.awt.Color(102, 102, 102));

        fieldTamSecundaria.setBackground(new java.awt.Color(51, 51, 51));
        fieldTamSecundaria.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        fieldTamSecundaria.setForeground(new java.awt.Color(255, 255, 255));
        fieldTamSecundaria.setText("102400");
        fieldTamSecundaria.setBorder(null);
        fieldTamSecundaria.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldTamSecundaria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldTamSecundariaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTamSecundariaFocusLost(evt);
            }
        });
        fieldTamSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamSecundariaActionPerformed(evt);
            }
        });
        fieldTamSecundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTamSecundariaKeyTyped(evt);
            }
        });

        separador3.setBackground(new java.awt.Color(102, 102, 102));
        separador3.setForeground(new java.awt.Color(102, 102, 102));

        fieldTamPaginas.setBackground(new java.awt.Color(51, 51, 51));
        fieldTamPaginas.setFont(new java.awt.Font("Calibri Light", 0, 15)); // NOI18N
        fieldTamPaginas.setForeground(new java.awt.Color(255, 255, 255));
        fieldTamPaginas.setText("1024");
        fieldTamPaginas.setBorder(null);
        fieldTamPaginas.setSelectionColor(new java.awt.Color(102, 102, 102));
        fieldTamPaginas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldTamPaginasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTamPaginasFocusLost(evt);
            }
        });
        fieldTamPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamPaginasActionPerformed(evt);
            }
        });
        fieldTamPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTamPaginasKeyTyped(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("[MB]");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("[MB]");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MEMORIA TOTAL");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("[MB]");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MEMORIA VIRTUAL");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PAGINAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(separador1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fieldTamPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fieldTamSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fieldTamPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)))
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(botonInstalarSO, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCerrar))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(219, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(72, 72, 72)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldTamPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)
                        .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldTamSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldTamPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(8, 8, 8)
                        .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonInstalarSO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonCerrar)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel4)
                    .addContainerGap(194, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
        this.controlador.closeFrame(this);
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void botonInstalarSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInstalarSOActionPerformed
        this.controlador.instalarSO(this);
    }//GEN-LAST:event_botonInstalarSOActionPerformed

    private void fieldTamPrincipalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPrincipalFocusGained
        if(fieldTamPrincipal.getText().equals("0") == true){
            fieldTamPrincipal.setText("");
        }
    }//GEN-LAST:event_fieldTamPrincipalFocusGained

    private void fieldTamPrincipalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPrincipalFocusLost
        if(fieldTamPrincipal.getText().trim().equals("") == true){
            fieldTamPrincipal.setText("0");
        }
    }//GEN-LAST:event_fieldTamPrincipalFocusLost

    private void fieldTamPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamPrincipalKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonInstalarSO.doClick();
        }
        controlador.validarSoloNumeros(evt, this);
    }//GEN-LAST:event_fieldTamPrincipalKeyTyped

    private void fieldTamPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamPrincipalActionPerformed
    }//GEN-LAST:event_fieldTamPrincipalActionPerformed

    private void fieldTamSecundariaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamSecundariaFocusGained
        System.out.println("asd");
        if(fieldTamSecundaria.getText().equals("0") == true){
            fieldTamSecundaria.setText("");
        }
    }//GEN-LAST:event_fieldTamSecundariaFocusGained

    private void fieldTamSecundariaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamSecundariaFocusLost
        if(fieldTamSecundaria.getText().trim().equals("") == true){
            fieldTamSecundaria.setText("0");
        }
    }//GEN-LAST:event_fieldTamSecundariaFocusLost

    private void fieldTamSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamSecundariaActionPerformed
    }//GEN-LAST:event_fieldTamSecundariaActionPerformed

    private void fieldTamSecundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamSecundariaKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonInstalarSO.doClick();
        }
        controlador.validarSoloNumeros(evt, this);
    }//GEN-LAST:event_fieldTamSecundariaKeyTyped

    private void fieldTamPaginasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPaginasFocusGained
        if(fieldTamPaginas.getText().equals("1024") == true){
            fieldTamPaginas.setText("");
        }
    }//GEN-LAST:event_fieldTamPaginasFocusGained

    private void fieldTamPaginasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTamPaginasFocusLost
        if(fieldTamPaginas.getText().trim().equals("") == true){
            fieldTamPaginas.setText("1024");
        }
    }//GEN-LAST:event_fieldTamPaginasFocusLost

    private void fieldTamPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamPaginasActionPerformed
    }//GEN-LAST:event_fieldTamPaginasActionPerformed

    private void fieldTamPaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTamPaginasKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla == KeyEvent.VK_ENTER){
            botonInstalarSO.doClick();
        }
        controlador.validarSoloNumeros(evt, this);
    }//GEN-LAST:event_fieldTamPaginasKeyTyped

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        if( (this.fieldTamPrincipal.getText().equals("") && this.fieldTamSecundaria.getText().equals("0") && this.fieldTamPaginas.getText().equals("0")) || (this.fieldTamPrincipal.getText().equals("0") && this.fieldTamSecundaria.getText().equals("") && this.fieldTamPaginas.getText().equals("0")) || (this.fieldTamPrincipal.getText().equals("0") && this.fieldTamSecundaria.getText().equals("0") && this.fieldTamPaginas.getText().equals("")) ) {
            this.fieldTamPaginas.setText("Libre");
            this.fieldTamPrincipal.setText("Libre");
            this.fieldTamSecundaria.setText("Libre");
        }
        
        
    }//GEN-LAST:event_jPanel2MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JButton botonInstalarSO;
    public javax.swing.JTextField fieldTamPaginas;
    public javax.swing.JTextField fieldTamPrincipal;
    public javax.swing.JTextField fieldTamSecundaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    // End of variables declaration//GEN-END:variables
}
