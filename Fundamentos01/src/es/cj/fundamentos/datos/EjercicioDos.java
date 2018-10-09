package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioDos {

	/*
	 *Defina 2 variables de tipo entero para describir las longitudes de los lados 
	 *lados de un rectangulo. El programa debe calcular y mostrar las
	 *longitudes de los lados, el perímetro y el área del rectángulo.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	private static Scanner sc1 = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Base: ");
		double base = sc.nextDouble();
		System.out.println("Altura: ");
		double altura = sc1.nextDouble();
		double area = base * altura;
		double perimetro = (base * 2) + (altura * 2);
		System.out.println(area);
		System.out.println(perimetro);
	}
}