package interfaces01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Socio socio1 = new Socio(5, "Ana", 28);
		Socio socio2 = new Socio(2, "Carlos", 35);
		Socio socio3 = new Socio(8, "Beatriz", 22);
		Socio socio4 = new Socio(1, "David", 40);

		System.out.println("--- PRUEBA DEL MÉTODO compareTo ---");
		System.out.println("Comparando ID 5 con ID 2: " + socio1.compareTo(socio2));
		System.out.println("Comparando ID 2 con ID 8: " + socio2.compareTo(socio3));
		System.out.println("Comparando ID 5 con ID 5: " + socio1.compareTo(socio1));

		Socio[] arraySocios = { socio1, socio2, socio3, socio4 };

		System.out.println("\n--- ARRAY ORIGINAL (SIN ORDENAR) ---");
		for (Socio s : arraySocios) {
			System.out.println(s.toString());
		}

		Arrays.sort(arraySocios);

		System.out.println("\n--- ARRAY ORDENADO POR ID CRECIENTE ---");
		for (Socio s : arraySocios) {
			System.out.println(s.toString());
		}
	}
}