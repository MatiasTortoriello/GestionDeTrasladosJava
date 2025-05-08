package testTransportes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import gestionDeTrasladosDominio.UsuarioClass;

class PruebaSistema {

	@Test
	void test() {
 /*
    Para iniciar el sistema, el usuario debe ingresar un número de gestión. 
	Este número debe comenzar con el carácter especial #. 
	El sistema deberá verificar que el número ingresado cumpla con esta condición. 
	En caso contrario, se solicitará nuevamente hasta que el usuario ingrese un número de gestión válido.*/

	}
	
	@Test
	public void queElUsuarioPuedaIngresarUnNumeroDeGestion() {
		Scanner teclado = new Scanner(System.in);
		UsuarioClass nuevoUsuario = new UsuarioClass("Matias", "Tortoriello", 35533516);
		String numeroDeGestion = teclado.next();
	}
	

	/*


AGREGAR_DESTINO: * Se debe agregar un nuevo destino para el traslado. 
Si el destino se agrega correctamente, el sistema deberá mostrar el mensaje: 
“Destino agregado correctamente". En caso de error, se deberá mostrar el mensaje: "No se pudo agregar el destino".*/
	
	@Test
	public void queSePuedaAgregarUnDestino() {
		
	}

/*AGREGAR_VIAJE: * Se debe agregar un viaje según el traslado determinado. 
Si la operación se realiza con éxito, el sistema deberá mostrar el mensaje: 
"El viaje se agregó correctamente". En caso de error, se deberá mostrar el mensaje: "No se pudo agregar el viaje".*/
	
	@Test
	public void queSePuedaAgregarUnViaje() {
		
	}

/*VER_RESUMEN: * Una vez asignados los viajes a sus respectivos destinos, 
se deberá generar y mostrar un resumen de la información que se podrá consultar en todo momento para visualizar la información actual.*/
	
	

}
