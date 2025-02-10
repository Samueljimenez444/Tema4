package parte1.ejercicio3;

public class Rectangulo {
	
	private int x2;
	private int y1;
	private int y2;
	private int x1;
	
	public Rectangulo(int x1,int x2,int y1,int y2){
		if(x1<x2 && y1<y2){
			this.x1=x1;
			this.x2=x2;
			this.y1=y1;
			this.y2=y2;
		}
		else {
			this.x1=0;
			this.x2=0;
			this.y1=1;
			this.y2=1;
		}
		
	}
	public int getX1() {
		return x1;
	}
	public int getX2() {
		return x2;
	}
	public int getY1() {
		return y1;
	}
	public int getY2() {
		return y2;
	}
	public void setX1(int x1) {
		this.x1=x1;
	}
	public void setX2(int x2) {
		this.x2=x2;
	}
	public void setY1(int y1) {
		this.y1=y1;
	}
	public void setY2(int y2) {
		this.y2=y2;
	}
	public void setX1Y2(int x1,int y1) {
		this.x1=x1;
		this.y1=y1;
	}
	public void setX2Y2(int x2,int y2) {
		this.x2=x2;
		this.y2=y2;
	}
	public void setAll(int x1,int y1, int x2, int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public int perimetro() {
		int perimetro = 0;
		int b=x2-x1;
		int h=y2-y1;
		
		perimetro=2*(b+h);
		
		return perimetro;
	}
	public double area() {
		double area=0;
		double h=y2-y1;
		double b=x2-x1;
		area=b*h;
		return area;
	}
}
