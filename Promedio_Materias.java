import java.io.*;

class Promedio_materias
{
	public static void main (String[] ar)throws IOException 
	{float examen_mat, tm1, tm2, tm3, examen_fis, tf1, tf2, examen_qui, tq1, tq2, tq3, promedio_mat, promedio_fis, promedio_qui, promedio_total;
	BufferedReader T;
	T=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Ingrese calificacion de examen de matematicas: ");
	examen_mat=Float.parseFloat(T.readLine());
	System.out.print("Ingrese tarea 1 de matematicas: ");
	tm1=Float.parseFloat(T.readLine());
	System.out.print("Ingrese tarea 2 de matematicas: ");
	tm2=Float.parseFloat(T.readLine());
	System.out.print("Ingrese tarea 3 de matematicas: ");
	tm3=Float.parseFloat(T.readLine());
	System.out.print("Ingrese calificacion de examen de Fisica: ");
	examen_fis=Float.parseFloat(T.readLine());
	System.out.print("Ingrese tarea 1 de fisica: ");
	tf1=Float.parseFloat(T.readLine());
	System.out.print("Ingrese tarea 2 de fisica: ");
	tf2=Float.parseFloat(T.readLine());
	System.out.print("Ingrese calificacion de examen de Quimica: ");
	examen_qui=Float.parseFloat(T.readLine());
	System.out.print("Ingrese tarea 1 de quimica: ");
	tq1=Float.parseFloat(T.readLine());
	System.out.print("Ingrese tarea 2 de quimica: ");
	tq2=Float.parseFloat(T.readLine());
	System.out.print("Ingrese tarea 3 de quimica: ");
	tq3=Float.parseFloat(T.readLine());
	promedio_mat=(float)(examen_mat*0.9+(tm1+tm2+tm3)/3*0.1);
	promedio_fis=(float)(examen_fis*0.8+(tf1+tf2)/2*0.2);
	promedio_qui=(float)(examen_qui*0.85+(tq1+tq2+tq3)/3*0.15);
	promedio_total=(float)(promedio_mat+promedio_fis+promedio_qui)/3;
	System.out.println("El promedio total de matematicas es: "+promedio_mat);
	System.out.println("El promedio total de fisica es: "+promedio_fis);
	System.out.println("El promedio total de quimica es: "+promedio_qui);
	System.out.println("El promedio total es: "+ promedio_total);
    }//modulo
}//clase