package ejercicios;

import java.util.Scanner;

/**
 * 49�.-  Los empleados de una f�brica trabajan en dos turnos,
 *  diurno y nocturno. Realizar un programa Java que permita
 *   calcular el sueldo diario de un trabajador de acuerdo 
 *   con los siguientes puntos:
	a.-  La tarifa del turno de diurno es 500 pts/h
	b.-  la tarifa del turno de nocturno es 800 pts/h 

 * @author Usuario
 *
 */
public class Ejer49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double DIURNO=500;
		final double NOCTURNO=800;
		double tarifa = 0;
		double horas=0;
		String s;
		Scanner teclado=new Scanner(System.in);
		double salario=0;
		
		
		System.out.println("Introduzca las horas trabajadas por el obrero.");
		s=teclado.next();
		
		horas=Double.parseDouble(s);
		
		s="";
		System.out.println("Selecione el turno:");
		System.out.println("1. Diurno");
		System.out.println("2. Nocturno ");
		
		s=teclado.next();
		if (s.equalsIgnoreCase("1")) {
			System.out.println("diurno");
			salario=DIURNO*horas;
		}else if (s.equalsIgnoreCase("2")) {
			System.out.println("nocturno");
			salario=NOCTURNO*horas;
		}
		
		 
		
		
		System.out.println("Salario del trabajador: "+salario+" pts");
		
		

	}

}
