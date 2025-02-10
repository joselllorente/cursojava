package es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos;

public abstract class Alimentos extends Producto {

    private String fechaCaducidad;

    public Alimentos(String nombre, int precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    

}