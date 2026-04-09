package interfaces03;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro("Dani", "Poodle Toy", 6.7, Color.marron);
		Gato gato = new Gato("Mía", "Ragdoll", 8, Color.gris);
		
		mostrarPerro(perro);
		mostrarGato(gato);
		
	}
	
	public static void mostrarPerro(Perro perro) {
		System.out.println("\nPerro");
		perro.comer();
		perro.dormir();
		perro.hacerRuido();
		perro.vacunar();
		perro.sacarPaseo();
		// imprimirObediencia(perro.getNombre(), perro.hacerCaso());
	}
	
	public static void mostrarGato(Gato gato) {
		System.out.println("\nGato");
		gato.comer();
		gato.dormir();
		gato.hacerRuido();
		gato.vacunar();
		gato.toserBolaPelo();
		// imprimirObediencia(gato.getNombre(), gato.hacerCaso());
	}
	

}
