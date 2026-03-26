package ejercicio01;

public class HoraExacta extends Hora implements Comparable<Object> {
	protected int segundos;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		setSegundos(segundos);
	}

	public int getSegundos() {
		return segundos;
	}

	public boolean setSegundos(int segundos) {
		boolean segundosCambiados = false;
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
			segundosCambiados = true;
		}
		return segundosCambiados;

	}

	public void inc() {
		segundos++;
		if (segundos == 60) {
			segundos = 0;
			super.inc();
		}
	}

	private int segundosTotales(HoraExacta hora) {
		int segundosTotales = 0;
		if (hora != null) {
			segundosTotales = hora.getHora() * 3600 + hora.getMinutos() * 60 + hora.getSegundos();
		}
		return segundosTotales;
	}

	@Override
	public String toString() {
		return super.toString() + ":" + String.format("%02d", segundos);
	}

	@Override
	public int compareTo(Object o) {
		int horaExacta = 0;
		if (o != null) {
			HoraExacta otraHora = (HoraExacta) o;
			horaExacta = segundosTotales(this) - segundosTotales(otraHora);
		}
		return horaExacta;
	}

}
