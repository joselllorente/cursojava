package es.cursojava.poo.herencia.ejercicios.vehiculos;

public class Motocicleta extends VehiculoMotorizado{
    private boolean tieneSidecar;
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int anio, double velocidadMaxima, 
            String tipo, boolean tieneSidecar, int cilindrada) {
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

    @Override
    public int acelerar() {

        return 0;
    }

    @Override
    public void encender() {
        System.out.println("Arrancando la moto");
        
    }

    @Override
    public void apagar() {
        System.out.println("Apagando la moto");
        
    }
    

    @Override
    public void select() {
        System.out.println("Consultando la Moto");
    }

    @Override
    public void delete() {
        System.out.println("Borrando moto");
        
    }

    @Override
    public void insert() {
        System.out.println("Insertando moto");
        
    }

    @Override
    public void update() {
        System.out.println("Actualizando moto");
        
    }

}
