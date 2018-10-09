package Semanal;

import java.util.Scanner;

public class Ejercicio1 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras.
		
		System.out.println("Numero: ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num > 0 && num < 10) {
				System.out.println("El numero es de 1 cifra.");
			} else if (num >= 10 && num < 100) {
				System.out.println("El numero es de 2 cifras.");
			} else if (num >= 100 && num < 1000) {
				System.out.println("El numero es de 3 cifras.");
			} else if (num >= 1000 && num < 10000) {
				System.out.println("El numero es de 4 cifras");
			} else {
				System.out.println("El numero es mayor de 4 cifras");
			}
		} else {
			System.out.println("El numero es negativo o 0");
		}
		
		sc.close();
	}

}
