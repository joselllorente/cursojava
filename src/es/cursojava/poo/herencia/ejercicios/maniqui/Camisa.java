package es.cursojava.poo.herencia.ejercicios.maniqui;

import java.util.Arrays;

public class Camisa extends Ropa {
       private Boton [] botones;

    public Camisa(String color, String talla, double precio, Boton[] botones) {
       super(color, talla, precio);
        this.botones = botones;
    }

    public Camisa(String color, String talla, double precio) {
        super(color, talla, precio);
    }
    

    public Boton[] getBotones() {
        return botones;
    }

    public void setBotones(Boton[] botones) {
        this.botones = botones;
    }


    @Override
    public String toString() {
        //Llamada al método de la clase padre
        String padre = super.toString();

        //Se crea un nuevo objeto StringBuilder al que le doy lo que me paso el método padre
        StringBuilder sb = new StringBuilder();
        sb.append("Pantalon{");
        sb.append(padre);
        sb.append("botones=").append(Arrays.toString(botones));
        sb.append('}');
        return sb.toString();
    }
    

}
