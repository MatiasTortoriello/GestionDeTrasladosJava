package gestionDeTrasladosDominio;

public class DestinoClass {
	private String nombreDestino;
	private Integer idDestino;
	private TipoDestino tipoDestino;
	
	public DestinoClass(String nombreDestino, Integer idDestino, TipoDestino tipoDestino) {
		this.nombreDestino = nombreDestino;
		this.idDestino = idDestino;
		this.tipoDestino = tipoDestino;
	}
}
