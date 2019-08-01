/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;


import modeloConection.ConexaoBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Pinkman
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD con = new ConexaoBD();
    
    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuarioLogado.setText(usuario);
        setSize(1920,1040);//Define Tamando da Janela
        setLocation(0,0);//Centraliza à Janela
    //    conecta.conectarMysql();
        con.conectarPostgre();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jLabelTituloCadastros = new javax.swing.JLabel();
        jLabelAddPaciente = new javax.swing.JLabel();
        jLabelAddMedico1 = new javax.swing.JLabel();
        jLabelAddEnfermeira = new javax.swing.JLabel();
        jButtonCadMedico = new javax.swing.JButton();
        jButtonCadEnfermeira = new javax.swing.JButton();
        jButtonCadPaciente = new javax.swing.JButton();
        jLabelTituloCadEnfermeiro = new javax.swing.JLabel();
        jLabelAddEnfermeira1 = new javax.swing.JLabel();
        jLabelTituloCadPaciente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelTituloSistemadeGerenciamento = new javax.swing.JLabel();
        jButtonFecharTelaCadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelUsuarioLogado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItemCadPaciente = new javax.swing.JMenuItem();
        jMenuItemCadEnfermeira = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemVersao = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        SairSair = new javax.swing.JMenuItem();

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoTelaPrincipal.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setPreferredSize(new java.awt.Dimension(0, 0));
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jLabelTituloCadastros.setText("Médicos");
        jPanelInternal.add(jLabelTituloCadastros);
        jLabelTituloCadastros.setBounds(100, 20, 70, 20);

        jLabelAddPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        jPanelInternal.add(jLabelAddPaciente);
        jLabelAddPaciente.setBounds(300, 130, 33, 40);

        jLabelAddMedico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        jPanelInternal.add(jLabelAddMedico1);
        jLabelAddMedico1.setBounds(60, 130, 33, 40);

        jLabelAddEnfermeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        jPanelInternal.add(jLabelAddEnfermeira);
        jLabelAddEnfermeira.setBounds(180, 130, 33, 40);

        jButtonCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos2_1.png"))); // NOI18N
        jButtonCadMedico.setToolTipText("Adicionar Médico");
        jButtonCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedicoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadMedico);
        jButtonCadMedico.setBounds(60, 40, 120, 120);

        jButtonCadEnfermeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Nurse.png"))); // NOI18N
        jButtonCadEnfermeira.setToolTipText("Adicionar Enfermeiro");
        jButtonCadEnfermeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEnfermeiraActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadEnfermeira);
        jButtonCadEnfermeira.setBounds(180, 40, 120, 120);

        jButtonCadPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Paciente.png"))); // NOI18N
        jButtonCadPaciente.setToolTipText("Adicionar Paciente");
        jButtonCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacienteActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadPaciente);
        jButtonCadPaciente.setBounds(300, 40, 120, 120);

        jLabelTituloCadEnfermeiro.setText("Enfermeiros");
        jPanelInternal.add(jLabelTituloCadEnfermeiro);
        jLabelTituloCadEnfermeiro.setBounds(210, 20, 70, 20);

        jLabelAddEnfermeira1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        jPanelInternal.add(jLabelAddEnfermeira1);
        jLabelAddEnfermeira1.setBounds(60, 270, 33, 40);

        jLabelTituloCadPaciente.setText("Pacientes");
        jPanelInternal.add(jLabelTituloCadPaciente);
        jLabelTituloCadPaciente.setBounds(330, 20, 80, 20);

        jLabel1.setText("Agenda");
        jPanelInternal.add(jLabel1);
        jLabel1.setBounds(100, 170, 60, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agenda-10_1.png"))); // NOI18N
        jButton1.setToolTipText("Adicionar Agenda");
        jPanelInternal.add(jButton1);
        jButton1.setBounds(60, 190, 120, 110);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(10, 80, 860, 320);

        jLabelTituloSistemadeGerenciamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTituloSistemadeGerenciamento.setText("Sistema de Gerenciamento de Cadastros ");
        jInternalFrameBemVindo.getContentPane().add(jLabelTituloSistemadeGerenciamento);
        jLabelTituloSistemadeGerenciamento.setBounds(250, 30, 340, 22);

        jButtonFecharTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharTelaCadastroActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharTelaCadastro);
        jButtonFecharTelaCadastro.setBounds(830, 0, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(510, 110, 890, 450);

        jLabel2.setText("Usuario Logado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 950, 110, 20);
        getContentPane().add(jLabelUsuarioLogado);
        jLabelUsuarioLogado.setBounds(110, 950, 310, 20);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadMedico.setText("Médicos");
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadMedico);

        jMenuItemCadPaciente.setText("Pacientes");
        jMenuCadastro.add(jMenuItemCadPaciente);

        jMenuItemCadEnfermeira.setText("Enfermeiras");
        jMenuCadastro.add(jMenuItemCadEnfermeira);

        jMenuItemCadUsuario.setText("Usuários");
        jMenuItemCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsuario);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorio.setText("Relatórios");
        jMenuBar1.add(jMenuRelatorio);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });

        jMenuItemVersao.setText("Versão");
        jMenuItemVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVersaoActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemVersao);

        jMenuBar1.add(jMenuSobre);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });

        SairSair.setText("Sair");
        SairSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairSairMouseClicked(evt);
            }
        });
        SairSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairSairActionPerformed(evt);
            }
        });
        jMenuSair.add(SairSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1443, 1056));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuarioActionPerformed
        // TODO add your handling code here:
        FormUsuario novocadastrousuario = new FormUsuario();
        novocadastrousuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadUsuarioActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenuSobreActionPerformed

    private void jButtonCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadPacienteActionPerformed

    private void jButtonFecharTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharTelaCadastroActionPerformed
        // TODO add your handling code here:
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharTelaCadastroActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void SairSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairSairActionPerformed
        // TODO add your handling code here:
    
        con.desconectar();
        System.exit(0);
        
    }//GEN-LAST:event_SairSairActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        // Chamar a tela bem vindo novamente:
        //TelaPrincipal welcome = new TelaPrincipal();
        //welcome.setVisible(true);
        //dispose();
        jInternalFrameBemVindo.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItemVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVersaoActionPerformed
        // TODO add your handling code here:
        
        
       // JOptionPane.showMessageDialog(jMenuSobre, "Versão 1.0", "Desenvolvido por Douglas Rafael", JOptionPane.INFORMATION_MESSAGE);
            jMenuItemVersao.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== jMenuItemVersao){
                JOptionPane.showMessageDialog(jMenuItemVersao, "Desenvolvido por Douglas Rafael", "Versão 1.0", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    });
        
    }//GEN-LAST:event_jMenuItemVersaoActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
        // TODO add your handling code here:
        
        try {
            con.executarSql("select * from usuario where nome_usuario'"+jLabelUsuarioLogado.getText()+"'");
            con.rs.first();
            
            if(con.rs.getString("tipo_usuario").equals("administrador")){
                FormMedico novocadastromedico = new FormMedico();
                novocadastromedico.setVisible(true);            
            }else{
                JOptionPane.showMessageDialog(rootPane, "Sem permissão para esta funcionalidade!\n Contate o administrador do sistema.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Sem permissão para esta funcionalidade!\n Contate o administrador do sistema."+ex);
        }
       
        
    }//GEN-LAST:event_jMenuItemCadMedicoActionPerformed

    private void jButtonCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedicoActionPerformed
        // TODO add your handling code here:
        FormMedico novocadastromedico = new FormMedico();
        novocadastromedico.setVisible(true);
    }//GEN-LAST:event_jButtonCadMedicoActionPerformed

    private void jButtonCadEnfermeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEnfermeiraActionPerformed
        // TODO add your handling code here:
        //FormEnfermeiro novocadastroenfermeiro = new FormEnfermeiro();
        //novocadastroenfermeiro.setVisible(true);
    }//GEN-LAST:event_jButtonCadEnfermeiraActionPerformed

    private void SairSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairSairMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SairSairMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SairSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadEnfermeira;
    private javax.swing.JButton jButtonCadMedico;
    private javax.swing.JButton jButtonCadPaciente;
    private javax.swing.JButton jButtonFecharTelaCadastro;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAddEnfermeira;
    private javax.swing.JLabel jLabelAddEnfermeira1;
    private javax.swing.JLabel jLabelAddMedico1;
    private javax.swing.JLabel jLabelAddPaciente;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelTituloCadEnfermeiro;
    private javax.swing.JLabel jLabelTituloCadPaciente;
    private javax.swing.JLabel jLabelTituloCadastros;
    private javax.swing.JLabel jLabelTituloSistemadeGerenciamento;
    private javax.swing.JLabel jLabelUsuarioLogado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemCadEnfermeira;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenuItem jMenuItemVersao;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}