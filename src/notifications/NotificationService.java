package notifications;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<Observer> observers = new ArrayList<>();
    private final NewNotificationSystem system;

    public NotificationService(NewNotificationSystem system) {
        this.system = system;
    }
    public void  subscribe (Observer observer) {
        observers.add(observer);
    }
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    public void triggerNotification(String message) {
        system.sendNotification(message);
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
