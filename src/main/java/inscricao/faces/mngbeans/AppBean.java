/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Candidato;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Alesandro
 */


@ManagedBean
@ApplicationScoped
public class AppBean extends PageBean {
    
    ArrayList <Candidato> listaCadidatos ;
    

    public AppBean() {
        
        listaCadidatos = new ArrayList <>();
        
       
        
      
    }
    
    public ArrayList<Candidato> getListaCadidatos() {
        return listaCadidatos;
    }

    public void setListaCadidatos(ArrayList<Candidato> listaCadidatos) {
        this.listaCadidatos = listaCadidatos;
    }

    public void setNovoCandidato(Candidato cadidato) {
        
        listaCadidatos.add(cadidato);
        
      
        
        
    }
    
}
