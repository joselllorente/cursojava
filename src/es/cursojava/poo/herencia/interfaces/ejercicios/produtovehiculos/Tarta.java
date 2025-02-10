package es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos;

public class Tarta extends Alimentos {

    private String sabor;

    public Tarta(String nombre, int precio, String fechaCaducidad, String sabor) {
        super(nombre, precio, fechaCaducidad);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}
