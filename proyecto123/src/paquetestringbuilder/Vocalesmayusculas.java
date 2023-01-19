package paquetestringbuilder;

import java.util.Scanner;

public class Vocalesmayusculas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Di una frase: ");
		String frase = entrada.nextLine();
		StringBuilder frase2 = new StringBuilder(frase);

		System.out.println(vocalesmayus(frase2));

	}

	public static StringBuilder vocalesmayus(StringBuilder frase2) {

		for (int i = 0; i < frase2.length(); i++) {
			char letra = frase2.charAt(i);
			if ("aeiou".contains(String.valueOf(letra))) {
				frase2.setCharAt(i, Character.toUpperCase(letra));
			}
		}

		return frase2;
	}

}
