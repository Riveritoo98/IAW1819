package es.cj.semanal;

import java.util.Scanner;

public class EjercicioSemanal03 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Escriba un programa que lea un n�mero entero por el teclado y muestre en la pantalla si es un n�mero
		// abundante. Un n�mero es abundante si la suma de sus divisores es mayor que �l. Ejemplo: 12 es abundante 
		// ya que sus divisores son 1, 2, 3, 4 y 6 cuya suma es 16 que es mayor que 12.
		int suma = 0;
		System.out.println("N�: ");
		int num1 = sc.nextInt();
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				suma = suma + i;
				
			}
	}
		if (suma > num1) {
			System.out.println("El n�mero es abundante");
		} else {
			System.out.println("El numero no es abundante");
		}
}
}