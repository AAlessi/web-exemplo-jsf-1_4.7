/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;
import javax.faces.validator.Validator;

/**
 *
 * @author Alesandro
 */
@FacesValidator("cpfValidator")
public class CpfValidator implements Validator {
    
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String cpf = value.toString();
        int lenght = cpf.length();
        
        if(lenght < 9 || lenght > 14){
            FacesMessage msg =
                new FacesMessage("O CPF deve ter os seguintes formatos: '99999999999', '999999999-99' ou '999.999.999-99' ");
            throw new ValidatorException(msg);
        }
        
    }
}