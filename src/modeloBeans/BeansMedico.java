/* PARA ATRIBUTOS E MÉTODOS!
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import javax.swing.JComboBox;

/**
 *
 * @author Douglas Rafael
 */
public class BeansMedico {

    private int codigo_medico;
    private String nome_medico;
    private String data_nasc;
    private int n_conselho;
    private int cpf;
    private int rg;
    private String org_emissor;
    private String estado_civil;
    private String sexo;
    private String end_pessoal;
    private int n_end_pessoal;
    private String compl_end_pessoal;
    private String bair_end_pessoal;
    private int cep_end_pessoal;
    private String cid_end_pessoal;
    private String uf_end_pessoal;
    private String tel_res_end_pessoal;
    private String tel_cel_end_pessoal;
    private String end_profi;
    private int n_end_profi;
    private String compl_end_profi;
    private String bair_end_profi;
    private int cep_end_profi;
    private String cid_end_profi;
    private String uf_end_profi;
    private int crm;
    private String esp_prin;///////////////////
    private String especialidade;
    private String titulo;
    private String instituicao;
    private String email;
    private String site;
    private String tel_profi;
    private String cur_lat;
    private String faculdade;
    private String inst_fac;
    private String ano_con_fac;
    private String mestrado;
    private String inst_mes;
    private String ano_con_mes;
    private String doutorado;
    private String inst_dou;
    private String ano_con_dou;
    private String posdoutorado;
    private String inst_posdou;
    private String ano_con_posdou;
    private String docencia;
    private String inst_docen;
    private String pesquisa;

    //MÉTODOS GETTERS E SETTERS
    
    
    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    
    public int getCodigo_medico() {
        return codigo_medico;
    }

    public void setCodigo_medico(int codigo_medico) {
        this.codigo_medico = codigo_medico;
    }
    
    public String getNome_medico() {
        return nome_medico;
    }

