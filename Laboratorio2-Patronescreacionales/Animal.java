abstract class Animal {
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getTipoAnimal();

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
