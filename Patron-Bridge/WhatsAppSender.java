class WhatsAppSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("[WHATSAPP] Enviando mensaje: " + message);
    }
}