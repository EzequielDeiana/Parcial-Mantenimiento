package datos;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class OrdenDeMantenimiento {
	private int idOrdenDeMantenimiento;
	private int nroDeOrden;
	private Ambiente ambiente;
	private String problema;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double costeDeReparacion;
	private boolean termnada;
	private boolean pagada;
	private String estadoDuranteLaReparacion;
	
	public OrdenDeMantenimiento() {}

	public OrdenDeMantenimiento(int nroDeOrden, Ambiente ambiente, String problema, LocalDate fechaInicio,
			LocalDate fechaFin, double costeDeReparacion, boolean termnada, boolean pagada,
			String estadoDuranteLaReparacion) {
		super();
		this.nroDeOrden = nroDeOrden;
		this.ambiente = ambiente;
		this.problema = problema;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costeDeReparacion = costeDeReparacion;
		this.termnada = termnada;
		this.pagada = pagada;
		this.estadoDuranteLaReparacion = estadoDuranteLaReparacion;
	}

	public int getIdOrdenDeMantenimiento() {
		return idOrdenDeMantenimiento;
	}

	public void setIdOrdenDeMantenimiento(int idOrdenDeMantenimiento) {
		this.idOrdenDeMantenimiento = idOrdenDeMantenimiento;
	}

	public int getNroDeOrden() {
		return nroDeOrden;
	}

	public void setNroDeOrden(int nroDeOrden) {
		this.nroDeOrden = nroDeOrden;
	}

	public Ambiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getCosteDeReparacion() {
		return costeDeReparacion;
	}

	public void setCosteDeReparacion(double costeDeReparacion) {
		this.costeDeReparacion = costeDeReparacion;
	}

	public boolean isTermnada() {
		return termnada;
	}

	public void setTermnada(boolean termnada) {
		this.termnada = termnada;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public String getEstadoDuranteLaReparacion() {
		return estadoDuranteLaReparacion;
	}

	public void setEstadoDuranteLaReparacion(String estadoDuranteLaReparacion) {
		this.estadoDuranteLaReparacion = estadoDuranteLaReparacion;
	}
	
	public long tiempoDeEjecucion() {
		return DAYS.between(getFechaInicio(), getFechaFin());
	}

	@Override
	public String toString() {
		return "OrdenDeMantenimiento [idOrdenDeMantenimiento=" + idOrdenDeMantenimiento + ", nroDeOrden=" + nroDeOrden
				+ ", ambiente=" + ambiente + ", problema=" + problema + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", costeDeReparacion=" + costeDeReparacion + ", termnada=" + termnada + ", pagada="
				+ pagada + ", estadoDuranteLaReparacion=" + estadoDuranteLaReparacion + "]";
	};
	
	
	
}
