package parte5.Ejercicio1;



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
 
 public int getHoras(int horas) {
	 
	 return horas;
 }
 
 public int getSegundos(int segundos) {
	 
	 return segundos;
 }
 
 public int getMinutos(int minutos) {
	 
	 return minutos;
 }
 
 public void setMinutos(int minutos) {
	 this.minutos=minutos;
 }
 
 public void setHoras(int hora) {
	 this.hora=hora;
 }
 
 public void setSegundos(int segundos) {
	 this.segundos=segundos;
 }

 
 public void aumentarSegundos() {
	segundos++;
	 if(segundos>=60){
		 segundos=0;
		 minutos++;
	 }
	 if(minutos>=60){
		 minutos=0;
		 hora++;
	 }
	 if(hora>=24){
		 hora=0;
	 }
 }
 
 public String toString() {
	 String cadena;
	 cadena=("Horas: " + hora + " Minutos: " +minutos+ " Segundos: " + segundos);
	 return cadena;
 }
 
 
}
