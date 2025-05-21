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
	
	@Override
	public boolean equals(Object destino) {
	    if (this == destino) return true;
	    if (destino == null || getClass() != destino.getClass()) return false;

	    DestinoClass otroDestino = (DestinoClass) destino;
	    return ciudadDestino != null && ciudadDestino.equalsIgnoreCase(otroDestino.ciudadDestino);
	}

	@Override
	public int hashCode() {
	    if (ciudadDestino != null) {
	        return ciudadDestino.toLowerCase().hashCode();
	    } else {
	        return 0;
	    }
	}
		
}
