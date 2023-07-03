package com.bytebank.test;
import com.bytebank.modelo.*;


public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario yesid = new Contador();
		yesid.setNombre("Yesid");
		yesid.setDocumento("1000002593");
		yesid.setSalario(1000000);
		
		System.out.println(yesid.getSalario());
		System.out.println(yesid.getBonificacion());
	}

}
