package Tema3;

import java.util.Scanner;

public class Parte22 {

	public static void main(String[] args) {

		System.out.println("Dame una palabra");
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();
		
		String[] deletrear = palabra.split("");
		
		for (String deletreada : deletrear) {
			System.out.print(deletreada + "-");
		}
		sc.close();
	}
	
	

}
