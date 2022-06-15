import java.io.*;

class Calificacion
{
	public static void main (String[] ar)throws IOException 
	{float c1, c2, c3, ef, tf, prom, ppar, pef, ptf, cf;//variables
	 BufferedReader T;
	 T=new BufferedReader(new InputStreamReader(System.in));
	 
	 System.out.print("Ingrese su calificacion 1: ");
	 c1=Float.parseFloat(T.readLine());
	 System.out.print("Ingrese su calificacion 2: ");
	 c2=Float.parseFloat(T.readLine());
	 System.out.print("Ingrese su calificaion 3: ");
	 c3=Float.parseFloat(T.readLine());
	 System.out.print("Ingrese su examen final: ");
	 ef=Float.parseFloat(T.readLine());
	 System.out.print("Ingrese trabajo fianl: ");
	 tf=Float.parseFloat(T.readLine());
	 prom=(float)(c1+c2+c3)/3;
	 ppar=(float)(prom*0.55);
	 pef=(float)(ef*0.30);
	 ptf=(float)(tf*0.15);
	 cf=(float)(ppar+pef+ptf);
	 System.out.print("Su calificacion final es de: "+cf);
	 
    }//modulo
}//clase