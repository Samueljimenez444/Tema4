package parte1.ejercicio4;

public class Articulo {
	public String nombre;
	public final int iva = 21;
	public int cuantosQuedan;
	public double precio;

	public Articulo(String nombre,double precio,int cuantosQuedan){
		if(nombre!=null && !nombre.isBlank()){
		this.nombre=nombre;
		}
		if(precio>0){
		this.precio=precio;
		}
		if(cuantosQuedan>=0){
		this.cuantosQuedan=cuantosQuedan;
		}
		else {
		this.nombre="error";
		this.precio=0;
		this.cuantosQuedan=0;
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
		this.nombre=nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan=cuantosQuedan;
	}
	
}
