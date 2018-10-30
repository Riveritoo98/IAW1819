package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

public class Ejercicio03 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer tabla de n números y guardar en otra tabla los pares y en otra tabla los impares.
		int tamanyo;
		int pares;
		int impares;
		
		do {
			System.out.println("Nº de elementos: ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		
	}

}
