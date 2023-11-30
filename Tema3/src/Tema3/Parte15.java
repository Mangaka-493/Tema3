package Tema3;

import java.util.Scanner;

public class Parte15 {

	public static void main(String[] args) {

		System.out.println("Dame la dirección de una página web");
		Scanner sc = new Scanner(System.in);
		String pagina = sc.nextLine();
		String direccion = pagina.split("//");
		String[] web = pagina.split("\\.");
		System.out.println([0]) + "//";
		for (int i = 0; i < web.length; i++) {
			System.out.println(web[i]);
		}
	}

}
