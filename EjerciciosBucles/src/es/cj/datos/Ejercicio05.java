package es.cj.datos;

import java.util.Scanner;

public class Ejercicio05 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dise�e una aplicaci�n que muestre las tablas de multiplicar del 1 al 10. Adem�s, solicite al usuario que 
		// tabla quiere mostrar.
		int numero = sc.nextInt();
		
		for (int i = 1; i < 11; i++) {
			
			System.out.println(i * numero);
		}
		sc.close();
		
		
	}

}
