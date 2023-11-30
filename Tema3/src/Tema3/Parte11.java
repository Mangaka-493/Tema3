package Tema3;

public class Parte11 {
			public static void main(String[] args) {
				Integer[][] tabla = new Integer[5][10];
				Integer x = 1;
				for (int i = 0; i < tabla.length; i++) {
					Integer[] arrayInterior = tabla[i];
					for (int j = 0; j < arrayInterior.length; j++) {
						arrayInterior[j] = x;
						x++;
					}
				}
				for (int i = 0; i < tabla.length; i++) {
					Integer[] arrayInterior = tabla[i];
					for (int j = 0; j < arrayInterior.length; j++) {
						System.out.print(arrayInterior[j] + "\t");
					}
					System.out.println();

				}

				}
}

