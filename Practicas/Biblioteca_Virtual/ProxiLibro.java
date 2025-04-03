package Biblioteca_Virtual;

class ProxyLibro implements Libro {
    private LibroReal libroReal;

    public ProxyLibro(LibroReal libroReal) {
        this.libroReal = libroReal;
    }

    @Override
    public void leer() {
        // Verificación de permisos
        System.out.println("Verificando permisos...");

        // Después de verificar, permite leer el libro real
        libroReal.leer();
    }
}