package parte3.Ejercicio5;
import java.util.*;
public class numerosAleatorios {
	public static void numeros(int a) {
		Random rand = new Random();
		int numeros = rand.nextInt(0, 2);
		for (int i = 0; i < a; i++) {
			System.out.println(numeros);
			numeros = rand.nextInt(0, 2);
		}
	}
	public static void numeros(int cantidad,int valorMax) {
		Random rand=new Random();
		int numeros=rand.nextInt(0,++valorMax);
		for(int i=0;i<cantidad;i++){
			System.out.println(numeros);
			 numeros=rand.nextInt(0,valorMax);
		}
	}
	public static void numeros(int cantidad,int valorMax,int valorMin) {
		Random rand=new Random();
		int numeros=rand.nextInt(valorMin,++valorMax);
		for(int i=0;i<cantidad;i++){


			System.out.println(numeros);
			 numeros=rand.nextInt(valorMin,valorMax);
		}
	}
	}