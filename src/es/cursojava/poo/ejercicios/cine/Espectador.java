package es.cursojava.poo.ejercicios.cine;

public class Espectador {
    private String nombre;
    private String dni;

    public Espectador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Espectador{");
        sb.append("nombre=").append(nombre);
        sb.append(", dni=").append(dni);
        sb.append('}');
        return sb.toString();
    }


}