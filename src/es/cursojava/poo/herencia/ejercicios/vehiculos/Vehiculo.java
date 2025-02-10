package es.cursojava.poo.herencia.ejercicios.vehiculos;

import java.time.LocalDate;

import es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos.interfaces.Consultable;

public abstract class Vehiculo implements Consultable{
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadMaxima;
    private String tipo;

    public Vehiculo(String marca, String modelo, int anio, double velocidadMaxima, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tmarca: ").append(marca);
        sb.append("\n\tmodelo: ").append(modelo);
        sb.append("\n\tanio: ").append(anio);
        sb.append("\n\tvelocidadMaxima: ").append(velocidadMaxima);
        sb.append("\n\ttipo: ").append(tipo);
        return sb.toString();
    }

    public void mostrarInformacion(){
        System.out.println(toString());
    }

    public double calcularImpuesto(){
        double impuestoBase=200;
        double impuesto=1;
        int anioActual = LocalDate.now().getYear();

        if(anioActual-this.anio>20){
            impuesto+=0.1;
        }else if (anioActual-anio>10){
            impuesto+=0.05;
        }

        if(tipo.equals("Diesel") || tipo.equals("Gasolina")){
            impuesto += 0.1;
        }else if (tipo.equals("Híbrido")){
            impuesto -= 0.05;
        }else if (tipo.equals("Eléctrico")){
            impuesto -= 0.1;
        }

        // if (this instanceof Coche){
        //     impuesto += 0.05;
        // }else if (this instanceof Motocicleta){
        //     impuesto -= 0.05;
        // }else if (this instanceof Camion){
        //     impuesto += 0.10;
        // }

        //impuesto = impuestoBase * impuesto;
        return impuesto;
    }

    public abstract int acelerar();
}

