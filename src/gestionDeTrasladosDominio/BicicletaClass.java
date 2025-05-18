package gestionDeTrasladosDominio;

import java.util.ArrayList;
import java.util.List;

import gestionDeTrasladosEnums.TipoBicicleta;

public class BicicletaClass extends VehiculoClass{


	private final Double volumenDeCargaTotal = 0.125;
	private final Double pesoDeCargaTotal = 15.0;
	private final Integer ciudadesMaximasQueRecorre = 1;
	private TipoBicicleta tipoBicicleta;
	
	BicicletaClass(Double maxVolumenDeCarga, Double maxPesoDeCarga, Integer maxCiudadesQueRecorre, Integer maxCantidadPaquetes, TipoBicicleta tipoBicicleta) {
		//super(maxVolumenDeCarga, maxPesoDeCarga, maxCiudadesQueRecorre);

		maxVolumenDeCarga = this.volumenDeCargaTotal;
		maxPesoDeCarga = this.pesoDeCargaTotal;
		maxCiudadesQueRecorre = this.ciudadesMaximasQueRecorre;
	}
	


}
