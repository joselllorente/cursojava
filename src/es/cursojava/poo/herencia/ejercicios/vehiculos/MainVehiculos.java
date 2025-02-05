package es.cursojava.poo.herencia.ejercicios.vehiculos;

public class MainVehiculos {

    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", "Corolla", 2020, 200,"Diesel",5,true);
        coche.mostrarInformacion();
        double importe = coche.calcularImpuesto();
        System.out.println("El importe a pagar es "+importe);
        //coche.volar();
        if (coche instanceof Coche){
             ((Coche)coche).volar();
             coche.mostrarInformacion();
        }


        
    }
}
