package es.cursojava.poo.ejercicios.cine;

import es.cursojava.inicio.funciones.Utilidades;

public class MainCine {
    public static void main(String[] args) {
        MainCine mainCine = new MainCine();
        mainCine.arrancarCine();
    }

    private Cine crearCine(){
        Sala sala1 = new Sala(1, "Pelicula 1", 3, 3);
        Sala sala2 = new Sala(2, "Pelicula 2", 2, 2);
        Sala sala3 = new Sala(3, "Pelicula 3", 4, 4);
        Sala[] salas = {sala1, sala2, sala3};

        Cine cine = new Cine("Cine Ejemplo", salas);
        return cine;
    }

    private Espectador[] creaEspectadores(){
        Espectador espectador1 = new Espectador("Espectador 1", "12345678A");
        Espectador espectador2 = new Espectador("Espectador 2", "23456789B");
        Espectador espectador3 = new Espectador("Espectador 3", "34567890C");
        Espectador[] espectadores = {espectador1, espectador2, espectador3};
        
        return espectadores;
    }

    private void arrancarCine(){
        Cine cine = crearCine();
        Espectador[] espectadores = creaEspectadores();
        gestionEntradas(cine, espectadores);
    }

    private void gestionEntradas(Cine cine, Espectador[] espectadores){
        //Recorremos todos los espectadores
        for (Espectador espectador : espectadores) {
            System.out.println("\nEl espectador "+espectador.getNombre() +" está comprando entradas");
            mostrarCartelera(cine);
            int numSala = Utilidades.pideDatoNumerico("Introduce el número de sala");
            int numEntradas = Utilidades.pideDatoNumerico(espectador.getNombre() + ", ¿Cuántas entradas quieres?");
            Sala salaSeleccionada = cine.getSalas()[numSala-1];
            mostrarButacas(salaSeleccionada);
        }
    }


    private void mostrarCartelera (Cine cine){
        Sala [] salas = cine.getSalas();
        for (Sala sala : salas) {
            System.out.println(sala);
        }
    }

    private void mostrarButacas (Sala sala){
        Espectador[][] butacas = sala.getButacas();
        System.out.println("Butacas disponibles para la película "+sala.getTituloPelicula());
        for (int idx = 0; idx < butacas.length; idx++) {//filas
            for (int i = 0; i < butacas[idx].length; i++) {//columnas
                System.out.print("\tO");        
            }
            System.out.println("");
        }

    }
}