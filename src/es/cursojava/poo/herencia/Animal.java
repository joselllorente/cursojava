package es.cursojava.poo.herencia;

public class Animal {
    private String nombre;
    private double peso;

    // public Animal() {

    // }

    

    public Animal(String nombre, double peso) {
        super();
        this.nombre = nombre;
        this.peso = peso;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(){
        System.out.println("El animal "+this.nombre+ " está comiendo");
    }

    public void beber(){
        System.out.println("El animal "+this.nombre+ " está bebiendo");
    }
    
}
