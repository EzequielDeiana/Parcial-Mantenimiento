package datos;

public class Salon extends Ambiente{
	private int cantidadDeMesas;
	private int cantidadDeSillas;
	private int capacidad;
	
	public Salon() {}

	public Salon(int cantidadDeMesas, int cantidadDeSillas, int capacidad, int nroAmbiente, String ambiente) {
		super(nroAmbiente, ambiente);
		this.cantidadDeMesas = cantidadDeMesas;
		this.cantidadDeSillas = cantidadDeSillas;
		this.capacidad = capacidad;
	}

	public int getCantidadDeMesas() {
		return cantidadDeMesas;
	}

	public void setCantidadDeMesas(int cantidadDeMesas) {
		this.cantidadDeMesas = cantidadDeMesas;
	}

	public int getCantidadDeSillas() {
		return cantidadDeSillas;
	}

	public void setCantidadDeSillas(int cantidadDeSillas) {
		this.cantidadDeSillas = cantidadDeSillas;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Salon [cantidadDeMesas=" + cantidadDeMesas + ", cantidadDeSillas=" + cantidadDeSillas + ", capacidad="
				+ capacidad + ", idAmbiente=" + idAmbiente + ", nroDeAmbiente=" + nroDeAmbiente + ", ambiente="
				+ ambiente + "]";
	}
	
	
	
}
