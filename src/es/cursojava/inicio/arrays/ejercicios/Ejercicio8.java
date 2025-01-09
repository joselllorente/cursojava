package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int opcion=0;
		Scanner scan = new Scanner(System.in);
		
		String [][] alumnos = new String [2][2];
		
		do {
			System.out.println("1. Pedir datos");
			System.out.println("2. Mostrar alumnos");
			System.out.println("3. Buscar alumnos");
			System.out.println("4. Borrar alumnos");
			System.out.println("5. Salir");
			
			System.out.println("\nElige una opción");
			
			opcion = scan.nextInt();
			
			
			switch (opcion) {
				case 1: 
					for (int i = 0; i<alumnos.length; i++) {
						System.out.println("Para el aula " + (i+1));
						for (int j = 0; j<alumnos[i].length; j++) {
							if (alumnos[i][j]==null) {
								scan = new Scanner(System.in);
								System.out.println("Introduce nombre del alumno "+ (j+1));
								alumnos[i][j] = scan.nextLine();
							}
						}
					}
					
					break;
				case 2: 
					for (int i = 0; i<alumnos.length; i++) {
						System.out.println("Para el aula " + (i+1));
						for (int j = 0; j<alumnos[i].length; j++) {
							String nombre = alumnos[i][j];
							System.out.println(nombre==null?"No hay alumno":nombre);
						}
					}
					break;
				case 3: 
					System.out.println("Introduce nombre del alumno a buscar");
					scan = new Scanner(System.in);
					String nombreBusqueda = scan.nextLine();
					for (int i = 0; i<alumnos.length; i++) {
						for (int j = 0; j<alumnos[i].length; j++) {
							String nombre = alumnos[i][j];
							if (nombre!=null && nombre.equals(nombreBusqueda)) {
								System.out.println("El alumno "+ nombreBusqueda + 
										" está en el aula "+(i+1));
							}
						}
					}
					break;
				case 4: 
					System.out.println("Introduce nombre del alumno a borrar");
					scan = new Scanner(System.in);
					String nombreEliminar = scan.nextLine();
					
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
					break;
				case 5: System.out.println("Adios!!") ;break;
				default: System.out.println("Opción incorrecta");	
				
			}
			
		}while(opcion!=5);
		
		

	}

}

