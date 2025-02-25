package es.cursojava.excepciones.ejercicio1;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.inicio.funciones.Utilidades;
import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class Principal {
    public static void main(String[] args) {
        
        List<Alumno> alumnos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Datos del alumno "+(i+1));
            try {
                String nombre = Utilidades.pideDatoCadena("Introduce nombre alumno "+ (i+1));
                int edad = Utilidades.pideDatoNumerico("Introduce edad alumno "+ (i+1));
                double notaMedia = Utilidades.pideDatoNumerico("Introduce nota alumno "+ (i+1));

                Alumno alumno = new Alumno(nombre, edad, notaMedia);
                alumnos.add(alumno);
                
            } catch (NotaInvalidaException | IllegalArgumentException e) {
                System.err.println("Alumno no se ha podido crear correctamente" + e.getMessage());
                //e.printStackTrace();
            } 

        }

        System.out.println("Número de alumnos guardados: " +alumnos.size());
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
