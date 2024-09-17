class Mamifero extends Animal {
    private double temperatura;
    private int nroDePatas;
    private String color;

    public Mamifero(String nombre, double temperatura, int nroDePatas, String color) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.nroDePatas = nroDePatas;
        this.color = color;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getNroDePatas() {
        return nroDePatas;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getTipoAnimal() {
        return "Mamífero";
    }

    @Override
    public String toString() {
        return super.toString() + "\nTemperatura: " + temperatura + "\nNúmero de patas: " + nroDePatas
                + "\nColor: "
                + color;
    }
}
