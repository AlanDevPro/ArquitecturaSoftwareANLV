class Pez extends Animal {
    private double longitud;

    public Pez(String nombre, double longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }

    @Override
    public String getTipoAnimal() {
        return "Pez";
    }

    @Override
    public String toString() {
        return super.toString() + "\nLongitud: " + longitud;
    }
}
