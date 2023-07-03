package com.bytebank.test;

public class TestString {
	public static void main(String[] args) {
		String nombre = "Alura";
		/*
		 * Forma no usada para intanciar un String: String nombre = new String("Alura")
		 * 
		 */
		printLine("Antes del replace: " + nombre);
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" cursos online.");
		nombre = nombre.toUpperCase();
		printLine("Después del replace: " + nombre);

		System.out.println();
	}

	public static void printLine(Object valor) {
		System.out.println(valor);
	}

}
