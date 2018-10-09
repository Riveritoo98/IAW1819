package ejerciciosIF;

import java.util.Scanner;

public class Ejerc9 {
	
	private static Scanner sc = new Scanner(System.in);
	
	//Pedir día, mes y año y mostrar la fecha del día siguiente. Suponer que todos los meses son de 30 días

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ano: ");
		int ano = sc.nextInt();
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		System.out.println("Dia: ");
		int dia = sc.nextInt();

		if (ano >= 0)
			switch (mes) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				if (dia > 0 && dia <= 30)
					fecha = ;
				break;

			default:
				System.out.println("No es válido");
				break;
			}
		if (dia >= 1 && dia < 30) {
			System.out.println(dia + 1);
		} else {
			System.out.println(a);
		}
		
	}

}
