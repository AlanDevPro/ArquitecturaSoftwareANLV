package Minisupermercado;

import java.util.Scanner;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVentasFacade sistema = new SistemaVentasFacade();

        int opcion;
        do {
            sistema.mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    sistema.iniciarVenta();
                    break;
                case 2:
                    sistema.agregarProductoAVenta();
                    break;
                case 3:
                    sistema.procesarVenta();
                    break;
                case 4:
                    sistema.mostrarCatalogo();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
