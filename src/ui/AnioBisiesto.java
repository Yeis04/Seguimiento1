import java.util.Scanner;

public class AnioBisiesto{
	/*
	entradas: año
	salidas: variable boolean que dice si el añomes o no es bisiesto.
	procedimiento: evalua si el residuo de dividir el año entre cuatro es cero, y entre cien no es cero o si entre cuatrocientos es cero.
	*/
	public static boolean bisiesto(int anio){
		
		
		boolean bisiesto = ((anio%4==0) && !(anio%100==0))  ? true : false;
		bisiesto = bisiesto || (anio%400==0);
		return bisiesto;
		
		
	}
	
	public static void main (String[] args){
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("digite el año que desea evaluar");
		int anio = lector.nextInt();
		
		boolean bisiesto = bisiesto(anio);
		
		System.out.println (((bisiesto == true)?  "el anio es bisiesto " : " el anio no es bisiesto"));
		
	}
	
}