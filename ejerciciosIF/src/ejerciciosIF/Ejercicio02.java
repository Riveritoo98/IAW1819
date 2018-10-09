package ejerciciosIF;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	
	// Pedir al usuario dia, mes y año y comprobar que la fecha es correcta.
	// Incluidos bisiestos. Multiplo de 400.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ano: ");
		int ano = sc.nextInt();
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		System.out.println("Dia: ");
		int dia = sc.nextInt();
		
		boolean fechaCorrecta = false;
				
		if (ano >= 0) {
			boolean esBisiesto = ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0));
			if (mes > 0 && mes < 13) {
				switch (mes) {
				case 2:
					if (dia >= 1 && dia <= 29 && esBisiesto)
						fechaCorrecta = true;
					else if (dia >=1 && dia <= 28 && !esBisiesto)
						fechaCorrecta = true;
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >= 1 && dia <= 31)
						fechaCorrecta = true;
					break;
					
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >= 1 && dia <= 30)
						fechaCorrecta = true;
					break;
				default:
					System.out.println("No es válido");
					break;
				}
			}
		}
		if (fechaCorrecta)
			System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + ano);
		else
			System.out.println("Fecha incorrecta: " + dia + "/" + mes + "/" + ano);
		
		sc.close();
	}

}
