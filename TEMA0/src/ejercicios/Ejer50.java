package ejercicios;

import java.util.Scanner;

/**
 * 50�.- Se pide realizar un programa Java que realice la operaci�n de suma o
 * resta de 2 n�meros le�dos por teclado en funci�n de la respuesta S/R a un
 * mensaje de petici�n de datos.
 * 
 * @author Usuario
 * 
 */
public class Ejer50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String respuesta="";
		String s;
		double numero;
		double numero2;
		double resultado;
		Scanner teclado= new Scanner(System.in);
		do {
			do {
				System.out.println("Selecione Suma/Resta,(S/R)");
				respuesta=teclado.next();
				
			} while (!respuesta.equalsIgnoreCase("S")&&!respuesta.equalsIgnoreCase("R"));
			do {
				System.out.println("�M�s datos? SI/NO, (S/N)");    
				s=teclado.next();
				
			} while (!s.equalsIgnoreCase("S")&&!s.equalsIgnoreCase("N"));
			
		} while (s.equalsIgnoreCase("si"));
		
		teclado.close();
	}

}