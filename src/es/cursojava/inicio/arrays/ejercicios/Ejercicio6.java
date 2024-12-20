package es.cursojava.inicio.arrays.ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int [][] numeros = new int [2][3];
		
		for (int i = 0; i<numeros.length; i++) {
			for (int j = 0; j<numeros[i].length; j++) {
				numeros[i][j] = (int)(Math.random()*100)+1;
			}
		}

		for (int i = 0; i<numeros.length; i++) {
			for (int j = 0; j<numeros[i].length; j++) {
				System.out.print(numeros[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for ( int[] fila    : numeros  ) {
			for (int numero  :  fila) {
				System.out.print(numero+"\t");
			}
			System.out.println();
		}
		
	}

}
