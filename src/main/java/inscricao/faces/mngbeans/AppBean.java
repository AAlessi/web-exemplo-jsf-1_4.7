/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Candidato;
import java.util.ArrayList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Alesandro
 */


@Named
@ApplicationScoped
public class AppBean extends PageBean {
    
    ArrayList <Candidato> listaCadidatos = new ArrayList <>();
    
    public ArrayList<Candidato> getListaCadidatos() {
        return listaCadidatos;
    }
    public void setNovoCandidato(Candidato cadidato) {
        
        listaCadidatos.add(cadidato);
                
    }
    
}
