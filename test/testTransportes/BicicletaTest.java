package testTransportes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestionDeTrasladosDominio.AutoClass;
import gestionDeTrasladosDominio.BicicletaClass;
import gestionDeTrasladosDominio.DestinoClass;
import gestionDeTrasladosDominio.PaqueteClass;
import gestionDeTrasladosEnums.TipoBicicleta;
import gestionDeTrasladosEnums.TipoDeAuto;

class BicicletaTest {

	@Test
	void queSePuedanCrearTodosLosTiposDeBici() {
		BicicletaClass mountainBike = new BicicletaClass(TipoBicicleta.MountainBike, "AAA111");
		BicicletaClass playera = new BicicletaClass(TipoBicicleta.Playera, "AAB112");
		BicicletaClass tradicional = new BicicletaClass(TipoBicicleta.Tradicional, "AAC113");
		
	}
	
	@Test
	void queSePuedanCargarPaquetesEnUnaPlayera() {
		BicicletaClass playera = new BicicletaClass(TipoBicicleta.Playera, "AAA111");
		DestinoClass destino = new DestinoClass("Juncal", "12", "Buenos Aires");
		PaqueteClass paqueteMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 3.0, destino, playera);
		
		Boolean cargaDePaquete = playera.asignarPaquete(paqueteMisterioso);
	
		assertTrue(cargaDePaquete);
	}
	
	void queUnaBicicletaNoPuedaIrAOtraCiudad() {
		BicicletaClass playera = new BicicletaClass(TipoBicicleta.Playera, "AAA111");
		
		DestinoClass destino1 = new DestinoClass("Juncal", "12", "Buenos Aires");
	    DestinoClass destino2 = new DestinoClass("Alberti", "32", "La Plata");


	    PaqueteClass paqueteMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 1.0, destino1, playera);
	    PaqueteClass paqueteMuyMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 1.0, destino2, playera);


	    playera.asignarPaquete(paqueteMisterioso);
	    playera.asignarPaquete(paqueteMuyMisterioso);
	    
	    assertTrue(playera.puedeTransportarPaquete(paqueteMuyMisterioso));
	}
	
	void queNoSePuedaCargarMasPesoDelRequeridoEnUnaBici() {
		BicicletaClass tradicional = new BicicletaClass(TipoBicicleta.Tradicional, "AAA111");
		DestinoClass destino = new DestinoClass("Juncal", "12", "Buenos Aires");
		PaqueteClass paqueteMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 3.0, destino, tradicional);
		
	}
	
	
}
