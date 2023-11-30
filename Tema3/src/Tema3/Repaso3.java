package Tema3;

import java.util.Scanner;

public class Repaso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		
		Integer posicion = -1;
		Integer posicion1 = -1;
		System.out.println("¿Qué nota buscas?");
		String nota = sc.nextLine();
		
		for (int i = 0; i < listaNotas.length; i++) {
			
			Integer notas = Integer.parseInt(nota);
						
			if (listaNotas[i] == notas ) {
				
				posicion = i;
				break;
			}
			
			for (int j = 0; j < listaNotas.length; j++) {
				if (listaNotas[j] == notas) {
					
					posicion1 = j;
				}
			}
		}
		
		if (posicion != -1) {
			
			System.out.println("La nota que busca ya existe y está en la posición " + posicion);
		}
		
		else if (posicion1 != -1) {
			
		}
		
		else {
			System.out.println("La nota buscada no existe");
		}
	}

}
