package gestionDeTrasladosEnums;

public enum TipoBicicleta {
	Playera(2.0, 5.0, 2, 0), //Volumen - Peso - MaxPaquetes - MaxCiudades
	MountainBike(3.0, 10.0, 2, 0),
	Tradicional(4.0, 15.0, 3, 0);
	
	private final Double volumenMaximo;
	private final Double pesoMaximo;
	private final Integer cantidadMaximaDePaquetes;
	private final Integer cantidadMaximaDeCiudades;
	
	
	private TipoBicicleta(Double volumenMaximo, Double pesoMaximo, Integer cantidadMaximaDePaquetes, Integer cantidadMaximaDeCiudades) {
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
