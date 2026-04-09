package interfaces03;

public interface Vivir {

	public default void comer() {
		System.out.println("Ñam");
	}
	
	public default void dormir() {
		System.out.println("Zzzz");
	}
	
	public default void hacerRuido() {
		System.out.println("Grrr");
	}
}
