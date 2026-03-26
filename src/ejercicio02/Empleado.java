package ejercicio02;

public class Empleado {
	
	private String nombre;
	
	public Empleado(String nombre) {
		super();
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null || nombre != "") {
			this.nombre = nombre;
		}
	}

	@Override
	public String toString() {
		return "Empleado" + nombre;
	}

}
