package notifications;

public class Main {

     static void main() {

        // Create the legacy notification system
        LegacyNotificationSystem legacy =
                new LegacyNotificationSystem();

        // Connect the legacy system through the adapter
        NewNotificationSystem adapter =
                new NotificationAdapter(legacy);

        // Create the notification service
        NotificationService service =
                new NotificationService(adapter);

        // Create observers
        Observer email =
                new EmailObserver(" miracle.johnny@miva.edu.ng " );

        Observer sms =
                new SMSObserver(" +2348146197564 ");

        // Subscribe observers
        service.subscribe(email);
        service.subscribe(sms);

        // Trigger a notification
        service.triggerNotification ( " Your order has been shipped! " );

        // Example of unsubscribing an observer
        service.unsubscribe(sms);

        System.out.println("--- Second notification ---");

        service.triggerNotification( " Your order is arriving soon! " );
    }
}