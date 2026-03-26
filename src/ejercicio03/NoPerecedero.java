package ejercicio03;

public class NoPerecedero extends Producto {

	private String tipo;

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null || tipo != "") {
			this.tipo = tipo;
		}
	}

	public double calcular(int cantidadProducto) {
		return super.calcular(cantidadProducto);
	}

	@Override
	public String toString() {
		return super.toString() + " | Tipo: " + tipo;
	}

}
