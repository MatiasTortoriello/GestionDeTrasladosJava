package gestionDeTrasladosDominio;

import gestionDeTrasladosEnums.TipoDeAcoplado;
import gestionDeTrasladosEnums.TipoDeAuto;

public class CamionClass extends VehiculoClass {

	private TipoDeAcoplado tipoDeAcoplado;
	/*
	 //Atributos que heredo de VehiculoClass 
	protected final Double volumenDeCargaTotal;
	protected final Double pesoDeCargaTotal;
	protected final Integer maxCantidadPaquetes;
	protected final Integer maxCiudadesQueRecorre;
	protected List<PaqueteClass> paquetes = new ArrayList<>();*/
	
	public CamionClass(TipoDeAcoplado tipoDeAcoplado, String patenteVehiculo) {
		super(tipoDeAcoplado.getVolumenMaximo(), 
				tipoDeAcoplado.getPesoMaximo(), 
				tipoDeAcoplado.getCantidadMaximaPaquetes(), 
				tipoDeAcoplado.getCantidadMaximaDeCiudades(),
				patenteVehiculo); //Volumen y peso totales. Cantidad de paquetes y ciudades que recorre.
		this.tipoDeAcoplado = tipoDeAcoplado;
	}

}
