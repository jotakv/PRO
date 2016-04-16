package ejercicios;

import java.util.Scanner;

/**
 * 68 .- Dise�ar un algoritmo que sume los N primeros n�meros primos.
 * 
 * @author Usuario
 * 
 */
public class Ejer68 {

	public static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static int IntroduceEnteroPositivo() {
		// TODO Auto-generated method stub
		int numero = 0;
		String aux = "";
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduce un n�mero:");
			aux = teclado.next();
			if (!isNumeric(aux)) {
				System.err
						.println("Introduzca solamente valores enteros positivos.");
			}

		} while (!isNumeric(aux));

		numero = Integer.parseInt(aux);

		return numero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 97;
		int veces = 10000;
		boolean isPrimo = true;
		int contador = 0;
		int suma=0;
		
		System.out.println("Introduzca un n�mero N;");
		
		
		numero = IntroduceEnteroPositivo();

		System.out.println("Los " + numero + " primero n�meros primos son:");
		for (int j = 2; j < veces; j++) {
			isPrimo = true;
			for (int i = 2; i < j; i++) {
				/*
				 * System.out.println("Dividendo=divisor*(cociente+resto)");
				 * System.out.println(j + "=" + i + "*(" + (j / i) + "+" + j % i
				 * + ")"); System.out.println(j % i);
				 */
				if (j % i == 0) {
					isPrimo = false;
				}
			}

			if (isPrimo && contador < numero) {
				suma=suma+j;
				System.out.println("El n�mero " + j + " es primo.");
				contador++;
			}
		}
		
		System.out.println("La suma de los "+numero+" primeros n�meros primos es:"+ suma);
		

	}

}
