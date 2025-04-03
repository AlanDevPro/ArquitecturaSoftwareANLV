class SMSSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("[SMS] Enviando mensaje: " + message);
    }
}