package gestionDeTrasladosDominio;

import gestionDeTrasladosEnums.TipoBicicleta;
import gestionDeTrasladosEnums.TipoDeAuto;

public class AutoClass extends VehiculoClass {
	
	private TipoDeAuto tipoDeAuto;
	
	public AutoClass(TipoDeAuto tipoDeAuto) {
		super(2.0, 500.0);
		this.tipoDeAuto = tipoDeAuto;
	}
	
	

	@Override
	protected boolean puedeCargar(PaqueteClass paquete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void agregarPaqueteAlEnvio(PaqueteClass paquete) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean puedeTransportarPaquete(PaqueteClass paquete) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
