package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voce {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_voce;
	private String nome;
	private String cognome;
	private String telefono;
	
	
	/// GETTERS AND SETTERS
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}		
	
	public int getId_voce() {
		return id_voce;
	}
	public void setId_voce(int id_voce) {
		this.id_voce = id_voce;
	}
	
	
	/// CONSTRUCTORS
	public Voce(String nome, String cognome, String telefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}
	
	public Voce(){
		
	}
	
	
}
