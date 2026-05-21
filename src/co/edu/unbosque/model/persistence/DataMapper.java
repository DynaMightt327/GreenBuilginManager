package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class DataMapper {

	public static AdministradorDTO convertirAdministradorAAdministradorDTO(Administrador entidad) {
		AdministradorDTO dto = new AdministradorDTO();
		dto.setNombre(entidad.getNombre());
		dto.setApellido(entidad.getApellido());
		dto.setEdad(entidad.getEdad());
		dto.setGenero(entidad.getGenero());
		dto.setCorreo(entidad.getCorreo());
		dto.setId(entidad.getId());
		dto.setTelefono(entidad.getTelefono());
		dto.setRutaFoto(entidad.getRutaFoto());
		dto.setEstado(entidad.getEstado());
		dto.setContrasena(entidad.getContrasena());
		dto.setConjuntoACargo(entidad.getConjuntoACargo());
		dto.setSalario(entidad.getSalario());
		dto.setTipoContrato(entidad.getTipoContrato());
		return dto;
	}

	public static Administrador convertirAdministradorDTOAAdministrador(AdministradorDTO dto) {
		Administrador entidad = new Administrador();
		entidad.setNombre(dto.getNombre());
		entidad.setApellido(dto.getApellido());
		entidad.setEdad(dto.getEdad());
		entidad.setGenero(dto.getGenero());
		entidad.setCorreo(dto.getCorreo());
		entidad.setId(dto.getId());
		entidad.setTelefono(dto.getTelefono());
		entidad.setRutaFoto(dto.getRutaFoto());
		entidad.setEstado(dto.getEstado());
		entidad.setContrasena(dto.getContrasena());
		entidad.setConjuntoACargo(dto.getConjuntoACargo());
		entidad.setSalario(dto.getSalario());
		entidad.setTipoContrato(dto.getTipoContrato());
		return entidad;
	}

	public static ArrayList<AdministradorDTO> convertirListaAdministradorAListaAdministradorDTO(
			ArrayList<Administrador> listaEntidad) {
		ArrayList<AdministradorDTO> listaDTO = new ArrayList<>();
		for (Administrador entidad : listaEntidad) {
			listaDTO.add(convertirAdministradorAAdministradorDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Administrador> convertirListaAdministradorDTOAListaAdministrador(
			ArrayList<AdministradorDTO> listaDTO) {
		ArrayList<Administrador> listaEntidad = new ArrayList<>();
		for (AdministradorDTO dto : listaDTO) {
			listaEntidad.add(convertirAdministradorDTOAAdministrador(dto));
		}
		return listaEntidad;
	}

	public static ResidenteDTO convertirResidenteAResidenteDTO(Residente entidad) {
		ResidenteDTO dto = new ResidenteDTO();
		dto.setNombre(entidad.getNombre());
		dto.setApellido(entidad.getApellido());
		dto.setEdad(entidad.getEdad());
		dto.setGenero(entidad.getGenero());
		dto.setCorreo(entidad.getCorreo());
		dto.setId(entidad.getId());
		dto.setTelefono(entidad.getTelefono());
		dto.setRutaFoto(entidad.getRutaFoto());
		dto.setEstado(entidad.getEstado());
		dto.setContrasena(entidad.getContrasena());
		dto.setTorre(entidad.getTorre());
		dto.setApartamento(entidad.getApartamento());
		dto.setPiso(entidad.getPiso());
		dto.setTieneReporte(entidad.isTieneReporte());
		dto.setNumeroReporte(entidad.getNumeroReporte());
		dto.setContenidoReporte(entidad.getContenidoReporte());
		dto.setTieneMulta(entidad.isTieneMulta());
		dto.setCostoMulta(entidad.getCostoMulta());
		dto.setRazonMulta(entidad.getRazonMulta());
		dto.setCantidadDeMulta(entidad.getCantidadDeMulta());
		dto.setTieneParqueadero(entidad.isTieneParqueadero());
		dto.setNumeroParqueadero(entidad.getNumeroParqueadero());
		dto.setTieneBicicletero(entidad.isTieneBicicletero());
		dto.setTieneCargadorDeCarro(entidad.isTieneCargadorDeCarro());
		return dto;
	}

	public static Residente convertirResidenteDTOAResidente(ResidenteDTO dto) {
		Residente entidad = new Residente();
		entidad.setNombre(dto.getNombre());
		entidad.setApellido(dto.getApellido());
		entidad.setEdad(dto.getEdad());
		entidad.setGenero(dto.getGenero());
		entidad.setCorreo(dto.getCorreo());
		entidad.setId(dto.getId());
		entidad.setTelefono(dto.getTelefono());
		entidad.setRutaFoto(dto.getRutaFoto());
		entidad.setEstado(dto.getEstado());
		entidad.setContrasena(dto.getContrasena());
		entidad.setTorre(dto.getTorre());
		entidad.setApartamento(dto.getApartamento());
		entidad.setPiso(dto.getPiso());
		entidad.setTieneReporte(dto.isTieneReporte());
		entidad.setNumeroReporte(dto.getNumeroReporte());
		entidad.setContenidoReporte(dto.getContenidoReporte());
		entidad.setTieneMulta(dto.isTieneMulta());
		entidad.setCostoMulta(dto.getCostoMulta());
		entidad.setRazonMulta(dto.getRazonMulta());
		entidad.setCantidadDeMulta(dto.getCantidadDeMulta());
		entidad.setTieneParqueadero(dto.isTieneParqueadero());
		entidad.setNumeroParqueadero(dto.getNumeroParqueadero());
		entidad.setTieneBicicletero(dto.isTieneBicicletero());
		entidad.setTieneCargadorDeCarro(dto.isTieneCargadorDeCarro());
		return entidad;
	}

	public static ArrayList<ResidenteDTO> convertirListaResidenteAListaResidenteDTO(ArrayList<Residente> listaEntidad) {
		ArrayList<ResidenteDTO> listaDTO = new ArrayList<>();
		for (Residente entidad : listaEntidad) {
			listaDTO.add(convertirResidenteAResidenteDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Residente> convertirListaResidenteDTOAListaResidente(ArrayList<ResidenteDTO> listaDTO) {
		ArrayList<Residente> listaEntidad = new ArrayList<>();
		for (ResidenteDTO dto : listaDTO) {
			listaEntidad.add(convertirResidenteDTOAResidente(dto));
		}
		return listaEntidad;
	}

	public static VigilanteDTO convertirVigilanteAVigilanteDTO(Vigilante entidad) {
		VigilanteDTO dto = new VigilanteDTO();
		dto.setNombre(entidad.getNombre());
		dto.setApellido(entidad.getApellido());
		dto.setEdad(entidad.getEdad());
		dto.setGenero(entidad.getGenero());
		dto.setCorreo(entidad.getCorreo());
		dto.setId(entidad.getId());
		dto.setTelefono(entidad.getTelefono());
		dto.setRutaFoto(entidad.getRutaFoto());
		dto.setEstado(entidad.getEstado());
		dto.setContrasena(entidad.getContrasena());
		dto.setHorario(entidad.getHorario());
		return dto;
	}

	public static Vigilante convertirVigilanteDTOAVigilante(VigilanteDTO dto) {
		Vigilante entidad = new Vigilante();
		entidad.setNombre(dto.getNombre());
		entidad.setApellido(dto.getApellido());
		entidad.setEdad(dto.getEdad());
		entidad.setGenero(dto.getGenero());
		entidad.setCorreo(dto.getCorreo());
		entidad.setId(dto.getId());
		entidad.setTelefono(dto.getTelefono());
		entidad.setRutaFoto(dto.getRutaFoto());
		entidad.setEstado(dto.getEstado());
		entidad.setContrasena(dto.getContrasena());
		entidad.setHorario(dto.getHorario());
		return entidad;
	}

	public static ArrayList<VigilanteDTO> convertirListaVigilanteAListaVigilanteDTO(ArrayList<Vigilante> listaEntidad) {
		ArrayList<VigilanteDTO> listaDTO = new ArrayList<>();
		for (Vigilante entidad : listaEntidad) {
			listaDTO.add(convertirVigilanteAVigilanteDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Vigilante> convertirListaVigilanteDTOAListaVigilante(ArrayList<VigilanteDTO> listaDTO) {
		ArrayList<Vigilante> listaEntidad = new ArrayList<>();
		for (VigilanteDTO dto : listaDTO) {
			listaEntidad.add(convertirVigilanteDTOAVigilante(dto));
		}
		return listaEntidad;
	}

	public static VisitanteDTO convertirVisitanteAVisitanteDTO(Visitante entidad) {
		VisitanteDTO dto = new VisitanteDTO();
		dto.setNombre(entidad.getNombre());
		dto.setApellido(entidad.getApellido());
		dto.setEdad(entidad.getEdad());
		dto.setGenero(entidad.getGenero());
		dto.setCorreo(entidad.getCorreo());
		dto.setId(entidad.getId());
		dto.setTelefono(entidad.getTelefono());
		dto.setRutaFoto(entidad.getRutaFoto());
		dto.setEstado(entidad.getEstado());
		dto.setContrasena(entidad.getContrasena());
		dto.setTorre(entidad.getTorre());
		dto.setPiso(entidad.getPiso());
		dto.setApartamento(entidad.getApartamento());
		dto.setEsFrecuente(entidad.isEsFrecuente());
		return dto;
	}

	public static Visitante convertirVisitanteDTOAVisitante(VisitanteDTO dto) {
		Visitante entidad = new Visitante();
		entidad.setNombre(dto.getNombre());
		entidad.setApellido(dto.getApellido());
		entidad.setEdad(dto.getEdad());
		entidad.setGenero(dto.getGenero());
		entidad.setCorreo(dto.getCorreo());
		entidad.setId(dto.getId());
		entidad.setTelefono(dto.getTelefono());
		entidad.setRutaFoto(dto.getRutaFoto());
		entidad.setEstado(dto.getEstado());
		entidad.setContrasena(dto.getContrasena());
		entidad.setTorre(dto.getTorre());
		entidad.setPiso(dto.getPiso());
		entidad.setApartamento(dto.getApartamento());
		entidad.setEsFrecuente(dto.isEsFrecuente());
		return entidad;
	}

	public static ArrayList<VisitanteDTO> convertirListaVisitanteAListaVisitanteDTO(ArrayList<Visitante> listaEntidad) {
		ArrayList<VisitanteDTO> listaDTO = new ArrayList<>();
		for (Visitante entidad : listaEntidad) {
			listaDTO.add(convertirVisitanteAVisitanteDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Visitante> convertirListaVisitanteDTOAListaVisitante(ArrayList<VisitanteDTO> listaDTO) {
		ArrayList<Visitante> listaEntidad = new ArrayList<>();
		for (VisitanteDTO dto : listaDTO) {
			listaEntidad.add(convertirVisitanteDTOAVisitante(dto));
		}
		return listaEntidad;
	}

	public static AvisoDTO convertirAvisoAAvisoDTO(Aviso entidad) {
		AvisoDTO dto = new AvisoDTO();
		dto.setTipoAviso(entidad.getTipoAviso());
		dto.setContenido(entidad.getContenido());
		dto.setFecha(entidad.getFecha());
		return dto;
	}

	public static Aviso convertirAvisoDTOAAviso(AvisoDTO dto) {
		Aviso entidad = new Aviso();
		entidad.setTipoAviso(dto.getTipoAviso());
		entidad.setContenido(dto.getContenido());
		entidad.setFecha(dto.getFecha());
		return entidad;
	}

	public static ArrayList<AvisoDTO> convertirListaAvisoAListaAvisoDTO(ArrayList<Aviso> listaEntidad) {
		ArrayList<AvisoDTO> listaDTO = new ArrayList<>();
		for (Aviso entidad : listaEntidad) {
			listaDTO.add(convertirAvisoAAvisoDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Aviso> convertirListaAvisoDTOAListaAviso(ArrayList<AvisoDTO> listaDTO) {
		ArrayList<Aviso> listaEntidad = new ArrayList<>();
		for (AvisoDTO dto : listaDTO) {
			listaEntidad.add(convertirAvisoDTOAAviso(dto));
		}
		return listaEntidad;
	}

	public static ReporteDTO convertirReporteAReporteDTO(Reporte entidad) {
		ReporteDTO dto = new ReporteDTO();
		dto.setNombre(entidad.getNombre());
		dto.setContenido(entidad.getContenido());
		dto.setFecha(entidad.getFecha());
		return dto;
	}

	public static Reporte convertirReporteDTOAReporte(ReporteDTO dto) {
		Reporte entidad = new Reporte();
		entidad.setNombre(dto.getNombre());
		entidad.setContenido(dto.getContenido());
		entidad.setFecha(dto.getFecha());
		return entidad;
	}

	public static ArrayList<ReporteDTO> convertirListaReporteAListaReporteDTO(ArrayList<Reporte> listaEntidad) {
		ArrayList<ReporteDTO> listaDTO = new ArrayList<>();
		for (Reporte entidad : listaEntidad) {
			listaDTO.add(convertirReporteAReporteDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Reporte> convertirListaReporteDTOAListaReporte(ArrayList<ReporteDTO> listaDTO) {
		ArrayList<Reporte> listaEntidad = new ArrayList<>();
		for (ReporteDTO dto : listaDTO) {
			listaEntidad.add(convertirReporteDTOAReporte(dto));
		}
		return listaEntidad;
	}

	public static ReservaDTO convertirReservaAReservaDTO(Reserva entidad) {
		ReservaDTO dto = new ReservaDTO();
		dto.setNombreCompleto(entidad.getNombreCompleto());
		dto.setTipoZona(entidad.getTipoZona());
		dto.setEdad(entidad.getEdad());
		dto.setId(entidad.getId());
		dto.setTelefono(entidad.getTelefono());
		dto.setCorreo(entidad.getCorreo());
		dto.setFechaReserva(entidad.getFechaReserva());
		dto.setHoraInicio(entidad.getHoraInicio());
		dto.setHoraFinal(entidad.getHoraFinal());
		dto.setCosto(entidad.getCosto());
		return dto;
	}

	public static Reserva convertirReservaDTOAReserva(ReservaDTO dto) {
		Reserva entidad = new Reserva();
		entidad.setNombreCompleto(dto.getNombreCompleto());
		entidad.setTipoZona(dto.getTipoZona());
		entidad.setEdad(dto.getEdad());
		entidad.setId(dto.getId());
		entidad.setTelefono(dto.getTelefono());
		entidad.setCorreo(dto.getCorreo());
		entidad.setFechaReserva(dto.getFechaReserva());
		entidad.setHoraInicio(dto.getHoraInicio());
		entidad.setHoraFinal(dto.getHoraFinal());
		entidad.setCosto(dto.getCosto());
		return entidad;
	}

	public static ArrayList<ReservaDTO> convertirListaReservaAListaReservaDTO(ArrayList<Reserva> listaEntidad) {
		ArrayList<ReservaDTO> listaDTO = new ArrayList<>();
		for (Reserva entidad : listaEntidad) {
			listaDTO.add(convertirReservaAReservaDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Reserva> convertirListaReservaDTOAListaReserva(ArrayList<ReservaDTO> listaDTO) {
		ArrayList<Reserva> listaEntidad = new ArrayList<>();
		for (ReservaDTO dto : listaDTO) {
			listaEntidad.add(convertirReservaDTOAReserva(dto));
		}
		return listaEntidad;
	}

	public static BicicleteroDTO convertirBicicleteroABicicleteroDTO(Bicicletero entidad) {
		BicicleteroDTO dto = new BicicleteroDTO();
		dto.setNumPuesto(entidad.getNumPuesto());
		dto.setCapacidadMaxima(entidad.getCapacidadMaxima());
		dto.setEstado(entidad.getEstado());
		dto.setNumBicicletero(entidad.getNumBicicletero());
		return dto;
	}

	public static Bicicletero convertirBicicleteroDTOABicicletero(BicicleteroDTO dto) {
		Bicicletero entidad = new Bicicletero();
		entidad.setNumPuesto(dto.getNumPuesto());
		entidad.setCapacidadMaxima(dto.getCapacidadMaxima());
		entidad.setEstado(dto.getEstado());
		entidad.setNumBicicletero(dto.getNumBicicletero());
		return entidad;
	}

	public static ArrayList<BicicleteroDTO> convertirListaBicicleteroAListaBicicleteroDTO(
			ArrayList<Bicicletero> listaEntidad) {
		ArrayList<BicicleteroDTO> listaDTO = new ArrayList<>();
		for (Bicicletero entidad : listaEntidad) {
			listaDTO.add(convertirBicicleteroABicicleteroDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Bicicletero> convertirListaBicicleteroDTOAListaBicicletero(
			ArrayList<BicicleteroDTO> listaDTO) {
		ArrayList<Bicicletero> listaEntidad = new ArrayList<>();
		for (BicicleteroDTO dto : listaDTO) {
			listaEntidad.add(convertirBicicleteroDTOABicicletero(dto));
		}
		return listaEntidad;
	}

	public static ParqueaderoDTO convertirParqueaderoAParqueaderoDTO(Parqueadero entidad) {
		ParqueaderoDTO dto = new ParqueaderoDTO();
		dto.setNumeroParqueadero(entidad.getNumeroParqueadero());
		dto.setEstado(entidad.getEstado());
		return dto;
	}

	public static Parqueadero convertirParqueaderoDTOAParqueadero(ParqueaderoDTO dto) {
		Parqueadero entidad = new Parqueadero();
		entidad.setNumeroParqueadero(dto.getNumeroParqueadero());
		entidad.setEstado(dto.getEstado());
		return entidad;
	}

	public static ArrayList<ParqueaderoDTO> convertirListaParqueaderoAListaParqueaderoDTO(
			ArrayList<Parqueadero> listaEntidad) {
		ArrayList<ParqueaderoDTO> listaDTO = new ArrayList<>();
		for (Parqueadero entidad : listaEntidad) {
			listaDTO.add(convertirParqueaderoAParqueaderoDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Parqueadero> convertirListaParqueaderoDTOAListaParqueadero(
			ArrayList<ParqueaderoDTO> listaDTO) {
		ArrayList<Parqueadero> listaEntidad = new ArrayList<>();
		for (ParqueaderoDTO dto : listaDTO) {
			listaEntidad.add(convertirParqueaderoDTOAParqueadero(dto));
		}
		return listaEntidad;
	}

	public static ParqueInfantilDTO convertirParqueInfantilAParqueInfantilDTO(ParqueInfantil entidad) {
		ParqueInfantilDTO dto = new ParqueInfantilDTO();
		dto.setEstado(entidad.getEstado());
		dto.setMedidaCuadrada(entidad.getMedidaCuadrada());
		dto.setEstaDisponible(entidad.isEstaDisponible());
		dto.setCapacidadMaxima(entidad.getCapacidadMaxima());
		dto.setHorario(entidad.getHorario());
		return dto;
	}

	public static ParqueInfantil convertirParqueInfantilDTOAParqueInfantil(ParqueInfantilDTO dto) {
		ParqueInfantil entidad = new ParqueInfantil();
		entidad.setEstado(dto.getEstado());
		entidad.setMedidaCuadrada(dto.getMedidaCuadrada());
		entidad.setEstaDisponible(dto.isEstaDisponible());
		entidad.setCapacidadMaxima(dto.getCapacidadMaxima());
		entidad.setHorario(dto.getHorario());
		return entidad;
	}

	public static ArrayList<ParqueInfantilDTO> convertirListaParqueInfantilAListaParqueInfantilDTO(
			ArrayList<ParqueInfantil> listaEntidad) {
		ArrayList<ParqueInfantilDTO> listaDTO = new ArrayList<>();
		for (ParqueInfantil entidad : listaEntidad) {
			listaDTO.add(convertirParqueInfantilAParqueInfantilDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<ParqueInfantil> convertirListaParqueInfantilDTOAListaParqueInfantil(
			ArrayList<ParqueInfantilDTO> listaDTO) {
		ArrayList<ParqueInfantil> listaEntidad = new ArrayList<>();
		for (ParqueInfantilDTO dto : listaDTO) {
			listaEntidad.add(convertirParqueInfantilDTOAParqueInfantil(dto));
		}
		return listaEntidad;
	}

	public static TorreDTO convertirTorreATorreDTO(Torre entidad) {
		TorreDTO dto = new TorreDTO();
		dto.setNumApartamento(entidad.getNumApartamento());
		dto.setNumPiso(entidad.getNumPiso());
		dto.setNumTorre(entidad.getNumTorre());
		dto.setEstadoPanelSolar(entidad.getEstadoPanelSolar());
		dto.setEstado(entidad.getEstado());
		return dto;
	}

	public static Torre convertirTorreDTOATorre(TorreDTO dto) {
		Torre entidad = new Torre();
		entidad.setNumApartamento(dto.getNumApartamento());
		entidad.setNumPiso(dto.getNumPiso());
		entidad.setNumTorre(dto.getNumTorre());
		entidad.setEstadoPanelSolar(dto.getEstadoPanelSolar());
		entidad.setEstado(dto.getEstado());
		return entidad;
	}

	public static ArrayList<TorreDTO> convertirListaTorreAListaTorreDTO(ArrayList<Torre> listaEntidad) {
		ArrayList<TorreDTO> listaDTO = new ArrayList<>();
		for (Torre entidad : listaEntidad) {
			listaDTO.add(convertirTorreATorreDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Torre> convertirListaTorreDTOAListaTorre(ArrayList<TorreDTO> listaDTO) {
		ArrayList<Torre> listaEntidad = new ArrayList<>();
		for (TorreDTO dto : listaDTO) {
			listaEntidad.add(convertirTorreDTOATorre(dto));
		}
		return listaEntidad;
	}

	public static CanchaMultipleDTO convertirCanchaMultipleACanchaMultipleDTO(CanchaMultiple entidad) {
		CanchaMultipleDTO dto = new CanchaMultipleDTO();
		dto.setEstado(entidad.getEstado());
		dto.setMedidaCuadrada(entidad.getMedidaCuadrada());
		dto.setEstaDisponible(entidad.isEstaDisponible());
		dto.setCapacidadMaxima(entidad.getCapacidadMaxima());
		dto.setHorario(entidad.getHorario());
		return dto;
	}

	public static CanchaMultiple convertirCanchaMultipleDTOACanchaMultiple(CanchaMultipleDTO dto) {
		CanchaMultiple entidad = new CanchaMultiple();
		entidad.setEstado(dto.getEstado());
		entidad.setMedidaCuadrada(dto.getMedidaCuadrada());
		entidad.setEstaDisponible(dto.isEstaDisponible());
		entidad.setCapacidadMaxima(dto.getCapacidadMaxima());
		entidad.setHorario(dto.getHorario());
		return entidad;
	}

	public static ArrayList<CanchaMultipleDTO> convertirListaCanchaMultipleAListaCanchaMultipleDTO(
			ArrayList<CanchaMultiple> listaEntidad) {
		ArrayList<CanchaMultipleDTO> listaDTO = new ArrayList<>();
		for (CanchaMultiple entidad : listaEntidad) {
			listaDTO.add(convertirCanchaMultipleACanchaMultipleDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<CanchaMultiple> convertirListaCanchaMultipleDTOAListaCanchaMultiple(
			ArrayList<CanchaMultipleDTO> listaDTO) {
		ArrayList<CanchaMultiple> listaEntidad = new ArrayList<>();
		for (CanchaMultipleDTO dto : listaDTO) {
			listaEntidad.add(convertirCanchaMultipleDTOACanchaMultiple(dto));
		}
		return listaEntidad;
	}

	public static CoworkingDTO convertirCoworkingACoworkingDTO(Coworking entidad) {
		CoworkingDTO dto = new CoworkingDTO();
		dto.setEstado(entidad.getEstado());
		dto.setMedidaCuadrada(entidad.getMedidaCuadrada());
		dto.setEstaDisponible(entidad.isEstaDisponible());
		dto.setCapacidadMaxima(entidad.getCapacidadMaxima());
		dto.setNumeroDePuesto(entidad.getNumeroDePuesto());
		dto.setTieneComputadores(entidad.isTieneComputadores());
		dto.setTieneAccesoAInternet(entidad.isTieneAccesoAInternet());
		return dto;
	}

	public static Coworking convertirCoworkingDTOACoworking(CoworkingDTO dto) {
		Coworking entidad = new Coworking();
		entidad.setEstado(dto.getEstado());
		entidad.setMedidaCuadrada(dto.getMedidaCuadrada());
		entidad.setEstaDisponible(dto.isEstaDisponible());
		entidad.setCapacidadMaxima(dto.getCapacidadMaxima());
		entidad.setNumeroDePuesto(dto.getNumeroDePuesto());
		entidad.setTieneComputadores(dto.isTieneComputadores());
		entidad.setTieneAccesoAInternet(dto.isTieneAccesoAInternet());
		return entidad;
	}

	public static ArrayList<CoworkingDTO> convertirListaCoworkingAListaCoworkingDTO(ArrayList<Coworking> listaEntidad) {
		ArrayList<CoworkingDTO> listaDTO = new ArrayList<>();
		for (Coworking entidad : listaEntidad) {
			listaDTO.add(convertirCoworkingACoworkingDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Coworking> convertirListaCoworkingDTOAListaCoworking(ArrayList<CoworkingDTO> listaDTO) {
		ArrayList<Coworking> listaEntidad = new ArrayList<>();
		for (CoworkingDTO dto : listaDTO) {
			listaEntidad.add(convertirCoworkingDTOACoworking(dto));
		}
		return listaEntidad;
	}

	public static SalonComunalDTO convertirSalonComunalASalonComunalDTO(SalonComunal entidad) {
		SalonComunalDTO dto = new SalonComunalDTO();
		dto.setEstado(entidad.getEstado());
		dto.setMedidaCuadrada(entidad.getMedidaCuadrada());
		dto.setEstaDisponible(entidad.isEstaDisponible());
		dto.setCapacidadMaxima(entidad.getCapacidadMaxima());
		dto.setHorario(entidad.getHorario());
		dto.setUltimoMantenimiento(entidad.getUltimoMantenimiento());
		dto.setCantidadSilla(entidad.getCantidadSilla());
		return dto;
	}

	public static SalonComunal convertirSalonComunalDTOASalonComunal(SalonComunalDTO dto) {
		SalonComunal entidad = new SalonComunal();
		entidad.setEstado(dto.getEstado());
		entidad.setMedidaCuadrada(dto.getMedidaCuadrada());
		entidad.setEstaDisponible(dto.isEstaDisponible());
		entidad.setCapacidadMaxima(dto.getCapacidadMaxima());
		entidad.setHorario(dto.getHorario());
		entidad.setUltimoMantenimiento(dto.getUltimoMantenimiento());
		entidad.setCantidadSilla(dto.getCantidadSilla());
		return entidad;
	}

	public static ArrayList<SalonComunalDTO> convertirListaSalonComunalAListaSalonComunalDTO(
			ArrayList<SalonComunal> listaEntidad) {
		ArrayList<SalonComunalDTO> listaDTO = new ArrayList<>();
		for (SalonComunal entidad : listaEntidad) {
			listaDTO.add(convertirSalonComunalASalonComunalDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<SalonComunal> convertirListaSalonComunalDTOAListaSalonComunal(
			ArrayList<SalonComunalDTO> listaDTO) {
		ArrayList<SalonComunal> listaEntidad = new ArrayList<>();
		for (SalonComunalDTO dto : listaDTO) {
			listaEntidad.add(convertirSalonComunalDTOASalonComunal(dto));
		}
		return listaEntidad;
	}

	public static ZonaBbqDTO convertirZonaBbqAZonaBbqDTO(ZonaBbq entidad) {
		ZonaBbqDTO dto = new ZonaBbqDTO();
		dto.setEstado(entidad.getEstado());
		dto.setMedidaCuadrada(entidad.getMedidaCuadrada());
		dto.setEstaDisponible(entidad.isEstaDisponible());
		dto.setCapacidadMaxima(entidad.getCapacidadMaxima());
		dto.setNumParrilla(entidad.getNumParrilla());
		dto.setEstadoAsadero(entidad.getEstadoAsadero());
		dto.setNumSilla(entidad.getNumSilla());
		dto.setUltimoMantenimiento(entidad.getUltimoMantenimiento());
		return dto;
	}

	public static ZonaBbq convertirZonaBbqDTOAZonaBbq(ZonaBbqDTO dto) {
		ZonaBbq entidad = new ZonaBbq();
		entidad.setEstado(dto.getEstado());
		entidad.setMedidaCuadrada(dto.getMedidaCuadrada());
		entidad.setEstaDisponible(dto.isEstaDisponible());
		entidad.setCapacidadMaxima(dto.getCapacidadMaxima());
		entidad.setNumParrilla(dto.getNumParrilla());
		entidad.setEstadoAsadero(dto.getEstadoAsadero());
		entidad.setNumSilla(dto.getNumSilla());
		entidad.setUltimoMantenimiento(dto.getUltimoMantenimiento());
		return entidad;
	}

	public static ArrayList<ZonaBbqDTO> convertirListaZonaBbqAListaZonaBbqDTO(ArrayList<ZonaBbq> listaEntidad) {
		ArrayList<ZonaBbqDTO> listaDTO = new ArrayList<>();
		for (ZonaBbq entidad : listaEntidad) {
			listaDTO.add(convertirZonaBbqAZonaBbqDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<ZonaBbq> convertirListaZonaBbqDTOAListaZonaBbq(ArrayList<ZonaBbqDTO> listaDTO) {
		ArrayList<ZonaBbq> listaEntidad = new ArrayList<>();
		for (ZonaBbqDTO dto : listaDTO) {
			listaEntidad.add(convertirZonaBbqDTOAZonaBbq(dto));
		}
		return listaEntidad;
	}

	public static ZonaMascotaDTO convertirZonaMascotaAZonaMascotaDTO(ZonaMascota entidad) {
		ZonaMascotaDTO dto = new ZonaMascotaDTO();
		dto.setEstado(entidad.getEstado());
		dto.setMedidaCuadrada(entidad.getMedidaCuadrada());
		dto.setEstaDisponible(entidad.isEstaDisponible());
		dto.setCapacidadMaxima(entidad.getCapacidadMaxima());
		dto.setHorario(entidad.getHorario());
		dto.setTamanoMaximo(entidad.getTamanoMaximo());
		dto.setEstadoDeCaneca(entidad.getEstadoDeCaneca());
		dto.setEstadoBebederos(entidad.getEstadoBebederos());
		return dto;
	}

	public static ZonaMascota convertirZonaMascotaDTOAZonaMascota(ZonaMascotaDTO dto) {
		ZonaMascota entidad = new ZonaMascota();
		entidad.setEstado(dto.getEstado());
		entidad.setMedidaCuadrada(dto.getMedidaCuadrada());
		entidad.setEstaDisponible(dto.isEstaDisponible());
		entidad.setCapacidadMaxima(dto.getCapacidadMaxima());
		entidad.setHorario(dto.getHorario());
		entidad.setTamanoMaximo(dto.getTamanoMaximo());
		entidad.setEstadoDeCaneca(dto.getEstadoDeCaneca());
		entidad.setEstadoBebederos(dto.getEstadoBebederos());
		return entidad;
	}

	public static ArrayList<ZonaMascotaDTO> convertirListaZonaMascotaAListaZonaMascotaDTO(
			ArrayList<ZonaMascota> listaEntidad) {
		ArrayList<ZonaMascotaDTO> listaDTO = new ArrayList<>();
		for (ZonaMascota entidad : listaEntidad) {
			listaDTO.add(convertirZonaMascotaAZonaMascotaDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<ZonaMascota> convertirListaZonaMascotaDTOAListaZonaMascota(
			ArrayList<ZonaMascotaDTO> listaDTO) {
		ArrayList<ZonaMascota> listaEntidad = new ArrayList<>();
		for (ZonaMascotaDTO dto : listaDTO) {
			listaEntidad.add(convertirZonaMascotaDTOAZonaMascota(dto));
		}
		return listaEntidad;
	}

	public static MultaDTO convertirMultaAMultaDTO(Multa entidad) {
		MultaDTO dto = new MultaDTO();
		dto.setRazon(entidad.getRazon());
		dto.setCosto(entidad.getCosto());
		dto.setContenido(entidad.getContenido());
		return dto;
	}

	public static Multa convertirMultaDTOAMulta(MultaDTO dto) {
		Multa entidad = new Multa();
		entidad.setRazon(dto.getRazon());
		entidad.setCosto(dto.getCosto());
		entidad.setContenido(dto.getContenido());
		return entidad;
	}

	public static ArrayList<MultaDTO> convertirListaMultaAListaMultaDTO(ArrayList<Multa> listaEntidad) {
		ArrayList<MultaDTO> listaDTO = new ArrayList<>();
		for (Multa entidad : listaEntidad) {
			listaDTO.add(convertirMultaAMultaDTO(entidad));
		}
		return listaDTO;
	}

	public static ArrayList<Multa> convertirListaMultaDTOAListaMulta(ArrayList<MultaDTO> listaDTO) {
		ArrayList<Multa> listaEntidad = new ArrayList<>();
		for (MultaDTO dto : listaDTO) {
			listaEntidad.add(convertirMultaDTOAMulta(dto));
		}
		return listaEntidad;
	}
}
