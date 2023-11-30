package Tema3;

public class Repaso1 {

	public static void main(String[] args) {
		Integer contador = 0;
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				contador++;
			}
		}
		System.out.println("Total de alumnos suspensos: " + contador);
	}

}
