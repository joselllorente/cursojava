package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce número de números a guardar");
		int total = scan.nextInt();
		
		int [] numeros = new int[total];
		for (int i = 0 ; i< numeros.length ; i++ ) {
			System.out.println("Introduce numero");
			numeros[i] = scan.nextInt();
		}
		
		for (int numero : numeros) {
			System.out.print(numero);
		}

		//Reordenamos el array
		for (int i = 0 ; i< numeros.length/2 ; i++ ) {
			int numAux = numeros[i];
			numeros[i] = numeros[numeros.length-1-i];
			numeros[numeros.length-1-i] = numAux;
		}
		
		//Pinto los valores
		for (int numero : numeros) {
			System.out.print(numero);
		}
		
		
	}

}
