package negocio;

import java.util.List;

import dao.OrdenDeMantenimientoDAO;
import datos.Ambiente;
import datos.OrdenDeMantenimiento;

public class OrdenDeMantenimientoABM {
	public static OrdenDeMantenimientoABM instance;
	
	OrdenDeMantenimientoABM(){};
	
	public static OrdenDeMantenimientoABM getInstance() {
		if(instance == null) {
			instance = new OrdenDeMantenimientoABM();
		}
		return instance;
	}
	
	public List<OrdenDeMantenimiento> traer(Ambiente ambiente){
		return OrdenDeMantenimientoDAO.getInstance().traer(ambiente);
	}
	
	public List<OrdenDeMantenimiento> traer(Ambiente ambiente, boolean terminada){
		return OrdenDeMantenimientoDAO.getInstance().traer(ambiente, terminada);
	}
	
	public List<OrdenDeMantenimiento> traer(boolean pagada){
		return OrdenDeMantenimientoDAO.getInstance().traer(pagada);
	}
	
}
