package com.pierangelo.beanScopes;

public class Triangolo {

	private Punto puntoA;
	private Punto puntoB;
	private Punto puntoC;
	private String tipo;
	
	
	public Punto getPuntoA() {
		return puntoA;
	}
	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}
	public Punto getPuntoB() {
		return puntoB;
	}
	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}
	public Punto getPuntoC() {
		return puntoC;
	}
	public void setPuntoC(Punto puntoC) {
		this.puntoC = puntoC;
	}	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	/// COSTRUTTORI
	public Triangolo(Punto puntoA, Punto puntoB, Punto puntoC) {
		super();
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		this.puntoC = puntoC;
	}
	
	
	public Triangolo(){
		
	}
}
