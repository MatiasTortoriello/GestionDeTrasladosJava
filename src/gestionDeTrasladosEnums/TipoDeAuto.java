package gestionDeTrasladosEnums;

public enum TipoDeAuto {
	Coupe(10.0, 100.0, 20, 3), //Volumen - Peso - MaxPaquetes - MaxCiudades
	Sedan(2.0, 500.0, 30, 5),
	SUV(3.5, 600.0, 50, 6);
	
	private final Double volumenMaximo;
	private final Double pesoMaximo;
	private final Integer cantidadMaximaDePaquetes;
	private final Integer cantidadMaximaDeCiudades;
	
	
	private TipoDeAuto(Double volumenMaximo, Double pesoMaximo, Integer cantidadMaximaDePaquetes, Integer cantidadMaximaDeCiudades) {
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
