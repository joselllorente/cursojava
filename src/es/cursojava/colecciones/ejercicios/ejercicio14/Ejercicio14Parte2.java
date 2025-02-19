package es.cursojava.colecciones.ejercicios.ejercicio14;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class Ejercicio14Parte2 {
    public static void main(String[] args) {
        List<Alumno> alumnos = Ejercicio14Parte1.generarAlumnos();
        Ejercicio14Parte2 e14p2 = new Ejercicio14Parte2();
        Map<String, List<Alumno>> mapaAulas = e14p2.generarMapa(alumnos);
        e14p2.mostrarDatosAulasEntry(mapaAulas);
        e14p2.mostrarNotaMediaMasAlta(mapaAulas);
    }

    Map<String,List<Alumno>> generarMapa (List<Alumno> alumnos){
        Map<String,List<Alumno>> mapa = new LinkedHashMap<>();

        mapa.put("aula1", alumnos.subList(0, 2));
        mapa.put("aula2", alumnos.subList(2, 4));
        mapa.put("aula3", alumnos.subList(4, 6));

        return mapa;
    }

    private void mostrarDatosAulas (Map<String, List<Alumno>> mapaAulas){
        System.out.println("================================");
        Set<String> aulas = mapaAulas.keySet();

        for (String aula : aulas) {
            System.out.println("Aula: "+aula);
            List<Alumno> alumnos = mapaAulas.get(aula);
            for (Alumno alumno : alumnos) {
                System.out.println("\t"+alumno.getNombre() + " " +alumno.getApellidos());
            }
        }
    }


    private void mostrarDatosAulasEntry (Map<String, List<Alumno>> mapaAulas){
        System.out.println("================================");
        Set<Entry<String, List<Alumno>>> entrySet = mapaAulas.entrySet();
        for (Entry<String,List<Alumno>> entry : entrySet) {
            String clave = entry.getKey();
            System.out.println(clave);
            List<Alumno> alumnos = entry.getValue();
            for (Alumno alumno :alumnos) {
                System.out.println("\t"+alumno.getNombre() + " " +alumno.getApellidos());
            }
        }

    }

    private void mostratAlumnos (Map<String, List<Alumno>> mapaAulas){
        System.out.println("================================");
        Collection <List<Alumno>> alumnos = mapaAulas.values();
        for (List<Alumno> alumnosAula : alumnos) {
            for (Alumno alumno : alumnosAula) {
                System.out.println("\t"+alumno.getNombre() + " " +alumno.getApellidos());
            }
        }

    }

    private void mostrarNotaMediaMasAlta (Map<String, List<Alumno>> mapaAulas){
        Set<String> aulas = mapaAulas.keySet();
        double nota = 0;
        String aulaMaximaNota = "";
        Alumno alumnoMaximaNota=null;
        for (String aula : aulas) {
            System.out.println("Aula: "+aula);
            List<Alumno> alumnos = mapaAulas.get(aula);
            for (Alumno alumno : alumnos) {
                if (alumno.getNotaMedia()>nota){
                    nota = alumno.getNotaMedia();
                    aulaMaximaNota = aula;
                    alumnoMaximaNota = alumno;
                }
            }
        }

        System.out.println("La nota más alta es "+nota);
        System.out.println("El aula con la nota más alta es "+aulaMaximaNota);
        System.out.println("Alumno con la nota más alta es "+alumnoMaximaNota);
    }
    
}

