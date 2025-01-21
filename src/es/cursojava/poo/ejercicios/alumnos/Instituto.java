package es.cursojava.poo.ejercicios.alumnos;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("N1","A1",22,8.5,"emasdasd@asdas.es");
		Alumno alumno2 = new Alumno("N2","A2",24,2.5,"eaasdas@asdas.es");
		String [] asignaturasAlumno2 = {"Lengua","Inglés","Historia"};
		alumno2.setAsignaturas(asignaturasAlumno2);
		
		String [] asignaturasAlumno3 = {"Física","Química","Matemáticas"};
		Alumno alumno3 = new Alumno("N2","A2",24,2.5,"eaasdas@asdas.es", asignaturasAlumno3);

	}

}

