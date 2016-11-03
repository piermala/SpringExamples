package com.pierangelo.iniezioneOggetti;

public class Punto {

	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	/// COSTRUTTORI
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public Punto(){
		
	}
	
	
	
	/// toString
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}