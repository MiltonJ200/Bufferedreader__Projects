import java.io.*;

class Tot_sueldob
{
	public static void main (String[] ar)throws IOException
	{float  sb, v1, v2, v3, compra, tpag, tot_vta;//Variable
	BufferedReader T;
	T=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Ingrese su sueldo base: $. ");
	sb=Float.parseFloat(T.readLine());
	System.out.print("Ingrese la venta 1: $. ");
	v1=Float.parseFloat(T.readLine());
	System.out.print("Ingrese venta 2: $. ");
	v2=Float.parseFloat(T.readLine());
	System.out.print("Ingrese venta 3: $. ");
	v3=Float.parseFloat(T.readLine());
	tot_vta=(float)(v1+v2+v3);
	compra=(float)(tot_vta*0.10);
	tpag=(float)(sb+compra);
	System.out.print("Su total que recibirá es $. "+tpag);
		
    }//Modulo
}//Clase