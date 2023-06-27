
public class ControlBonificacion {
	private double suma;

	public double registrarSalario(Funcionario funcionario) {
		suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
}
