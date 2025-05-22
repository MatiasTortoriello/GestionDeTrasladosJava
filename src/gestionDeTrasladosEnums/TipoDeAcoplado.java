package gestionDeTrasladosEnums;

public enum TipoDeAcoplado {
	
		Tradicional(20.0, 250.0, 20, 8),  //Volumen - Peso - MaxPaquetes - MaxCiudades
		RemolqueArticulado(40.0, 500.0, 40, 5);
		
		private final Double volumenMaximo;
		private final Double pesoMaximo;
		private final Integer cantidadMaximaDePaquetes;
		private final Integer cantidadMaximaDeCiudades;
		
		private TipoDeAcoplado(Double volumenMaximo, Double pesoMaximo, Integer cantidadMaximaDePaquetes, Integer cantidadMaximaDeCiudades) {
			this.volumenMaximo = volumenMaximo;
			this.pesoMaximo = pesoMaximo;
			this.cantidadMaximaDePaquetes = cantidadMaximaDePaquetes;
			this.cantidadMaximaDeCiudades = cantidadMaximaDeCiudades;
		}
		
	    public Double getVolumenMaximo() {
	        return volumenMaximo;
	    }

	    public Double getPesoMaximo() {
	        return pesoMaximo;
	    }

	    public Integer getCantidadMaximaPaquetes() {
	        return cantidadMaximaDePaquetes;
	    }
	    
	    public Integer getCantidadMaximaDeCiudades() {
	    	return cantidadMaximaDeCiudades;
	    }
	}