package es.cursojava.poo.ejercicios.cine;

public class Cine {
    private String nombre;
    private Sala[] salas;

    public Cine(String nombre, Sala[] salas) {
        this.nombre = nombre;
        this.salas = salas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
}