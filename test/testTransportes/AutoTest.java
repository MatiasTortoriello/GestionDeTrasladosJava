package testTransportes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestionDeTrasladosDominio.AutoClass;
import gestionDeTrasladosDominio.PaqueteClass;
import gestionDeTrasladosEnums.TipoDeAuto;
import gestionDeTrasladosInterfaz.GestionDeTrasladoClass;

class AutoTest {

	@Test
	void test() {

	}
	
	//Test de creación de los tres tipos de autos:
	
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
	void queNoSePuedanRepetirPatentes() {
		 AutoClass coupe = new AutoClass(TipoDeAuto.Coupe, "AAA111");
		 AutoClass sedan = new AutoClass(TipoDeAuto.Sedan, "AAA112");
		 AutoClass suv = new AutoClass(TipoDeAuto.SUV, "AAA111");
		 
		 GestionDeTrasladoClass gestion = new GestionDeTrasladoClass();
		 
		 gestion.agregarVehiculo(coupe);
		 gestion.agregarVehiculo(sedan);
		 gestion.agregarVehiculo(suv);
		 
		 assertFalse(gestion.getVehiculos().size() == 3);
		
	        
	}
	
	@Test
	void queSePuedanCargarPaquetesEnUnCoupe() {
		AutoClass coupe = new AutoClass(TipoDeAuto.Coupe, "AAA111");
		PaqueteClass paqueteMisterioso = new PaqueteClass(null, null, null, null, null, coupe);
		
	}
	
	
	//Test de carga de paquetes en los tres tipos de autos:
	
	/*@Test
	void queSePuedanCargarPaquetesEnElLosAutos() {
		
	}
	
	/*@Test
	void queNoSePuedanCargarMasPaquetesDeLosPermitidosEnCadaAuto() {
		
	}*/
	

 

}
