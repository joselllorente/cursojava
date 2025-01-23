package es.cursojava.poo;

//POJO (PLAIN OLD JAVA OBJECT)
public class Persona {
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	private double peso;

	
	
	public Persona() {

	}
	
	public Persona (String nombre, String apellidos, String dni, double peso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.peso = peso;
	}
	
	public Persona (String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;

	}
	
	
	//Getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getDni() {
		return dni;
	}
	
	public void correr () {
		System.out.print("La persona "+ this.nombre + " está corriendo");
		if (peso<50) {
			System.out.println(" muy rápido");
		}else if (peso<70) {
			System.out.println(" rápido");
		}else if (peso<100) {
			System.out.println(" lento");
		}else {
			System.out.println(" muy lento");
		}
	}
	
}
