package Tema3;

public class Parte12 {

	public static void main(String[] args) {

		Integer[][] tablaDeMultiplicar = new Integer[11][10];
		Integer x = 0;
		for (int i = 0; i < tablaDeMultiplicar.length; i++) {
			Integer[] interior = tablaDeMultiplicar[i];
			for (int j = 0; j < interior.length; j++) {
				interior[j] = i*j;
			}
		}
		for (int i = 0; i < tablaDeMultiplicar.length; i++) {
			Integer[] interior = tablaDeMultiplicar[i];
			for (int k = 0; k < interior.length; k++) {
				System.out.print(interior[k] + "\t");
			}
			System.out.println();
		}
	}

}
