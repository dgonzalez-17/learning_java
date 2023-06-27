
public class PruebaAcceso {
public static void main(String[] args) {
//	Cuenta cuenta = new Cuenta();
//	cuenta.saldo = 200;
//	cuenta.retirar(300);
//	cuenta.saldo = cuenta.saldo - 300;
//	System.out.println(cuenta.saldo);
	//PUEDO CAMBIARLOS Y PARA ESO ES EL MODIFICADOR DE ACCESO, PARA LA ENCAPSULACIÓN
	
	Cuenta cuenta = new Cuenta(4);
	cuenta.retirar(300);
	System.out.println(cuenta.getSaldo());
	
	cuenta.setAgencia(22);
	System.out.println(cuenta.getAgencia());
}
}
