package com.pierangelo.iniezioneOggetti;

public class Triangolo {

	private Punto puntoA;
	private Punto puntoB;
	private Punto puntoC;
	
	
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
