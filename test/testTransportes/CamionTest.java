package testTransportes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestionDeTrasladosDominio.CamionClass;
import gestionDeTrasladosEnums.TipoDeAcoplado;
import gestionDeTrasladosInterfaz.GestionDeTrasladoClass;

class CamionTest {

	@Test
	void queSePuedanCrearTodosLosTiposDeAcoplado() {
		
		 CamionClass tradicional = new CamionClass(TipoDeAcoplado.Tradicional, "AAA111");
		 CamionClass remolqueArticulado = new CamionClass(TipoDeAcoplado.RemolqueArticulado, "AAB112");
		 
		 GestionDeTrasladoClass gestion = new GestionDeTrasladoClass();
		 
		 gestion.agregarVehiculo(tradicional);
		 gestion.agregarVehiculo(remolqueArticulado);
	 
		 assertEquals(2, gestion.getVehiculos().size());
	       
	}
}
