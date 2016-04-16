package ejercicios;

import java.util.Scanner;

public class IntroduceInteger {

	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    Integer.parseInt(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	public static int IntroduceEnteroPositivo() {
		// TODO Auto-generated method stub
		int numero=0;
		String aux="";
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un n�mero:");
			aux=teclado.next();
			if (!isNumeric(aux)) {
				System.err.println("Introduzca solamente valores enteros positivos.");
			}
			
		} while (!isNumeric(aux));
		
		
		
		numero=Integer.parseInt(aux);
		
		
		
		return numero;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		for (int i = 0; i < 4; i++) {
			numero=IntroduceEnteroPositivo();
			System.out.println("*****"+numero);
			
		}
		
		
		 
	}

}
