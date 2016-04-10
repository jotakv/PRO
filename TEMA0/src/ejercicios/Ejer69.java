package ejercicios;

import java.util.Scanner;

/**
 * 69.-Crear un menú a través de programa Java que permita elegir y realizar
 * cada una de las siguientes opciones sobre dos números que se han de solicitar
 * previamente: a) Suma b) Resta c) Cociente d) división
 * 
 * @author Usuario
 * 
 */
public class Ejer69 {

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);

		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	private double introduceDouble() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String cadena = "";
		double numero = 0;

		do {

			System.out.println("Introduce un número:");
			cadena = teclado.next();

			if (!isNumeric(cadena)) {
				System.err
						.println(cadena
								+ " no es un número. Por favor introduzca solamente valores numérios ");
			}

		} while (!isNumeric(cadena));

		numero = Double.parseDouble(cadena);

		return numero;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejer69 ej = new Ejer69();

		String opcion = "";
		Scanner teclado = new Scanner(System.in);
		double numero = 0;
		double otroNumero = 0;

		do {

			System.out.println("Seleccione una de las operaciones:");
			System.out.println("a) Suma");
			System.out.println("b) Resta");
			System.out.println("c) multiplicacion");
			System.out.println("d) división");
			System.out.println("Pulse 0 para salir del programa");
			opcion = teclado.next();

			if (opcion.equalsIgnoreCase("a") || opcion.equalsIgnoreCase("b")
					|| opcion.equalsIgnoreCase("c")
					|| opcion.equalsIgnoreCase("d")) {
				System.out
						.println("Introduzca el primer valor de la operación:");
				numero = ej.introduceDouble();

				System.out
						.println("Introduzca el segundo valor de la operación:");
				otroNumero = ej.introduceDouble();
			}else if (opcion.equalsIgnoreCase("0")) {
				System.out.println("Saliendo del programa...");
			}
			else {
				System.err.println("Opción no registrada.");
			}

			if (opcion.equalsIgnoreCase("a")) {
				System.out.println(numero + "+" + otroNumero + "="
						+ (numero + otroNumero));
			}else if (opcion.equalsIgnoreCase("b")) {
				System.out.println(numero + "-" + otroNumero + "="
						+ (numero - otroNumero));
			}else if (opcion.equalsIgnoreCase("c")) {
				System.out.println(numero + "*" + otroNumero + "="
						+ (numero * otroNumero));
			}else if (opcion.equalsIgnoreCase("d")) {
				System.out.println(numero + "/" + otroNumero + "="
						+ (numero / otroNumero));
			}

		} while (!opcion.equalsIgnoreCase("0"));

		System.out.println("Fin del programa");

	}

}
