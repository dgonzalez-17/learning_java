
public class TipoVariable {

	public static void main(String[] args) {
		System.out.println("Hola Mundo!!!");

		int edad = 21;
		System.out.println(edad);
		System.out.println("Mi edad es " + edad);

		double salario = 1250.34;
		System.out.println("salario" + salario);
		double salarioMitad = salario / 2;
		System.out.println("salario mitad" + salarioMitad);
		
		
		//CONVERSION DE DATO
		
		double variable1 = 30.09;
		int variable1Entero = (int) variable1; //CASTEO
		System.out.println(variable1Entero);
		
		//DATOS GRANDES
		long numeroGrande = 34289743832479L; 
		short numeroPequeno = 1255;
		byte numeroAunMasPequeno = 99;
		float numeroDecimalPequeno = 2.5F;
		
		
		//OPERACIONES 
		int resultado = (int) variable1 + variable1Entero;
		System.out.println(resultado);
	}
}
