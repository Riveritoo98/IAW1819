package ejerciciosIF;

import java.util.Scanner;

public class Ejercicio01 {

	//Pedir nota de 0 a 10 y mostrarla como insuficiente, suficiente, bien, nnotable y sobresaliente.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("N�: ");
		double nota = sc.nextDouble();
		
		if (nota < 5 && nota >= 0) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Introduce un numero v�lido");
		}
		
		switch ((int)nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
			
		default:
			System.out.println("Valor incorrecto");
			break;
		}
		
		
		sc.close();
	}

}
