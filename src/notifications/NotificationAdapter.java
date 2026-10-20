package notifications;

public class NotificationAdapter implements NewNotificationSystem {

    private final LegacyNotificationSystem legacy;

    public NotificationAdapter(LegacyNotificationSystem legacy) {
        this.legacy = legacy;
    }

    @Override
    public void sendNotification(String message) {
        legacy.sendOldNotification(message);
    }
}