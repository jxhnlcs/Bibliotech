package VIEW;

import DAO.EmprestimoDAO;
import MODEL.EmprestimoMODEL;
import MODEL.LivrosMODEL;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;

public class EmprestimoVIEW extends javax.swing.JFrame implements ActionListener {

    public EmprestimoVIEW() {
        initComponents();
        Botoes();
        SoNumero();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLIVROS = new javax.swing.JButton();
        btnCADASTRAR = new javax.swing.JButton();
        btnEMPRESTIMO = new javax.swing.JButton();
        btnDEVOLUCAO = new javax.swing.JButton();
        btnHOME = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();
        txtTel = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtDataDevolucao = new javax.swing.JTextField();
        txtNomeLivro = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtDataAluguel = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIBLIOTECH");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        btnLIVROS.setBackground(new java.awt.Color(0, 0, 0));
        btnLIVROS.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLIVROS.setForeground(new java.awt.Color(255, 255, 255));
        btnLIVROS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/livro.png"))); // NOI18N
        btnLIVROS.setText("  Livros");
        btnLIVROS.setBorder(null);
        btnLIVROS.setPreferredSize(new java.awt.Dimension(57, 50));
        btnLIVROS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIVROSActionPerformed(evt);
            }
        });
        jPanel2.add(btnLIVROS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, -1));

        btnCADASTRAR.setBackground(new java.awt.Color(0, 0, 0));
        btnCADASTRAR.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCADASTRAR.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/conecte-se (1) (1).png"))); // NOI18N
        btnCADASTRAR.setText("Cadastrar");
        btnCADASTRAR.setBorder(null);
        btnCADASTRAR.setPreferredSize(new java.awt.Dimension(57, 50));
        btnCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRARActionPerformed(evt);
            }
        });
        jPanel2.add(btnCADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, -1));

        btnEMPRESTIMO.setBackground(new java.awt.Color(0, 0, 0));
        btnEMPRESTIMO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEMPRESTIMO.setForeground(new java.awt.Color(255, 255, 255));
        btnEMPRESTIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/emprestimo.png"))); // NOI18N
        btnEMPRESTIMO.setText("Emprestar");
        btnEMPRESTIMO.setBorder(null);
        btnEMPRESTIMO.setPreferredSize(new java.awt.Dimension(57, 50));
        btnEMPRESTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEMPRESTIMOActionPerformed(evt);
            }
        });
        jPanel2.add(btnEMPRESTIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, -1));

        btnDEVOLUCAO.setBackground(new java.awt.Color(0, 0, 0));
        btnDEVOLUCAO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDEVOLUCAO.setForeground(new java.awt.Color(255, 255, 255));
        btnDEVOLUCAO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/devolucao.png"))); // NOI18N
        btnDEVOLUCAO.setText(" Devolver");
        btnDEVOLUCAO.setBorder(null);
        btnDEVOLUCAO.setPreferredSize(new java.awt.Dimension(57, 50));
        btnDEVOLUCAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDEVOLUCAOActionPerformed(evt);
            }
        });
        jPanel2.add(btnDEVOLUCAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, 210, -1));

        btnHOME.setBackground(new java.awt.Color(0, 0, 0));
        btnHOME.setForeground(new java.awt.Color(0, 0, 0));
        btnHOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pinguin.png (2).png"))); // NOI18N
        btnHOME.setBorder(null);
        btnHOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOMEActionPerformed(evt);
            }
        });
        jPanel2.add(btnHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 89, 86));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Emprestar livro");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 6, 181, 46));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setText("Cpf");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 570, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 270, 10));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setText("Telefone");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 260, 10));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setText("N°");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 270, 10));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel9.setText("Rua");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 180, 10));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel12.setText("Nome do livro");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel13.setText("Data da devolução");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 270, 19));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel14.setText("Data do empréstimo");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 260, 10));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel15.setText("Bairro");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        btnConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnConfirmar.setText("Confirmar empréstimo");
        btnConfirmar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 190, 60));
        jPanel3.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 50, 10));

        txtTel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTel.setBorder(null);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        jPanel3.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 260, 40));

        txtRua.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRua.setBorder(null);
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });
        jPanel3.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 270, 40));

        txtNum.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNum.setBorder(null);
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        jPanel3.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 50, 40));

        txtBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBairro.setBorder(null);
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        jPanel3.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 180, 40));

        txtDataDevolucao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDataDevolucao.setBorder(null);
        txtDataDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDevolucaoActionPerformed(evt);
            }
        });
        jPanel3.add(txtDataDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 260, 40));

        txtNomeLivro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeLivro.setBorder(null);
        txtNomeLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeLivroActionPerformed(evt);
            }
        });
        jPanel3.add(txtNomeLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 570, 40));

        txtCpf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCpf.setBorder(null);
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        jPanel3.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 270, 40));

        txtDataAluguel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDataAluguel.setBorder(null);
        txtDataAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataAluguelActionPerformed(evt);
            }
        });
        jPanel3.add(txtDataAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 270, 40));

        txtNomeCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeCliente.setBorder(null);
        jPanel3.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 570, 40));
        jPanel3.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 570, 10));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel11.setText("Nome do cliente");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 940, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLIVROSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIVROSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLIVROSActionPerformed

    private void btnCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTRARActionPerformed

    private void btnEMPRESTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEMPRESTIMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEMPRESTIMOActionPerformed

    private void btnDEVOLUCAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDEVOLUCAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDEVOLUCAOActionPerformed

    private void btnHOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHOMEActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        emprestarLivro();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtDataDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataDevolucaoActionPerformed

    private void txtNomeLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeLivroActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtDataAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataAluguelActionPerformed

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
            java.util.logging.Logger.getLogger(EmprestimoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmprestimoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmprestimoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmprestimoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmprestimoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCADASTRAR;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDEVOLUCAO;
    private javax.swing.JButton btnEMPRESTIMO;
    private javax.swing.JButton btnHOME;
    private javax.swing.JButton btnLIVROS;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataAluguel;
    private javax.swing.JTextField txtDataDevolucao;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeLivro;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    public void Botoes() {
        JButton[] btns = {btnHOME, btnLIVROS, btnCADASTRAR, btnEMPRESTIMO, btnDEVOLUCAO};
        for (JButton btn : btns) {
            btn.setBackground(new Color(0, 0, 0));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    btn.setBackground(new Color(28, 28, 28));
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(0, 0, 0));
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                }
            });
        }
        btnLIVROS.addActionListener((e) -> {
            this.setVisible(false);
            new LivrosVIEW();
        });

        btnDEVOLUCAO.addActionListener((e) -> {
            this.setVisible(false);
            new DevolucaoVIEW();
        });
        btnCADASTRAR.addActionListener((e) -> {
            this.setVisible(false);
            new CadastroVIEW();
        });
        btnHOME.addActionListener((e) -> {
            this.setVisible(false);
            new HomeVIEW();
        });
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new HomeVIEW();
    }

    public void Mensagem() {
        JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void limparCampos() {
        txtNomeCliente.setText("");
        txtCpf.setText("");
        txtTel.setText("");
        txtRua.setText("");
        txtNum.setText("");
        txtBairro.setText("");
        txtNomeLivro.setText("");
        txtDataAluguel.setText("");
        txtDataDevolucao.setText("");
    }

    public void emprestarLivro() {
        if (txtNomeCliente.getText().isEmpty() || txtCpf.getText().isEmpty() || txtTel.getText().isEmpty()
                || txtRua.getText().isEmpty() || txtNum.getText().isEmpty() || txtBairro.getText().isEmpty()
                || txtNomeLivro.getText().isEmpty() || txtDataAluguel.getText().isEmpty()
                || txtDataDevolucao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preecha os campos", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {

            String nomeCliente, cpf, tel, rua, num, bairro, nomeLivro, valor, dataAluguel,
                    dataDevolucao, statusLivro = "Emprestado";

            nomeCliente = txtNomeCliente.getText();
            cpf = txtCpf.getText();
            tel = txtTel.getText();
            rua = txtRua.getText();
            num = txtNum.getText();
            bairro = txtBairro.getText();
            nomeLivro = txtNomeLivro.getText();
            dataAluguel = txtDataAluguel.getText();
            dataDevolucao = txtDataDevolucao.getText();

            EmprestimoMODEL emprestimoM = new EmprestimoMODEL();
            emprestimoM.setNomeCliente(nomeCliente);
            emprestimoM.setCpf(cpf);
            emprestimoM.setTelefone(tel);
            emprestimoM.setEndRua(rua);
            emprestimoM.setEndNum(num);
            emprestimoM.setEndBairro(bairro);
            emprestimoM.setNomeLivro(nomeLivro);
            emprestimoM.setDataAluguel(dataAluguel);
            emprestimoM.setDataDevolucao(dataDevolucao);

            LivrosMODEL livrosM = new LivrosMODEL();
            livrosM.setStatusLivro(statusLivro);

            EmprestimoDAO emprestimoD = new EmprestimoDAO();
            emprestimoD.emprestarLivro(emprestimoM, livrosM);

            Mensagem();
            limparCampos();
        }
    }
    
    public void SoNumero(){
        txtCpf.setDocument(new NumeroINPUT());
        txtNum.setDocument(new NumeroINPUT());
        txtTel.setDocument(new NumeroINPUT());
    }
}