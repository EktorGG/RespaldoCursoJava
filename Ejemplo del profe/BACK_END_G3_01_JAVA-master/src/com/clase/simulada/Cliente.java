package com.clase.simulada;

public class Cliente {
	//atributos o caracteristicas
	private String rut;
	private String nombre;
	private int edad;
	private String sexo;
	private Boolean plan;
	private Celular celular;
//constructores
	public Cliente() {}
	public Cliente(String rut, String nombre, int edad, String sexo, Boolean plan, Celular celular) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.plan = plan;
		this.celular = celular;
	}
	//metodos o funciones
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Boolean getPlan() {
		return plan;
	}
	public void setPlan(Boolean plan) {
		this.plan = plan;
	}
	public Celular getCelular() {
		return celular;
	}
	public void setCelular(Celular celular) {
		this.celular = celular;
	}
	
	//metodo toString
	@Override
	public String toString() {
		return "Cliente [rut=" + rut +
				", nombre=" + nombre + 
				", edad=" + edad + 
				", sexo=" + sexo + 
				", plan=" + plan + 
				", celularx=" + celular + "]";
	}
	

}
