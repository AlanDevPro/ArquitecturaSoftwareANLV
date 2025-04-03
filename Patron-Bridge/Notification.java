
abstract class Notification {
    protected NotificationSender sender; // Composición con la interfaz Implementor

    public Notification(NotificationSender sender) {
        this.sender = sender;
    }

    abstract void sendNotification();
}
