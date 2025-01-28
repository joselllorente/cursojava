package es.cursojava.examen.modulo1;

public class Examen {
    public static void main(String[] args) {
        int[] numeros = UtilidadesExamen.crearArray();
        UtilidadesExamen.mostrarArray(numeros);
        //System.out.println("Promedio: "+UtilidadesExamen.calcularPromedio(numeros));
        double promedio = UtilidadesExamen.calcularPromedio(numeros);
        System.out.println("Promedio: "+promedio);

        System.out.println("encontrarExtremos");
        int[] extremos =  UtilidadesExamen.encontrarExtremos(numeros);
        System.out.println("Valor máximo" + extremos[0]);
        System.out.println("Valor mínimo" + extremos[1]);

        System.out.println("filtrarMayoresQuePromedio");
        int[] mayoresPromedio = UtilidadesExamen.filtrarMayoresQuePromedio(numeros, promedio);
        UtilidadesExamen.mostrarArray(mayoresPromedio);

    }
}
