package gestionDeTrasladosDominio;

public class DestinoClass {
	private Integer codigo;
	private String ciudad;
	private String pais;
	private Double distancia;
	
	public DestinoClass(Integer codigo, String ciudad, String pais, Double distancia) {
		this.codigo = codigo;
		this.ciudad = ciudad;
		this.pais = pais;
		this.distancia = distancia;
	}
	
	public DestinoClass() {
		
	} //Sobrecarga de métodos, por las dudas.

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}
	
	
}
