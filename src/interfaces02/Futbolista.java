package interfaces02;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {

	private int numCamiseta;
	private String nombre;
	private int edad;
	private int numGoles;

	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	@Override
	public String toString() {
		return "Camiseta: " + numCamiseta + " | Nombre: " + nombre + " | Edad: " + edad + " | Goles: " + numGoles;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Futbolista otro = (Futbolista) obj;
		return this.numCamiseta == otro.numCamiseta && Objects.equals(this.nombre, otro.nombre);
	}

	@Override
	public int compareTo(Futbolista otro) {
		int comparacionCamiseta = Integer.compare(this.numCamiseta, otro.numCamiseta);

		if (comparacionCamiseta != 0) {
			return comparacionCamiseta;
		}

		return this.nombre.compareTo(otro.nombre);
	}
}
