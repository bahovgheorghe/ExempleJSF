package it.alfasoft.gheorghe.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

//eager gli do la forza di agire su qusto bean quindi ti fa prendere anche i riferimenti anche di altri oggetti
//name ti permette di cambire il nome di riferimento nella pagina .xhtl di questo bean
@ManagedBean(name="c" , eager=true)
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cognome;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	
}
