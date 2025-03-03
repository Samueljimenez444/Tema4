package parte4.Ejercicio1;

import java.util.ArrayList;


public class Crud {

	private static ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	public static void añadirAlumno(String nombre, double media) {
		Alumno alumno = new Alumno(nombre, media);
		listaAlumnos.add(alumno);
	}

	public static void mostrarLista() {
		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno);

		}
	}
	public static void modificarAlumno(String nombre,double media) {
		for (Alumno alumno : listaAlumnos) {
			if(alumno.getNombre()==nombre){
				System.out.println("Encontrado y modificado correctamente");
				alumno.setMedia(media);
			}
		}
	}
	public static void eliminarAlumno(String nombre) {
		for (int i=0;i<listaAlumnos.size();i++) {
			if(listaAlumnos.get(i).getNombre().equals(nombre)){
				System.out.println("Alumno borrado correctamente");
				listaAlumnos.remove(i);
			}
		}
	}
}
