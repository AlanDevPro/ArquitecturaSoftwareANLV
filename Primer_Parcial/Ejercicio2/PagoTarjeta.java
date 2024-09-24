public class PagoTarjeta extends Pago {
    private String numeroTarjeta;
    private String titular;
    private String fechaExpiracion;

    public PagoTarjeta(double monto, String numeroTarjeta, String titular, String fechaExpiracion) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
        System.out.println("Titular: " + titular);
        System.out.println("Número de tarjeta: " + numeroTarjeta);
        // Lógica adicional para conectar con el sistema de la pasarela de pago
    }
}
