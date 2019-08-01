/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author Pinkman
 */
public class BeansUsuario {
    
    private Integer codigo_usuario;
    private String nome_usuario;
    private String tipo_usuario;
    private String senha_usuario;
    private String pesquisa_usuario;
 
//MÉTODOS GETTERS E SETTERS

    public Integer getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(Integer codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getPesquisa_Usuario() {
        return pesquisa_usuario;
    }

    public void setPesquisa_Usuario(String pesquisa) {
        this.pesquisa_usuario = pesquisa;
    }
 
    
    
}
