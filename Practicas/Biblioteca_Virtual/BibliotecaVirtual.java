package Biblioteca_Virtual;

public class BibliotecaVirtual {
    public static void main(String[] args) {
        // Creando un libro real
        LibroReal libro = new LibroReal(
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                1605,
                "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor...");

        // Creando un proxy para el libro
        ProxyLibro proxyLibro = new ProxyLibro(libro);

        // Accediendo al libro a través del proxy
        System.out.println("Intentando leer: " + libro.getTitulo());
        proxyLibro.leer();
    }
}