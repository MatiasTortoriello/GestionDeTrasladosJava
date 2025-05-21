package gestionDeTrasladosDominio;

import java.util.Objects;

public class PaqueteClass {
	
	private Integer codigoPaquete;
    private Double alturaPaquete;
    private Double anchoPaquete;
    private Double profundoPaquete;
    private Double pesoPaquete;
    private DestinoClass destinoPaquete;

    
    public PaqueteClass(Integer codigoPaquete, Double altura, Double ancho, Double profundidad, Double peso, DestinoClass destino) {
		
    	this.codigoPaquete = codigoPaquete;
        this.alturaPaquete = altura;
        this.anchoPaquete = ancho;
        this.profundoPaquete = profundidad;
        this.pesoPaquete = peso;
        this.destinoPaquete = destino;

    }
    
    /////Getters y Setters/////
    ///
    /*public Double getVolumen() {
    	return (alturaPaquete*anchoPaquete)*profundoPaquete;
    }*/
    
	public Integer getCodigoPaquete() {
		return this.codigoPaquete;
	}
	
    public Double getVolumen() {
        return alturaPaquete * anchoPaquete * profundoPaquete;
    }

    public Double getPeso() {
        return pesoPaquete;
    }

    public DestinoClass getDestino() {
        return destinoPaquete;
    }
    
    /*public VehiculoClass getVehiculoAsignado() {
		return vehiculoAsignado;
	}

	public void setVehiculoAsignado(VehiculoClass vehiculoAsignado) {
		this.vehiculoAsignado = vehiculoAsignado;
	}*/
    
   
    //Otros Métodos
    

    @Override
    public boolean equals(Object objetoPaquete) {
    	
        if (this == objetoPaquete) return true;
        
        if (!(objetoPaquete instanceof PaqueteClass)) return false;
        
        PaqueteClass paquete = (PaqueteClass) objetoPaquete;
        return Integer.compare(codigoPaquete, paquete.codigoPaquete) == 0;
    }

    @Override
    public int hashCode() {
    	
        return Objects.hash(codigoPaquete);
        
    }
}