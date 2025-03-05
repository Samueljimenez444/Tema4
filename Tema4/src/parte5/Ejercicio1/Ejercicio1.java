package parte5.Ejercicio1;


import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int eleccion;
		
		int hora=0;
		
		int minutos=0;
		
		int segundos=0;
		
		Hora horaActual=null;
		
		Scanner lectura=new Scanner(System.in);
		
		do {
			
			System.out.println("-- MENU --");
			System.out.println("1 Mostrar Hora.");
			System.out.println("2 Cambiar Hora.");
			System.out.println("3 Aumentar Hora(+1 Segundo).");
			eleccion=lectura.nextInt();
			
			switch(eleccion) {
			case 1:
				
				System.out.println(horaActual);
				
				break;
				
			case 2:
				
				System.out.println("Introduce las horas");
				hora=lectura.nextInt();
				
				System.out.println("Introduce los minutos");
				minutos=lectura.nextInt();
				
				System.out.println("Introduce los segundos");
				segundos=lectura.nextInt();
				
				horaActual=new Hora(hora,minutos,segundos);
				
				break;
				
			case 3:
				
				horaActual.aumentarSegundos();
				
				break;
			}
			
		}while(eleccion!=0);
		
		lectura.close();

	}

}
