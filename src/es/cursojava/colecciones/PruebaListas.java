package es.cursojava.colecciones;

import java.util.ArrayList;

import es.cursojava.poo.herencia.Vaca;

public class PruebaListas {
    public static void main(String[] args) {
        
        ArrayList<Vaca> lista = new ArrayList<>();

        //lista.add("Azul");
        //lista.add(1);
        lista.add(new Vaca("vaca1", 0, 0));
        lista.add(new Vaca("vaca2", 0, 0));
        


        System.out.println(lista.size());

        Vaca v3 = new Vaca("vaca3", 0, 0);
        lista.add(0, v3);
        lista.get(0).mugir();

        for (Vaca vaca : lista) {
            vaca.mugir();
        }

        lista.remove(v3);
        lista.remove(0);

        

        System.out.println("Existe: "+ lista.contains(v3));
        // for (Object object : lista) {
        //     if (object instanceof Vaca){
        //         Vaca v = (Vaca)object;
        //         v.mugir();
        //     }
        //     System.out.println(object);
        // }


    }
}

