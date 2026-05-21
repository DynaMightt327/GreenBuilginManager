package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.AdministradorDAO;
import co.edu.unbosque.model.persistence.AvisoDAO;
import co.edu.unbosque.model.persistence.BicicleteroDAO;
import co.edu.unbosque.model.persistence.CanchaMultipleDAO;
import co.edu.unbosque.model.persistence.CoworkingDAO;
import co.edu.unbosque.model.persistence.ParqueInfantilDAO;
import co.edu.unbosque.model.persistence.ParqueaderoDAO;
import co.edu.unbosque.model.persistence.ReporteDAO;
import co.edu.unbosque.model.persistence.ReservaDAO;
import co.edu.unbosque.model.persistence.ResidenteDAO;
import co.edu.unbosque.model.persistence.SalonComunalDAO;
import co.edu.unbosque.model.persistence.TorreDAO;
import co.edu.unbosque.model.persistence.VigilanteDAO;
import co.edu.unbosque.model.persistence.VisitanteDAO;
import co.edu.unbosque.model.persistence.ZonaBbqDAO;
import co.edu.unbosque.model.persistence.ZonaMascotaDAO;

public class ModelFacade {
	
	private AdministradorDAO administradorDAO;
	private ResidenteDAO residenteDAO;
	private VigilanteDAO vigilanteDAO;
	private VisitanteDAO visitanteDAO;
	private AvisoDAO avisoDAO;
	private ReporteDAO reporteDAO;
	private ReservaDAO reservaDAO;
	private TorreDAO torreDAO;
	private ParqueaderoDAO parqueaderoDAO;
	private BicicleteroDAO bicicleteroDAO;
	private CanchaMultipleDAO canchaMultipleDAO;
	private CoworkingDAO coworkingDAO;
	private ParqueInfantilDAO parqueInfantilDAO;
	private SalonComunalDAO salonComunalDAO;
	private ZonaBbqDAO zonaBbqDAO;
	private ZonaMascotaDAO zonaMascotaDAO;
	
	public ModelFacade() {
		administradorDAO = new AdministradorDAO();
		residenteDAO = new ResidenteDAO();
		vigilanteDAO = new VigilanteDAO();
		visitanteDAO = new VisitanteDAO();
		avisoDAO = new AvisoDAO();
		reporteDAO = new ReporteDAO();
		reservaDAO = new ReservaDAO();
		torreDAO = new TorreDAO();
		parqueaderoDAO = new ParqueaderoDAO();
		bicicleteroDAO = new BicicleteroDAO();
		canchaMultipleDAO = new CanchaMultipleDAO();
		coworkingDAO = new CoworkingDAO();
		parqueInfantilDAO = new ParqueInfantilDAO();
		salonComunalDAO = new SalonComunalDAO();
		zonaBbqDAO = new ZonaBbqDAO();
		zonaMascotaDAO = new ZonaMascotaDAO();
	}

	public AdministradorDAO getAdministradorDAO() {
		return administradorDAO;
	}

	public void setAdministradorDAO(AdministradorDAO administradorDAO) {
		this.administradorDAO = administradorDAO;
	}

	public ResidenteDAO getResidenteDAO() {
		return residenteDAO;
	}

	public void setResidenteDAO(ResidenteDAO residenteDAO) {
		this.residenteDAO = residenteDAO;
	}

	public VigilanteDAO getVigilanteDAO() {
		return vigilanteDAO;
	}

	public void setVigilanteDAO(VigilanteDAO vigilanteDAO) {
		this.vigilanteDAO = vigilanteDAO;
	}

	public VisitanteDAO getVisitanteDAO() {
		return visitanteDAO;
	}

	public void setVisitanteDAO(VisitanteDAO visitanteDAO) {
		this.visitanteDAO = visitanteDAO;
	}

	public AvisoDAO getAvisoDAO() {
		return avisoDAO;
	}

	public void setAvisoDAO(AvisoDAO avisoDAO) {
		this.avisoDAO = avisoDAO;
	}

	public ReporteDAO getReporteDAO() {
		return reporteDAO;
	}

	public void setReporteDAO(ReporteDAO reporteDAO) {
		this.reporteDAO = reporteDAO;
	}

	public ReservaDAO getReservaDAO() {
		return reservaDAO;
	}

	public void setReservaDAO(ReservaDAO reservaDAO) {
		this.reservaDAO = reservaDAO;
	}

	public TorreDAO getTorreDAO() {
		return torreDAO;
	}

	public void setTorreDAO(TorreDAO torreDAO) {
		this.torreDAO = torreDAO;
	}

	public ParqueaderoDAO getParqueaderoDAO() {
		return parqueaderoDAO;
	}

	public void setParqueaderoDAO(ParqueaderoDAO parqueaderoDAO) {
		this.parqueaderoDAO = parqueaderoDAO;
	}

	public BicicleteroDAO getBicicleteroDAO() {
		return bicicleteroDAO;
	}

	public void setBicicleteroDAO(BicicleteroDAO bicicleteroDAO) {
		this.bicicleteroDAO = bicicleteroDAO;
	}

	public CanchaMultipleDAO getCanchaMultipleDAO() {
		return canchaMultipleDAO;
	}

	public void setCanchaMultipleDAO(CanchaMultipleDAO canchaMultipleDAO) {
		this.canchaMultipleDAO = canchaMultipleDAO;
	}

	public CoworkingDAO getCoworkingDAO() {
		return coworkingDAO;
	}

	public void setCoworkingDAO(CoworkingDAO coworkingDAO) {
		this.coworkingDAO = coworkingDAO;
	}

	public ParqueInfantilDAO getParqueInfantilDAO() {
		return parqueInfantilDAO;
	}

	public void setParqueInfantilDAO(ParqueInfantilDAO parqueInfantilDAO) {
		this.parqueInfantilDAO = parqueInfantilDAO;
	}

	public SalonComunalDAO getSalonComunalDAO() {
		return salonComunalDAO;
	}

	public void setSalonComunalDAO(SalonComunalDAO salonComunalDAO) {
		this.salonComunalDAO = salonComunalDAO;
	}

	public ZonaBbqDAO getZonaBbqDAO() {
		return zonaBbqDAO;
	}

	public void setZonaBbqDAO(ZonaBbqDAO zonaBbqDAO) {
		this.zonaBbqDAO = zonaBbqDAO;
	}

	public ZonaMascotaDAO getZonaMascotaDAO() {
		return zonaMascotaDAO;
	}

	public void setZonaMascotaDAO(ZonaMascotaDAO zonaMascotaDAO) {
		this.zonaMascotaDAO = zonaMascotaDAO;
	}
}