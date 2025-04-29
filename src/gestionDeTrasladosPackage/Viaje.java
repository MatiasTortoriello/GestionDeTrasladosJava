package gestionDeTrasladosPackage;

import java.util.Random;

public class Viaje {
    private Destino destino;
    private String nombreCliente;
    private int porcentajeDescuento;
    private int numeroAleatorio;

    public Viaje(Destino destino, String nombreCliente, int porcentajeDescuento) {
        this.destino = destino;
        this.nombreCliente = nombreCliente;
        this.porcentajeDescuento = porcentajeDescuento;
        Random random = new Random();
        this.numeroAleatorio = random.nextInt(93) + 7; // Número entre 7 y 99
    }

    public Destino getDestino() {
        return destino;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    @Override
    public String toString() {
        return "Viaje [Cliente=" + nombreCliente + " #" + numeroAleatorio + ", Destino=" + destino.getCiudad() +
               ", Descuento=" + porcentajeDescuento + "%]";
    }
}