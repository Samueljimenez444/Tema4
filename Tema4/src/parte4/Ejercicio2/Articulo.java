package parte4.Ejercicio2;

public class Articulo {

	private String nombre;
	private final int iva = 21;
	private int cuantosQuedan;
	private double precio;
	

	public Articulo(String nombre, double precio, int cuantosQuedan) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			this.nombre = "error";
			this.precio = 0;
			this.cuantosQuedan = 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public int getIva() {
		return iva;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}
	
	public String toString() {
	String cadena;
	cadena=("Nombre Articulo: "+ nombre +" Precio: " +precio+" Stock: "+ cuantosQuedan);
	return cadena;	
	}
	
	public boolean equals(Object articuloComparacion) {
		boolean iguales;
		Articulo otroArticulo=(Articulo) articuloComparacion;
		if(otroArticulo.nombre.equals(otroArticulo.nombre)){
			iguales=true;
		}
		else {
			iguales=false;
		}
		return iguales;
	}

}
