package testTransportes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestionDeTrasladosDominio.BicicletaClass;
import gestionDeTrasladosEnums.TipoBicicleta;

class BicicletaTest {

	@Test
	void queSePuedanCrearTodosLosTiposDeBici() {
		BicicletaClass mountainBike = new BicicletaClass(TipoBicicleta.MountainBike, "AAA111");
		BicicletaClass playera = new BicicletaClass(TipoBicicleta.Playera, "AAB112");
		BicicletaClass tradicional = new BicicletaClass(TipoBicicleta.Tradicional, "AAC113");
		
		
		
	}

}
