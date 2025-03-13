package examenObjetosCoches;

import java.util.Objects;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private double descuento;
	private double precio;
	private Estado estado;
	enum Estado{
		NUEVO,SEMINUEVO,USADO
	}
	
	public Coche(String matricula, String marca,String modelo,double precio,double descuento,String estado) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		estado=estado.toUpperCase();
		switch(estado) {
		case "NUEVO","SEMINUEVO","USADO":
		this.estado=Estado.valueOf(estado);
		break;
	}
	}
	
	public void calcularDescuento(String estado) {
		switch(estado) {
		case "NUEVO":
		descuento=1.0;
		break;
		
		case "SEMINUEVO":
		descuento=0.10;
		break;
		case "USADO":
		descuento=0.20;
	
		break;
		}
		
		
	}
	
	public double precioFinal() {
		precio=precio*descuento;
		return precio;
	}
	
	public String toString() {
		String cadena;
		cadena=("Matricula: " + matricula + " Marca: " + marca + " Modelo:" + modelo +" Precio: " + precio +" Estado Vehiculo: " + estado);
		return cadena;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object coche) {
	boolean iguales=false;
		Coche otroCoche = (Coche) coche;
		if(this.matricula.equals(otroCoche.matricula)) {
			iguales=true;
		}
		return iguales;
	}
	

}
