package gestionDeTrasladosDominio;

import java.util.Set;

import gestionDeTrasladosEnums.TipoBicicleta;
import gestionDeTrasladosEnums.TipoDeAuto;

public class AutoClass extends VehiculoClass {
	
	private TipoDeAuto tipoDeAuto;
	
	public AutoClass(TipoDeAuto tipoDeAuto) {
		super(tipoDeAuto.getVolumenMaximo(), 
				tipoDeAuto.getPesoMaximo(), 
				tipoDeAuto.getCantidadMaximaPaquetes(), 
				tipoDeAuto.getCantidadMaximaDeCiudades()); //Volumen y peso totales. Maximo de ciudades que recorre y cantidad de paquetes máximos. Heredados de VehiculoClass
		this.tipoDeAuto = tipoDeAuto;
	}

	@Override
	public boolean puedeTransportarPaquete(PaqueteClass paquete) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
