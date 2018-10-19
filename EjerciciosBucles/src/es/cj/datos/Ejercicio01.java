package es.cj.datos;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir 10 numeros, mostrar la media de los positivos, media de los negativos y cantidad de ceros.
		
		double sumapositivos = 0, sumanegativos = 0;
		int contadorpositivos = 0, contadornegativos = 0, contadorceros = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nº: ");
			double numero = sc.nextDouble();
			
			if (numero > 0) {
				sumapositivos = sumapositivos + numero; // es lo mismo que * sumapositivos += numero *
				contadorpositivos++;
			} else if (numero < 0) {
				sumanegativos = sumanegativos + numero;
				contadornegativos++;
			} else {
				contadorceros++;
			}
		}
		System.out.println("Media Positivos: " + (sumapositivos/contadorpositivos));
		System.out.println("Media Negativos: " + (sumanegativos/contadornegativos));
		System.out.println("Contador de Ceros: " + contadorceros);
		sc.close();
	}

}
