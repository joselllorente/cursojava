package es.cursojava.inicio.arrays.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [] numeros = {4,8,15,16,23,42,2};
		
		for (int numero : numeros) {
			System.out.println(numero);
		}

		//Cálculo de la media de todos los números
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
			//suma = suma + numero;
		}
		System.out.println("La media de todos los números es: "+ suma/numeros.length);

		
		int numMayor = 0;
		int numMenor = Integer.MAX_VALUE;
		for (int i=0 ; i<numeros.length ; i++) {
			if (numeros[i]>numMayor) {
				numMayor = numeros[i];
			}
			if (numeros[i]<numMenor) {
				numMenor = numeros[i];
			}
		}
		
		
		System.out.println("Mayor: "+numMayor);
		System.out.println("Menor: "+numMenor);
		
		
	}

}
