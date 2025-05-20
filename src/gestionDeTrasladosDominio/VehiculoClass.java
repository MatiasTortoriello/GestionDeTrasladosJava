package gestionDeTrasladosDominio;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;
import java.util.List;

public abstract class VehiculoClass {
	
	protected final Double volumenDeCargaTotal;
	protected final Double pesoDeCargaTotal;
	protected final Integer maxCantidadPaquetes;
	protected final Integer maxCiudadesQueRecorre;
	protected List<PaqueteClass> paquetes = new ArrayList<>();
	
	/*public VehiculoClass (String patente, String marca, String modelo, Double pesoTotalQuePuedeLlevar) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.pesoTotalQuePuedeLlevar = pesoTotalQuePuedeLlevar;
	}*/
	
	public VehiculoClass(Double volumenDeCargaTotal, Double pesoDeCargaTotal, Integer maxCantidadPaquetes, Integer maxCiudadesQueRecorre) {
		this.volumenDeCargaTotal = volumenDeCargaTotal;
		this.pesoDeCargaTotal = pesoDeCargaTotal;
		this.maxCiudadesQueRecorre = maxCiudadesQueRecorre;
		this.maxCantidadPaquetes = maxCantidadPaquetes;
	}
	
	 ///GETTERS Y SETTERS ////
	
	public List<PaqueteClass> getPaquetes() {
        return paquetes;
    }
	 
	/*
	protected String getPatente() {
		return patente;
	}

	protected void setPatente(String patente) {
		this.patente = patente;
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
	////////////OTROS METODOS/////////////////
		
	public boolean puedeTransportarPaquete(PaqueteClass paquete) {
		return true;
	}
	
	public boolean asignarPaquete(PaqueteClass nuevoPaquete) {
        if (puedeTransportarPaquete(nuevoPaquete)) {
            paquetes.add(nuevoPaquete);
            return true;
        }
        return false;
	}
	
	

		
}



	
