package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Leer n números ordenados crecientemente. Pedir al usuario un número y buscarlo en la tabla. Se debe 
		// mostrar la posición en la que se encuentra. Si no está, indicarlo con un mensaje
	//Variables	
		System.out.println("Indica los números que quieres en la tabla.");
		int totalnumeros = sc.nextInt();
		int numero [] = new int[totalnumeros];
	//Meter números	
		for (int i = 0; i < numero.length; i++) {
			numero[i] = new Random().nextInt(10);
		}
	//Ordenar crecientemente y buscar un numero pedido por usuario.
		Arrays.sort(numero);
		System.out.println(Arrays.toString(numero));
		System.out.println("Indique el numero que quiere buscar: ");
		int number = sc.nextInt();
		System.out.println("El " + number + " encuentra la posición: " + Arrays.binarySearch(numero, number));
		
	}

}
