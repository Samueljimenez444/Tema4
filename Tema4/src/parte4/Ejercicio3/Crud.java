package parte4.Ejercicio3;

import java.util.ArrayList;

public class Crud {
	
 private static ArrayList<Pizza> listaPizzas=new ArrayList<>();
 
 public static String mostrarPizzas() {
	 
	 for(Pizza pizza:listaPizzas) {
		 System.out.println(pizza);
	 }
	 
	return null;
	 
 }
 
 public static void nuevoPedido(Pizza pizza) {
	 listaPizzas.add(pizza);
 }
 
 public static void pizzaServida(Pizza pizza) {
	 for(int i=0;i<listaPizzas.size();i++){
		if(listaPizzas.get(i).equals(pizza)){
			listaPizzas.remove(i);
		}
	 }
	
 }
 
}
