package es.cursojava.inicio.funciones;

public class PruebaUtilidades {

	public static void main(String[] args) {
		
//		int edad = Utilidades.pideDatoNumerico("Introduce tu edad");
//		int opcion = Utilidades.pideDatoNumerico("Introduce una opción");
//		
//		for (int i=0; i<3;i++) {
//			int anio = Utilidades.pideDatoNumerico("Introduce tu año de nacimiento");
//			System.out.println(anio);
//		}
//		
//		String nombre = Utilidades.pideDatoCadena("Introduce tu nombre");
//		System.out.println(nombre.toUpperCase());

		String [] opcionesMenu = {"1. Opción 1","2. Opción 2","1. Opción 3"};
		Utilidades.pintaMenu(opcionesMenu);
		
		Utilidades.pintaMenu(args, "Selecciona una opción");
		
	}

}
