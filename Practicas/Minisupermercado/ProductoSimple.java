package Minisupermercado;

class ProductoSimple implements Producto {
    private String descripcion;
    private double precio;

    public ProductoSimple(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
