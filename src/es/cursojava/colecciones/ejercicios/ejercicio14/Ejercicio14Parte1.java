package es.cursojava.colecciones.ejercicios.ejercicio14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.inicio.funciones.Utilidades;
import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class Ejercicio14Parte1 {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos1 = generarAlumnos ();

        // listaAlumnos.addAll(Arrays.asList(alumno,alumno1,alumno2,alumno3,alumno4,alumno5));
        // System.out.println(listaAlumnos.size());

        //listaAlumnos1 = (Arrays.asList(alumno,alumno1,alumno2,alumno3,alumno4,alumno5));
        System.out.println(listaAlumnos1.size());

        //List<Alumno> listaAlumnos2 = (Arrays.asList(alumno,alumno1,alumno2,alumno3,alumno4,alumno5));

        Ejercicio14Parte1 e14p1 = new Ejercicio14Parte1();
        e14p1.mostrarInfoAlumnos(listaAlumnos1);
        //e14p1.mostrarNotaMediaAlumno(listaAlumnos2);
        e14p1.eliminarAlumnosSuspensos(listaAlumnos1);
        System.out.println("=================================");
        e14p1.mostrarInfoAlumnos(listaAlumnos1);
    }
    static List<Alumno> generarAlumnos (int numAlumnos){ 
        List<Alumno> listaAlumnos = new CopyOnWriteArrayList<>();

        for (int i = 0; i < numAlumnos; i++) {
            Alumno alumno = new Alumno("N"+i,"A"+i,22,Math.random()*10,"adasd@asdasd.es");
            listaAlumnos.add(alumno);
        }

        return listaAlumnos;
    }
    static List<Alumno> generarAlumnos (){
        // List<Alumno> listaAlumnos1 = new CopyOnWriteArrayList<>();

        // Alumno alumno = new Alumno("N1","A1",22,2,"adasd@asdasd.es");
        // Alumno alumno1 = new Alumno("N2","A2",22,3,"adasd@asdasd.es");
        // Alumno alumno2 = new Alumno("N3","A3",22,4,"adasd@asdasd.es");
        // Alumno alumno3= new Alumno("N4","A4",22,2,"adasd@asdasd.es");
        // Alumno alumno4 = new Alumno("N2","A5",22,0,"adasd@asdasd.es");
        // Alumno alumno5 = new Alumno("N6","A6",22,0,"adasd@asdasd.es");

        // listaAlumnos1.add(new Alumno("N1","A1",22,9,"adasd@asdasd.es"));
        // listaAlumnos1.add(alumno1);
        // listaAlumnos1.add(alumno2);
        // listaAlumnos1.add(alumno3);
        // listaAlumnos1.add(alumno4);
        // listaAlumnos1.add(alumno5);
        List<Alumno> listaAlumnos1=generarAlumnos (6);
        return listaAlumnos1;
    }

    private void mostrarInfoAlumnos (List<Alumno> listaAlumnos){
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

    private void mostrarNotaMediaAlumno (List<Alumno> listaAlumnos){
        String nombreABuscar = Utilidades.pideDatoCadena("Introduce nombre del alumno: ");
        boolean alumnoEncontrado = false;
        //Recorro todos los alumnos
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getNombre().equals(nombreABuscar)){
                System.out.println("Alumno "+ alumno.getApellidos() +" nota: "+ alumno.getNotaMedia());
                alumnoEncontrado = true;
                break;
            }
            //System.out.println( alumno.getNombre().equals(nombreABuscar)?"Alumno "+ alumno.getApellidos() +" nota: "+ alumno.getNotaMedia():"" ) ;
        }

        System.out.println(!alumnoEncontrado?"No hay alumnos con el nombre "+ nombreABuscar : "");

    }


    private void eliminarAlumnosSuspensos (List<Alumno> listaAlumnos){
        // for (Alumno alumno : listaAlumnos) {
        //     if(alumno.getNotaMedia()<5){
        //         listaAlumnos.remove(alumno);
        //     }
        // }

        for (int i = 0; i < listaAlumnos.size(); i++) {
            Alumno alumno = listaAlumnos.get(i);
            if(alumno.getNotaMedia()<5){
                listaAlumnos.remove(i--);
            }
        }
    }
}
