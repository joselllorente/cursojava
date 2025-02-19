package es.cursojava.colecciones.ejercicios.ejercicio14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class Ejercicio14Parte3 {
    public static void main(String[] args) {
        Ejercicio14Parte2 e14p2 = new Ejercicio14Parte2();
        Ejercicio14Parte1 e14p1 = new Ejercicio14Parte1();

        Colegio cole1 = new Colegio("Cole1", "Dir1");
        Map<String, List<Alumno>> aulasCole1 = e14p2.generarMapa(e14p1.generarAlumnos(6));
        cole1.setAulas(aulasCole1);

        
        Map<String, List<Alumno>> aulasCole2 = e14p2.generarMapa(e14p1.generarAlumnos(6));
        Colegio cole2 = new Colegio("Cole2", "Dir2",aulasCole2);
        
        Map<String, List<Alumno>> aulasCole3 = e14p2.generarMapa(e14p1.generarAlumnos(6));
        Colegio cole3 = new Colegio("Cole3", "Dir3",aulasCole3);

        List<Colegio> colegios = Arrays.asList(cole1,cole2,cole3);


    }
}
