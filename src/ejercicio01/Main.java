package ejercicio01;

public class Main {
	public static void main(String[] args) {
		// Prueba de clase Hora
		Hora h = new Hora(23, 59);
		System.out.println("Hora simple: " + h);
		h.inc();
		System.out.println("Tras incrementar:  " + h);

		System.out.println("----------");
		
		// Prueba de clase HoraExacta
		HoraExacta he = new HoraExacta(12, 59, 59);
		System.out.println("Exacta:      " + he);
		he.inc();
		System.out.println("Tras inc():  " + he);

		System.out.println("----------");
		
		// Testeos
		System.out.println("Cambio a 70 seg: " + he.setSegundos(70)); // false
		System.out.println("Cambio a 30 seg: " + he.setSegundos(30)); // true
		System.out.println("Resultado final:   " + he);
	}
}