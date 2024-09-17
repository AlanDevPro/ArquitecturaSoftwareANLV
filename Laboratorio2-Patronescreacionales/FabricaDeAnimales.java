class FabricaDeAnimales implements FabricaAbstracta {

    @Override
    public Mamifero crearMamifero(String nombre, double temperatura, int nroDePatas, String color) {
        return new Mamifero(nombre, temperatura, nroDePatas, color);
    }

    @Override
    public Ave crearAve(String nombre, double peso, double tamañoAlas) {
        return new Ave(nombre, peso, tamañoAlas);
    }

    @Override
    public Pez crearPez(String nombre, double longitud) {
        return new Pez(nombre, longitud);
    }
}
