package parte5.Ejercicio1;

import java.lang.System.Logger;

public class Hora {
 private int hora;
 private int minutos;
 private int segundos;
 
 public Hora(int hora, int minutos, int segundos) {
	 
	 if(hora>=0 && hora<=23){
	 this.hora=hora;
	 }
	 
	 if(minutos>=0 && minutos<=59){
	 this.minutos=minutos;
	 }
	
	 if(segundos>=0 && segundos<=59){
	 this.segundos=segundos;
	 }
 }
 
 
 
 public static void aumentarSegundos(int segundos, int minutos, int horas) {
	 segundos++;
	 if(segundos>=60){
		 segundos=0;
		 minutos++;
	 }
	 if(minutos>=60){
		 minutos=0;
		 horas++;
	 }
	 if(horas>=24){
		 horas=0;
		 segundos++;
	 }
 }
 
 
}
