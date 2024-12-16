package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int [][] numeros = new int [4][4];
		
		
		for (int i=0; i<numeros.length ; i++) {
			for (int j=0; j< numeros[i].length  ;  j++) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduce número para la posción ["+i+"]["+j+"]" );
				numeros[i][j] = scan.nextInt();
				//System.out.print(numeros[i][j]+"\t");
			}
		}
		
		System.out.println();
		for (int i=0; i<numeros.length ; i++) {
			for (int j=0; j< numeros[i].length  ;  j++) {
				System.out.print(numeros[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<numeros.length ; i++) {
			double suma = 0.0;
			for (int j=0; j< numeros[i].length  ;  j++) {
				suma += numeros[i][j]; 
			}
			System.out.println("Media para la fila "+ i +" es "+suma/numeros[i].length);
		}
		
		System.out.println();
		
		for (int i=0; i<numeros.length ; i++) {
			for (int j=0; j< numeros[i].length  ;  j++) {
				if (i==j) {
					System.out.print(numeros[i][j]+"\t");
				}else {
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i=0; i<numeros.length ; i++) {
			System.out.print(numeros[i][i]+"\t");
		}
		
	}

}
