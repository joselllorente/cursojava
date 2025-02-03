package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class GuitarraElectrica extends Guitarra {
	private double potencia;
	
	public GuitarraElectrica(String nombre, String tipo, double potencia) {
		super(nombre, tipo);
		this.potencia = potencia;
	}

	public GuitarraElectrica(String nombre, String tipo) {
		super(nombre, tipo);
	}

	public GuitarraElectrica(int numCuerdas, String nombre, String tipo) {
		super(numCuerdas, nombre, tipo);
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + ", instrumento=" + super.toString() + "]";
	}

	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra electrica "+ getNombre() +" muy alto");
	}

	
}
