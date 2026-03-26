package ejercicio01;

public class Hora {

	protected int hora;
	protected int minutos;

	public Hora(int hora, int minutos) {
		super();
		setHora(hora);
		setMinutos(minutos);
	}

	public int getHora() {
		return hora;
	}

	public boolean setHora(int hora) {
		boolean horaCambiada = false;
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			horaCambiada = true;
		}
		return horaCambiada;
	}

	public int getMinutos() {
		return minutos;
	}

	public boolean setMinutos(int minutos) {
		boolean minutosCambiados = false;
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
			minutosCambiados = true;
		}
		return minutosCambiados;
	}

	public void inc() {
		minutos++;
		if (minutos == 60) {
			minutos = 0;
			if (hora != 23) {
				hora++;
			} else {
				hora = 0;
			}
		}
	}

	@Override
	public String toString() {
		return hora + ":" + String.format("%02d", minutos);
	}
}
