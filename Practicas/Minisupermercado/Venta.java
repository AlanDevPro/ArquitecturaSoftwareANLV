package Minisupermercado;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

class Venta {
    private String nombre;
    private Date fecha;
    private String tipoDocumento;
    private String numeroDocumento;
    private ArrayList<DetalleVenta> detalles;
    private String tipoPago;

    public Venta(String nombre, String tipoDocumento, String numeroDocumento) {
        this.nombre = nombre;
        this.fecha = new Date();
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getTotal() {
        double total = 0;
        for (DetalleVenta detalle : detalles) {
            total += detalle.getSubtotal();
        }
        return total;
    }

    public void mostrarDetalle() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("\n===== DETALLE DE VENTA =====");
        System.out.println("Cliente: " + nombre);
        System.out.println("Fecha: " + dateFormat.format(fecha));
        System.out.println(tipoDocumento + ": " + numeroDocumento);
        System.out.println("Tipo de pago: " + tipoPago);
        System.out.println("---------------------------");
        System.out.println("Cant. | Descripción                | P.Unit  | Subtotal");
        System.out.println("---------------------------");

        for (DetalleVenta detalle : detalles) {
            System.out.printf("%-5d | %-28s | $%-6.2f | $%-6.2f\n",
                    detalle.getCantidad(),
                    detalle.getProducto().getDescripcion(),
                    detalle.getProducto().getPrecio(),
                    detalle.getSubtotal());
        }

        System.out.println("---------------------------");
        System.out.printf("TOTAL A PAGAR: $%.2f\n", getTotal());
        System.out.println("===========================");
    }
}