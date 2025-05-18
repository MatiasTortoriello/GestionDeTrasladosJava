package gestionDeTrasladosInterfaz;

import java.util.ArrayList;
import java.util.HashSet;

import gestionDeTrasladosDominio.VehiculoClass;
import gestionDeTrasladosDominio.ViajeClass;

public class GestionDeTrasladoClass {
	private String numeroDeGestion;
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



	
}