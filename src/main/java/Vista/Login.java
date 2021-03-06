package Vista;

import DAO.UsuariosDAO;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Login extends javax.swing.JFrame {

    private VistaSGI gerente;
    private UsuariosDAO uDao;
    private final ImageIcon iconoMostrar = new ImageIcon("src/main/resources/btnMostrar.png");
    private final ImageIcon iconoOcultar = new ImageIcon("src/main/resources/btnOcultar.png");
    private boolean estado = true;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Miniatura2.png")).getImage();
        super.setIconImage(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        txfContraseña = new javax.swing.JPasswordField();
        signIn = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnMostrarContraseñaU = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoBiodess - copia.png"))); // NOI18N

        txfUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsuario.setText("USUARIO");
        txfUsuario.setToolTipText("");
        txfUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfUsuarioMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfUsuarioMouseReleased(evt);
            }
        });
        txfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUsuarioActionPerformed(evt);
            }
        });
        txfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfUsuarioKeyTyped(evt);
            }
        });

        txfContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txfContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txfContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfContraseña.setText("•••••••••••••••");
        txfContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfContraseñaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfContraseñaMouseReleased(evt);
            }
        });
        txfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfContraseñaActionPerformed(evt);
            }
        });
        txfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfContraseñaKeyPressed(evt);
            }
        });

        signIn.setBackground(new java.awt.Color(255, 255, 255));
        signIn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signIn.setForeground(new java.awt.Color(255, 255, 255));
        signIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bton Login.png"))); // NOI18N
        signIn.setBorderPainted(false);
        signIn.setContentAreaFilled(false);
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bton login cursor oscuro.png"))); // NOI18N
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bton salida.png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bton salida cursor oscuro.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnMostrarContraseñaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnMostrar.png"))); // NOI18N
        btnMostrarContraseñaU.setBorderPainted(false);
        btnMostrarContraseñaU.setContentAreaFilled(false);
        btnMostrarContraseñaU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarContraseñaU.setFocusable(false);
        btnMostrarContraseñaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarContraseñaUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarContraseñaU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarContraseñaU, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INICIAR SESION");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabecera_.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfUsuarioMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 1) {

            if (txfContraseña.getText().length() == 0) {
                txfContraseña.setText("•••••••••••••••");
            } else {

                if (txfUsuario.getText().equalsIgnoreCase("USUARIO")) {
                    txfUsuario.setText(null);

                } else {
                }
            }
        }
    }//GEN-LAST:event_txfUsuarioMouseClicked

    private void txfUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfUsuarioMouseReleased
        // TODO add your handling code here:

        if (txfContraseña.getText().length() == 0) {
            txfContraseña.setText("•••••••••••••••");
        } else {

            if (txfUsuario.getText().equalsIgnoreCase("USUARIO")) {
                txfUsuario.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txfUsuarioMouseReleased

    private void txfUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUsuarioKeyPressed
        // TODO add your handling code here:

        if (txfContraseña.getText().length() == 0) {
            txfContraseña.setText("•••••••••••••••");
        } else {

            if (txfUsuario.getText().equalsIgnoreCase("USUARIO")) {
                txfUsuario.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txfUsuarioKeyPressed

    private void txfContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfContraseñaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            if (txfUsuario.getText().length() == 0) {
                txfUsuario.setText("USUARIO");
            } else {

                if (txfContraseña.getText().equalsIgnoreCase("•••••••••••••••")) {
                    txfContraseña.setText(null);
                } else {
                }
            }
        }
    }//GEN-LAST:event_txfContraseñaMouseClicked

    private void txfContraseñaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfContraseñaMouseReleased
        // TODO add your handling code here:

        if (txfUsuario.getText().length() == 0) {
            txfUsuario.setText("USUARIO");
        } else {

            if (txfContraseña.getText().equalsIgnoreCase("•••••••••••••••")) {
                txfContraseña.setText(null);
            } else {
            }
        }

    }//GEN-LAST:event_txfContraseñaMouseReleased

    private void txfContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfContraseñaKeyPressed
        // TODO add your handling code here:
        if (txfUsuario.getText().length() == 0) {
            txfUsuario.setText("USUARIO");
        } else {

            if (txfContraseña.getText().equalsIgnoreCase("•••••••••••••••")) {
                txfContraseña.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txfContraseñaKeyPressed

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        verificar();

        setColor(gerente.btn_1);
        gerente.ind_1.setOpaque(true);
        resetColor(new JPanel[]{gerente.btn_2, gerente.btn_3}, new JPanel[]{gerente.ind_2, gerente.ind_3});
        gerente.parent.removeAll();
        gerente.parent.add(gerente.PerfilGerente);
        gerente.parent.repaint();
        gerente.parent.revalidate();
    }//GEN-LAST:event_signInActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfContraseñaActionPerformed

        try {
            verificar();
            setColor(gerente.btn_1);
            gerente.ind_1.setOpaque(true);
            resetColor(new JPanel[]{gerente.btn_2, gerente.btn_3}, new JPanel[]{gerente.ind_2, gerente.ind_3});
            gerente.parent.removeAll();
            gerente.parent.add(gerente.PerfilGerente);
            gerente.parent.repaint();
            gerente.parent.revalidate();

        } catch (NullPointerException npe) {

        }
    }//GEN-LAST:event_txfContraseñaActionPerformed

    private void txfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUsuarioActionPerformed
        verificar();
    }//GEN-LAST:event_txfUsuarioActionPerformed

    private void txfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUsuarioKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

    }//GEN-LAST:event_txfUsuarioKeyTyped

    private void btnMostrarContraseñaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarContraseñaUActionPerformed

        if (estado) {
            txfContraseña.setEchoChar((char) 0);
            btnMostrarContraseñaU.setIcon(iconoOcultar);
        } else {
            txfContraseña.setEchoChar('•');
            btnMostrarContraseñaU.setIcon(iconoMostrar);
        }

        estado = !estado;
    }//GEN-LAST:event_btnMostrarContraseñaUActionPerformed

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(0, 0, 0));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMostrarContraseñaU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton signIn;
    private javax.swing.JPasswordField txfContraseña;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables

    public void verificar() {

        uDao = new UsuariosDAO();
        String usuario = txfUsuario.getText();
        ResultSet rs;

        try {

            rs = uDao.buscar(usuario);

            if (!rs.next()) {

                JOptionPane.showMessageDialog(null, "El nombre de usuario no está registrado o está mal escrito. Verifique su información.");

            } else {

                if (!rs.getString(2).equals(txfContraseña.getText())) {

                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta. Verifique su información.");

                } else {

                    if (rs.getString(3).equalsIgnoreCase("Encargado")) {
                        gerente.cargo = 1;

                    } else {

                        gerente.cargo = 0;
                    }

                    gerente = new VistaSGI();
                    gerente.setVisible(true);
                    gerente.lblUsuario.setText(rs.getString(1));
                    gerente.lblNombre.setText(rs.getString(4));
                    gerente.lblApellido.setText(rs.getString(5));
                    gerente.lblCelular.setText(rs.getString(6));
                    gerente.lblDireccion.setText(rs.getString(7));
                    gerente.lblCargo.setText(rs.getString(3));
                    dispose();
                }
            }

        } catch (SQLException ex) {

        }

    }

}
