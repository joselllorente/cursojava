package es.cursojava.poo.ejercicios.alumnos;

public class Instituto {
	
	public static void main(String[] args) {
		//System.out.println(nombre);
		
		Alumno alumno1 = new Alumno("N1","A1",22,8.5,"emasdasd@asdas.es");
		Alumno alumno2 = new Alumno("N2","A2",24,2.5,"eaasdas@asdas.es");
		String [] asignaturasAlumno2 = {"Lengua","Inglés","Historia"};
		alumno2.setAsignaturas(asignaturasAlumno2);
		
		String [] asignaturasAlumno3 = {"Física","Química","Matemáticas"};
		Alumno alumno3 = new Alumno("N3","A2",24,2.5,"eaasdas@asdas.es", asignaturasAlumno3);
		
		Alumno alumno4 = new Alumno();
		alumno4.setNombre("N4");
		alumno4.setApellidos("A4");
		alumno4.setEdad(22);
		alumno4.setEmail("asdadasd@asdas");
		alumno4.setNotaMedia(7.0);
		alumno4.setAsignaturas( new String[] {"Física","Química"} );
	
		Alumno [] alumnos = {alumno1,alumno2,alumno3,alumno4};  
	
		for (int i=0 ; i<alumnos.length  ; i++ ) {
			Alumno alumno = alumnos[i];
			System.out.println(alumno.getNombre());
			alumno.estudiar();
			
			String[] asigns = alumno.getAsignaturas();
			if (asigns!=null) {
				for (String asignatura : asigns) {
					System.out.println("\t"+asignatura);
				}
			}
		}
		
		
		for (Alumno alumno   :  alumnos  ) {
			System.out.println(alumno.getNombre());
			alumno.estudiar();
			
			String[] asigns = alumno.getAsignaturas();
			if (asigns!=null) {
				for (String asignatura : asigns) {
					System.out.println("\t"+asignatura);
				}
			}
		}
		
		
	}
	
	
}

