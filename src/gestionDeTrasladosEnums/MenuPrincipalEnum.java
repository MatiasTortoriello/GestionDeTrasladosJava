package gestionDeTrasladosEnums;

public enum MenuPrincipalEnum {
	AGREGAR_DESTINO("Agregar destino"),AGREGAR_VIAJE("Agregar viaje"),VER_RESUMEN("Ver resumen"),SALIR("Salir");
	
	private String descripcion;

	MenuPrincipalEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
}