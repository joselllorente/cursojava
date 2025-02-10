package es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos;

import es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos.interfaces.Encendible;

public class Mechero extends Producto implements Encendible{
    String gas;

    public Mechero(String nombre, int precio, String gas) {
        super(nombre, precio);
        this.gas = gas;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo mechero");
        
    }

    @Override
    public void select() {
        System.out.println("Consultando el mechero");
    }
    

}
