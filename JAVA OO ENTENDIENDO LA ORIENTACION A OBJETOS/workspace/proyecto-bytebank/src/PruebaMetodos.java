
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(2);
		cuenta.setSaldo(300);
		cuenta.depositar(200);
		System.out.println(cuenta.getSaldo());
		
		
		cuenta.retirar(100);
		System.out.println(cuenta.getSaldo());
		
		Cuenta cuentaSofia = new Cuenta(3);
		cuentaSofia.depositar(1000);
		cuentaSofia.transferir(400, cuenta);
	}
}
