package gestionDeTrasladosDominio;

import java.util.ArrayList;
import java.util.List;

import gestionDeTrasladosEnums.TipoBicicleta;

public class BicicletaClass extends VehiculoClass{

	private final Integer MAX_CANTIDAD_PAQUETES = 2;
	private final Double MAX_VOLUMEN_CARGA = 0.125;
	private final Double MAX_PESO_CARGA = 15.0;
	private final Integer MAX_CIUDADES_QUE_RECORRE = 1;
	private TipoBicicleta tipoBicicleta;
	private List<PaqueteClass> listaDePaquetes = new ArrayList<>();
	
	BicicletaClass(Double maxVolumenDeCarga, Double maxPesoDeCarga, Integer maxCiudadesQueRecorre, Integer maxCantidadPaquetes, TipoBicicleta tipoBicicleta) {
		//super(maxVolumenDeCarga, maxPesoDeCarga, maxCiudadesQueRecorre);
		maxCantidadPaquetes = this.MAX_CANTIDAD_PAQUETES;
		maxVolumenDeCarga = this.MAX_VOLUMEN_CARGA;
		maxPesoDeCarga = this.MAX_PESO_CARGA;
		maxCiudadesQueRecorre = this.MAX_CIUDADES_QUE_RECORRE;
	}
	
	BicicletaClass(Double maxPesoDeCarga, Integer maxCantidadPaquetes){
		//super( maxPesoDeCarga, maxPesoDeCarga, maxCantidadPaquetes );
		maxCantidadPaquetes = this.MAX_CANTIDAD_PAQUETES;
		//maxVolumenDeCarga = this.MAX_VOLUMEN_CARGA;
		maxPesoDeCarga = this.MAX_PESO_CARGA;
		//maxCiudadesQueRecorre = this.MAX_CIUDADES_QUE_RECORRE;

	}

	
	public Boolean existePaquete(PaqueteClass paquete) {
		/*for (PaqueteClass p : listaDePaquetes) {
			if (p.getidPaquete().equals(paquete.getidPaquete())) {
				return true;
			}
		}
		*/
		return false;
	}
	
	public Integer numeroDePaquete(PaqueteClass paquete) {
		/*System.out.println(paquete.getidPaquete());
		return paquete.getidPaquete();*/
		return 0;
	}
	
	@Override
	public void agregarPaqueteAlEnvio(PaqueteClass paquete) {
		
		if (!listaDePaquetes.contains(paquete) && listaDePaquetes.size() < MAX_CANTIDAD_PAQUETES) {
			listaDePaquetes.add(paquete);
		}
	}
	
	
	@Override			
	public Double calcularVolumenDelEnvioTotal() {
		/*Double volumenDelEnvioTotal = 0.0;
		for (int i = 0; i < arrayDePaquetes.length; i++) {
			if(arrayDePaquetes[i] != null ) {
				volumenDelEnvioTotal += arrayDePaquetes[i].calcularVolumen();
			}
		}
		return volumenDelEnvioTotal;*/
	}
	
	@Override
	public Double calcularPesoDelEnvioTotal() {
		/*Double pesoDelEnvioTotal = 0.0;
		for (int i = 0; i < arrayDePaquetes.length; i++) {
			if(arrayDePaquetes[i] != null ) {
			pesoDelEnvioTotal += arrayDePaquetes[i].getPeso();
			}
		}
		return pesoDelEnvioTotal;*/
	}
	
	@Override
	void llevarPaquete(Integer maxCiudadesQueRecorre) {
		/*Double volumenDelPaquete = 0.0;
		Double pesoDelpaquete =0.0;
		
		volumenDelPaquete = calcularVolumenDelEnvioTotal(); 
		pesoDelpaquete = calcularPesoDelEnvioTotal();
		
		if((volumenDelPaquete <= MAX_VOLUMEN_CARGA) && (pesoDelpaquete <= MAX_PESO_CARGA) && (maxCiudadesQueRecorre <= MAX_CIUDADES_QUE_RECORRE)){
			System.out.println("La Bicicleta llevara el paquete");
			//return arrayDePaquetes[];
		}else {
			System.out.println("La bicileta no llevara el paquete");
		}	 */
	}

}
