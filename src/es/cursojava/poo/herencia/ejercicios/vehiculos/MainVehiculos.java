package es.cursojava.poo.herencia.ejercicios.vehiculos;

public class MainVehiculos {

    public static void main(String[] args) {
        MainVehiculos mv = new MainVehiculos();
        Garaje garaje = new Garaje("Mengo",2, 1, 1);
        mv.aparcarVehiculos( mv.crearVehiculos() , garaje);

        //Vehiculo v = new Vehiculo(null, null, 0, 0, null);
        // Vehiculo coche = new Coche("Toyota", "Corolla", 2020, 200,"Diesel",5,true);
        // coche.mostrarInformacion();
        // double importe = coche.calcularImpuesto();
        // System.out.println("El importe a pagar es "+importe);
        // //coche.volar();
        // if (coche instanceof Coche){
        //      ((Coche)coche).volar();
        //      coche.mostrarInformacion();
        // }

       
       
        // Vehiculo[] vehiculos = garaje.getPlazas();
        // System.out.println("Plazas del garaje "+garaje.getNombre());
        // for (int i = 0; i < vehiculos.length; i++) {
        //     Vehiculo v = vehiculos[i];
        //     if(v!=null){
        //         System.out.println("Plaza "+ (i+1));
        //         v.mostrarInformacion();
        //     }
        // }   
    }


    private void aparcarVehiculos(Vehiculo[] vehiculos, Garaje garaje){
        
        for (Vehiculo vehiculo : vehiculos) {
            if(garaje.hayHueco(vehiculo)){
                System.out.println("Hay plazas para el vehiculo "+vehiculo);
                garaje.aparcarVehiculo(vehiculo);
            }else{
                System.out.println("No hay plazas disponibles para el vehiculo "+vehiculo);
            }
        }
    }


    public Vehiculo[] crearVehiculos(){
        Vehiculo[] vehiculos = new Vehiculo[6];
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 200,"Diesel",5,true);
        Coche coche2 = new Coche("Toyota", "Corolla", 2020, 200,"Diesel",5,true);
        Motocicleta moto1 = new Motocicleta("Kawasaki", "KW2", 2020, 250,"Diesel",true,125);
        Motocicleta moto2 = new Motocicleta("Honda", "CBR", 2010, 220,"Diesel",false,125);
        Camion camion1 = new Camion("EBRO", "MOD1", 2022, 180, "Diesel", 200, 4);
        Camion camion2 = new Camion("EBRO", "MOD2", 2020, 180, "Diesel", 200, 4);

        vehiculos[0]=coche1;
        vehiculos[1]=coche2;
        vehiculos[2]=moto1;
        vehiculos[3]=moto2;
        vehiculos[4]=camion1;
        vehiculos[5]=camion2;

        return vehiculos;
    }
}
