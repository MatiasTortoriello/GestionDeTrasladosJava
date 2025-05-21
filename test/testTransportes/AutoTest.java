package testTransportes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import gestionDeTrasladosDominio.AutoClass;
import gestionDeTrasladosDominio.DestinoClass;
import gestionDeTrasladosDominio.PaqueteClass;
import gestionDeTrasladosEnums.TipoDeAuto;
import gestionDeTrasladosInterfaz.GestionDeTrasladoClass;

class AutoTest {

	@Test
	void test() {

	}
	
	/*Test de creación de los tres tipos de autos:*/
	
	@Test
	void queSePuedanCrearTodosLosTiposDeAuto() {
		 AutoClass coupe = new AutoClass(TipoDeAuto.Coupe, "AAA111");
		 AutoClass sedan = new AutoClass(TipoDeAuto.Sedan, "AAB112");
		 AutoClass suv = new AutoClass(TipoDeAuto.SUV, "AAC113");
		 
		 GestionDeTrasladoClass gestion = new GestionDeTrasladoClass();
		 
		 gestion.agregarVehiculo(coupe);
		 gestion.agregarVehiculo(sedan);
		 gestion.agregarVehiculo(suv);
		 
		 
		 assertEquals(3, gestion.getVehiculos().size());
	        
	}
	
    @Test
    public void testAutoPuedeTransportarPaqueteValido() {
    	
        AutoClass sedan = new AutoClass(TipoDeAuto.Sedan, "AAA123");
        
        DestinoClass destino = new DestinoClass("Juncal", "1129", "Buenos Aires");
        
        PaqueteClass paquete = new PaqueteClass(1.0, 1.0, 1.0, 3.0, destino);
        
        
        
        assertTrue(sedan.puedeTransportarPaquete(paquete));
    }
	
	@Test
	void queNoSePuedanRepetirPatentes() {
		 AutoClass coupe = new AutoClass(TipoDeAuto.Coupe, "AAA111");
		 AutoClass sedan = new AutoClass(TipoDeAuto.Sedan, "AAA112");
		 AutoClass suv = new AutoClass(TipoDeAuto.SUV, "AAA111");
		 
		 GestionDeTrasladoClass gestion = new GestionDeTrasladoClass();
		 
		 gestion.agregarVehiculo(coupe);
		 gestion.agregarVehiculo(sedan);
		 gestion.agregarVehiculo(suv);
		 /*Suv no debería agregarse porque tiene la misam patente que Coupé*/
		 assertEquals(2, gestion.getVehiculos().size());
		
	        
	}
	
	/*TEST PARA COUPE:*/
	
	@Test
	void queSePuedanCargarPaquetesEnUnCoupe() {
		AutoClass coupe = new AutoClass(TipoDeAuto.Coupe, "AAA111");
		DestinoClass destino = new DestinoClass("Juncal", "12", "Buenos Aires");
		PaqueteClass paqueteMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 3.0, destino);
		
		Boolean cargaDePaquete = coupe.asignarPaquete(paqueteMisterioso);
	
		assertTrue(cargaDePaquete);
		
	}
	
	void queNoSePuedaExcederElLimiteDePesoEnUnCoupe() {
		AutoClass coupe = new AutoClass(TipoDeAuto.Coupe, "AAA111");
		DestinoClass destino = new DestinoClass("Juncal", "12", "Buenos Aires");
		PaqueteClass paqueteMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 200.0, destino);
		/*El Paquete pesa 200 y el coupe sólo puede llevar 100*/	
		assertFalse(coupe.puedeTransportarPaquete(paqueteMisterioso));
		
	}
	
	void queNoSePuedaExcederElLimiteDePaquetesEnUnCoupe() {
		AutoClass coupe = new AutoClass(TipoDeAuto.Coupe, "AAA111");
		
		DestinoClass destino1 = new DestinoClass("Juncal", "12", "Buenos Aires");
	    DestinoClass destino2 = new DestinoClass("Alberti", "32", "La Plata");
	    DestinoClass destino3 = new DestinoClass("Perón", "156", "Rosario");
	    DestinoClass destino4 = new DestinoClass("Córdoba", "250", "Córdoba");

	    PaqueteClass paqueteMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 1.0, destino1);
	    PaqueteClass paqueteMuyMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 1.0, destino2);
	    PaqueteClass paqueteMasMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 1.0, destino3);
	    PaqueteClass paqueteIncreiblementeMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 1.0, destino4);

	    coupe.asignarPaquete(paqueteMisterioso);
	    coupe.asignarPaquete(paqueteMuyMisterioso);
	    coupe.asignarPaquete(paqueteMasMisterioso);
	    coupe.asignarPaquete(paqueteIncreiblementeMisterioso);
	    /*El Coupé sólo puede llevar hasta 3 paquetes*/
	    assertEquals(3, coupe.getPaquetes());
	    
	    assertFalse(coupe.puedeTransportarPaquete(paqueteIncreiblementeMisterioso));
	}
	
    @Test
    public void queSePuedaCambiarElDestinoDelPaquete() {
    	AutoClass coupe = new AutoClass(TipoDeAuto.Coupe, "AAA111");
    	DestinoClass destino1 = new DestinoClass("Juncal", "12", "Buenos Aires");
        PaqueteClass paqueteMisterioso = new PaqueteClass(1.0, 1.0, 1.0, 1.0, destino1);
        
    	coupe.agregarDestino(destino1);
        
        assertTrue(coupe.puedeTransportarPaquete(paqueteMisterioso));
    }

}
