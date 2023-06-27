
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaYesid = new Cuenta(3);
		//cuentaYesid.titular.nombre = "Diego";
		// System.out.println(cuentaYesid.titular.nombre);
		// TITULAR ES NULL, GENERA ERROR, NO PUEDO OBTENER VALORES DE UN OBJETO NULL

		Cuenta cuentaDeiby = new Cuenta(4);
		cuentaDeiby.setTitular(new Cliente());
		// Se puede inicializar una referencia, es decir, crea un objeto y lo referencia
		// a este campo
	}
}
