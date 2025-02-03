package es.cursojava.poo.herencia.ejercicios.maniqui;

public class Boton {
    private String color;
    private String forma;
    private String tamanio;

    public Boton(String color, String forma, String tamanio) {
        this.color = color;
        this.forma = forma;
        this.tamanio = tamanio;
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Boton [color=" + color + ", forma=" + forma + ", tamanio=" + tamanio + "]";
    }

    


}
