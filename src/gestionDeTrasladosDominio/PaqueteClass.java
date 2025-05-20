package gestionDeTrasladosDominio;

import java.util.Objects;

public class PaqueteClass {
	
    private Double alturaPaquete;
    private Double anchoPaquete;
    private Double profundoPaquete;
    private Double pesoPaquete;
    private String destinoPaquete;

    public PaqueteClass(Double altura, Double ancho, Double profundidad, Double peso, String destino) {
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
    
    public Double getVolumen() {
        return alturaPaquete * anchoPaquete * profundoPaquete;
    }

    public Double getPeso() {
        return pesoPaquete;
    }

    public String getDestino() {
        return destinoPaquete;
    }
    

    //Otros Métodos
    

    @Override
    public boolean equals(Object objetoPaquete) {
    	
        if (this == objetoPaquete) return true;
        
        if (!(objetoPaquete instanceof PaqueteClass)) return false;
        
        PaqueteClass paquete = (PaqueteClass) objetoPaquete;
        return Double.compare(pesoPaquete, paquete.pesoPaquete) == 0 &&
               Double.compare(getVolumen(), paquete.getVolumen()) == 0 &&
               destinoPaquete.equals(paquete.destinoPaquete);
    }

    @Override
    public int hashCode() {
    	
        return Objects.hash(getVolumen(), pesoPaquete, destinoPaquete);
        
    }
}