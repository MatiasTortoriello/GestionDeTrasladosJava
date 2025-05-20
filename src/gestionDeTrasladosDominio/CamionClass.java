package gestionDeTrasladosDominio;

import gestionDeTrasladosEnums.TipoDeAcoplado;
import gestionDeTrasladosEnums.TipoDeAuto;

public class CamionClass extends VehiculoClass {

	private TipoDeAcoplado tipoDeAcoplado;
	
	public CamionClass(TipoDeAcoplado tipoDeAcoplado) {
		super(tipoDeAcoplado.getVolumenMaximo(), 
				tipoDeAcoplado.getPesoMaximo(), 
				tipoDeAcoplado.getCantidadMaximaPaquetes(), 
				500); //Volumen y peso totales. Maximo de ciudades que recorre y cantidad de paquetes máximos. Heredados de VehiculoClass
		this.tipoDeAcoplado = tipoDeAcoplado;
	}



	@Override
	public boolean puedeTransportarPaquete(PaqueteClass paquete) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean asignarPaquete(PaqueteClass nuevoPaquete) {
        if (puedeTransportarPaquete(nuevoPaquete)) {
            paquetes.add(nuevoPaquete);
            return true;
        }
        return false;
	}

}
