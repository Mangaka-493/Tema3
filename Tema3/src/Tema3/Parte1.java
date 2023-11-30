package Tema3;

public class Parte1 {

	public static void main(String[] args) {
		Integer[] lista = new Integer[15];
		Integer posicion = 0;
		for (int contador = 1; contador <= 30; contador++) {
			Integer impares = contador % 2;
			if(impares == 0) {
				lista[posicion] = contador;
				posicion++;
			}
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
	}

}
