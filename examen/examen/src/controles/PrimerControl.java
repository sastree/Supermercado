package controles;

import java.util.*;

public class PrimerControl {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca sus datos separados por comas en el siguiente orden: email, nombre, apellido");
		String datos = entrada.nextLine();
		String datosSeparados[] = datos.split(","); //separanos los datos
		int cuenta = 0;
		final double precio = 1.45;   
		double gasto[][] = new double[5][7];
		if (!(datosSeparados.length == 3)) {
			System.out.println("Faltan datos o estan mal introducidos.");
		}

		char letrasmail[] = datosSeparados[0].toCharArray(); 
		if (datosSeparados[0].length() < 18) {
			while (datosSeparados[0].length() < 18) {
				System.out.println(
						"El mail tiene una longitud de menos de 20 caracteres\nIntroduzca nuevamente su correo");
				datosSeparados[0] = entrada.nextLine();
			}

		} else if (!(datosSeparados[0].endsWith(".com"))) {
			while (!(datosSeparados[0].endsWith(".com"))) {
				System.out.println("Extension de correo incorrecta\nIntroduzca nuevamente su correo");
				datosSeparados[0] = entrada.nextLine();

			}
		} else if (!(letrasmail[9] == 64)) {
			while (!(letrasmail[9] == 64)) {
				System.out.println("El correo no tiene '@' o esta mal introducido\nIntroduzca nuevamente su correo");
				letrasmail = entrada.nextLine().toCharArray();

			}
		}
		if (datosSeparados[1].trim().toUpperCase().equals("LUZ")) {
			cuenta++;
		} else {
			while (!datosSeparados[1].trim().toUpperCase().equals("LUZ")) {
				System.out.println("Nombre incorrecto\nIntroduzca nuevamente su nombre");
				datosSeparados[1] = entrada.nextLine();
			}
			if (datosSeparados[1].toUpperCase().trim().equals("LUZ")) {
				cuenta++;
			}
		}
		if (datosSeparados[2].toLowerCase().trim().equals("carita")) {
			cuenta++;
		}

		else {
			while (!datosSeparados[2].trim().toLowerCase().equals("carita")) {
				System.out.println("Apellido incorrecto\nIntroduzca nuevamente su apellido");
				datosSeparados[2] = entrada.nextLine();
			}
			if (datosSeparados[2].toLowerCase().trim().equals("carita")) {
				cuenta++;
			}
		}
		if (cuenta == 2) {
			for (int i = 0; i < gasto.length; i++) {
				for (int j = 0; j < gasto[i].length; j++) {
					gasto[i][j] = (double) (Math.random() * 10);
				}
			}
			gasto[0][0] = 0;
			gasto[4][4] = 0;
			gasto[4][5] = 0;
			gasto[4][6] = 0;
			for (int i = 0; i < gasto.length; i++) {
				for (int j = 0; j < gasto[i].length; j++) {
					System.out.printf("%.2f ", gasto[i][j]);
				}
				System.out.println();
			}
		}
		double suma = 0;
		for (int i = 0; i < gasto.length; i++) {
			for (int j = 0; j < gasto[i].length; j++) {
				suma += gasto[i][j];
			}

		}

		System.out.printf("El gasto total del mes es: %.2f", suma);
	}
}
