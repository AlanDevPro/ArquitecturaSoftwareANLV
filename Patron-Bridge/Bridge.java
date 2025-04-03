public class Bridge {
    public static void main(String[] args) {
        // Crear distintos canales de notificación
        NotificationSender email = new EmailSender();
        NotificationSender sms = new SMSSender();
        NotificationSender whatsapp = new WhatsAppSender();

        // Crear distintos tipos de notificación con diferentes canales
        Notification alertEmail = new AlertNotification(email);
        Notification promotionSMS = new PromotionNotification(sms);
        Notification reminderWhatsApp = new ReminderNotification(whatsapp);

        // Enviar mensajes por distintos canales
        alertEmail.sendNotification(); // [EMAIL] ⚠️ Alerta: Acción urgente requerida.
        promotionSMS.sendNotification(); // [SMS] 🎉 Promoción: ¡50% de descuento en tu próxima compra!
        reminderWhatsApp.sendNotification(); // [WHATSAPP] ⏰ Recordatorio: No olvides tu cita mañana.
    }
}
