// Concrete Abstraction 2 - Promoción
class PromotionNotification extends Notification {
    public PromotionNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    void sendNotification() {
        sender.send("🎉 Promoción: ¡50% de descuento en tu próxima compra!");
    }
}
