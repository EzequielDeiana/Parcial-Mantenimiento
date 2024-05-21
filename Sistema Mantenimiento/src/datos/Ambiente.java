package datos;

public abstract class Ambiente {
	protected int idAmbiente;
	protected int nroDeAmbiente;
	protected String ambiente;
	
	public Ambiente() {}

	public Ambiente(int nroDeAmbiente, String ambiente) {
		super();
		this.nroDeAmbiente = nroDeAmbiente;
		this.ambiente = ambiente;
	}

	public int getIdAmbiente() {
		return idAmbiente;
	}

	public void setIdAmbiente(int idAmbiente) {
		this.idAmbiente = idAmbiente;
	}

	public int getNroDeAmbiente() {
		return nroDeAmbiente;
	}

	public void setNroDeAmbiente(int nroDeAmbiente) {
		this.nroDeAmbiente = nroDeAmbiente;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	
	
}
