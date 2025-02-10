package es.cursojava.poo.herencia.ejercicios.vehiculos;

public class Camion extends VehiculoMotorizado{
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

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();

        impuesto += 0.1; 
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
        System.out.println("Arrancando el camión");
        
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el camión");
        
    }

    @Override
    public void select() {
        System.out.println("Consultando el camión");
    }

    @Override
    public void delete() {
        System.out.println("Borrando camión");
        
    }

    @Override
    public void insert() {
        System.out.println("Insertando camión");
        
    }

    @Override
    public void update() {
        System.out.println("Actualizando camión");
        
    }

}
