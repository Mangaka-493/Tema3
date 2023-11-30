package Tema3;

import java.util.Scanner;

public class Parte10 {

	public static void main(String[] args) {

		System.out.println("Dame el tamaño que quieres asignarle a tu array");
		Scanner sc = new Scanner(System.in);
		Integer tamaño = sc.nextInt();
		Integer x = 0;
		Integer y = 1;
		Integer[] asignacion = new Integer[tamaño];
		for (int i = 1; i <= asignacion.length; i++) {
			Integer aux = x;
			x = y;
			y = aux + y;
			System.out.println(aux);
		}
		sc.close();
	}

}
