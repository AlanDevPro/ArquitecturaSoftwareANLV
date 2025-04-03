package Minisupermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SistemaVentasFacade {
    private List<Producto> catalogoProductos;
    private Venta ventaActual;
    private Scanner scanner;

    public SistemaVentasFacade() {
        catalogoProductos = new ArrayList<>();
        scanner = new Scanner(System.in);
        inicializarCatalogo();
    }

    private void inicializarCatalogo() {
        // Productos simples
        catalogoProductos.add(ProductoFactory.crearProductoSimple("Leche", 1.50));
        catalogoProductos.add(ProductoFactory.crearProductoSimple("Pan", 1.00));
        catalogoProductos.add(ProductoFactory.crearProductoSimple("Huevos (docena)", 2.50));
        catalogoProductos.add(ProductoFactory.crearProductoSimple("Arroz (1kg)", 1.80));
        catalogoProductos.add(ProductoFactory.crearProductoSimple("Azúcar (1kg)", 1.20));

        // Productos compuestos
        ProductoCompuesto desayuno = ProductoFactory.crearProductoCompuesto("Pack Desayuno");
        desayuno.agregarProducto(ProductoFactory.crearProductoSimple("Café", 3.50));
        desayuno.agregarProducto(ProductoFactory.crearProductoSimple("Medialunas (3)", 2.00));
        catalogoProductos.add(desayuno);

        ProductoCompuesto canasta = ProductoFactory.crearProductoCompuesto("Canasta Básica");
        canasta.agregarProducto(ProductoFactory.crearProductoSimple("Aceite (1L)", 4.50));
        canasta.agregarProducto(ProductoFactory.crearProductoSimple("Fideos (500g)", 1.20));
        canasta.agregarProducto(ProductoFactory.crearProductoSimple("Salsa de tomate", 1.80));
        catalogoProductos.add(canasta);
    }

    public void iniciarVenta() {
        System.out.println("\n===== NUEVA VENTA =====");
        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Tipo de documento (DNI/RUC): ");
        String tipoDocumento = scanner.nextLine();

        System.out.print("Número de documento: ");
        String numeroDocumento = scanner.nextLine();

        ventaActual = new Venta(nombre, tipoDocumento, numeroDocumento);
        System.out.println("Venta iniciada correctamente.");
    }

    public void mostrarCatalogo() {
        System.out.println("\n===== CATÁLOGO DE PRODUCTOS =====");
        for (int i = 0; i < catalogoProductos.size(); i++) {
            Producto p = catalogoProductos.get(i);
            System.out.printf("%d. %-20s - $%.2f\n", i + 1, p.getDescripcion(), p.getPrecio());
        }
    }

    public void agregarProductoAVenta() {
        if (ventaActual == null) {
            System.out.println("Error: Primero debe iniciar una venta.");
            return;
        }

        mostrarCatalogo();

        System.out.print("Seleccione el número del producto: ");
        int seleccion = Integer.parseInt(scanner.nextLine()) - 1;

        if (seleccion < 0 || seleccion >= catalogoProductos.size()) {
            System.out.println("Selección inválida.");
            return;
        }

        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0.");
            return;
        }

        Producto productoSeleccionado = catalogoProductos.get(seleccion);
        DetalleVenta detalle = new DetalleVenta(productoSeleccionado, cantidad);
        ventaActual.agregarDetalle(detalle);

        System.out.printf("Agregado: %d unidades de %s\n",
                cantidad, productoSeleccionado.getDescripcion());
    }

    public void procesarVenta() {
        if (ventaActual == null) {
            System.out.println("Error: Primero debe iniciar una venta.");
            return;
        }

        if (ventaActual.getTotal() == 0) {
            System.out.println("La venta no tiene productos agregados.");
            return;
        }

        System.out.println("\n===== PROCESAR VENTA =====");
        System.out.println("Seleccione el tipo de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de crédito");
        System.out.println("3. Transferencia bancaria");

        System.out.print("Opción: ");
        int opcion = Integer.parseInt(scanner.nextLine());

        String tipoPago;
        switch (opcion) {
            case 1:
                tipoPago = "Efectivo";
                break;
            case 2:
                tipoPago = "Tarjeta de crédito";
                break;
            case 3:
                tipoPago = "Transferencia bancaria";
                break;
            default:
                System.out.println("Opción inválida. Se seleccionará Efectivo por defecto.");
                tipoPago = "Efectivo";
        }

        ventaActual.setTipoPago(tipoPago);
        ventaActual.mostrarDetalle();

        // Finalizar la venta actual
        ventaActual = null;
        System.out.println("¡Venta procesada con éxito!");
    }

    public void mostrarMenu() {
        System.out.println("\n===== MINI SISTEMA DE VENTAS =====");
        System.out.println("1. Iniciar nueva venta");
        System.out.println("2. Agregar producto a la venta");
        System.out.println("3. Procesar venta");
        System.out.println("4. Mostrar catálogo");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}