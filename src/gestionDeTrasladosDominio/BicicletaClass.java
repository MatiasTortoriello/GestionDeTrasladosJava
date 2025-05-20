package gestionDeTrasladosDominio;

import java.util.ArrayList;
import java.util.List;

import gestionDeTrasladosEnums.TipoBicicleta;

public class BicicletaClass extends VehiculoClass{

	private TipoBicicleta tipoBicicleta;
	//Hereda el List Paquetes
	BicicletaClass(TipoBicicleta tipoBicicleta) {
		//super(maxVolumenDeCarga, maxPesoDeCarga, maxCiudadesQueRecorre);
		super(0.125, 15.0, 1, 2); //Volumen y peso totales. Maximo de ciudades que recorre . Heredados de VehiculoClass
		tipoBicicleta = this.tipoBicicleta;
	}
	

	@Override
	public boolean puedeTransportarPaquete(PaqueteClass paquete) {

		return false;
	}

	@Override
	public void agregarPaqueteAlEnvio(PaqueteClass paquete) {		
	}
	
	public boolean asignarPaquete(PaqueteClass nuevoPaquete) {
        if (puedeTransportarPaquete(nuevoPaquete)) {
            paquetes.add(nuevoPaquete);
            return true;
        }
        return false;
	}

	


}
