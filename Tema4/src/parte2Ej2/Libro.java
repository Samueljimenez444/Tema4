package parte2Ej2;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	private Genero genero;
	
	enum Genero {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}
	
	public Libro(String titulo, String autor, int ejemplares, int prestados,String genero) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;
		}
		
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		
		switch(genero.toUpperCase()) {
		case "NARRATIVO": this.genero=Genero.NARRATIVO;
		break;
		case "DRAMATICO": this.genero=Genero.DRAMATICO;
		break;
		case "LIRICO": this.genero=Genero.LIRICO;
		break;
		case "DIDACTICO": this.genero=Genero.DIDACTICO;
		break;
		case "POETICO": this.genero=Genero.POETICO;
		break;
		}
	}
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;
		}
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
	}

	public Libro(String titulo, String autor) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;
		}
	}
	
	public boolean prestamo(int prestados, int ejemplares) {
		boolean prestado;
		if(ejemplares-prestados>=0){
			prestado=true;
		}
		else {
			prestado=false;
		}
		return prestado;
	}
	public boolean devolucion(int devueltos,int ejemplares) {
		boolean devolver;
		if(prestados==0){
			devolver=false;
			this.prestados-=devueltos;
		}
		else {
			devolver=true;
		}
		return devolver;
	}
	
}
