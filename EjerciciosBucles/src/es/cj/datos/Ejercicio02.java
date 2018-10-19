package es.cj.datos;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa que muestre y calcule el producto de los n primeros números impares
		
		int numero = sc.nextInt();
		int producto = 1;
		int i = 1;
		int contador = 0;

		
		while (numero > contador) {
			producto = producto * i;
			i += 2;
			contador++;
		};
		System.out.println("awd= " + producto);
		sc.close();
	}

}