package Tema3;

import java.util.Scanner;

public class Parte2 {

	public static void main(String[] args) {
		System.out.println("Dame un numero");
		Scanner sc = new Scanner(System.in);
		Integer numero = sc.nextInt();
		Integer[] lista = new Integer[6];
		Integer posicion = 0;
		for (int numero2 = numero; numero2 <= numero + 5 ; numero2++) {
			lista[posicion] = numero2 * numero2;
			posicion++;
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

}
