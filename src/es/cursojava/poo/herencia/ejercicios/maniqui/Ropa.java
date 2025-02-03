package es.cursojava.poo.herencia.ejercicios.maniqui;

public class Ropa {
    private String color;
    private String talla;
    private double precio;
    
    public Ropa(String color, String talla, double precio) {
        this.color = color;
        this.talla = talla;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("color=").append(color);
        sb.append(", talla=").append(talla);
        sb.append(", precio=").append(precio);
        return sb.toString();
    }


}
