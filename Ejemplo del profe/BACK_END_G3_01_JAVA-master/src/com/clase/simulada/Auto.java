package com.clase.simulada;

//modificador de acceso - class -  nombre de la clase
public class Auto {
//atributos
	public String marca;
	public double octanage;
	private double altura;
	private String color;
	private String motor; //"as123"

	//constructores
	public Auto() {}//constructor vacio
	
	public Auto(double altura, String color, String motor) {
			super();
			this.altura = altura;
			this.color = color;
			this.motor = motor;
		}

	
	
	public Auto(String color, String motor) {
			super();
			this.color = color;
			this.motor = motor;
		}



//Metodos
	
	//getters an setters
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}

}
