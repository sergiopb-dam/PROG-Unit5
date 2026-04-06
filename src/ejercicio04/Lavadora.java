package ejercicio04;

public class Lavadora extends Electrodomestico {

	private int carga = 5;

	public Lavadora() {
		super();
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public double precioFinal() {
		double precioAcumulado = super.precioFinal();

		if (carga > 30) {
			precioAcumulado += 50;
		}

		return precioAcumulado;
	}
}