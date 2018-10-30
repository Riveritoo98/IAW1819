package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Leer n números enteros, guardarlos en la tabla y mostrar la media de los positivos, media negativos 
		// y el número de ceros.
		
		System.out.println("Indica los números que quieres en la tabla");
		int totalnumeros = sc.nextInt();
		int numero [] = new int[totalnumeros];
		int sumaP = 0, sumaN = 0, contP = 0, contN = 0, contC = 0, totalP = 0, totalN = 0;
		
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Numero " + (i + 1) + ":");
			numero[i] = sc.nextInt();
			if (numero[i] < 0) {
				contN++;
				sumaN = sumaN + numero[i];
				
			} else if (numero[i] > 0){
				contP++;
				sumaP = sumaP + numero[i];
			} else {
				contC++;
			}
			
		}	
		totalN = sumaN/contN;
		totalP = sumaP/contP;
		System.out.println("Suma de negativos: " + totalN);
		System.out.println("Contador de ceros: " + contC);
		System.out.println("Suma de positivos: " + totalP);
	}

}