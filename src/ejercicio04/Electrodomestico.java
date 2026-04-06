package ejercicio04;

public class Electrodomestico {

	protected double precioBase = 100;
	protected double peso = 5;
	protected Color color = Color.blanco;
	protected Consumo consumoEnergetico = Consumo.F;

	public Electrodomestico(double precioBase, double peso, Color color, Consumo consumoEnergetico) {
		super();
		setPrecioBase(precioBase);
		setColor(color);
		setConsumoEnergetico(consumoEnergetico);
		setPeso(peso);
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}
	}
	
	public double getPeso() {
		return precioBase;
	}
	
	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(Consumo consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	
	void comprobarConsumoEnergetico(char letra) {
		if (letra == Consumo.values()) {
			
		}
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + "]";
	}
}
