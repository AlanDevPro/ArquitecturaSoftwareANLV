package Biblioteca_Virtual;

class LibroReal implements Libro {
    private String titulo;
    private String autor;
    private int año;
    private String contenido;

    public LibroReal(String titulo, String autor, int año, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.contenido = contenido;
    }

    @Override
    public void leer() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
        System.out.println("Contenido del libro:");
        System.out.println(contenido);
    }

    public String getTitulo() {
        return titulo;
    }
}