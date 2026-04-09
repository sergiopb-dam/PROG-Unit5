package interfaces03;

public class Perro extends AnimalDomestico {
	public Perro(String nombre, String raza, double peso, Color color) {
		super(nombre, raza, peso, color);
	}

	public static final double PROBABILIDAD_OBEDIENCIA = 0.9;

	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau!!");
	}

	public void sacarPaseo() {
		System.out.println(nombre + " fue sacad@ a pasear");
	}

}
