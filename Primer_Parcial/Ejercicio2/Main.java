import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creando productos
        Producto producto1 = new Producto("Arroz", 2.5);
        Producto producto2 = new Producto("Leche", 1.5);
        Producto producto3 = new Producto("Pan", 1.0);

        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        // Selección de tipo de pago: Efectivo
        Pago pagoEfectivo = new PagoEfectivo(5.0);

        // Creando la venta
        Venta venta = new Venta(productos, pagoEfectivo);
        venta.procesarVenta();

        // Selección de tipo de pago: Tarjeta
        Pago pagoTarjeta = new PagoTarjeta(5.0, "1234-5678-9123-4567", "Juan Perez", "12/25");

        // Creando la venta
        Venta ventaTarjeta = new Venta(productos, pagoTarjeta);
        ventaTarjeta.procesarVenta();

        // Selección de tipo de pago: Transferencia Bancaria
        Pago pagoTransferencia = new PagoTransferencia(5.0, "00123456789", "00987654321");

        // Creando la venta
        Venta ventaTransferencia = new Venta(productos, pagoTransferencia);
        ventaTransferencia.procesarVenta();
    }
}
