package es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos;

import es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos.interfaces.Insertable;

public abstract class Alimentos extends Producto implements Insertable{

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