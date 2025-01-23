package es.cursojava.poo;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Persona persona0 = new Persona();//Llamada al constructor por defecto
		System.out.println("p0:"+persona0);
		System.out.println(persona0.getPeso());
		System.out.println(persona0.getNombre());
		persona0.setNombre("Nombre1");
		persona0.setPeso(70.5);
		System.out.println(persona0.getPeso());
		System.out.println(persona0.getNombre());
		persona0.correr();
		
		Persona persona1 = new Persona();
		System.out.println("p1:"+persona1);
		System.out.println(persona1.getNombre());
		persona1.setNombre("Nombre2");
		persona1 = persona0;
		System.out.println("p1:"+persona1);
		System.out.println("p0:"+persona0);
		persona0.setNombre("Nombre3");
		System.out.println(persona1.getNombre());
		System.out.println(persona0.getNombre());
		persona1.setPeso(60);
		persona1.correr();

		Persona persona2 = new Persona("N2","A2","2A",40);
		System.out.println(persona2.getNombre());
		System.out.println(persona2.getPeso());
		persona2.correr();
//		if (Math.random()>0.5) {
//			Persona persona1 = new Persona();
//			//Persona persona2 = new Persona("N2","A2","2A",60);
//			Persona persona3 = persona1;
//		}
		
		

	}

}


