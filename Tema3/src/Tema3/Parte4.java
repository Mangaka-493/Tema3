package Tema3;

import java.util.Scanner;

public class Parte4 {

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
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		sc.close();
	}

}
