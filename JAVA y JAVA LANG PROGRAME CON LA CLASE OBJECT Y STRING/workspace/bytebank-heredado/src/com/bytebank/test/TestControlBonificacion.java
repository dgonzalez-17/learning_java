package com.bytebank.test;
import com.bytebank.modelo.*;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario yesid = new Contador();
		yesid.setSalario(2000);
		
		Gerente sofia = new Gerente();
		sofia.setSalario(20000);
		
		Contador julian = new Contador();
		julian.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(yesid);
		controlBonificacion.registrarSalario(sofia);
		controlBonificacion.registrarSalario(julian);
	}
}
