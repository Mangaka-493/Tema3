package Tema3;

import java.util.Scanner;

public class Parte19 {

	public static void main(String[] args) {

		System.out.println("Dime algo");
		Scanner sc = new Scanner(System.in);
		String algo = sc.nextLine();
		Integer contador1 = 0;
		Integer contador2 = 0;
		String[] frase = algo.split("");
		for (int i = 0; i < frase.length; i++) {
			if (frase[i].equalsIgnoreCase("a") || frase[i].equalsIgnoreCase("á")) {
				contador1++;
			}
			else if (frase[i].equalsIgnoreCase(" ")) {
				contador2++;
			}
			
		}
		System.out.println("La letra a se repite " + contador1 + " veces");
		System.out.println("Hay un total de " + (contador2 + 1) + " palabras");
		}
		
	}


