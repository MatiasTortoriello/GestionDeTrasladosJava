package gestionDeTrasladosEnums;

public enum TipoDeAuto {
	Coupe(1.5, 250.0, 20, 100),
	Sedan(2.0, 500.0, 30, 100),
	SUV(3.5, 600.0, 50, 100);
	
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
	
    public double getVolumenMaximo() {
        return volumenMaximo;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public int getCantidadMaximaPaquetes() {
        return cantidadMaximaDePaquetes;
    }
    
    public Integer getCantidadMaximaDeCiudades() {
		return cantidadMaximaDePaquetes;
    	
    }
}
