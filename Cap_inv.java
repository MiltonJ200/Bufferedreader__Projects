import java.io.*;

class Cap_inv 
{
	public static void main (String[] ar)throws IOException
	{ float cap_inv, gan;//Variable
	  BufferedReader T;
	  T=new BufferedReader(new InputStreamReader(System.in));
	  
	  System.out.print("Ingrese su capital invertido: $. ");
	  cap_inv=Float.parseFloat(T.readLine());
	  gan=(float)(cap_inv*0.02);
	  System.out.print("Su ganancia total es de $."+gan);
    }//modulo
}//clase