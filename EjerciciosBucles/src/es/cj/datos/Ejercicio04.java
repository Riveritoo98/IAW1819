package es.cj.datos;

import java.util.Scanner;

public class Ejercicio04 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un número y calcular su factorial.
		int numero = sc.nextInt();
		int hola = 1;
		for (int i = numero; i > 0; i--) {
			hola = hola * i;
		}
		System.out.println(hola);
		sc.close();
	}

}
