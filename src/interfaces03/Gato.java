package interfaces03;

public class Gato extends AnimalDomestico {
	public Gato(String nombre, String raza, double peso, Color color) {
		super(nombre, raza, peso, color);
	}
	public static final double PROBABILIDAD_OBEDIENCIA = 0.05;
	
	@Override
	public boolean hacerCaso() {
		return Math.random() < PROBABILIDAD_OBEDIENCIA;
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("Miau!!");
	}
		
	public void toserBolaPelo() {
		System.out.println("BASHISDGHIEIWEHIGUISDHGUIHAAAAAAAAAAAAAA");
	}
	
}
