package com.generation.f20220523;

public class CalculoPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int notasdelramo = 12;
		Integer[] notas = {20, 51, 67, 88, 25, 100, 40, 50, 70, 70, 100, 100}; //ARREGLO, MATRIZ O ARRAY
		System.out.println(notas);
		
		//Promedio: Suma de todas las notas dividido por la cantidad de nota
		
		int sumaNotas = 0; //Definir variable acumuladora
		
		
		for (int i = 0; i < notas.length; i++) { //Cómo recorrer el arreglo de notas
		     sumaNotas = sumaNotas + notas[i]; //Establecemos el contador		     
			
		}
		System.out.println("La suma de notas es " + sumaNotas);
		
		//Promedio-> sumaNotas / el total de notas
		float promedio = ((notasdelramo + sumaNotas)/ notas.length);
		System.out.println("la calificación final del ramo es " + promedio);
		
		if(promedio>=50 && promedio <= 100) {
			System.out.println("Aprueba");			
			if(promedio<=49 && promedio >=0) {
				System.out.println("Reprueba");
			}
		}
	}

}
