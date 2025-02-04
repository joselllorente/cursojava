package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class Tambor extends Instrumento {
    private String material;

    public Tambor(String nombre, String tipo, String material) {
        super(nombre, tipo);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    public void aporrear() {
        System.out.println("Aporreando el tambor de " + material);
    }

    @Override
    public void afinar() {
       this.setAfinado(true);
       System.out.println("El tambor "+getNombre()+ " está afinado");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tambor{");
        sb.append("material=").append(material);
        sb.append('}');
        return sb.toString();
    }


    
}
