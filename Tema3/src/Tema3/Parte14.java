package Tema3;

import java.util.Scanner;

public class Parte14 {

	public static void main(String[] args) {

		System.out.println("Dime tu nombre");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		String[] modificacion = nombre.split(" ");
		System.out.println("Tu primer nombre es: " + modificacion[0]);
		System.out.println("Tu segundo nombre es: " + modificacion[1]);
		System.out.println("Tu primer apellido es: " + modificacion[2]);
		System.out.println("Tu segundo apellido es: " + modificacion[3]);
		scanner.close();
	}

}
