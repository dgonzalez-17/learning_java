
public class TestDescuento {
	public static void main(String[] args) {
		double valorCompra = 250.0;

		if (valorCompra >= 100 && valorCompra < 200) {
			System.out.println("El descuento es del 10%");
		} else if (valorCompra >= 200 && valorCompra < 300) {
			System.out.println("El descuento es del 15%");
		} else {
			System.out.println("El descuento es del 20%");
		}
	}
}
