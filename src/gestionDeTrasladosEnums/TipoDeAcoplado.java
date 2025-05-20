package gestionDeTrasladosEnums;

public enum TipoDeAcoplado {
	
		Tradicional(1.5, 250.0, 20),
		RemolqueArticulado(2.0, 500.0, 30);
		
		private final Double volumenMaximo;
		private final Double pesoMaximo;
		private final Integer cantidadMaximaDePaquetes;
		
		
		private TipoDeAcoplado(Double volumenMaximo, Double pesoMaximo, Integer cantidadMaximaDePaquetes) {
			this.volumenMaximo = volumenMaximo;
			this.pesoMaximo = pesoMaximo;
			this.cantidadMaximaDePaquetes = cantidadMaximaDePaquetes;
		}
		
	    public double getVolumenMaximo() {
	        return volumenMaximo;
	    }

	    public double getPesoMaximo() {
	        return pesoMaximo;
	    }

	    public int getCantidadMaximaPaquetes() {
	        return cantidadMaximaDePaquetes;
	    }
	}


