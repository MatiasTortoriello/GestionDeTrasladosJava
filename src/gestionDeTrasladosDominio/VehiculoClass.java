package gestionDeTrasladosDominio;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class VehiculoClass {
	
	protected final Double volumenDeCargaTotal;
	protected final Double pesoDeCargaTotal;
	protected final Integer maxCantidadPaquetes;
	protected final Integer maxCiudadesQueRecorre;
	protected Set<PaqueteClass> listaPaquetes = new HashSet<>();
	protected Set<DestinoClass> destinos = new HashSet<>();
	protected String patenteVehiculo; 
	
	/*public VehiculoClass (String patente, String tipo, String marca, String modelo, Double pesoTotalQuePuedeLlevar) {
		this.patente = patente;
		this.tipo = tipo
		this.marca = marca;
		this.modelo = modelo;
		this.pesoTotalQuePuedeLlevar = pesoTotalQuePuedeLlevar;
	}*/
	
	public VehiculoClass(Double volumenDeCargaTotal, Double pesoDeCargaTotal, Integer maxCantidadPaquetes, Integer maxCiudadesQueRecorre, String patenteVehiculo) {
		
		this.volumenDeCargaTotal = volumenDeCargaTotal;
		this.pesoDeCargaTotal = pesoDeCargaTotal;
		this.maxCiudadesQueRecorre = maxCiudadesQueRecorre;
		this.maxCantidadPaquetes = maxCantidadPaquetes;
		this.patenteVehiculo = patenteVehiculo;
	
	}
	
	 ///GETTERS Y SETTERS ////
	
	public Set<PaqueteClass> getPaquetes() {
        return listaPaquetes;
    }
	
	public Set<DestinoClass> getDestinos() {
		return destinos;
	}

	public void setDestinos(Set<DestinoClass> destinos) {
		this.destinos = destinos;
	}

	public Double getVolumenDeCargaTotal() {
		return volumenDeCargaTotal;
	}

	public Double getPesoDeCargaTotal() {
		return pesoDeCargaTotal;
	}

	public Integer getMaxCantidadPaquetes() {
		return maxCantidadPaquetes;
	}

	public Integer getMaxCiudadesQueRecorre() {
		return maxCiudadesQueRecorre;
	}

	public void setPaquetes(Set<PaqueteClass> paquetes) {
		this.listaPaquetes = paquetes;
	}

	public void setPatenteVehiculo(String patenteVehiculo) {
		this.patenteVehiculo = patenteVehiculo;
	}
	
	public String getPatenteVehiculo() {
		return this.patenteVehiculo;
	}
	
	
	////////////OTROS METODOS/////////////////
		
	public Double volumenTotal() {
	    Double volumenTotal = 0.0;
	    for (PaqueteClass paquete : listaPaquetes) {
	        volumenTotal = volumenTotal + paquete.getVolumen();
	    }
	    return volumenTotal;
	}

	public Double pesoTotal() {
	    Double pesoTotal = 0.0;
	    for (PaqueteClass paquete : listaPaquetes) {
	        pesoTotal = pesoTotal + paquete.getPeso();
	    }
	    return pesoTotal;
	}
	
	public void agregarDestino(DestinoClass destino) {
	    this.destinos.add(destino);
	}
		
	public Boolean puedeTransportarPaquete(PaqueteClass paquete) {
  
	    return listaPaquetes.size() < maxCantidadPaquetes &&  /*Si la cantidad de paquetes es menor o igual a la cantidad máxima de paquetes que puede llevar el vehículo.*/
	            (pesoTotal() + paquete.getPeso()) <= pesoDeCargaTotal && /*Si el último paquete que se carga más el peso total de todos los paquetes es menor o igual a la cantidad de peso que puede cargarse.*/
	            (volumenTotal() + paquete.getVolumen()) <= volumenDeCargaTotal && /*Si el volumen del último paquete sumado al volumen total que ya existe es menor o igual al volumen total que puede llevar el vehículo.*/
	            (destinos.size() < maxCiudadesQueRecorre); /*Si el tamaño de la lista de ciudades es menor o igual a las ciudades que recorre*/
		}
	
	public Boolean asignarPaquete(PaqueteClass paquete) {
        if (puedeTransportarPaquete(paquete)) {
            listaPaquetes.add(paquete);
            /*paquete.setVehiculoAsignado(this);*/
            destinos.add(paquete.getDestino());
            return true;
        }
        return false;
	}

	@Override
	public boolean equals(Object vehiculo) {
	    if (this == vehiculo) return true;
	    if (vehiculo == null || getClass() != vehiculo.getClass()) return false;
	    VehiculoClass nuevoVehiculo = (VehiculoClass) vehiculo;
	    return patenteVehiculo.equals(nuevoVehiculo.patenteVehiculo);
	}

	@Override
	public int hashCode() {
	    return patenteVehiculo.hashCode();
	}
	
	/*
	protected String getPatente() {
		return patente;
	}
	protected void setPatente(String patente) {
		this.patente = patente;
	}
	protected String getTipo(){
		return tipo;
	}
	protected void setTipo(String tipo){
		this.tipo = tipo;
	}
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected Double getPesoTotalQuePuedeLlevar() {
		return pesoTotalQuePuedeLlevar;
	}
	protected void setPesoTotalQuePuedeLlevar(Double pesoTotalQuePuedeLlevar) {
		this.pesoTotalQuePuedeLlevar = pesoTotalQuePuedeLlevar;
	}
	public Double getVolumenTotalQuePuedeLlevar() {
		return volumenTotalQuePuedeLlevar;
	}
	public void setVolumenTotalQuePuedeLlevar(Double volumenTotalQuePuedeLlevar) {
		this.volumenTotalQuePuedeLlevar = volumenTotalQuePuedeLlevar;
	}
*/

		
}



	
