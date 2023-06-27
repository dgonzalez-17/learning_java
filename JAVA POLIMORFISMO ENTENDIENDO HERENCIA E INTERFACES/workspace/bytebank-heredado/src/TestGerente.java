
public class TestGerente {
public static void main(String[] args) {
	Gerente gerente = new Gerente();
	gerente.setSalario(5000);
	System.out.println(gerente.getBonificacion());
//	Funcionario gerente = new Funcionario();
//	gerente.setSalario(50000);
	gerente.setTipo(1);
	System.out.println(gerente.getBonificacion());
	
}
}
