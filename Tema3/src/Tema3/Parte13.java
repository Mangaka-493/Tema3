package Tema3;

public class Parte13 {

	public static void main(String[] args) {

		Integer[][] tablaDeMultiplicar = new Integer[10][10];
		for (int i = 1; i <= tablaDeMultiplicar.length; i++) {
			Integer uno = i;
			Integer dos = i * 2;
			Integer tres = i * 3;
			Integer cuatro = i * 4;
			Integer cinco = i * 5;
			Integer seis = i * 6;
			Integer siete = i * 7;
			Integer ocho = i * 8;
			Integer nueve = i * 9;
			Integer diez = i * 10;
			System.out.println(uno + "	" + dos + "	" + tres + "	" + cuatro + "	" + cinco + "	" + seis + "	"
					+ siete + "	" + ocho + "	" + nueve + "	" + diez);
		}
	}

}
