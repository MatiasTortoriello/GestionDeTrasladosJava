package gestionDeTrasladosEnums;

public enum TipoDeAuto {
	Coupe(1.5, 250.0, 20),
	Sedan(2.0, 500.0, 30),
	SUV(3.5, 600.0, 50);
	
	private final Double volumenMaximo;
	private final Double pesoMaximo;
	private final Integer cantidadMaximaDePaquetes;
	
	
	private TipoDeAuto(Double volumenMaximo, Double pesoMaximo, Integer cantidadMaximaDePaquetes) {
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
