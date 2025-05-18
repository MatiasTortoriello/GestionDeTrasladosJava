package gestionDeTrasladosDominio;

import java.util.Objects;

public class PaqueteClass {
    private Double altoPaquete;
    private Double anchoPaquete;
    private Double profundoPaquete;
    private Double pesoPaquete;
    private String destinoPaquete;

    public PaqueteClass(Double alto, Double ancho, Double profundo, Double peso, String destino) {
        this.altoPaquete = alto;
        this.anchoPaquete = ancho;
        this.profundoPaquete = profundo;
        this.pesoPaquete = peso;
        this.destinoPaquete = destino;
    }
    
    /////Getters y Setters/////

    public double getVolumen() {
        return altoPaquete * anchoPaquete * profundoPaquete;
    }

    public double getPeso() {
        return pesoPaquete;
    }

    public String getDestino() {
        return destinoPaquete;
    }

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