
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente yesid = new Cliente();
		yesid.setNombre("Yesid");
		yesid.setDocumento("1000002593");
		yesid.setTelefono("3026039088");
		
		
		Cuenta cuentaYesid = new Cuenta(3);
		cuentaYesid.setAgencia(1);
		cuentaYesid.setTitular(yesid);
		System.out.println(cuentaYesid.getTitular().getNombre());
	}
}
