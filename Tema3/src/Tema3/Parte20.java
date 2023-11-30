package Tema3;

import java.util.Random;
import java.util.Scanner;

public class Parte20 {

	public static void main(String[] args) {

		Integer contador = 10;
		Scanner sc = new Scanner(System.in);

		String[] palabras = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sofisticado",
				"terremoto", "culinario", "teclado", "primavera" };

		String respuestaNueva = "si";

		while (true) {
			contador = 10;
			if (respuestaNueva.equalsIgnoreCase("si")) {
				Random random = new Random();
				Integer aleatorio = random.nextInt(0, 10);
				String palabra = palabras[aleatorio];
				System.out.println(palabra);
				Integer adivinanza = palabra.length();
				String[] palabrasAdivinadas = new String[adivinanza];

				for (int i = 0; i < palabrasAdivinadas.length; i++) {
					palabrasAdivinadas[i] = "_ ";
				}

				String[] vista = palabra.split(""); 
				
				palabrasAdivinadas[0] = vista[0];
				
				for (int i = 0; i <= 10; i++) {
					for (int j = 0; j < palabrasAdivinadas.length; j++) {
						System.out.print(palabrasAdivinadas[j]);
					}
					System.out.println();
					System.out.println("Dime una letra, tienes " + contador + " intentos");
					String respuesta = sc.nextLine();
					Boolean encontrada = false;

					for (int j = 0; j < vista.length; j++) {
						if (vista[j].equals(respuesta)) {
							encontrada = true;
							palabrasAdivinadas[j] = respuesta;
						}
					}
					System.out.println();
					if (encontrada == true) {
						System.out.println("¡Correcto, sigue así!");
					} else if (encontrada == false) {
						System.out.println("Incorrecto, inténtalo de nuevo");
						contador--;
					}
					else if (contador == 0 || !(palabrasAdivinadas[i].equalsIgnoreCase(palabra))) {
						System.out.println("GAME OVER");
					}
				}
				System.out.println("¿Quieres intentarlo otra vez?");
				respuestaNueva = sc.nextLine();
				if(respuestaNueva.equalsIgnoreCase("no")){
					System.out.println("Fin del juego");
					break;
				}
			}
		}
		sc.close();
	}
}
