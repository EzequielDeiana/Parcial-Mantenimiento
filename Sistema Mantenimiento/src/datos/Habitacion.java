package datos;

public class Habitacion extends Ambiente {
	private int plazas;
	private String nroHabitacion;

	public Habitacion() {
	}
	
	

	public Habitacion(int plazas, String nroHabitacion, int nroAmbiente, String ambiente) {
		super(nroAmbiente, ambiente);
		this.plazas = plazas;
		this.nroHabitacion = nroHabitacion;
	}



	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public String getNroHabitacion() {
		return nroHabitacion;
	}

	public void setNroHabitacion(String nroHabitacion) {
		this.nroHabitacion = nroHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [plazas=" + plazas + ", nroHabitacion=" + nroHabitacion + ", ambiente=" + super.ambiente
				+ ", nroDeAmbiente=" + super.nroDeAmbiente + "]";
	}

}
