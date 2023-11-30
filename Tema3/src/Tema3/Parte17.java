package Tema3;

import java.util.Scanner;

public class Parte17 {

	public static void main(String[] args) {

		System.out.println("Dime una frase");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			String palabra = palabras[i];
			if (i == 0) {
				System.out.print(palabra.toLowerCase());
			} else {
				String[] letras = palabra.split("");
				String letra = letras[0];
				System.out.print(letra.toUpperCase());
				for (int j = 1; j < letras.length; j++) {
					System.out.print(letras[j]);
				}
			}
		}
		sc.close();
	}

}
