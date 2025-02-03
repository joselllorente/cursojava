package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class Instrumento {

    private String nombre;
	private String tipo;
	private boolean afinado;

    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre=").append(nombre);
        sb.append(", tipo=").append(tipo);
        sb.append(", afinado=").append(afinado);
        return sb.toString();
    }

    public void afinar (){
        this.afinado = Math.random()>0.4;
        if(afinado){
            System.out.println("El instrumento "+ nombre +" está afinado correctamente");
        }else{
            System.out.println("El instrumento "+ nombre +" no se pudo afinar correctamente");
        }
        // boolean t = false;
        // if (Math.random()>0.4){
        //     System.out.println("El instrumento está afinado correctamente");
        //     this.afinado = true;
        // }

    }

    public void tocar (){
        System.out.println("El instrumento "+ nombre + " está tocando");
    }
}
