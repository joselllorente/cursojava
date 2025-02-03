package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class Guitarra extends Instrumento{
    private int numCuerdas;

    public Guitarra(String nombre, String tipo) {
        super(nombre, tipo);
        this.numCuerdas = 6;
    }

    public Guitarra(int numCuerdas, String nombre, String tipo) {
        super(nombre, tipo);
        this.numCuerdas = numCuerdas;
    }

    public int getNumCuerdas() {
        return numCuerdas;
    }

    public void setNumCuerdas(int numCuerdas) {
        this.numCuerdas = numCuerdas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guitarra{");
        sb.append(super.toString());
        sb.append("numCuerdas=").append(numCuerdas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Afinando la guitarra");
    }

    // @Override
    // public void afinar (){
    //     super.afinar();
    //     System.out.println("Afinando la guitarra");
    // }

    
}
