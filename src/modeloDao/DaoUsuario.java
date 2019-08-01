/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;

/**
 *
 * @author Pinkman
 */
public class DaoUsuario {
    
    ConexaoBD conex = new ConexaoBD(); 
    BeansUsuario mod = new BeansUsuario();
    
    public void editarUsuario(BeansUsuario mod){
        conex.conectarPostgre();

        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuario set nome_usuario=?,tipo_usuario=?,senha_usuario=? where codigo_usuario=?");
        
            pst.setString(1,mod.getNome_usuario());
            pst.setString(2,mod.getTipo_usuario());
            pst.setString(3,mod.getSenha_usuario());
            pst.setInt(4,mod.getCodigo_usuario());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados do Usuário atualizados com sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar atualizar dados do Usuário no BD! Erro \n"+ex);
        }
        
        conex.desconectar();
    }
    
    public void excluirUsuario(BeansUsuario mod){
        conex.conectarPostgre();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuario where codigo_usuario=?");
            
            pst.setInt(1, mod.getCodigo_usuario());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados do Usuário excluídos com sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir dados de Usuário no BD! Erro \n"+ex);
        }
        
        conex.desconectar();
        
    }
    
    public BeansUsuario buscarUsuario(BeansUsuario mod){
        conex.conectarPostgre();

        conex.executarSql("select * from usuario where nome_usuario like '%"+mod.getPesquisa_Usuario()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo_usuario(conex.rs.getInt("codigo_usuario"));
            mod.setNome_usuario(conex.rs.getString("nome_usuario"));
            mod.setTipo_usuario(conex.rs.getString("tipo_usuario"));
            mod.setSenha_usuario(conex.rs.getString("senha_usuario"));
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado no Banco de Dados!");
            
        }
        
        conex.desconectar();
        return mod;
    }
    
    public void salvarUsuario(BeansUsuario mod){
        conex.conectarPostgre();

        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuario (nome_usuario,tipo_usuario,senha_usuario)values(?,?,?)");
            pst.setString(1,mod.getNome_usuario());
            pst.setString(2,mod.getTipo_usuario());
            pst.setString(3,mod.getSenha_usuario());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados do Usuário cadastrados com sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar dados do Usuário no BD! Erro: \n"+ex);
        }

        conex.desconectar();
    }
    
    
    
}
