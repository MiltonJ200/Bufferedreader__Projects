import java.io.*;

class inversion_personas
{

	public static void main (String[] ar)throws IOException
	{float inversion_1, inversion_2,inversion_3, inversion_total, persona1, persona2, persona3;//variables 
	 BufferedReader T;
	 T=new BufferedReader(new InputStreamReader(System.in));
	 
	 System.out.print("Ingrese cuanto invierte la primera persona: ");
	 inversion_1=Float.parseFloat(T.readLine());
	 System.out.print("Ingrese cuanto invierte la segunda persona: ");
	 inversion_2=Float.parseFloat(T.readLine());
	 System.out.print("Ingrese cuanto invierte la tercera persona: ");
	 inversion_3=Float.parseFloat(T.readLine());
	 inversion_total=(float)(inversion_1+inversion_2+inversion_3);
	 persona1=(float)(inversion_1*100)/inversion_total;
	 persona2=(float)(inversion_2*100)/inversion_total;
	 persona3=(float)(inversion_3*100)/inversion_total;
	 System.out.print(" Persona 1= $."+persona1);
	 System.out.print(" Persona 2= $."+persona2);
	 System.out.print(" Persona 3= $."+persona3);
	 		
	}//modulo	
}//clase