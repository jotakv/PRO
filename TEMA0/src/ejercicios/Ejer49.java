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
		double horas=0;
		String s;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Selecione el turno:");
		System.out.println("1. Diurno");
		System.out.println("2. Nocturno ");
		
		s=teclado.next();
		
		
		System.out.println("Introduzca las horas trabajadas por el obrero.");
		s=teclado.next();
		
		horas=Double.parseDouble(s);
		
		if (horas==DIURNO) {
			System.out.println("diurno");
		}else if (horas==NOCTURNO) {
			System.out.println("nocturno");
		}
		
		
		

	}

}
