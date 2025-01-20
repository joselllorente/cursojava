package es.cursojava.inicio.arrays.ejercicios;

import es.cursojava.inicio.funciones.Utilidades;

public class Ejercicio8Funciones {

	public static void main(String[] args) {
		int opcion=0;
		
		String [][] alumnos = new String [2][2];
		String [] opciones = {"1. Pedir datos","2. Mostrar alumnos",
				"3. Buscar alumnos","4. Borrar alumnos",
				"5. Salir"};
		String opcionesStr = "1. Pedir datos;2. Mostrar alumnos;3. Buscar alumnos;4. Borrar alumnos;5. Salir";
		do {
			Utilidades.pintaMenu(opcionesStr);
			//Utilidades.pintaMenu(opciones);
			opcion = Utilidades.pideDatoNumerico("");
			
			switch (opcion) {
				case 1: pedirDatosAlumnos(alumnos); break;
				case 2: mostrarAlumnos(alumnos); break;
				case 3: buscarAlumno(alumnos); break;
				case 4: eliminarAlumno(alumnos);break;
				case 5: System.out.println("Adios!!") ;break;
				default: System.out.println("Opción incorrecta");	
				
			}
			
		}while(opcion!=5);
		
		

	}

	private static void pedirDatosAlumnos (String [][] alumnos) {
		for (int i = 0; i<alumnos.length; i++) {
			System.out.println("Para el aula " + (i+1));
			for (int j = 0; j<alumnos[i].length; j++) {
				if (alumnos[i][j]==null) {
					alumnos[i][j] = Utilidades.pideDatoCadena("Introduce nombre del alumno "+ (j+1));
				}
			}
		}
		
	}
	
	private static void mostrarAlumnos (String [][] alumnos) {
		for (int i = 0; i<alumnos.length; i++) {
			System.out.println("Para el aula " + (i+1));
			for (int j = 0; j<alumnos[i].length; j++) {
				String nombre = alumnos[i][j];
				System.out.println(nombre==null?"No hay alumno":nombre);
			}
		}
	}
	
	/**
	 * 
	 *  @param alumnos
	 */
	private static void buscarAlumno(String [][] alumnos) {
		String nombreBusqueda = Utilidades.pideDatoCadena("Introduce nombre del alumno a buscar");
		for (int i = 0; i<alumnos.length; i++) {
			for (int j = 0; j<alumnos[i].length; j++) {
				String nombre = alumnos[i][j];
				if (nombre!=null && nombre.equals(nombreBusqueda)) {
					System.out.println("El alumno "+ nombreBusqueda + 
							" está en el aula "+(i+1));
				}
			}
		}
	}
	
	private static void eliminarAlumno(String [][] alumnos) {
		String nombreEliminar = Utilidades.pideDatoCadena("Introduce nombre del alumno a borrar");
		
		boolean existeAlumno = false;
		for (int i = 0; i<alumnos.length; i++) {
			for (int j = 0; j<alumnos[i].length; j++) {
				String nombre = alumnos[i][j];
				if (nombre!=null && nombre.equals(nombreEliminar)) {
					alumnos[i][j]=null;
					existeAlumno = true;
				}
			}
		}
		
		if (!existeAlumno) {
			System.out.println("Alumno no encontrado");
		}
	}
	//VAR ARGS
	private static void contador (String texto, int edad, int... numeros ) {
		System.out.println(texto);
		System.out.println(edad);
		int suma=0;
		for (int numero : numeros) {
			suma += numero;
		}
		System.out.println(suma);
	}
}




