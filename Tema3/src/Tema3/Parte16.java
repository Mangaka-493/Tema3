package Tema3;

import java.util.Scanner;

public class Parte16 {

	public static void main(String[] args) {

		System.out.println("Dime algo");
		Scanner sc = new Scanner(System.in);
		String algo = sc.nextLine();
		String[] reversa = algo.split("");
		for (int i = reversa.length - 1; i >= 0; i--) {
			System.out.println(reversa[i]);
		}
		sc.close();
	}

}
