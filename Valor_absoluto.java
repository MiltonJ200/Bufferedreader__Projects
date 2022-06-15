import java.io.*;

class Valor_absoluto
{
	public static void main (String[] ar)throws IOException 
	{Float numero, resultad;//Variable
	BufferedReader T;
	T=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Ingrese un numero: ");
	numero=Float.parseFloat(T.readLine());
	if (numero<0){
		resultad=(float)(numero*(-1));	
	}else{
		resultad=(float)numero;
	}
	System.out.println("El valor absoluto es: "+resultad);
	}//modulo
}//clase

