package gestionDeTrasladosInterfaz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import gestionDeTrasladosDominio.VehiculoClass;


public class GestionDeTrasladoClass {
	
	  private final Set<VehiculoClass> listaVehiculos = new HashSet<>();
	  //private static Set<String> listaDePatentes = new HashSet<>();

	  public GestionDeTrasladoClass() {
		  
	  }
	  
	  public boolean agregarVehiculo(VehiculoClass vehiculo) {
	        return listaVehiculos.add(vehiculo);
	    }

	  public Set<VehiculoClass> getVehiculos() {
	        return listaVehiculos;
	    }
	  
	  /*public boolean agregarVehiculo(VehiculoClass vehiculo) {
	    	if(listaVehiculos.contains(vehiculo.getPatenteVehiculo())) {
	    		/*Si entra acá, quiere decir que la patente está duplicada y no se puede agregar.*/
	    		/*System.out.println("Esta patente ya existe: " + vehiculo.getPatenteVehiculo());
	    		return false;
	    	}*/
	    	/*Si no entra al if, entonces la patente es única y se puede argegar*/
	       /* return listaVehiculos.add(vehiculo);
	    }*/
	 
}