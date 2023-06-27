
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(2);
		primeraCuenta.setSaldo(200);

		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.setSaldo(100);
		System.out.println("saldo primera cuenta: " + primeraCuenta.getSaldo());
		System.out.println("saldo segunda cuenta: " + segundaCuenta.getSaldo());
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
		}
			System.out.println("Son el mismo objeto");
	}
}
