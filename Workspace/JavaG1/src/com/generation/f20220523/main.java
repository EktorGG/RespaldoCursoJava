package com.generation.f20220523;

public class main {
	public static void main  (String[]  args) {
		
		//variables
		//se define el tipo de dato al cual pertenecerá la variable
		//tipo de dato + nombre +
		
		String nombre = "Generation";
		System.out.println(nombre);
		
		char letraA = 'a'; //char contiene 16 bit en un solo carácter
		System.out.println(letraA);
		
		//Variables numéricas en su valoración máxima:
		
		//32bits
		int numeroInt = 2147483647;
		System.out.println(numeroInt);
				
		//8bits
		byte numerobyte = 127;
		System.out.println(numerobyte);
		
		//16bits
		short numeroshort = 32767;
		System.out.println(numeroshort);
		
		//64bits
		long numerolong = 2147483647;
		System.out.println(numerolong);
				
		//float y double (aceptan decimales)
		
		//Variables booleana (true or false)
		
		boolean aceptar = true; //false
		System.out.println(aceptar);
		 
		nombre = "Héctor Gómez Godoy";
		System.out.println("Nombre: " + nombre);
		
		int edad = 29;
		System.out.println("Edad: " +edad+" años");
		
		String genero = "Másculino";
		System.out.println("Género: "+genero);
		
		String colorcabello = "Castaño Oscuro";
		System.out.println("Cabello color " +colorcabello);
		

		
		boolean compromiso = true;
		System.out.println("¿Comprometido?: " + compromiso);
		
		String comuna = "Santiago Centro";
		System.out.println("comuna: " +comuna);
		
		int población = 1700000;
		System.out.println(población);
		
		
		String ocupación = "Profesor de Ed. Física";
		System.out.println("Ocupación: "+ ocupación);
		
		//Objetos
		
		String curso = "G1";
		
		if (curso.equals("g1")) {
			System.out.println("iguales");
		}else{
			System.out.println("distintos");
		}

	
	    if (curso.equalsIgnoreCase("g1")) { //equalsIgnoreCase ignora las mayúsculas
	    	System.out.println("iguales");
	    } else {
	    	System.out.println("distintos");
	    }
	    
	    if (curso.toLowerCase().equals("g1")) { //toLowerCase() transorma el dato a minúsculas
			System.out.println("iguales");
		}else{
			System.out.println("distintos");
		}
	    
	    
	    if (curso.equals("g1")) {
			System.out.println("iguales");
		}else{
			System.out.println("distintos");
		}
	    
	    
	    
	    if (curso.equals("g1".toUpperCase())) { //toUpperCase transforma el dato en mayúsculas
			System.out.println("iguales");
		}else{
			System.out.println("distintos");
		}
	    
	    String curso2 = ""; //Vacío
	    String curso3 = null; //Null, en blanco, sin valor asignado
	    
	    if(curso2.isBlank()) {
	    	System.out.println(true);
	    }
	    
	    if( null == curso3 ) {
	    	System.out.println(true);
	    }
	    //Float y double
	    //Cast es convertir un dato en otro tipo de dato
	    float altura = (float) 1.73;
	    Float peso = (float) 72.5; //En mayusculas es un objeto
	    
	    Float gravedad = Float.parseFloat("9.6"); //PARSE: convertir un numeron en string a numero
	    
	    Integer.parseInt("23");
	    Long.parseLong("123456787654");
	    Float.parseFloat("85.5");
	    Double.parseDouble("12345.56");
	    
	   
	    //Conversion de datos
	    //Automática
	    //byte>short>int>long>float>double
	    
	    int num4= 18;
	    float num4f= num4;
	    System.out.println(num4+" "+num4f);
	    
	    //Manualmente
	    //double>float>long>int>short>byte
	    Double peso2= 75.9;
	    Float peso2F = peso2.floatValue();
	         	        
	    
	    
	    
	    //Ejercicio: Convertir la variable de tipo primitiva en otros tipos de datos superiores
	    int num1= 12;
	    Double num1d = (double) num1;
	    
	    //Operaciones: + - * / %
	    // == != > >= < <= (COMPARACIONES)
	    
	    
	    int dos=2;
	    int tres=3;
	    
	    if(5==(tres + dos)) {
	    		    	
	    }
	    
	}
}


