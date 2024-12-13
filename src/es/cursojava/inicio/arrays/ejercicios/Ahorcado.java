package es.cursojava.inicio.arrays.ejercicios;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		
		String [] palabras = {"destornillador","monitor","pirata","murciélago","metamorfosis"};
		
		int random = (int)(Math.random()*5);
		String palabraJuego = palabras[random];
		
		String[] palabraOculta = palabraJuego.split("");
//		System.out.println(palabraJuego);
//		System.out.println(palabraOculta.length);
		
		int vidas = 6;
		String letrasPropuestas = "";		
		int contadorAciertos = 0;
		
		do {
			//boolean palabraAcertada = (contadorAciertos==palabraOculta.length);
			for (String letra : palabraOculta) {
				if (letrasPropuestas.contains(letra)) {
					System.out.print(letra +" ");
				}else {
				//	palabraAcertada = false;
					System.out.print("_ ");
				}
			}
			
			if(contadorAciertos==palabraOculta.length) {
				System.out.println("\nHAS GANADO!!!!");
				break;
			}
			System.out.println("\nYa has introducido "+letrasPropuestas);
			
			System.out.println("\nIntroduce una letra");
			Scanner scan = new Scanner(System.in);
			String letraIntroducida = scan.nextLine();
			letrasPropuestas+=letraIntroducida;
			
			boolean acierto = false;
			for (String letra : palabraOculta) {
				if (letra.equals(letraIntroducida)) {
					contadorAciertos++;
					acierto = true;
				}
			}
			
			if (!acierto) {
				System.out.println("La letra "+letraIntroducida + " no está en la palabra oculta");
				vidas--;
			}
			
			System.out.println("Te quedan "+vidas + " vidas");
			if (vidas==0) {
				System.out.println("Te has quedado sin vidas. Has perdido!!! JAJAJAJA");
			}
		}
		while(vidas>0);
		//while(vidas>0 && contadorAciertos<palabraOculta.length);
		
	}

}

