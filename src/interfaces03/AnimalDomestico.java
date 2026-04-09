package interfaces03;

public abstract class AnimalDomestico implements Vivir {

	protected String nombre;
	protected String raza;
	protected double peso;
	protected Color color;

	public AnimalDomestico(String nombre, String raza, double peso, Color color) {
		setNombre(nombre);
		setRaza(raza);
		setPeso(peso);
		setColor(color);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null || nombre != "") {
			this.nombre = nombre;
		}
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		if (raza != null || raza != "") {
			this.raza = raza;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso != 0 || peso < 0) {
			this.peso = peso;
		}
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void vacunar() {
		System.out.println(nombre + " ha sido vacunad@");
	}

	public abstract boolean hacerCaso();
	
}
