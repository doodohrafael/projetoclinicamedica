/*
 Métodos de inserção, update, conexão e desconexão.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modeloBeans.BeansMedico;

/**
 *
 * @author Douglas Rafael
 */
public class DaoMedico {
    
    //ConexaoBD conexaocontrole = new ConexaoBD();
    ConexaoBD conex = new ConexaoBD();
    BeansMedico mod = new BeansMedico();
    
    //Atualizar dados do banco
    public void editarMedico(BeansMedico mod){
        conex.conectarPostgre();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update medico set nome_medico=?,data_nasc=?,n_conselho=?,cpf=?,rg=?,org_emissor=?,estado_civil=?,end_pessoal=?,n_end_pessoal=?,bair_end_pessoal=?,compl_end_pessoal=?,cep_end_pessoal=?,cid_end_pessoal=?,uf_end_pessoal=?,tel_res_end_pessoal=?,tel_cel_end_pessoal=?,end_profi=?,n_end_profi=?,compl_end_profi=?,bair_end_profi=?,cep_end_profi=?,cid_end_profi=?,uf_end_profi=?,crm=?,esp_prin=?,instituicao=?,email=?,site=?,tel_profi=?,cur_lat=?,faculdade=?,inst_fac=?,ano_con_fac=?,inst_mes=?,ano_con_mes=?,inst_dou=?,ano_con_dou=?,inst_posdou=?,ano_con_posdou=?,inst_docen=?,sexo=?,especialidade=?,titulo=?,mestrado=?,doutorado=?,posdoutorado=?,docencia=? where codigo_medico=?");
        
            pst.setString(1,mod.getNome_medico());
            pst.setString(2,mod.getData_nasc());
            pst.setInt(3,mod.getN_conselho());
            pst.setInt(4,mod.getCpf());
            pst.setInt(5,mod.getRg());
            pst.setString(6,mod.getOrg_emissor());
            pst.setString(7,mod.getEstado_civil());
            pst.setString(8,mod.getEnd_pessoal());
            pst.setInt(9,mod.getN_end_pessoal());
            pst.setString(10,mod.getBair_end_pessoal());
            pst.setString(11,mod.getCompl_end_pessoal());
            pst.setInt(12,mod.getCep_end_pessoal());
            pst.setString(13,mod.getCid_end_pessoal());
            pst.setString(14,mod.getUf_end_pessoal());
            pst.setString(15,mod.getTel_res_end_pessoal());
            pst.setString(16,mod.getTel_cel_end_pessoal());
            
            //Dados proficionas
            pst.setString(17,mod.getEnd_profi());
            pst.setInt(18,mod.getN_end_profi());
            pst.setString(19,mod.getCompl_end_profi());
            pst.setString(20,mod.getBair_end_profi());
            pst.setInt(21,mod.getCep_end_profi());
            pst.setString(22,mod.getCid_end_profi());
            pst.setString(23,mod.getUf_end_profi());
            pst.setInt(24,mod.getCrm());
            pst.setString(25,mod.getEsp_prin());
            pst.setString(26,mod.getInstituicao());
            pst.setString(27,mod.getEmail());
            pst.setString(28,mod.getSite());
            pst.setString(29,mod.getTel_profi());
            pst.setString(30,mod.getCur_lat());
            
            pst.setString(31,mod.getFaculdade());
            pst.setString(32,mod.getInst_fac());
            pst.setString(33,mod.getAno_con_fac());
            
            pst.setString(34,mod.getInst_mes());
            pst.setString(35,mod.getAno_con_mes());
            
            pst.setString(36,mod.getInst_dou());
            pst.setString(37,mod.getAno_con_dou());
            
            pst.setString(38,mod.getInst_posdou());
            pst.setString(39,mod.getAno_con_posdou());
            
            pst.setString(40,mod.getInst_docen());
            
            pst.setString(41,mod.getSexo());
            
            pst.setString(42,mod.getEspecialidade());
            
            pst.setString(43,mod.getTitulo());
            
            pst.setString(44,mod.getMestrado());
            
            pst.setString(45,mod.getDoutorado());
            
            pst.setString(46,mod.getPosdoutorado());
            
            pst.setString(47,mod.getDocencia());
            
            pst.setInt(48,mod.getCodigo_medico());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados do Médico atualizados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar atualizar dados do Médico no BD! \nErro"+ex);
        }
        
        
        conex.desconectar();
    }
    
    public void excluirMedico(BeansMedico mod){
        conex.conectarPostgre();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from medico where codigo_medico=?");
            
            pst.setInt(1,mod.getCodigo_medico());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados do Médico excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir dados do Médico no BD! \nErro"+ex);
        }
        
        conex.desconectar();
    }
    //Pesquisar dados no banco
    public BeansMedico buscarMedico(BeansMedico mod){
            
        conex.conectarPostgre();
            
            conex.executarSql("select *from medico where nome_medico like'%"+mod.getPesquisa()+"%'");
        try {
            
            //while(conex.rs.next()) {
            conex.rs.first(); //Para encontrar o primeiro resultado que ele encontrar no BD.
            mod.setCodigo_medico(conex.rs.getInt("codigo_medico"));
            mod.setNome(conex.rs.getString("nome_medico"));
            mod.setData_nasc(conex.rs.getString("data_nasc"));
            mod.setN_conselho(conex.rs.getInt("n_conselho"));
            mod.setCpf(conex.rs.getInt("cpf"));
            mod.setRg(conex.rs.getInt("rg"));
            mod.setOrg_emissor(conex.rs.getString("org_emissor"));
            mod.setEstado_civil(conex.rs.getString("estado_civil"));
            mod.setEnd_pessoal(conex.rs.getString("end_pessoal"));
            mod.setN_end_pessoal(conex.rs.getInt("n_end_pessoal"));
            mod.setBair_end_pessoal(conex.rs.getString("bair_end_pessoal"));
            mod.setCompl_end_pessoal(conex.rs.getString("compl_end_pessoal"));
            mod.setCep_end_pessoal(conex.rs.getInt("cep_end_pessoal"));
            mod.setCid_end_pessoal(conex.rs.getString("cid_end_pessoal"));
            mod.setUf_end_pessoal(conex.rs.getString("uf_end_pessoal"));
            mod.setTel_res_end_pessoal(conex.rs.getString("tel_res_end_pessoal"));
            mod.setTel_cel_end_pessoal(conex.rs.getString("tel_cel_end_pessoal"));
            
            mod.setEnd_profi(conex.rs.getString("end_profi"));
            mod.setN_end_profi(conex.rs.getInt("n_end_profi"));
            mod.setCompl_end_profi(conex.rs.getString("compl_end_profi"));
            mod.setBair_end_profi(conex.rs.getString("bair_end_profi"));
            mod.setCep_end_profi(conex.rs.getInt("cep_end_profi"));
            mod.setCid_end_profi(conex.rs.getString("cid_end_profi"));
            mod.setUf_end_profi(conex.rs.getString("uf_end_profi"));
            
            mod.setCrm(conex.rs.getInt("crm"));
            mod.setEsp_prin(conex.rs.getString("esp_prin"));
            mod.setInstituicao(conex.rs.getString("instituicao"));
            mod.setEmail(conex.rs.getString("email"));
            mod.setSite(conex.rs.getString("site"));
            mod.setTel_profi(conex.rs.getString("tel_profi"));
            mod.setCur_lat(conex.rs.getString("cur_lat"));
            
            mod.setFaculdade(conex.rs.getString("faculdade"));
            mod.setInst_fac(conex.rs.getString("inst_fac"));
            mod.setAno_con_fac(conex.rs.getString("ano_con_fac"));
            
            mod.setInst_mes(conex.rs.getString("inst_mes"));
            mod.setAno_con_mes(conex.rs.getString("ano_con_mes"));
            
            mod.setInst_dou(conex.rs.getString("inst_dou"));
            mod.setAno_con_dou(conex.rs.getString("ano_con_dou"));
            
            mod.setInst_posdou(conex.rs.getString("inst_posdou"));
            mod.setAno_con_posdou(conex.rs.getString("ano_con_posdou"));
            
            mod.setInst_docen(conex.rs.getString("inst_docen"));
            
            mod.setSexo(conex.rs.getString("sexo"));
            mod.setEspecialidade(conex.rs.getString("especialidade"));
            mod.setTitulo(conex.rs.getString("titulo"));
            
            mod.setMestrado(conex.rs.getString("mestrado"));
            mod.setDoutorado(conex.rs.getString("doutorado"));
            mod.setPosdoutorado(conex.rs.getString("posdoutorado"));
            mod.setDocencia(conex.rs.getString("docencia"));
            //}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Médico não cadastrado no BD! ");
            
        }
            
            conex.desconectar();
            return mod;
            
        }
    
    //Inserir dados no banco
    public void salvarMedico(BeansMedico mod){
        
        conex.conectarPostgre(); //Conectar ao BD
        
        try {
            
            PreparedStatement pst = conex.con.prepareStatement("insert into medico (nome_medico,data_nasc,n_conselho,cpf,rg,org_emissor,estado_civil,end_pessoal,n_end_pessoal,bair_end_pessoal,compl_end_pessoal,cep_end_pessoal,cid_end_pessoal,uf_end_pessoal,tel_res_end_pessoal,tel_cel_end_pessoal,end_profi,n_end_profi,compl_end_profi,bair_end_profi,cep_end_profi,cid_end_profi,uf_end_profi,crm,esp_prin,instituicao,email,site,tel_profi,cur_lat,faculdade,inst_fac,ano_con_fac,inst_mes,ano_con_mes,inst_dou,ano_con_dou,inst_posdou,ano_con_posdou,inst_docen,sexo,especialidade,titulo,mestrado,doutorado,posdoutorado,docencia)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? ,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome_medico());
            pst.setString(2,mod.getData_nasc());
            pst.setInt(3,mod.getN_conselho());
            pst.setInt(4,mod.getCpf());
            pst.setInt(5,mod.getRg());
            pst.setString(6,mod.getOrg_emissor());
            pst.setString(7,mod.getEstado_civil());
            pst.setString(8,mod.getEnd_pessoal());
            pst.setInt(9,mod.getN_end_pessoal());
            pst.setString(10,mod.getBair_end_pessoal());
            pst.setString(11,mod.getCompl_end_pessoal());
            pst.setInt(12,mod.getCep_end_pessoal());
            pst.setString(13,mod.getCid_end_pessoal());
            pst.setString(14,mod.getUf_end_pessoal());
            pst.setString(15,mod.getTel_res_end_pessoal());
            pst.setString(16,mod.getTel_cel_end_pessoal());
            
            //Dados proficionas
            pst.setString(17,mod.getEnd_profi());
            pst.setInt(18,mod.getN_end_profi());
            pst.setString(19,mod.getCompl_end_profi());
            pst.setString(20,mod.getBair_end_profi());
            pst.setInt(21,mod.getCep_end_profi());
            pst.setString(22,mod.getCid_end_profi());
            pst.setString(23,mod.getUf_end_profi());
            pst.setInt(24,mod.getCrm());
            pst.setString(25,mod.getEsp_prin());
            pst.setString(26,mod.getInstituicao());
            pst.setString(27,mod.getEmail());
            pst.setString(28,mod.getSite());
            pst.setString(29,mod.getTel_profi());
            pst.setString(30,mod.getCur_lat());
            
            pst.setString(31,mod.getFaculdade());
            pst.setString(32,mod.getInst_fac());
            pst.setString(33,mod.getAno_con_fac());
            
            pst.setString(34,mod.getInst_mes());
            pst.setString(35,mod.getAno_con_mes());
            
            pst.setString(36,mod.getInst_dou());
            pst.setString(37,mod.getAno_con_dou());
            
            pst.setString(38,mod.getInst_posdou());
            pst.setString(39,mod.getAno_con_posdou());
            
            pst.setString(40,mod.getInst_docen());
            
            pst.setString(41,mod.getSexo());
            
            pst.setString(42,mod.getEspecialidade());
            
            pst.setString(43,mod.getTitulo());
            
            pst.setString(44,mod.getMestrado());
            
            pst.setString(45,mod.getDoutorado());
            
            pst.setString(46,mod.getPosdoutorado());
            
            pst.setString(47,mod.getDocencia());
   
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados do Médico cadastrados com sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar dados do Médico no BD! "+ex);
        }
        
        conex.desconectar(); //Desconectar após a inserção!
    
    }
    
}
