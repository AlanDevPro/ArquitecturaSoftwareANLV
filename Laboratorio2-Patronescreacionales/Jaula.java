class Jaula {
    private Animal animal;
    private double alto;
    private double ancho;
    private double largo;

    public Jaula(Animal animal, double alto, double ancho, double largo) {
        this.animal = animal;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return "Jaula para " + animal.toString() + ", Dimensiones: " + alto + "x" + ancho + "x" + largo;
    }
}
