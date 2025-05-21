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
	
	/*@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;

	    DestinoClass other = (DestinoClass) obj;
	    return ciudadDestino != null && ciudadDestino.equalsIgnoreCase(other.ciudadDestino);
	}

	@Override
	public int hashCode() {
	    return ciudadDestino != null ? ciudadDestino.toLowerCase().hashCode() : 0;
	}*/
		
}
