public class PagoTransferencia extends Pago {
    private String numeroCuentaOrigen;
    private String numeroCuentaDestino;

    public PagoTransferencia(double monto, String numeroCuentaOrigen, String numeroCuentaDestino) {
        super(monto);
        this.numeroCuentaOrigen = numeroCuentaOrigen;
        this.numeroCuentaDestino = numeroCuentaDestino;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia bancaria por $" + monto);
        System.out.println("Cuenta de origen: " + numeroCuentaOrigen);
        System.out.println("Cuenta de destino: " + numeroCuentaDestino);
        // Lógica adicional para procesar la transferencia bancaria
    }
}
