package es.cursojava.poo.herencia.ejercicios.maniqui;

public class Pantalon extends Ropa {

    private Boton boton;

    public Pantalon(String color, String talla, double precio, Boton boton) {
        super(color,talla, precio);
        this.boton = boton;
    }

    public Boton getBoton() {
        return boton;
    }

    public void setBoton(Boton boton) {
        this.boton = boton;
    }

    @Override
    public String toString() {
        //Llamada al método de la clase padre
        String padre = super.toString();

        //Se crea un nuevo objeto StringBuilder al que le doy lo que me paso el método padre
        StringBuilder sb = new StringBuilder();
        sb.append("Pantalon{");
        sb.append(padre);
        sb.append("boton=").append(boton);
        sb.append('}');
        return sb.toString();
    }

    
}
