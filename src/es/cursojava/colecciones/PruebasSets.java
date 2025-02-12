package es.cursojava.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class PruebasSets {
    public static void main(String[] args) {
        Set<Alumno> alumnos = new LinkedHashSet<>();
        alumnos.add(new Alumno("N1", "A1", 22, 8, "email@asdas.es"));
        alumnos.add(new Alumno("N2", "A2", 22, 8, "email@asdas.es"));
        alumnos.add(new Alumno("N3", "A3", 22, 8, "email@asdas.es"));

        Alumno a4 = new Alumno("N4", "A4", 22, 8, "email@asdas.es");
        // System.out.println(alumnos.add(a4));
        // System.out.println(alumnos.add(a4));

        // System.out.println(alumnos.size());
        
        // for (Alumno alumno : alumnos) {
        //     System.out.println(alumno.getNombre());
        // }

        Iterator<Alumno> ite = alumnos.iterator();
        while(ite.hasNext()){
            Alumno a = ite.next();
            System.out.println(a.getNombre());
        }
        
    }
}

