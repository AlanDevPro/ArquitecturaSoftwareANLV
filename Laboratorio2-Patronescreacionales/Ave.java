class Ave extends Animal {
    private double peso;
    private double tamañoAlas;

    public Ave(String nombre, double peso, double tamañoAlas) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamañoAlas = tamañoAlas;
    }

    public double getPeso() {
        return peso;
    }

    public double getTamañoAlas() {
        return tamañoAlas;
    }

    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    @Override
    public String getTipoAnimal() {
        return "Ave";
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeso: " + peso + "\nTamaño de alas: " + tamañoAlas;
    }
}
