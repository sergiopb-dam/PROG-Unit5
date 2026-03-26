package ejercicio03;

public class Perecedero extends Producto {

	private int diasACaducar;

	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		setDiasACaducar(diasACaducar);
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	public double calcular(int cantidadProducto) {
		double total = super.calcular(cantidadProducto);
		if (diasACaducar == 1) {
			total = total / 4;
		}
		if (diasACaducar == 2) {
			total = total / 3;
		}
		if (diasACaducar == 3) {
			total = total / 2;
		}
		return total;
		
	}

	@Override
	public String toString() {
		return super.toString() + " | Días a caducar: " + diasACaducar;
	}

}
