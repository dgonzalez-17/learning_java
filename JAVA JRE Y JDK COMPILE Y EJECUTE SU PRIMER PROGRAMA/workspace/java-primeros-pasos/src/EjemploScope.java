
public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Hallo world");
		int edad = 21;
		int cantidadPersonas = 2;

		boolean esPareja = cantidadPersonas > 1;
		if (edad >= 18 & esPareja) {
			System.out.println("Usted puede entrar");
		} else {

			System.out.println("Usted no está permitido para entrar");
		}
	}
}
