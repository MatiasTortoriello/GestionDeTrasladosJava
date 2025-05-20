package gestionDeTrasladosDominio;

import java.util.Set;

import gestionDeTrasladosEnums.TipoBicicleta;
import gestionDeTrasladosEnums.TipoDeAuto;

public class AutoClass extends VehiculoClass {
	
	private TipoDeAuto tipoDeAuto;
	
	public AutoClass(TipoDeAuto tipoDeAuto) {
		super(tipoDeAuto.getVolumenMaximo(), tipoDeAuto.getPesoMaximo(), tipoDeAuto.getCantidadMaximaPaquetes(), 500);
		this.tipoDeAuto = tipoDeAuto;
	}
	
	@Override
	public boolean puedeTransportarPaquete(PaqueteClass paquete) {

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
