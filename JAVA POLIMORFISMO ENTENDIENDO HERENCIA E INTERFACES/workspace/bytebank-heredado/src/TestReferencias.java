
public class TestReferencias {
	public static void main(String[] args) {
		
		
		/**
		 * El elemnto más generico puede ser el adaptado al elemento
		 * más generico.*/
		Funcionario funcionario = new Gerente();
				funcionario.setNombre("Yesid");
		Gerente gerente = new Gerente();
		gerente.setNombre("Sofia");
		
		funcionario.setSalario(2000);
		gerente.setSalario(20000);
		
	}

}
