package testTransportes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestionDeTrasladosDominio.AutoClass;
import gestionDeTrasladosDominio.BicicletaClass;
import gestionDeTrasladosDominio.CamionClass;
import gestionDeTrasladosDominio.DestinoClass;
import gestionDeTrasladosDominio.PaqueteClass;
import gestionDeTrasladosEnums.TipoBicicleta;
import gestionDeTrasladosEnums.TipoDeAcoplado;
import gestionDeTrasladosEnums.TipoDeAuto;
import gestionDeTrasladosInterfaz.GestionDeTrasladoClass;

class BicicletaTest {

	@Test
	void queSePuedanCrearTodosLosTiposDeBici() {
		BicicletaClass mountainBike = new BicicletaClass(TipoBicicleta.MountainBike, "AAA111");
		BicicletaClass playera = new BicicletaClass(TipoBicicleta.Playera, "AAB112");
		BicicletaClass tradicional = new BicicletaClass(TipoBicicleta.Tradicional, "AAC113");
		
		GestionDeTrasladoClass gestion = new GestionDeTrasladoClass();
		 
		gestion.agregarVehiculo(mountainBike);
		gestion.agregarVehiculo(playera);
		gestion.agregarVehiculo(tradicional);
		 
		 assertEquals(3, gestion.getVehiculos().size());
	}
	
	@Test
	public void queNoSePuedanRepetirPatentesEnLasBicicletas() {
		 BicicletaClass playera = new BicicletaClass(TipoBicicleta.Playera, "AAA111");
		 BicicletaClass tradicional = new BicicletaClass(TipoBicicleta.Tradicional, "AAA111");
		 
		 GestionDeTrasladoClass gestion = new GestionDeTrasladoClass();
		 
		 gestion.agregarVehiculo(tradicional);
		 gestion.agregarVehiculo(playera);
		 /*Playera no debería agregarse porque tiene la misam patente que Tradicional*/
		 assertEquals(1, gestion.getVehiculos().size());  
	}
	
	@Test
	void queSePuedanCargarPaquetesEnUnaPlayera() {
		BicicletaClass playera = new BicicletaClass(TipoBicicleta.Playera, "AAA111");
		DestinoClass destino = new DestinoClass("Juncal", "12", "Buenos Aires");
		PaqueteClass paqueteMisterioso = new PaqueteClass(01, 1.0, 1.0, 1.0, 1.0, destino);
		PaqueteClass paqueteMisterioso2 = new PaqueteClass(02, 1.0, 1.0, 1.0, 1.0, destino);
		PaqueteClass paqueteMisterioso3 = new PaqueteClass(03, 1.0, 1.0, 1.0, 1.0, destino);
		
		playera.asignarPaquete(paqueteMisterioso);
		playera.asignarPaquete(paqueteMisterioso2);
		playera.asignarPaquete(paqueteMisterioso3);
		/*No asigna el tercero porque la playera sólo admite 2*/
		
		assertEquals(2, playera.getPaquetes().size());

	}
	
	@Test
	void queSePuedanCargarPaquetesEnUnaTradicional() {
		BicicletaClass tradicional = new BicicletaClass(TipoBicicleta.Playera, "AAA111");
		DestinoClass destino = new DestinoClass("Juncal", "12", "Buenos Aires");
		PaqueteClass paqueteMisterioso = new PaqueteClass(01, 1.0, 1.0, 1.0, 3.0, destino);
		PaqueteClass paqueteMisterioso2 = new PaqueteClass(02, 1.0, 1.0, 1.0, 3.0, destino);
		PaqueteClass paqueteMisterioso3 = new PaqueteClass(03, 1.0, 1.0, 1.0, 3.0, destino);
		
		assertTrue(tradicional.puedeTransportarPaquete(paqueteMisterioso));
		assertTrue(tradicional.puedeTransportarPaquete(paqueteMisterioso2));
		assertTrue(tradicional.puedeTransportarPaquete(paqueteMisterioso3));
	}
	
	void queUnaBicicletaNoPuedaIrAOtraCiudad() {
		BicicletaClass playera = new BicicletaClass(TipoBicicleta.Playera, "AAA111");
		
		DestinoClass destino1 = new DestinoClass("Juncal", "12", "Buenos Aires");
	    DestinoClass destino2 = new DestinoClass("Alberti", "32", "La Plata");

	    PaqueteClass paqueteMisterioso = new PaqueteClass(01, 1.0, 1.0, 1.0, 1.0, destino1);
	    PaqueteClass paqueteMuyMisterioso = new PaqueteClass(02, 1.0, 1.0, 1.0, 1.0, destino2);

	    playera.asignarPaquete(paqueteMisterioso);
	    playera.asignarPaquete(paqueteMuyMisterioso);
	    
	    assertTrue(playera.puedeTransportarPaquete(paqueteMuyMisterioso));
	}
	
	void queNoSePuedaCargarMasPesoDelRequeridoEnUnaBici() {
		BicicletaClass tradicional = new BicicletaClass(TipoBicicleta.Tradicional, "AAA111");
		DestinoClass destino = new DestinoClass("Juncal", "12", "Buenos Aires");

		PaqueteClass paqueteMuyPesado = new PaqueteClass(01, 1.0, 1.0, 1.0, 40.0, destino);
		
		tradicional.asignarPaquete(paqueteMuyPesado);
		/*El paquete pesa 40kg y la tradicional sólo lleva hasta 15*/
		  assertFalse(tradicional.asignarPaquete(paqueteMuyPesado));
		  
	}
	
}
