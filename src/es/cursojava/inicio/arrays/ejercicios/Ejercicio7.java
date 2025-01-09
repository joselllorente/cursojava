package es.cursojava.inicio.arrays.ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		int [][] numeros = new int [4][4];
		
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
		
		System.out.println();
		for (int i = 0; i<numeros.length; i++) {
			for (int j = 0; j<numeros[i].length; j++) {
				if (i==j) {
					System.out.print(numeros[i][j]+"\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
//		System.out.println();
//		for (int i = 0; i<numeros.length; i++) {
//			for (int j = 0; j<numeros[i].length; j++) {
//				if (i==j) {
//					System.out.println(numeros[i][j]);
//				}
//			}
//		}
		System.out.println();
		for (int i = 0; i<numeros.length/2; i++) {
			int aux = numeros[i][i];
			numeros[i][i] = numeros[numeros.length-1-i][numeros.length-1-i];
			numeros[numeros.length-1-i][numeros.length-1-i] = aux;

		}
		
		System.out.println();
		for (int i = 0; i<numeros.length; i++) {
			for (int j = 0; j<numeros[i].length; j++) {
					System.out.print(numeros[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}










