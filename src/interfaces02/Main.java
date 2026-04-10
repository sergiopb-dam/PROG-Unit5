package interfaces02;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Futbolista f1 = new Futbolista(11, "Isagi", 36, 821);
		Futbolista f2 = new Futbolista(9, "Rin", 39, 873);
		Futbolista f3 = new Futbolista(10, "Nagi", 60, 345);
		Futbolista f4 = new Futbolista(11, "Bachira", 47, 414);
		Futbolista f5 = new Futbolista(8, "Reo", 25, 312);

		Futbolista[] tablaFutbolistas = { f1, f2, f3, f4, f5 };

		Arrays.sort(tablaFutbolistas);

		for (Futbolista f : tablaFutbolistas) {
			System.out.println(f.toString());
		}
	}
}