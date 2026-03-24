package ejercicio01;

public class Hora {

	private int hora;
	private int minutos;

	public Hora(int hora, int minutos) {
		super();
		setHora(hora);
		setMinutos(minutos);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora < 0 || hora > 23)
			throw new IllegalArgumentException("\nError: La hora debe estar en un rango de 0-23.");
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos < 0 || minutos > 60)
			throw new IllegalArgumentException("\nError: Los minutos debens");
		this.minutos = minutos;
	}

	public void inc() {
		if (minutos != 60) {
			minutos++;
		}
		if (minutos == 60) {
			minutos = 0;
			if (hora != 23) {
				hora++;
			} else {
				hora = 0;
			}
		}
	}
}
