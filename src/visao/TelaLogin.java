/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author Pinkman
 */
public class TelaLogin extends javax.swing.JFrame {
    
    ConexaoBD con = new ConexaoBD();

    public TelaLogin() {
        initComponents();
        con.conectarPostgre();
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitLoginTelaLogin = new javax.swing.JLabel();
        jLabelTodosOsDireitosReservados = new javax.swing.JLabel();
        jSeparatorDownTelaLogin = new javax.swing.JSeparator();
        jSeparatorUpTelaLogin = new javax.swing.JSeparator();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSairTelaLogin = new javax.swing.JButton();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelTitLoginTelaLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTitLoginTelaLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitLoginTelaLogin.setText("Login");
        getContentPane().add(jLabelTitLoginTelaLogin);
        jLabelTitLoginTelaLogin.setBounds(540, 530, 50, 17);

        jLabelTodosOsDireitosReservados.setText("@2017. TODOS OS DIREITOS RESERVADOS.");
        getContentPane().add(jLabelTodosOsDireitosReservados);
        jLabelTodosOsDireitosReservados.setBounds(430, 760, 260, 20);
        getContentPane().add(jSeparatorDownTelaLogin);
        jSeparatorDownTelaLogin.setBounds(420, 752, 270, 10);
        getContentPane().add(jSeparatorUpTelaLogin);
        jSeparatorUpTelaLogin.setBounds(420, 550, 270, 10);

        jTextFieldUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldUsuario.setToolTipText("Digite um Usuario");
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(450, 580, 220, 40);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(450, 630, 220, 40);

        jButtonEntrar.setBackground(new java.awt.Color(51, 153, 255));
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(450, 700, 220, 40);

        jButtonSairTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao_Sair_02.png"))); // NOI18N
        jButtonSairTelaLogin.setBorder(null);
        jButtonSairTelaLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSairTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairTelaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairTelaLogin);
        jButtonSairTelaLogin.setBounds(660, 10, 60, 60);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Doctor_Tela_Login_02.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(-160, -20, 890, 850);

        setSize(new java.awt.Dimension(746, 817));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        // AO CLICAR, ENTRARÁ NO SISTEMA E MOSTRARÁ A TELA PRINCIPAL
        // Pega o que o usuario digitar e compara a string:
         /*if(jTextFieldUsuario.getText().equals("")&&jPasswordFieldSenha.getText().equals("")){
           TelaPrincipal telap = new TelaPrincipal();
            telap.setVisible(true);
            dispose(); 
        }else{
             JOptionPane.showMessageDialog(rootPane, " Senha ou Usuário Inválidos! ");
         }*/
    // Pesquisa no BD se o usuario esta cadastrado. se sim, libera
    //Busca se o usuario digitado existe no BD
        
        try {
            con.executarSql("select * from usuario where nome_usuario='"+jTextFieldUsuario.getText()+"'");
            //salva dentro do rs
            con.rs.first();
            //se a senha fopr igual, ele mostra a tela
            if(con.rs.getString("senha_usuario").equals(jPasswordFieldSenha.getText())){
    
                TelaPrincipal telaprin = new TelaPrincipal(jTextFieldUsuario.getText());
                telaprin.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Senha/Usuário inválidos! ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Senha/Usuário inválidos! ");
        }
        
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jButtonSairTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairTelaLoginActionPerformed
        // TODO add your handling code here:
       jButtonSairTelaLogin.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== jButtonSairTelaLogin){
                int retorno = JOptionPane.showConfirmDialog(jButtonSairTelaLogin, "Deseja Realmente Sair? ", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (retorno == JOptionPane.YES_OPTION)
                    System.exit(0);
                else if(retorno == JOptionPane.NO_OPTION)
                    JOptionPane.showMessageDialog(jButtonSairTelaLogin, "Obrigado por continuar", "Agradecimento", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }); 
    }//GEN-LAST:event_jButtonSairTelaLoginActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        
       
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSairTelaLogin;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelTitLoginTelaLogin;
    private javax.swing.JLabel jLabelTodosOsDireitosReservados;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JSeparator jSeparatorDownTelaLogin;
    private javax.swing.JSeparator jSeparatorUpTelaLogin;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
