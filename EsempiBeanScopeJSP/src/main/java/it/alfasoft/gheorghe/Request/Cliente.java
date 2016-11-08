package it.alfasoft.gheorghe.Request;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="c",eager=true)
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cognome;
	private String citta;
	private String squadra;
	
	private List<String> elencoC;
	private List<String> squadre;
	private List<String> squadreScelte;
	
	public Cliente() {
		citta="Torino";
		elencoC = new ArrayList<String>();
		elencoC.add("Milano");
		elencoC.add("Torino");
		elencoC.add("Roma");
		
		squadre = new ArrayList<String>();
		squadre.add("Juventus");
		squadre.add("Milan");
		squadre.add("Napoli");
		
		squadreScelte = new ArrayList<String>();
		
		
	}

	public Cliente(String nome, String cognome, String citta) {
		this.nome = nome;
		this.cognome = cognome;
		this.citta = citta;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public List<String> getElencoC() {
		return elencoC;
	}

	public void setElencoC(List<String> elencoC) {
		this.elencoC = elencoC;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	public List<String> getSquadre() {
		return squadre;
	}

	public void setSquadre(List<String> squadre) {
		this.squadre = squadre;
	}

	public List<String> getSquadreScelte() {
		return squadreScelte;
	}

	public void setSquadreScelte(List<String> squadreScelte) {
		this.squadreScelte = squadreScelte;
	}
	
	
	

}
