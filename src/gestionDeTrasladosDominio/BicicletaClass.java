package gestionDeTrasladosDominio;

import java.util.ArrayList;
import java.util.List;

import gestionDeTrasladosEnums.TipoBicicleta;

public class BicicletaClass extends VehiculoClass{

	private TipoBicicleta tipoBicicleta;
	/*
	 //Atributos que heredo de VehiculoClass
	protected final Double volumenDeCargaTotal;
	protected final Double pesoDeCargaTotal;
	protected final Integer maxCantidadPaquetes;
	protected final Integer maxCiudadesQueRecorre;
	protected List<PaqueteClass> paquetes = new ArrayList<>();*/
	
	public BicicletaClass(TipoBicicleta tipoBicicleta, String patenteVehiculo) {
		super(tipoBicicleta.getVolumenMaximo(), 
				tipoBicicleta.getPesoMaximo(), 
				tipoBicicleta.getCantidadMaximaPaquetes(), 
				tipoBicicleta.getCantidadMaximaDeCiudades(),
				patenteVehiculo); //Volumen y peso totales. Cantidad de paquetes y ciudades que recorre. 
		this.tipoBicicleta = tipoBicicleta;
	}
	
}
