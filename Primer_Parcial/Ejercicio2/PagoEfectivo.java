public class PagoEfectivo extends Pago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por $" + monto);
        // Lógica adicional para registrar el pago en efectivo
    }
}
