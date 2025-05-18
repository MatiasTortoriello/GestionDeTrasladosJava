package gestionDeTrasladosInterfaz;

import java.util.ArrayList;
import java.util.HashSet;

import gestionDeTrasladosDominio.DestinoClass;
import gestionDeTrasladosDominio.VehiculoClass;
import gestionDeTrasladosDominio.ViajeClass;

public class GestionDeTrasladoClass {
	private Integer numeroDeGestion
    private ArrayList<VehiculoClass> listaVehiculos;
    private HashSet<Integer> paquetesAsignados;
    
	public GestionDeTrasladoClass() {
        listaVehiculos = new ArrayList<>();
        paquetesAsignados = new HashSet<>();
	}
	
	////////////////////GETTERS Y SETTERS/////////////////////////
	
	public String getNumeroDeGestion() {
		return numeroDeGestion;
	}

	public void setNumeroDeGestion(String numeroDeGestion) {
		this.numeroDeGestion = numeroDeGestion;
	}

	public Double getCostoMinimo() {
		return costoMinimo;
	}

	public void setCostoMinimo(Double costoMinimo) {
		this.costoMinimo = costoMinimo;
	}

	public Double getCostoPorKm() {
		return costoPorKm;
	}

	public void setCostoPorKm(Double costoPorKm) {
		this.costoPorKm = costoPorKm;
	}

	

	/***
	 * Agrega una nuevo destino
	 * 
	 * @param destino
	 * @return true si se pudo agregar o false en caso contrario Se debera buscar si
	 *         ya se ha ingresado con anterioridad y contemplar esta situacion
	 */
	public boolean agregarDestino(DestinoClass destino) {

		return false;

	}

	
	/***
	 * Buscar un destino
	 * 
	 * @param codigo del destino buscado
	 * @return Destino (null si no existe)
	 */
	public DestinoClass buscarDestino(Integer codigo) {

		return null;
	}

	/****
	 * Agrega un nuevo viaje. Asigna el costo antes de agregarlo
	 * 
	 * @param viaje Viaje
	 * @return true si se pudo agregar o false en caso contrario
	 */
	public boolean agregarViaje(ViajeClass viaje) {

		return false;
	}

	/***
	 * Calcula el costo del viaje
	 * 
	 * @return double
	 */
	public double calcularCostoDelViaje(ViajeClass viaje) {
		return 0;
	}

	/****
	 * Calcula el importe total de todos los viajes
	 * 
	 * @return importe total
	 */
	public double calcularImporteTotal() {
		return 0;
	}

	/***
	 * Calcula el importe promedio de los viajes
	 * 
	 * @return importe promedio
	 */
	public double calcularImportePromedio() {

		return 0;
	}

	/***
	 * Obtener viajes ordenados por costo ascendente
	 * 
	 * @return Viaje[]
	 */
	public ViajeClass[] obtenerViajesOrdenadosPorCostoAscendente() {

		return null;
	}
	
	/*public double calcularCosto(Double distancia) {
    return distancia * PRECIOPORKILOMETRO;
	}*/

	/****
	 * Devuelve en formato String un resumen de los viajes realizados Ordenados por
	 * costo de forma ascendente
	 * 
	 * @return Listado de las ventas realizadas
	 */
	public String toString() {
		return "";
	}

	/*
	 * Debe determinar el viaje de mayor precio y devolver todos los datos del
	 * destino y el valor del viaje hallado
	 */
	public String viajeDeMayorPrecio() {

		return "";
	}
}