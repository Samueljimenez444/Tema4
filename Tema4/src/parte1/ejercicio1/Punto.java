package parte1.ejercicio1;

public class Punto {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void SetXY(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void desplaza(int dx,int dy){
		dx+=x;
		dy+=y;
		this.x=dx;
		this.y=dy;
	}
	public double distancia(Punto p) {
		double dx=this.x-p.x;
		double dy=this.y-p.y;
		double distancia=Math.sqrt(dx*dy +dx*dy);
		return distancia;
	}
	public String toString() {
		return (this.x+" "+this.y);
	}
	
	
}
