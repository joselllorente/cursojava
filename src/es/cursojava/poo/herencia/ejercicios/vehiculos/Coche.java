package es.cursojava.poo.herencia.ejercicios.vehiculos;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;

    public Coche(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int numeroPuertas, boolean tieneAireAcondicionado) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coche{");
        sb.append(super.toString());
        sb.append("\n\tnumeroPuertas=").append(numeroPuertas);
        sb.append("\n\ttieneAireAcondicionado=").append(tieneAireAcondicionado?"Yes":"No");
        sb.append('}');
        return sb.toString();
    }

    public void volar(){
        System.out.println("Coche volando");
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Soy un coche que puede volar");
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();

        impuesto += 0.05; 
        impuesto = 200 * impuesto;
        return impuesto;
    }


}