/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloDao.DaoMedico;

/**
 *
 * @author Pinkman
 */
public class ConexaoBD {
    
    public Statement stm; //Faz a pesquisa no BD
    public ResultSet rs; //Me traz um conjunto de resultados/select do BD
    private String driver = "org.postgresql.Driver"; // Driver de conexao
    private String caminho = "jdbc:postgresql://localhost:5432/clinicamedica"; //Caminho e porta do BD
    private String usuario = "postgres";
    private String senha = "Dooh@8531";
    public Connection con; //
    
    //Para conectar ao BD
    public void conectarPostgre(){
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efeituada com sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n "+ex.getMessage());
        }
    }
    
    //Método para executar sql
    public void executarSql(String sql){
        try {
            //CONCUR_READ_ONLY vai ser um rs rolável, do inicio para o fim e vice-versa
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY); //TYPE_SCROLL_INSENSITIVE me permite continuar a ver os dados do meu ultimo select
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executarSql:\n "+ex.getMessage());
        }
        
    }
    
    //Para desconectar do BD
    public void desconectar(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Banco de dados desconectado com sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro a tentar desconectar do banco de dados:\n " + ex.getMessage());
        }
    }
    
    
    /*public Statement stmt; //Realiza a pesquisa no BD
    public ResultSet rs; //Resultado da pesquisa
    private String driver = "com.mysql.jdbc.Driver"; //Identidica o BD
    private String caminho = "jdbc:mysql://localhost:3306/"; //Onde esta alocado
    private String dataBaseName = "clinicamedica";
    private String usuario = "root"; //Usuario de login
    private String senha = ""; //Senha de login
    public Connection con; //Realiza a conxexão
    
    
    public void conectarMysql(){ //Realiza a conexão com o Banco
        System.setProperty("jdbc.Drivers", driver); //Setar a propriedade do drive de conexão
        try { 
            con=DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão do Banco de Dados Efetuada com Sucesso! "); //Se o BD conectar, ele enviará essa msg
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar ao Banco de Dados!\n "+ex.getMessage());
        }
    }

    public void desconectar(){ //Desconecta a conexão com o Banco
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Banco de Dados Desconectado com Sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar Banco de Dados!/n "+ex.getMessage());
        }
    }
*/
}
