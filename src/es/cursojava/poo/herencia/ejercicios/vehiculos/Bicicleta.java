package es.cursojava.poo.herencia.ejercicios.vehiculos;

public class Bicicleta extends Vehiculo{
    int nunMarchas;

    public Bicicleta(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int nunMarchas) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.nunMarchas = nunMarchas;
    }

    @Override
    public int acelerar() {
        // TODO Auto-generated method stub
        return 0;
    }



    

}
