package parte1.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Punto punto1 = new Punto(5, 10);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);
		int dx;
		int dy;
		Scanner lectura=new Scanner(System.in);
		
		punto1.setX(5);
		punto1.setY(10);
		System.out.println(punto1.getX() + " " + punto1.getY());

		System.out.println(punto2.getX() + " " + punto2.getY());

		System.out.println(punto3.getX() + " " + punto2.getY());

		System.out.println(punto3.getX() + punto2.getX());

		System.out.println(punto1.getY() - punto2.getY());
		
		System.out.println("Introduce cuanto quieres desplazar el punto 1 en x");
		dx=lectura.nextInt();
		System.out.println("Introduce cuanto quieres desplazar el punto 1 en x");
		dy=lectura.nextInt();
		
		punto1.desplaza(dx, dy);
		
		System.out.println("Calculo distancia entre nuevo p1 y p3");
		System.out.println(punto1.distancia(punto3));
		
		System.out.println("Este es el nuevo p1");
		System.out.println(punto1);
		
		lectura.close();
	}
}
