package Tema3;

import java.util.Scanner;

public class Parte6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] palabra = new String[3];
		for (int i = 0; i < palabra.length; i++) {
			System.out.println("Dime algo " + (i + 1));
			String algo = sc.nextLine();
			palabra[i] = algo;
		}
		String suma = "";
		for (int i = 0; i < palabra.length; i++) {
			suma = suma + palabra[i];
		}
		System.out.println("Todas las palabras: " + suma);
		sc.close();

	}

}
