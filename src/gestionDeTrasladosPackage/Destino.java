package gestionDeTrasladosPackage;

public class Destino {
    private int codigo;
    private String ciudad;
    private double distancia;

    public Destino(int codigo, String ciudad, double distancia) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.distancia = distancia;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double getDistancia() {
        return distancia;
    }

    @Override
    public String toString() {
        return "Destino [Código=" + codigo + ", Ciudad=" + ciudad + ", Distancia=" + distancia + " km]";
    }
}