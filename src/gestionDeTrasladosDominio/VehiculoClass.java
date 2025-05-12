package gestionDeTrasladosDominio;

public class VehiculoClass {
	public String patente;
	public String marca;
	public String modelo;
	public Double pesoTotalQuePuedeLlevar;
	
	public VehiculoClass (String patente, String marca, String modelo, Double pesoTotalQuePuedeLlevar) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.pesoTotalQuePuedeLlevar = pesoTotalQuePuedeLlevar;
	}
	
	public VehiculoClass() {
		
	}
	

	 ///GETTERS Y SETTERS ////
	 

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
	
	@Override
	public String toString() {
		return marca + modelo;
	}
	
	

}



	
