package it.alfasoft.gheorghe.Request;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.xml.bind.ValidationException;
@ManagedBean(name="utente",eager=true)
public class Utente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private int eta;
	private String telefono;
	private String codFiscale;
	public Utente(){
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCodFiscale() {
		return codFiscale;
	}

	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}
	
	public void validaCodFisc(FacesContext comntext, 
							  UIComponent component,
							  Object value) throws ValidatorException{

		if (value==null){
			return;
		}
		
		String dato = value.toString();
		
		if(!dato.startsWith("aaa")){
			FacesMessage msg = new FacesMessage("Codice Fiscale Errato!");
			throw new ValidatorException(msg);
		}
		
		
	}

}