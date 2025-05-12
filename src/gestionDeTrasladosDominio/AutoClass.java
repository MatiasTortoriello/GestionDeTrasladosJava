package gestionDeTrasladosDominio;

import gestionDeTrasladosEnums.TipoDeAuto;

public class AutoClass extends VehiculoClass {
	
	private TipoDeAuto tipoDeAuto;
	
	public AutoClass(String patente, String marca, String modelo, Double pesoTotalQuePuedeLlevar, TipoDeAuto tipoDeAuto) {
		super(patente, marca, modelo, pesoTotalQuePuedeLlevar);
		this.tipoDeAuto = tipoDeAuto;
	}
	
}
