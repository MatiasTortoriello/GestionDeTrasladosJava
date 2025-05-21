package gestionDeTrasladosDominio;

import java.util.Set;

import gestionDeTrasladosEnums.TipoBicicleta;
import gestionDeTrasladosEnums.TipoDeAuto;

public class AutoClass extends VehiculoClass {
	
	private TipoDeAuto tipoDeAuto;
	/*
	 //Atributos que heredo de VehiculoClass
	Double volumenDeCargaTotal;
	Double pesoDeCargaTotal;
	Integer maxCantidadPaquetes;
	Integer maxCiudadesQueRecorre;
	String patenteVehiculo;
	protected List<PaqueteClass> paquetes = new ArrayList<>();*/
	
	public AutoClass(TipoDeAuto tipoDeAuto, String patenteVehiculo) {
		super(tipoDeAuto.getVolumenMaximo(), 
				tipoDeAuto.getPesoMaximo(), 
				tipoDeAuto.getCantidadMaximaPaquetes(), 
				tipoDeAuto.getCantidadMaximaDeCiudades(), 
				patenteVehiculo); //Volumen y peso totales. Cantidad de paquetes y ciudades que recorre.
		this.tipoDeAuto = tipoDeAuto;
		//this.patenteVehiculo = patenteVehiculo;
	}
	
	@Override
	public boolean equals(Object auto) {
	    if (this == auto) return true;
	    if (!(auto instanceof AutoClass)) return false;
	    AutoClass otroAuto = (AutoClass) auto;
	    return this.getPatenteVehiculo().equals(otroAuto.getPatenteVehiculo());
	}

	@Override
	public int hashCode() {
	    return getPatenteVehiculo().hashCode();
	}
	
}
