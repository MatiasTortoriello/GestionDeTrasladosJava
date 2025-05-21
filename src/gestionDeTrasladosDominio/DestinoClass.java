package gestionDeTrasladosDominio;

public class DestinoClass {
	private String calleDestino;
	private String numeroDestino;
	private String ciudadDestino;
	
	
	public DestinoClass(String calleDestino, String numeroDestino, String ciudadDestino) {
		this.calleDestino = calleDestino;
		this.numeroDestino = numeroDestino;
		this.ciudadDestino = ciudadDestino;
		
	}


	public String getCalleDestino() {
		return calleDestino;
	}


	public void setCalleDestino(String calleDestino) {
		this.calleDestino = calleDestino;
	}


	public String getNumeroDestino() {
		return numeroDestino;
	}


	public void setNumeroDestino(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}


	public String getCiudadDestino() {
		return ciudadDestino;
	}


	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	
	
}
