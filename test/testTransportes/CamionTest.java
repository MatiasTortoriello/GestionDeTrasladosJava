package testTransportes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestionDeTrasladosDominio.CamionClass;
import gestionDeTrasladosDominio.DestinoClass;
import gestionDeTrasladosDominio.PaqueteClass;
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
	
    @Test
    public void quePuedaTransportarUnPaqueteValido() {
    	
    	CamionClass tradicional = new CamionClass(TipoDeAcoplado.Tradicional, "AAA111");
        DestinoClass destino = new DestinoClass("Juncal", "1129", "Buenos Aires");
        PaqueteClass paquete = new PaqueteClass(01, 1.0, 1.0, 1.0, 3.0, destino);
        
        assertTrue(tradicional.puedeTransportarPaquete(paquete));
    }
    
	@Test
	void queNoSePuedanRepetirPatentes() {
		 CamionClass tradicional = new CamionClass(TipoDeAcoplado.Tradicional, "AAA111");
		 CamionClass remolqueArticulado = new CamionClass(TipoDeAcoplado.RemolqueArticulado, "AAA111");
		 
		 GestionDeTrasladoClass gestion = new GestionDeTrasladoClass();
		 
		 gestion.agregarVehiculo(tradicional);
		 gestion.agregarVehiculo(remolqueArticulado);
		 /*RemolqueArticulado no debería agregarse porque tiene la misam patente que Tradicional*/
		 assertEquals(1, gestion.getVehiculos().size());    
	}
	
	@Test
    public void queUnCamionNoPuedaExcederElMaximoDePaquetes() {
    	 CamionClass tradicional = new CamionClass(TipoDeAcoplado.Tradicional, "AAA111");
    	 DestinoClass destino1 = new DestinoClass("Juncal", "12", "Buenos Aires");
    	 
    	 tradicional.agregarDestino(destino1);
       
       for (Integer i = 1; i < 21; i++) {
        	 PaqueteClass paqueteMisterioso = new PaqueteClass(i, 1.0, 1.0, 1.0, 1.1 , destino1); 
            tradicional.asignarPaquete(paqueteMisterioso);
            
        }
        
        PaqueteClass otroPaqueteMisterioso = new PaqueteClass(21, 1.0, 1.0, 1.0, 1.0, destino1);
        assertFalse(tradicional.puedeTransportarPaquete(otroPaqueteMisterioso));
    }
    
    @Test
    public void testCamionNoPuedeExcederPesoMaximo() {
    	 CamionClass remolqueArticulado = new CamionClass(TipoDeAcoplado.RemolqueArticulado, "AAB112");
    	 DestinoClass destino1 = new DestinoClass("Juncal", "12", "Buenos Aires");
         PaqueteClass paqueteMisterioso = new PaqueteClass(01, 1.0, 1.0, 1.0, 4000.0, destino1);
    	
         remolqueArticulado.agregarDestino(destino1);

         assertFalse(remolqueArticulado.puedeTransportarPaquete(paqueteMisterioso));
    }
}
