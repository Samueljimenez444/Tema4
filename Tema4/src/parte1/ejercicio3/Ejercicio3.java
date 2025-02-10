package parte1.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int x1;
		int x2;
		int y1;
		int y2;
		Scanner lectura = new Scanner(System.in);

		System.out.println("Introduce los puntos del rectangulo1");
		System.out.println("Introduce el punto x1");
		x1=lectura.nextInt();
		System.out.println("Introduce el punto x2");
		
		x2=lectura.nextInt();
		System.out.println("Introduce el punto y1");
		
		y1=lectura.nextInt();
		System.out.println("Introduce el punto y2");
		
		y2=lectura.nextInt();
		Rectangulo rectangulo1 = new Rectangulo(x1,x2,y1,y2);
		
		rectangulo1.setAll(x1, y1, x2, y2);
		System.out.println("Puntos del rectangulo rectangulo1");
		
		System.out.println("Introduce los puntos del rectangulo2");
		System.out.println("Introduce el punto x1");
		x1=lectura.nextInt();
		System.out.println("Introduce el punto x2");
		x2=lectura.nextInt();

		System.out.println("Introduce el punto y1");
		y1=lectura.nextInt();

		System.out.println("Introduce el punto y2");
		y2=lectura.nextInt();
		Rectangulo rectangulo2 = new Rectangulo(x1,x2,y1,y2);
		
		rectangulo2.setAll(x1, y1, x2, y2);
		System.out.println("Puntos del rectangulo "+ rectangulo2);
		
		System.out.println(rectangulo1.perimetro());
		System.out.println(rectangulo2.perimetro());
		
		System.out.println(rectangulo1.area());
		System.out.println(rectangulo2.area());

		lectura.close();

	}

}
