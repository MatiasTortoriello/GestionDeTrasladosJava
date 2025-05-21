package gestionDeTrasladosInterfaz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import gestionDeTrasladosDominio.VehiculoClass;


public class GestionDeTrasladoClass {
	
	  private final Set<VehiculoClass> listaVehiculos = new HashSet<>();
	  private static Set<String> listaDePatentes = new HashSet<>();

	    public boolean agregarTransporte(VehiculoClass vehiculo) {
	    	if(listaDePatentes.contains(vehiculo.getPatenteVehiculo())) {
	    		
	    	}
	        return listaVehiculos.add(vehiculo); //Arranca a agregar vehículos en esta lista, corroborando que no estén repetidos
	    }

	    public Set<VehiculoClass> getTransportes() {
	        return listaVehiculos;
	    }
	    
	/*public GestionDeTrasladoClass() {
        listaVehiculos = new HashSet<>();
        paquetesAsignados = new HashSet<>();
	}*/
	
}