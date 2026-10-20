package notifications;

public class EmailObserver implements Observer {
    private final String user;
    public EmailObserver(String user) {
        this.user =user;
    }
    @Override
    public void update(String message){
        System.out.println("Email to" + user + ":" + message);
    }
}
