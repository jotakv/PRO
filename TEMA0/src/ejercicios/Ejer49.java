package ejercicios;

import java.util.Scanner;

/**
 * 49�.-  Los empleados de una f�brica trabajan en dos turnos,
 *  diurno y nocturno. Realizar un programa Java que permita
 *   calcular el sueldo diario de un trabajador de acuerdo 
 *   con los siguientes puntos:
	a.-  La tarifa del turno de diurno es 500 pts/h
	b.-  la tarifa del turno de nocturno es 800 pts/h 
	c.-  En caso de trabajar un domingo la tarifa se incrementa
	 en 200 pts/h para el turno de diurno y 300 pts/h para el turno de nocturno.
 * @author Usuario
 *
 */
public class Ejer49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double DIURNO=500;
		final double NOCTURNO=800;
		final double DOMINGONOCTURNO=300;
		final double DOMINGODIURNO=200;
		 
		double horas=0;
		String s;
		 
		boolean isDiurno=false;
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
			 
			isDiurno=true;
		}else if (s.equalsIgnoreCase("2")) {
			System.out.println("nocturno");
			salario=NOCTURNO*horas;
			 
			isDiurno=false;
		}
		s="";
		
		boolean condicion=true;
		do {
			System.out.println("�Ha trabajado el domingo?. S/N");
			s=teclado.next();
			if (s.equalsIgnoreCase("s")) {
				condicion=true;
				
				if (isDiurno==true) {
					salario=salario+DOMINGODIURNO;
				}else {
					//isDiurno==false
					salario=salario+DOMINGONOCTURNO;
					
				}
				
			}else if (s.equalsIgnoreCase("n")) {
				condicion=true;
				
			}else {
				System.out.println("Por favor solo puede seleccionar S/N. D�nde S significa Si y N siginifica No");
				condicion=false;
			}
			
		} while (condicion==false);
		 
		
		
		System.out.println("Salario diario del trabajador: "+salario+" pts");
		
		teclado.close();

	}

}
