package parte3.Ejercicio2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio2 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner lectura = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		a=lectura.nextInt();
		
		System.out.println("Introduce el Segundo numero");
		b=lectura.nextInt();
		
		c=lectura.nextInt();
		System.out.println("Introduce el Tercer numero");
		
		System.out.println(Media.media(a, b));
		
		System.out.println(Media.media(a, b, c));

	}

}
