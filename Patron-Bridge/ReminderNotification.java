class ReminderNotification extends Notification {
    public ReminderNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    void sendNotification() {
        sender.send("⏰ Recordatorio: No olvides tu cita mañana.");
    }
}
