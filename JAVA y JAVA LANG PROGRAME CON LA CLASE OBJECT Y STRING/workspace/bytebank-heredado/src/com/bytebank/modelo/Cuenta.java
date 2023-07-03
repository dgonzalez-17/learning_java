package com.bytebank.modelo;

/**
 * 
 * Cuenta va a crear instancias de Cuenta corriente y cuenta ahorros
 * @version 1.0
 * @author yesidgonzalez
 */
public abstract class Cuenta {
	
	/**
	 * public -> Accesible desde cualquier parte
	 * --Default -> Accesible dentro del paquete 
	 * --Protected -> Default + clases hijas
	 * --Private -> Solo es accesible dentro de la clase.
	 * */
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//variable de la clase, no atributo del objeto
	private static int total = 0; 

	/**
	 * Instancia una cuenta usando agencia 
	 * @param agencia -> Necesitas enviar una agencia para crear una cuenta
	 */
	public Cuenta(int agencia) {
		if (agencia <= 0) {
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println(total + " cuentas se han creado.");

	}

	public abstract void depositar(double valor);

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.retirar(valor)) {
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}

	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente nuevoCliente) {

		this.titular = nuevoCliente;

	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
	@Override
	public String toString() {
		String cuenta = "Cuenta de agencia: " + this.agencia;
		return cuenta;
	}

}
