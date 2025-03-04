package parte4.Ejercicio4;
public class Disco {
	private int codigo;
	private String autor;
	private String titulo;
	private int duracion;
	private Genero genero;
	enum Genero{
		JAZZ,POP,ROCK,BLUES
	}
	public Disco(int codigo,String autor,String titulo,int duracion) {
		
		this.codigo=codigo;
		this.autor=autor;
		this.titulo=titulo;
		this.duracion=duracion;
		
	}
	public String toString() {
		String cadena=("Codigo Disco: " + codigo+" Autor: "+ autor+ " Titulo: "+ titulo +" Duracion: "+duracion+" Genero: "+ genero);
		return cadena;
	}
	
	public boolean equals(Object OtroDisco) {
		Disco DiscoComparacion=(Disco) OtroDisco;
		boolean iguales;
		if(DiscoComparacion.codigo==this.codigo){
			iguales=true;
		}
		else {
			iguales=false;
		}
		return iguales;
	}
	
	public String setGenero(String genero) {
		switch (genero.toUpperCase()) {
		case "JAZZ":
			this.genero = Genero.JAZZ;
			break;
		case "ROCK":
			this.genero = Genero.ROCK;
			break;
		case "BLUES":
			this.genero = Genero.BLUES;
			break;
		case "POP":
			this.genero = Genero.POP;
			break;
		}
		return genero;
	}
	
	public int setCodigo(int codigo) {
		this.codigo=codigo;
		return codigo;
	}
	
	
}
