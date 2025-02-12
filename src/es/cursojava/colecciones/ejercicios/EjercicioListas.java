package es.cursojava.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.cursojava.poo.herencia.ejercicios.vehiculos.Camion;
import es.cursojava.poo.herencia.ejercicios.vehiculos.Coche;
import es.cursojava.poo.herencia.ejercicios.vehiculos.Motocicleta;
import es.cursojava.poo.herencia.ejercicios.vehiculos.Vehiculo;
import es.cursojava.poo.herencia.ejercicios.vehiculos.VehiculoMotorizado;

public class EjercicioListas {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 200,"Diesel",5,true);
        Coche coche2 = new Coche("BMW", "420", 2020, 200,"Diesel",6,true);
        Motocicleta moto1 = new Motocicleta("Kawasaki", "KW2", 2020, 250,"Diesel",true,125);
        Motocicleta moto2 = new Motocicleta("Honda", "CBR", 2010, 220,"Diesel",false,125);
        Camion camion1 = new Camion("EBRO", "MOD1", 2022, 180, "Diesel", 200, 4);
        Camion camion2 = new Camion("EBRO", "MOD2", 2020, 180, "Diesel", 200, 4);

        List<VehiculoMotorizado> vehiculos = new ArrayList<>();
        System.out.println(vehiculos.size());
        System.out.println(vehiculos.isEmpty());
        System.out.println();
        vehiculos.add(coche1);
        vehiculos.add(coche1);
        vehiculos.add(coche1);
        vehiculos.add(coche1);
        vehiculos.add(coche1);
        vehiculos.add(coche1);

        VehiculoMotorizado vm2 = vehiculos.set(0, camion2);
        System.out.println(vm2.getMarca());

        vehiculos.addAll(Arrays.asList(coche1,coche2,moto1,moto2,camion1,camion2));
        //vehiculos = Arrays.asList(coche1,coche2,moto1,moto2,camion1,camion2);
        System.out.println(vehiculos.size());

        // for (VehiculoMotorizado vehiculoMotorizado : vehiculos) {
        //     vehiculoMotorizado.acelerar();
        // }

        for (int i = 0; i < vehiculos.size(); i++) {
            VehiculoMotorizado vm = vehiculos.get(i);
            vm.encender();
        }




    }
}
