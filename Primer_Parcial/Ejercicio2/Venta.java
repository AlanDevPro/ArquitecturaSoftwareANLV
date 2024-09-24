import java.util.List;

public class Venta {
    private List<Producto> productos;
    private Pago pago;

    public Venta(List<Producto> productos, Pago pago) {
        this.productos = productos;
        this.pago = pago;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void procesarVenta() {
        double total = calcularTotal();
        System.out.println("Total de la venta: $" + total);
        pago.procesarPago();
        // Lógica adicional para registrar la venta
    }
}
