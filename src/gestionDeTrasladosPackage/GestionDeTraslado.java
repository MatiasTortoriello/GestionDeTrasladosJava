package gestionDeTrasladosPackage;

import java.util.Arrays;

public class GestionDeTraslado {
    private static final int MAX_DESTINOS = 20;
    private static final int MAX_VIAJES = 50;
    private Destino[] destinos;
    private Viaje[] viajes;
    private int cantDestinos;
    private int cantViajes;

    public GestionDeTraslado() {
        destinos = new Destino[MAX_DESTINOS];
        viajes = new Viaje[MAX_VIAJES];
        cantDestinos = 0;
        cantViajes = 0;
    }

    public boolean agregarDestino(Destino destino) {
        if (cantDestinos >= MAX_DESTINOS || buscarDestino(destino.getCodigo()) != null) {
            return false;
        }
        destinos[cantDestinos++] = destino;
        return true;
    }

    public Destino buscarDestino(int codigo) {
        for (int i = 0; i < cantDestinos; i++) {
            if (destinos[i].getCodigo() == codigo) {
                return destinos[i];
            }
        }
        return null;
    }

    public boolean agregarViaje(Viaje viaje) {
        if (cantViajes >= MAX_VIAJES) {
            return false;
        }
        viajes[cantViajes++] = viaje;
        return true;
    }

    public double calcularCostoDelViaje(Viaje viaje) {
        double precioBase = viaje.getDestino().getDistancia() * 100; // Ejemplo: 100 unidades por km
        double descuento = (precioBase * viaje.getPorcentajeDescuento()) / 100;
        return precioBase - descuento;
    }

    public double calcularImporteTotal() {
        double total = 0;
        for (int i = 0; i < cantViajes; i++) {
            total += calcularCostoDelViaje(viajes[i]);
        }
        return total;
    }

    public double calcularImportePromedio() {
        if (cantViajes == 0) return 0;
        return calcularImporteTotal() / cantViajes;
    }

    public Viaje[] obtenerViajesOrdenadosPorCostoAscendente() {
        Viaje[] copia = Arrays.copyOf(viajes, cantViajes);
        Arrays.sort(copia, (v1, v2) -> Double.compare(calcularCostoDelViaje(v1), calcularCostoDelViaje(v2)));
        return copia;
    }

    public String viajeDeMayorPrecio() {
        if (cantViajes == 0) return "No hay viajes registrados.";

        Viaje mayor = viajes[0];
        double costoMayor = calcularCostoDelViaje(mayor);

        for (int i = 1; i < cantViajes; i++) {
            double costoActual = calcularCostoDelViaje(viajes[i]);
            if (costoActual > costoMayor) {
                mayor = viajes[i];
                costoMayor = costoActual;
            }
        }
        return mayor.toString() + ", Costo: $" + costoMayor;
    }
}