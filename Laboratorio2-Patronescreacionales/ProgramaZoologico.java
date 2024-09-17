import java.util.Scanner;

public class ProgramaZoologico {
    FabricaDeAnimales fabrica = new FabricaDeAnimales();
    static Scanner scanner = new Scanner(System.in);
    static Zoologico zoologico = new Zoologico("Zoo de la Ciudad", "123 Calle Principal", "555-1234");

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir Mamífero");
            System.out.println("2. Añadir Ave");
            System.out.println("3. Añadir Pez");
            System.out.println("4. Mostrar Mamíferos");
            System.out.println("5. Mostrar Aves");
            System.out.println("6. Mostrar Peces");
            System.out.println("7. Mostrar Zoológico");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    añadirMamifero();
                    break;
                case 2:
                    añadirAve();
                    break;
                case 3:
                    añadirPez();
                    break;
                case 4:
                    System.out.print("\nMostrando todos los animales Mamiferos");
                    System.out.print("\n");
                    zoologico.mostrarAnimalesPorTipo("Mamífero");
                    break;
                case 5:
                    System.out.print("\nMostrando todos los animales Aves");
                    zoologico.mostrarAnimalesPorTipo("Ave");
                    break;
                case 6:
                    System.out.print("\nMostrando todos los animales Peces");
                    zoologico.mostrarAnimalesPorTipo("Pez");
                    break;
                case 7:
                    zoologico.mostrarZoologico();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 8);
    }

    public static void añadirMamifero() {
        System.out.println("\n--- Añadir Mamífero ---");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Temperatura (C): ");
        double temperatura = scanner.nextDouble();
        System.out.print("Número de patas: ");
        int nroDePatas = scanner.nextInt();
        System.out.print("Color: ");
        String color = scanner.next();
        Mamifero mamifero = new Mamifero(nombre, temperatura, nroDePatas, color);
        añadirJaula(mamifero);
    }

    public static void añadirAve() {
        System.out.println("\n--- Añadir Ave ---");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Tamaño de alas (cm): ");
        double tamanoAlas = scanner.nextDouble();
        Ave ave = new Ave(nombre, peso, tamanoAlas);
        añadirJaula(ave);
    }

    public static void añadirPez() {
        System.out.println("\n--- Añadir Pez ---");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Longitud (cm): ");
        double longitud = scanner.nextDouble();
        Pez pez = new Pez(nombre, longitud);
        añadirJaula(pez);
    }

    public static void añadirJaula(Animal animal) {
        System.out.print("Alto de la jaula: ");
        double alto = scanner.nextDouble();
        System.out.print("Ancho de la jaula: ");
        double ancho = scanner.nextDouble();
        System.out.print("Largo de la jaula: ");
        double largo = scanner.nextDouble();
        Jaula jaula = new Jaula(animal, alto, ancho, largo);
        zoologico.agregarJaula(jaula);
    }
}
