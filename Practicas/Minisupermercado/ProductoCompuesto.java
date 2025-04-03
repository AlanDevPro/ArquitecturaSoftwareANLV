package Minisupermercado;

import java.util.ArrayList;
import java.util.List;

class ProductoCompuesto implements Producto {
    private String descripcion;
    private List<Producto> productos = new ArrayList<>();

    public ProductoCompuesto(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }
}