    public void setNome(String nome_medico) {
        
        this.nome_medico = nome_medico;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public int getN_conselho() {
        return n_conselho;
    }

    public void setN_conselho(int n_conselho) {
        this.n_conselho = n_conselho;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getOrg_emissor() {
        return org_emissor;
    }

    public void setOrg_emissor(String org_emissor) {
        this.org_emissor = org_emissor;
    }

    public String getEnd_pessoal() {
        return end_pessoal;
    }

    public void setEnd_pessoal(String end_pessoal) {
        this.end_pessoal = end_pessoal;
    }

    public int getN_end_pessoal() {
        return n_end_pessoal;
    }

    public void setN_end_pessoal(int n_end_pessoal) {
        this.n_end_pessoal = n_end_pessoal;
    }

    public String getCompl_end_pessoal() {
        return compl_end_pessoal;
    }

    public void setCompl_end_pessoal(String compl_end_pessoal) {
        this.compl_end_pessoal = compl_end_pessoal;
    }

    public String getBair_end_pessoal() {
        return bair_end_pessoal;
    }

    public void setBair_end_pessoal(String bair_end_pessoal) {
        this.bair_end_pessoal = bair_end_pessoal;
    }

    public int getCep_end_pessoal() {
        return cep_end_pessoal;
    }

    public void setCep_end_pessoal(int cep_end_pessoal) {
        this.cep_end_pessoal = cep_end_pessoal;
    }

    public String getCid_end_pessoal() {
        return cid_end_pessoal;
    }

    public void setCid_end_pessoal(String cid_end_pessoal) {
        this.cid_end_pessoal = cid_end_pessoal;
    }

    public String getUf_end_pessoal() {
        return uf_end_pessoal;
    }

    public void setUf_end_pessoal(String uf_end_pessoal) {
        this.uf_end_pessoal = uf_end_pessoal;
    }

    public String getTel_res_end_pessoal() {
        return tel_res_end_pessoal;
    }

    public void setTel_res_end_pessoal(String tel_res_end_pessoal) {
        this.tel_res_end_pessoal = tel_res_end_pessoal;
    }

    public String getTel_cel_end_pessoal() {
        return tel_cel_end_pessoal;
    }

    public void setTel_cel_end_pessoal(String tel_cel_end_pessoal) {
        this.tel_cel_end_pessoal = tel_cel_end_pessoal;
    }

    public String getEnd_profi() {
        return end_profi;
    }

    public void setEnd_profi(String end_profi) {
        this.end_profi = end_profi;
    }

    public int getN_end_profi() {
        return n_end_profi;
    }

    public void setN_end_profi(int n_end_profi) {
        this.n_end_profi = n_end_profi;
    }

    public String getCompl_end_profi() {
        return compl_end_profi;
    }

    public void setCompl_end_profi(String compl_end_profi) {
        this.compl_end_profi = compl_end_profi;
    }

    public String getBair_end_profi() {
        return bair_end_profi;
    }

    public void setBair_end_profi(String bair_end_profi) {
        this.bair_end_profi = bair_end_profi;
    }

    public int getCep_end_profi() {
        return cep_end_profi;
    }

    public void setCep_end_profi(int cep_end_profi) {
        this.cep_end_profi = cep_end_profi;
    }

    public String getCid_end_profi() {
        return cid_end_profi;
    }

    public void setCid_end_profi(String cid_end_profi) {
        this.cid_end_profi = cid_end_profi;
    }

    public String getUf_end_profi() {
        return uf_end_profi;
    }

    public void setUf_end_profi(String uf_end_profi) {
        this.uf_end_profi = uf_end_profi;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEsp_prin() {
        return esp_prin;
    }

    public void setEsp_prin(String esp_prin) {
        this.esp_prin = esp_prin;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String Instituicao) {
        this.instituicao = Instituicao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTel_profi() {
        return tel_profi;
    }

    public void setTel_profi(String tel_profi) {
        this.tel_profi = tel_profi;
    }

    public String getCur_lat() {
        return cur_lat;
    }

    public void setCur_lat(String cur_lat) {
        this.cur_lat = cur_lat;
    }

    public String getInst_fac() {
        return inst_fac;
    }

    public void setInst_fac(String inst_fac) {
        this.inst_fac = inst_fac;
    }

    public String getAno_con_fac() {
        return ano_con_fac;
    }

    public void setAno_con_fac(String ano_con_fac) {
        this.ano_con_fac = ano_con_fac;
    }

    public String getInst_mes() {
        return inst_mes;
    }

    public void setInst_mes(String inst_mes) {
        this.inst_mes = inst_mes;
    }

    public String getAno_con_mes() {
        return ano_con_mes;
    }

    public void setAno_con_mes(String ano_con_mes) {
        this.ano_con_mes = ano_con_mes;
    }

    public String getInst_dou() {
        return inst_dou;
    }

    public void setInst_dou(String inst_dou) {
        this.inst_dou = inst_dou;
    }

    public String getAno_con_dou() {
        return ano_con_dou;
    }

    public void setAno_con_dou(String ano_con_dou) {
        this.ano_con_dou = ano_con_dou;
    }

    public String getInst_posdou() {
        return inst_posdou;
    }

    public void setInst_posdou(String inst_posdou) {
        this.inst_posdou = inst_posdou;
    }

    public String getAno_con_posdou() {
        return ano_con_posdou;
    }

    public void setAno_con_posdou(String ano_con_posdou) {
        this.ano_con_posdou = ano_con_posdou;
    }
/*
    public String getDocencia() {
        return docencia;
    }

    public void setDocencia(String docencia) {
        this.docencia = docencia;
    }
*/
    public String getInst_docen() {
        return inst_docen;
    }

    public void setInst_docen(String inst_docen) {
        this.inst_docen = inst_docen;
    }
    
    
    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMestrado() {
        return mestrado;
    }

    public void setMestrado(String mestrado) {
        this.mestrado = mestrado;
    }

    public String getDoutorado() {
        return doutorado;
    }

    public void setDoutorado(String doutorado) {
        this.doutorado = doutorado;
    }

    public String getPosdoutorado() {
        return posdoutorado;
    }

    public void setPosdoutorado(String posdoutorado) {
        this.posdoutorado = posdoutorado;
    }

    public String getDocencia() {
        return docencia;
    }

    public void setDocencia(String docencia) {
        this.docencia = docencia;
    }


    


    
    
}
