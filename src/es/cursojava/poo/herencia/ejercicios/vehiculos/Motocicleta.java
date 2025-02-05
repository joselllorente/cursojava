package es.cursojava.poo.herencia.ejercicios.vehiculos;

public class Motocicleta extends Vehiculo{
    private boolean tieneSidecar;
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int anio, double velocidadMaxima, String tipo, boolean tieneSidecar, int cilindrada) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.tieneSidecar = tieneSidecar;
        this.cilindrada = cilindrada;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moto{");
        sb.append(super.toString());
        sb.append("cilindrada= ").append(cilindrada);
        sb.append(", tieneSidecar= ").append( tieneSidecar?"Sí":"No" );
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();

        impuesto -= 0.05; 
        impuesto = 200 * impuesto;
        return impuesto;
    }
}
