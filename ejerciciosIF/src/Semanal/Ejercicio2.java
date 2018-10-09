package Semanal;

import java.util.Scanner;

public class Ejercicio2 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		//Si trabaja 40 horas o menos se le paga 16€ por hora 
		//Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra.
		
		System.out.println("Horas: ");
		int horas = sc.nextInt();
		
		if (horas < 41) {
			System.out.println(16 * horas + " Euros");
		} else {
			System.out.println((40 * 16) + (horas - 40) * 20 + " Euros");
		}
		
		sc.close();
	}

}
