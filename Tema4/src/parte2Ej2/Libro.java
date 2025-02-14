package parte2Ej2;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;

	private Genero genero;

	enum Genero {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}

	public Libro(String titulo, String autor, int ejemplares, String genero) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;
		}

		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}

		switch (genero.toUpperCase()) {
		case "NARRATIVO":
			this.genero = Genero.NARRATIVO;
			break;
		case "DRAMATICO":
			this.genero = Genero.DRAMATICO;
			break;
		case "LIRICO":
			this.genero = Genero.LIRICO;
			break;
		case "DIDACTICO":
			this.genero = Genero.DIDACTICO;
			break;
		case "POETICO":
			this.genero = Genero.POETICO;
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

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public boolean prestamo(int ejemplares) {
		boolean prestado;
		if (ejemplares >= 0) {
			prestado = true;
			this.ejemplares -= 1;

		} else {
			prestado = false;
		}
		return prestado;
	}

	public boolean devolucion(int devueltos, int ejemplares) {
		boolean devolver;
		if (ejemplares <= 0) {
			devolver = false;

		} else {
			this.ejemplares++;

			devolver = true;
		}
		return devolver;
	}

	public String toString() {
		String cadena;
		cadena = ("Titulo: " + titulo + " Autor: " + autor + " Ejemplares: " + ejemplares + " Genero: " + genero);
		return cadena;
	}

	public boolean equals(Object libro1) {
		boolean iguales;
		Libro otroLibro1 = (Libro) libro1;
		if (this.autor.equals(otroLibro1.autor) && this.titulo.equals(otroLibro1.titulo)) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;
	}
}
