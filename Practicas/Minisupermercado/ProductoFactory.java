package Minisupermercado;

class ProductoFactory {
    public static Producto crearProductoSimple(String descripcion, double precio) {
        return new ProductoSimple(descripcion, precio);
    }

    public static ProductoCompuesto crearProductoCompuesto(String descripcion) {
        return new ProductoCompuesto(descripcion);
    }
}
