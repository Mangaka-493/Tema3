package Tema3;

import java.util.Scanner;

public class Parte7 {

	public static void main(String[] args) {

		System.out.println("Cuantos nuneros me vas a decir?");
		Scanner sc = new Scanner(System.in);
		Integer tamaño = sc.nextInt();
		Integer[] numeros = new Integer[tamaño];
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Dame el numero " + (i + 1));
			numeros[i] = sc.nextInt();
		}
		System.out.println("Estos son los numeros que me has dicho:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		Integer[] laInversa = new Integer[numeros.length];
		for (int i = 0; i < laInversa.length; i++) {
			laInversa[i] = numeros[numeros.length - 1 - i];
		}
		System.out.println("Estos son los resultados de la copia:");
		for (int i = 0; i < laInversa.length; i++) {
			System.out.print(laInversa[i] + " ");
		}
		sc.close();
	}

}
