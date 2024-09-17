import java.util.ArrayList;
import java.util.List;

class Zoologico {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Jaula> jaulas;

    public Zoologico(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.jaulas = new ArrayList<>();
    }

    public void agregarJaula(Jaula jaula) {
        jaulas.add(jaula);
    }

    public void mostrarZoologico() {
        System.out.println("Zoológico: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Lista de Jaulas:");
        for (Jaula jaula : jaulas) {
            System.out.println(jaula);
        }
    }

    public void mostrarAnimalesPorTipo(String tipo) {
        for (Jaula jaula : jaulas) {
            if (jaula.getAnimal().getTipoAnimal().equals(tipo)) {
                System.out.println(jaula.getAnimal());
                System.out.println("\n");
            }
        }
    }

    @Override
    public String toString() {
        return "Zoológico: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
}
