public abstract class Pago {
    protected double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public abstract void procesarPago();
}
