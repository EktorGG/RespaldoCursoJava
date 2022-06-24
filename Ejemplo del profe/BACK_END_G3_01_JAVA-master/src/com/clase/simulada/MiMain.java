package com.clase.simulada;

public class MiMain {

	public static void main(String[] args) {
		System.out.println("Clase everis");

		//instancia de la clase
		//Tipo_objeto nombre_variable = new Tipo_objeto (); () constructor
		Celular iphone0 = new Celular();
		//iphone0.numero=9876;
		//System.out.println(iphone0.numero);
		
		iphone0.setMarca("xiaomi");
		System.out.println(iphone0.getMarca());
		
		//instancia, asignando valores por defecto
		Celular iphone1 = new Celular("Alcatel");
		System.out.println(iphone1.getMarca());
		
		//String palabra = "everis";
		
		Celular celular3 = new Celular("samsung",9876543);
		System.out.println(celular3.getNumero());
		System.out.println(celular3.getMarca());
		
		Celular celular4 = new Celular(768766554);
		System.out.println(celular4.getNumero());
		System.out.println(celular4.getMarca());
		System.out.println(celular3.toString());
		System.out.println();
		
		//instancia de Cliente
		Cliente cliente1 = new Cliente("1213245","nombre1", 18, "F", false,celular3);
		System.out.println(cliente1.toString());
		
		
		//Instancia de compañia
		Compania movistar = new Compania(5);
		movistar.agregarCliente(cliente1);
		//movistar.agregarCliente(cliente1);
		//movistar.agregarCliente(cliente1);
		//movistar.agregarCliente(cliente1);
		//movistar.agregarCliente(cliente1);
		//movistar.agregarCliente(cliente1);
		
		
		if(movistar.buscarCliente("1213245")) {
			System.out.println("Cliente encontrado");
		}else {
			System.out.println("Cliente NO encontrado");
		}
		movistar.modificarCelular("1213245", 77777);
		
		//System.out.println(movistar.toString());
		movistar.listarClientes();
	}

}
