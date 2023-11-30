package Tema3;

public class Repaso2 {
	
	public static void main(String[] args) {
		Integer notas = 0;
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		Integer suma = 0;
		
		for (int i = 0; i < listaNotas.length; i++) {
			
			if (listaNotas[i] >= 5) {
			
				notas++;
				suma = suma + listaNotas[i];
				
			}
		}
		
		System.out.println("Total de alumnos aprobados: " + suma / notas);
	
	}

}
