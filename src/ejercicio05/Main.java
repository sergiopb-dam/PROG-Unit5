package ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Poligono> poligonos = new ArrayList<>();

	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("\n--- MENÚ ---");
			System.out.println("1. Introducir triángulo.");
			System.out.println("2. Introducir rectángulo.");
			System.out.println("3. Mostrar polígonos.");
			System.out.println("4. Salir.");
			System.out.print("Elige una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				introducirTriangulo();
				break;
			case 2:
				introducirRectangulo();
				break;
			case 3:
				mostrarPoligonos();
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		} while (opcion != 4);
	}

	private static void introducirTriangulo() {
		System.out.print("Introduce el lado 1 del triángulo: ");
		double l1 = scanner.nextDouble();
		System.out.print("Introduce el lado 2 del triángulo: ");
		double l2 = scanner.nextDouble();
		System.out.print("Introduce el lado 3 del triángulo: ");
		double l3 = scanner.nextDouble();
		poligonos.add(new Triangulo(l1, l2, l3));
		System.out.println("Triángulo añadido correctamente.");
	}

	private static void introducirRectangulo() {
		System.out.print("Introduce el lado 1 del rectángulo: ");
		double l1 = scanner.nextDouble();
		System.out.print("Introduce el lado 2 del rectángulo: ");
		double l2 = scanner.nextDouble();
		poligonos.add(new Rectangulo(l1, l2));
		System.out.println("Rectángulo añadido correctamente.");
	}

	private static void mostrarPoligonos() {
		if (poligonos.isEmpty()) {
			System.out.println("La lista de polígonos está vacía.");
		} else {
			for (Poligono p : poligonos) {
				System.out.println(p.toString() + " | Área: " + p.area());
			}
		}
	}
}