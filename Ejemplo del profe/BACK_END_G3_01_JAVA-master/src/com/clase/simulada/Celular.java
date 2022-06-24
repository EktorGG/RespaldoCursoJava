package com.clase.simulada;

public class Celular {
//atributos o caracteristicas
	//privacidad tipo_dato identificador
	//public int numero; //+- 2MM
	private int numero;
	private String marca; //"asdfgh123456!"·$%&/"

//constructores
	public Celular() {}//constructor vacio
	
	public Celular(String marca) {
		super();
		this.marca = marca;
	}

	public Celular( String marca,int numero) {
		super();
		this.numero = numero;
		this.marca = marca;
	}

	public Celular(int numero) {
		super();
		this.numero = numero;
	}

	//get(obtener) & set(colocar, asignar, poner) 
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
//metodos o funciones
	//privacidad tipo_retorno nombre_metodo(parametros)

	@Override
	public String toString() {
		return "Celularz [numero=" + numero + ", marca=" + marca + "]";
	}
}
