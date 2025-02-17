package parte3.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int a;
		
		int b;
		
		Scanner lectura = new Scanner(System.in);
		
		System.out.println("Introuce el primer numero");
		
		a=lectura.nextInt();
		
		System.out.println("Introduce el segundo numero");
		
		b=lectura.nextInt();
		
		System.out.println(SumaEnteros.sumaEnteros(a));
		
		System.out.println(SumaEnteros.sumaEnteros(a, b));
		
		lectura.close();
	}

}
