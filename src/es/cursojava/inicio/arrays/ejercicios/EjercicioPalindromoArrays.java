package es.cursojava.inicio.arrays.ejercicios;

public class EjercicioPalindromoArrays {

	public static void main(String[] args) {
		String textoOriginal = "recanocer";
		
		String [] datos = textoOriginal.split("");
		
		for (int i=0 ; i<datos.length/2; i++) {
			if (!datos[i].equals(datos[datos.length-1-i])) {
				System.out.println("No es palíndromo");
				break;
			}
		}
		

	}

}
