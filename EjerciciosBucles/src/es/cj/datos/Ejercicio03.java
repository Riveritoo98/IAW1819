package es.cj.datos;

import java.util.Scanner;

public class Ejercicio03 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un programa que lea un número desde el teclado y realice la suma de los 100 números siguientes, 
		// mostrando el resultado en pantalla.
		int o = 0;
		int numero = sc.nextInt();
		for (int i = (numero + 1); i < (numero + 101); i++) {
			o = o + i;
		}
		System.out.println(o);
		sc.close();
	}

}
