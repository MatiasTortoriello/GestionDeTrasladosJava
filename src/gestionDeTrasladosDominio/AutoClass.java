package gestionDeTrasladosDominio;

import gestionDeTrasladosEnums.TipoBicicleta;
import gestionDeTrasladosEnums.TipoDeAuto;

public class AutoClass extends VehiculoClass {
	
	private TipoDeAuto tipoDeAuto;
	
	public AutoClass(TipoDeAuto tipoDeAuto) {
		super(2.0, 500.0, 2);
		this.tipoDeAuto = tipoDeAuto;
	}
	
	@Override
	public boolean puedeTransportarPaquete(PaqueteClass paquete) {

		return false;
	}

	@Override
	public void agregarPaqueteAlEnvio(PaqueteClass paquete) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean asignarPaquete(PaqueteClass nuevoPaquete) {
        if (puedeTransportarPaquete(nuevoPaquete)) {
            paquetes.add(nuevoPaquete);
            return true;
        }
        return false;
	}


}
