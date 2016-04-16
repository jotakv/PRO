package ejercicios;

public class IsInteger {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux="2";
		System.out.println(isNumeric(aux));

	}

}
