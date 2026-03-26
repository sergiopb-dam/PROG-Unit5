package ejercicio03;

public class Producto {

	protected String nombre;
	protected double precio;

	public Producto(String nombre, double precio) {
		super();
		setNombre(nombre);
		setPrecio(precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null || nombre != "") {
			this.nombre = nombre;
		}

	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}
	
	public double calcular(int cantidadProducto) {
		double total = precio * cantidadProducto;
		return total;
	}

	@Override
	public String toString() {
		return "Producto: " + nombre + " | Precio: " + precio;
	}

}
