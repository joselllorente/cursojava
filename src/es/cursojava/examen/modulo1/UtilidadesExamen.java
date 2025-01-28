package es.cursojava.examen.modulo1;

import java.util.Scanner;

public class UtilidadesExamen {

    public static int pideDatoNumerico(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		return numero;
	}

    /**
     * Crear un array y llenarlo con números del usuario (1 punto)
        Escribe una función crearArray que:
        o	Pida al usuario el tamaño del array (entre 1 y 100).
        o	Llene el array con números introducidos por el usuario.
        o	Devuelva el array.
     * @return
     */
    public static int[] crearArray (){
        int size = 0;
        do{
            size = pideDatoNumerico("Introduce tamaño del array");
        }while(size<1 || size >10);
        
        int[] numeros = new int[size];
        for (int i = 0; i < size; i++) {
            numeros[i] = pideDatoNumerico("Introduce número para posición "+ i); 
        }

        return numeros;
    }

    public static void mostrarArray (int[] numeros){
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static double calcularPromedio (int[] numeros){
        double promedio = 0;
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        promedio = suma / numeros.length;

        return promedio;
    }

    public static int[] encontrarExtremos (int[] numeros){
        int [] extremos = new int[2];
        int maximoValor = Integer.MIN_VALUE;
        int minimoValor = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero>maximoValor){
                maximoValor = numero;
            }
            if (numero<minimoValor){
                minimoValor = numero;
            }
        }

        extremos[0]= maximoValor;
        extremos[1]= minimoValor;
        //int [] extremosBis = {maximoValor,minimoValor};
        //return new int[] {maximoValor,minimoValor};
        return extremos;
    }

    public static int[] filtrarMayoresQuePromedio (int[] numeros, double promedio){
        int contador = 0;

        // String numerosString = "";
        // for (int numero : numeros) {
        //     if(numero>promedio){
        //         numerosString += numero+";"; 
        //     }
        // }
        // "8;9;11;".split(";");

        for (int numero : numeros) {
            if(numero>promedio){
                contador++;
            }
        }
        
        int[] mayoresPromedio = new int[contador];
        int posicionArray = 0;
        for (int numero : numeros) {
            if(numero>promedio){
                mayoresPromedio[posicionArray++] = numero;
                //posicionArray++;
            }
        }

        return mayoresPromedio;
    }
}
