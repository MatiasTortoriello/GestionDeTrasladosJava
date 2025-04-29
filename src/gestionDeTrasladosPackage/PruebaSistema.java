package gestionDeTrasladosPackage;

import java.util.Scanner;

public class PruebaSistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionDeTraslado sistema = new GestionDeTraslado();

        // Validar número de gestión
        String numeroGestion;
        do {
            System.out.print("Ingrese el número de gestión (debe comenzar con '#'): ");
            numeroGestion = sc.nextLine().trim();
        } while (!numeroGestion.startsWith("#"));

        MenuPrincipal opcion;
        do {
            opcion = ingresarOpcionDelMenuPrincipalValidada(sc);
            switch (opcion) {
                case AGREGAR_DESTINO:
                    if (agregarNuevoDestino(sistema, sc)) {
                        System.out.println("Destino agregado correctamente.");
                    } else {
                        System.out.println("No se pudo agregar el destino.");
                    }
                    break;
                case AGREGAR_VIAJE:
                    if (agregarViaje(sistema, sc)) {
                        System.out.println("El viaje se agregó correctamente.");
                    } else {
                        System.out.println("No se pudo agregar el viaje.");
                    }
                    break;
                case VER_RESUMEN:
                    verResumen(sistema);
                    break;
                case SALIR:
                    System.out.println("Finalizando el programa. ¡Hasta luego!");
                    break;
            }
        } while (opcion != MenuPrincipal.SALIR);

        sc.close();
    }

    private static MenuPrincipal ingresarOpcionDelMenuPrincipalValidada(Scanner sc) {
        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Agregar Destino");
            System.out.println("2. Agregar Viaje");
            System.out.println("3. Ver Resumen");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            String input = sc.nextLine().trim();
            switch (input) {
                case "1":
                    return MenuPrincipal.AGREGAR_DESTINO;
                case "2":
                    return MenuPrincipal.AGREGAR_VIAJE;
                case "3":
                    return MenuPrincipal.VER_RESUMEN;
                case "4":
                    return MenuPrincipal.SALIR;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private static boolean agregarNuevoDestino(GestionDeTraslado actual, Scanner sc) {
        try {
            System.out.print("Ingrese el código del destino: ");
            int codigo = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Ingrese el nombre de la ciudad: ");
            String ciudad = sc.nextLine().trim();
            System.out.print("Ingrese la distancia en km: ");
            double distancia = Double.parseDouble(sc.nextLine().trim());

            Destino destino = new Destino(codigo, ciudad, distancia);
            return actual.agregarDestino(destino);
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean agregarViaje(GestionDeTraslado actual, Scanner sc) {
        try {
            System.out.print("Ingrese el código del destino (-1 para salir): ");
            int codigoDestino = Integer.parseInt(sc.nextLine().trim());
            if (codigoDestino == -1) return false;

            Destino destino = actual.buscarDestino(codigoDestino);
            if (destino == null) {
                System.out.println("Error. El destino " + codigoDestino + " no ha sido definido.");
                return false;
            }

            System.out.print("Ingrese el nombre del cliente: ");
            String cliente = sc.nextLine().trim();
            System.out.print("Ingrese el porcentaje de descuento (0-100): ");
            int descuento = Integer.parseInt(sc.nextLine().trim());

            if (descuento < 0 || descuento > 100) {
                System.out.println("Porcentaje de descuento inválido.");
                return false;
            }

            Viaje viaje = new Viaje(destino, cliente, descuento);
            return actual.agregarViaje(viaje);
        } catch (Exception e) {
            return false;
        }
    }

    private static void verResumen(GestionDeTraslado actual) {
        System.out.println("\n--- Resumen de Viajes ---");
        System.out.println("Importe total acumulado: $" + actual.calcularImporteTotal());
        System.out.println("Importe promedio: $" + actual.calcularImportePromedio());
        System.out.println("Viaje de mayor precio:");
        System.out.println(actual.viajeDeMayorPrecio());

        System.out.println("\nViajes ordenados por costo ascendente:");
        Viaje[] viajesOrdenados = actual.obtenerViajesOrdenadosPorCostoAscendente();
        for (Viaje v : viajesOrdenados) {
            System.out.println(v);
        }
    }
}