package Tema3;

import java.util.Scanner;

public class Parte5 {

	public static void main(String[] args) {

		System.out.println("Cuantos numeros me vas a decir?");
		Scanner sc = new Scanner(System.in);
		Integer tamaño = sc.nextInt();
		Integer[] numeros = new Integer[tamaño];
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Dame el numero " + (i + 1));
			numeros[i] = sc.nextInt();
		}
		Integer suma = 0;
		Integer maximo = numeros[0];
		Integer minimo = numeros[0];
		Integer posicionmax = 0;
		Integer posicionmin = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
			if(numeros[i] > maximo) {
				maximo = numeros[i];
				posicionmax = i;
			}
			else if(numeros[i] < minimo) {
				minimo = numeros[i];
				posicionmin = i;
			}
		}
		System.out.println("La media es: " + suma/numeros.length);
		System.out.println("El máximo es " + maximo + " y se encuentra en la posición " + posicionmax);
		System.out.println("El mínimo es " + minimo + " y se encuentra en la posición " + posicionmin);
		
		System.out.println("Estos son los números que me has indicado");
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		sc.close();
	}
}
