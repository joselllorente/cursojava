package es.cursojava.colecciones.ejercicios.ejercicio14;

import java.util.List;
import java.util.Map;

import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class Colegio {
    private String nombre;
    private String direccion;
    private Map<String , List<Alumno>> aulas;

    public Colegio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public Colegio(String nombre, String direccion, Map<String, List<Alumno>> aulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aulas = aulas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map<String, List<Alumno>> getAulas() {
        return aulas;
    }

    public void setAulas(Map<String, List<Alumno>> aulas) {
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Colegio [nombre=" + nombre + ", direccion=" + direccion + ", aulas=" + aulas + "]";
    }

    public void guadarAlumno (String aula, Alumno alumno){
        this.aulas.get(aula).add(alumno);
    }

    public void guadarAlumnos (String aula, List<Alumno> alumnos){
        this.aulas.get(aula).addAll(alumnos);
        //List<Alumno> alumnosAntiguos = this.aulas.put(aula, alumnos);
    }

}
