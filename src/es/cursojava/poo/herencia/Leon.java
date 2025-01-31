package es.cursojava.poo.herencia;

public class Leon extends Animal{
    private boolean tieneMelena;

    public Leon (boolean tieneMelena, String nombre, double peso){
        super(nombre,peso);
        this.tieneMelena = tieneMelena;
    }

    public Leon (boolean tieneMelena, String nombre){
        super(nombre);
        this.tieneMelena = tieneMelena;
    }

    public void cazar(){
        System.out.println("El leon "+ this.getNombre() +" está cazando");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("Ferozmente");
    }


    
}
