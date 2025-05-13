package gestionDeTrasladosDominio;

public class PaqueteClass {
	private Integer idPaquete;
	private String descripcionPaquete;
	private Double pesoPaquete;
	private Double alturaPaquete;
	private Double anchoPaquete;
	private Double profundidadPaquete;
	private Double volumenPaquete = alturaPaquete*anchoPaquete*profundidadPaquete;
	
	public PaqueteClass(Integer idPaquete, String descripcionPaquete) {
		
	}
}
