package notifications;

public class SMSObserver implements Observer{
    private final String user;
    public SMSObserver(String user) {
        this.user = user;
    }
    @Override
    public void update (String message) {
        System.out.println("SMS to " + user + ": " + message);
    }
}
