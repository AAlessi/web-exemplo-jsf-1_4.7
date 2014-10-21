/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Alesandro
 */
@ManagedBean
@RequestScoped
public class LogonBean extends PageBean {

   

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    private String nome;
    private String senha;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public String login(){
        
        if(nome.equals(senha)){
            return "inscricao";
        }
        
        
        return "login";
    }
    
    
}
