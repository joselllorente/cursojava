package es.cursojava.poo.ejercicios.cine;

public class Sala {
    private int numero;
    private String tituloPelicula;
    private Espectador[][] butacas;

    public Sala(int numero, String tituloPelicula, int filas, int columnas) {
        this.numero = numero;
        this.tituloPelicula = tituloPelicula;
        this.butacas = new Espectador[filas][columnas];
    }

    public Sala(int numero, String tituloPelicula, Espectador[][] butacas) {
        this.numero = numero;
        this.tituloPelicula = tituloPelicula;
        this.butacas = butacas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public Espectador[][] getButacas() {
        return butacas;
    }

    public void setButacas(Espectador[][] butacas) {
        this.butacas = butacas;
    }

    @Override
    public String toString() {
        return "Sala [numero=" + numero + ", tituloPelicula=" + tituloPelicula + "]";
    }

}