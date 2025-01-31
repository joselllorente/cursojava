package es.cursojava.poo.herencia;

public class Vaca extends Animal{
    private int numCuernos;

    public Vaca (String nombre, double peso, int numCuernos){
        super(nombre, peso);
        this.numCuernos=numCuernos;
    }

    public void mugir (){
        System.out.println("La vaca "+ getNombre() + " está mugiendo");
    }

    @Override
    public void comer(){
        System.out.println("La vaca "+ getNombre() +" esta rumiando");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaca{");
        sb.append("numCuernos=").append(numCuernos);
        sb.append('}');
        return sb.toString();
    }



}
