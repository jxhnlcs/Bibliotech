/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;


import DAO.LivrosDAO;
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

/**
 *
 * @author PuddinAPX
 */
public class CadastroVIEW extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form CadastroVIEW
     */
    public CadastroVIEW() {
        initComponents();
        botoes();
        SoNumeros();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnCADASTRO = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtEditora = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLIVROS = new javax.swing.JButton();
        btnCADASTRAR = new javax.swing.JButton();
        btnEMPRESTIMO = new javax.swing.JButton();
        btnDEVOLUCAO = new javax.swing.JButton();
        btnHOME = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Autor");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 150, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Nome do livro");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 150, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Ano de lançamento");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 210, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Editora");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 150, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Valor");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 150, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Cod. Livro");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 150, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 300, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 300, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 300, 20));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 320, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 670, 10));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 320, 10));

        btnCADASTRO.setBackground(new java.awt.Color(255, 255, 255));
        btnCADASTRO.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCADASTRO.setText("Cadastrar");
        btnCADASTRO.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnCADASTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTROActionPerformed(evt);
            }
        });
        jPanel3.add(btnCADASTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 150, 50));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNome.setBorder(null);
        jPanel3.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 320, 40));

        txtEditora.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEditora.setBorder(null);
        jPanel3.add(txtEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 320, 40));

        txtCod.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCod.setBorder(null);
        jPanel3.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 670, 40));

        txtValor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtValor.setBorder(null);
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        jPanel3.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 300, 40));

        txtAutor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAutor.setBorder(null);
        jPanel3.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 300, 40));

        txtAno.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAno.setBorder(null);
        jPanel3.add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 300, 40));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setText("Cadastrar livro");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 200, 50));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("Categoria");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, 30));

        txtCategoria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCategoria.setBorder(null);
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        jPanel3.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 320, 40));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 320, 10));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 940, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIBLIOTECH");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

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
        jPanel1.add(btnLIVROS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, -1));

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
        jPanel1.add(btnCADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 210, -1));

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
        jPanel1.add(btnEMPRESTIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, -1));

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
        jPanel1.add(btnDEVOLUCAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, 210, -1));

        btnHOME.setBackground(new java.awt.Color(0, 0, 0));
        btnHOME.setForeground(new java.awt.Color(0, 0, 0));
        btnHOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pinguin.png (2).png"))); // NOI18N
        btnHOME.setBorder(null);
        btnHOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOMEActionPerformed(evt);
            }
        });
        jPanel1.add(btnHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 89, 86));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCADASTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTROActionPerformed
        cadastrarLivro();
    }//GEN-LAST:event_btnCADASTROActionPerformed

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

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCADASTRAR;
    private javax.swing.JButton btnCADASTRO;
    private javax.swing.JButton btnDEVOLUCAO;
    private javax.swing.JButton btnEMPRESTIMO;
    private javax.swing.JButton btnHOME;
    private javax.swing.JButton btnLIVROS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    public void botoes() {
        JButton[] btns = {btnCADASTRAR, btnDEVOLUCAO, btnEMPRESTIMO, btnHOME, btnLIVROS};
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
        btnEMPRESTIMO.addActionListener((e) -> {
            this.setVisible(false);
            new EmprestimoVIEW();
        });
        btnDEVOLUCAO.addActionListener((e) -> {
            this.setVisible(false);
            new DevolucaoVIEW();
        });
        btnLIVROS.addActionListener((e) -> {
            this.setVisible(false);
            new LivrosVIEW();
        });
        btnHOME.addActionListener((e) -> {
            this.setVisible(false);
            new HomeVIEW();
        });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new HomeVIEW();
    }

    public void limparCampos() {
        txtNome.setText("");
        txtEditora.setText("");
        txtAutor.setText("");
        txtCategoria.setText("");
        txtAno.setText("");
        txtCod.setText("");
        txtValor.setText("");
    }

    public void Mensagem() {

        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void cadastrarLivro() {

        if (txtNome.getText().isEmpty() || txtEditora.getText().isEmpty() || txtAutor.getText().isEmpty()
                || txtCategoria.getText().isEmpty() || txtValor.getText().isEmpty() || txtAno.getText().isEmpty() || txtCod.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            String nomeLivro, editora, autor, categoria, valorLivro, anoLancamento, codLivro;

            nomeLivro = txtNome.getText();
            editora = txtEditora.getText();
            autor = txtAutor.getText();
            categoria = txtCategoria.getText();
            valorLivro = txtValor.getText();
            anoLancamento = txtAno.getText();
            codLivro = txtCod.getText();

            LivrosMODEL livrosM = new LivrosMODEL();

            livrosM.setNomeLivro(nomeLivro);
            livrosM.setEditora(editora);
            livrosM.setAutor(autor);
            livrosM.setCategoria(categoria);
            livrosM.setValorLivro(valorLivro);
            livrosM.setAnoLancamento(anoLancamento);
            livrosM.setCodLivro(codLivro);

            LivrosDAO livrosD = new LivrosDAO();
            livrosD.cadastrarLivro(livrosM);
            
            Mensagem();
            limparCampos();

        }

    }
    
    public void SoNumeros(){
        txtAno.setDocument(new NumeroINPUT());
        txtCod.setDocument(new NumeroINPUT());
        txtValor.setDocument(new NumeroINPUT());
    }

}