package parte4.Ejercicio1;

public class Alumno {

	private String nombre;
	private double media;

	public String getNombre() {
		return nombre;
	}
	
	
	
	public Alumno(String nombre, double media) {
		this.nombre = nombre;
		this.media = media;
		;
	}
	
	
	
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media=media;
	}
	
	

	public String toString() {
		String cadena;
		cadena = ("Nombre: " + nombre + " Media: " + media);
		return cadena;
	}

	public boolean equals(Object AlumnoComparacion) {
		boolean iguales;
		Alumno OtroAlumno = (Alumno) AlumnoComparacion;
		if (this.nombre == OtroAlumno.nombre) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}
}
