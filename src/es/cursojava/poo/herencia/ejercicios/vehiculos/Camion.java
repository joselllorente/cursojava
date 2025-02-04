package es.cursojava.poo.herencia.ejercicios.vehiculos;

public class Camion extends Vehiculo{
    private double capacidadCarga;
    private int numeroEjes;

    public Camion(String marca, String modelo, int anio, double velocidadMaxima, String tipo,  double capacidadCarga, int numeroEjes) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camion{");
        sb.append(super.toString());
        sb.append("capacidadCarga= ").append(capacidadCarga);
        sb.append(", numEjes= ").append( numeroEjes );
        sb.append('}');
        return sb.toString();
    }
}
