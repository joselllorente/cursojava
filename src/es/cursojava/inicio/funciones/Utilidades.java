package es.cursojava.inicio.funciones;

import java.util.Scanner;

public class Utilidades {

	public static final String ELIGE_OPCION = "Por favor, elige una opción";
	
	public static int pideDatoNumerico(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		return numero;
	}
	
	public static double pideDatoDecimal(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextInt();
		
		return numero;
	}

	/**
	 * 
	 * @param texto
	 * @return
	 */
	public static String pideDatoCadena(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String cadena = scan.nextLine();
		
		return cadena;
	}
	
	
	
	
	public static void pintaMenu (String menuStr) {
		String[] opciones = menuStr.split(";");
		pintaMenu(opciones);
		
	}
	/**
	 * Función que sirve para pintar las opciones de un menú que llegan 
	 * en un array de Strings
	 * @param menuArray Array Strings con las opciones del menú
	 * @author Jose Luis
	 * @since 1.0
	 */
	public static void pintaMenu (String[] menuArray) {
//		for (String opcion : menuArray) {
//			System.out.println(opcion);
//		}
//		System.out.println("Introduce una opción");
		pintaMenu(menuArray,"Introduce una opción");
	}
	
	public static void pintaMenu (String[] menuArray, String texto) {

		for (String opcion : menuArray) {
			System.out.println(opcion);
		}
		System.out.println(texto);
	}
	
}






