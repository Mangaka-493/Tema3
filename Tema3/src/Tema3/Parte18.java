package Tema3;

import java.util.Scanner;

public class Parte18 {

	public static void main(String[] args) {

		System.out.println("Dame un número capicúa");
		Scanner sc = new Scanner(System.in);
		String numero = sc.nextLine();
		String[] capicua = numero.split("");
		Boolean factos = true;
		Integer j = capicua.length - 1;
		for (int i = 0; i < capicua.length; i++) {

			if (capicua[i].equals(capicua[j])) {
			} else {
				factos = false;
			}
			j--;
			// System.out.println("Dame otro número");
			// numero = sc.nextLine();
		}
		if (factos == true) {
			System.out.println("Este numero es capicúo");
		} else {
			System.out.println("Este número no es capicúo");
		}
		sc.close();
	}
}
