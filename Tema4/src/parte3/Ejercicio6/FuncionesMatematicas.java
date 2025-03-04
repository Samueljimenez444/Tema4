package parte3.Ejercicio6;
public class FuncionesMatematicas {
public static int mates(int a) {
	int resultado;
	if(a==0){
		resultado=0;
	}
	else {
		resultado=a+mates(a-1);
	}
	return resultado;
}
public static double mates(double a, int n) {
	double resultado=0;
	if(n==0){
		resultado=1;
	}
	else {
		resultado=a*mates(a,n-1);
	}
	
	return resultado;
}
public static int fibonacci(int a) {
	int resultado;
	if(a==0){
		resultado=0;
	}
	else if(a==1){
		resultado=1;
	}
	else {
		resultado=fibonacci(a-1)+fibonacci(a-2);
	}
	
	return resultado;
}
}
