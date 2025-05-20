package gestionDeTrasladosDominio;

public class CamionClass extends VehiculoClass {

	public CamionClass(Double volumenDeCargaTotal, Double pesoDeCargaTotal, Integer maxCiudadesQueRecorre) {
		super(0.125, 15.0, 1, 2000); //Volumen y peso totales. Maximo de ciudades que recorre . Heredados de VehiculoClass
	}



	@Override
	public boolean puedeTransportarPaquete(PaqueteClass paquete) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean asignarPaquete(PaqueteClass nuevoPaquete) {
        if (puedeTransportarPaquete(nuevoPaquete)) {
            paquetes.add(nuevoPaquete);
            return true;
        }
        return false;
	}

}
