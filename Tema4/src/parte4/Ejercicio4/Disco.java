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
	
	

}
