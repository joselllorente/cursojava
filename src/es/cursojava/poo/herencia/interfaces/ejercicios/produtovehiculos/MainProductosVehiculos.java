package es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos;

import es.cursojava.poo.herencia.ejercicios.vehiculos.Bicicleta;
import es.cursojava.poo.herencia.ejercicios.vehiculos.Coche;
import es.cursojava.poo.herencia.ejercicios.vehiculos.Vehiculo;
import es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos.interfaces.Consultable;
import es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos.interfaces.Encendible;
import es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos.interfaces.Insertable;
import es.cursojava.poo.herencia.interfaces.ejercicios.produtovehiculos.interfaces.Operable;

public class MainProductosVehiculos {

    public static void main(String[] args) {
        MainProductosVehiculos mpv = new MainProductosVehiculos();
        mpv.ejercicio();
    }

    private void ejercicio(){

        Tarta tarta = new Tarta("Tarta1", 20, null, "Chocolate");
        Coche coche = new Coche("Marca1", "Modelo1", 2020, 200, "Diesel", 5, false);
        Operable ordenador = new Ordenador("O1", 1000, "", null);
        Bicicleta bicicleta = new Bicicleta("","",2020,200,"Pedales",10);
        Mechero mechero = new Mechero("Mechero1", 100, null);

        coche.encender();
        ordenador.encender();

        Encendible [] arrayEncendible = {coche, ordenador,mechero};
        enciende(mechero);
        //operable(coche);
        consulta(coche);
    }


    private void consulta (Consultable consulta){
        consulta.select();
    }

    private void insertObject (Insertable objeto){
        objeto.insert();
    }


    private void operable(Operable objetoOperable){
        objetoOperable.encender();
        objetoOperable.apagar();
        objetoOperable.suspender();

    }


    public void enciende (Encendible objetoEncendible){
        objetoEncendible.encender();
    }

    

}
