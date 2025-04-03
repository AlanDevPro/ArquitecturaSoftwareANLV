public // Concrete Abstraction 1 - Alerta
class AlertNotification extends Notification {
    public AlertNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    void sendNotification() {
        sender.send("⚠️ Alerta: Acción urgente requerida.");
    }
}


