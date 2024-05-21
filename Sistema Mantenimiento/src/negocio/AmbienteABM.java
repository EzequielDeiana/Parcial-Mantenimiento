package negocio;

import dao.AmbienteDAO;
import datos.Ambiente;

public class AmbienteABM {
	public static AmbienteABM instance;
	
	public AmbienteABM() {};
	
	public AmbienteABM getInstance() {
		if(instance == null) {
			instance = new AmbienteABM();
		}
		return instance;
	}
	
	public Ambiente traer(int idAmbiente) {
		return AmbienteDAO.getInstance().traer(idAmbiente);
	}
	
}
