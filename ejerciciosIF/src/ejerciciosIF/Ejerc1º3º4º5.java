package ejerciciosIF;

import java.util.Scanner;

public class Ejerc1�3�4�5 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N� 1: ");
		int n1 = sc.nextInt();
		System.out.println("N� 2: ");
		int n2 = sc.nextInt();
		System.out.println("N� 3: ");
		int n3 = sc.nextInt();
	//Pedir dos n�meros y decfir si son iguales o no.
		if (n1 == n2) {
			System.out.println(n1 + " es igual a " + n2);
		} else {
			System.out.println(n1 + " no es igual a " + n2);
		};
	//Pedir un n�mero e indicar si es positivo o negativo.
		if (n1 > 0) {
			System.out.println(n1 + " es positivo ");
		} else if (n1 < 0) {
			System.out.println(n1 + " es negativo ");
		} else {
			System.out.println(n1 + " es cero ");
		};
	//Pedir dos n�meros y decir si uno es m�ltiplo del otro.
		if (n1 % n2 == 0) {
			System.out.println(n1 + "es multiplo de " + n2);
		} else if (n2 % n1 == 0) {
			System.out.println(n2 +  "es multiplo de" + n1);
		} else {
			System.out.println("No son multiplos");
		};
	//Pedir dos n�meros e indicar cual es el mayor o si son iguales.
		if (n1 > n2) {
			System.out.println(n1 + "es mayor que " + n2);
		} else if (n2 > n1) {
			System.out.println(n2 +  "es mayor que" + n1);
		} else {
			System.out.println(n1 + "es igual que" + n2);
		};
	//Pedir dos n�meros y mostrarlos ordenados de mayor a menor
		
	//Pedir tres n�meros y mostrarlos ordenados de mayor a menor
		
	}
}
