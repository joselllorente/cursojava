package es.cursojava.colecciones;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EjemplosMapas {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("Clave1", 2);
        System.out.println(mapa.put("Clave2", 3));
        System.out.println(mapa.put("Clave2", 4));
        System.out.println(mapa.put("Clave3", 7));
        System.out.println(mapa.put("Clave4", 6));
        System.out.println(mapa.put("Clave2", 5));

        System.out.println("============Valores por clave ==============");
        //Recuperamos por clave
        System.out.println(mapa.get("Clave1"));
        System.out.println(mapa.get("Clave2"));

        System.out.println("==========  Claves ===========");
        Set<String> claves = mapa.keySet();
        for (String clave : claves) {
            System.out.println(clave);
        }

        System.out.println("==========  Valores  =============");
        Collection<Integer> valores = mapa.values();
        for (Integer numero : valores) {
            System.out.println(numero);
        }

        System.out.println("==========  Todas Claves con Valor ===========");
        for (String clave : claves) {
            System.out.println(clave + " " + mapa.get(clave));
        }

        System.out.println("==========  Todas Claves con Valor usando Entry ===========");
        Set<Entry<String,Integer>> entries = mapa.entrySet();
        for ( Entry<String,Integer> entry   : entries  ) {
            System.out.println(entry);
        }
    }
}

