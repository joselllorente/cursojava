package es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos;

import es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos.interfaces.Operable;

public class Ordenador extends ProductosElectronicos implements Operable {

    private String procesador;

    public Ordenador(String nombre, int precio, String fechaFabricacion, String procesador) {
        super(nombre, precio, fechaFabricacion);
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void encender() {
       System.out.println("Encendiendo ordenador");
        
    }

    @Override
    public void apagar() {
        System.out.println("Apagando ordenador");
        
    }

    @Override
    public void suspender() {
        System.out.println("Suspendiendo ordenador");
    }

   
}
