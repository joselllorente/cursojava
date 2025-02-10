package es.cursojava.poo.herencia.ejercicios.vehiculos;

public final class Coche extends VehiculoMotorizado {
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
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();

        impuesto += 0.05; 
        impuesto = 200 * impuesto;
        return impuesto;
    }

    @Override
    public int acelerar() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void encender() {
        System.out.println("Arrancando el coche");
        
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el coche");
        
    }

    @Override
    public void select() {
        System.out.println("Consultando el coche");
    }

    @Override
    public void delete() {
        System.out.println("Borrando coche");
        
    }

    @Override
    public void insert() {
        System.out.println("Insertando coche");
        
    }

    @Override
    public void update() {
        System.out.println("Actualizando coche");
        
    }

    
}