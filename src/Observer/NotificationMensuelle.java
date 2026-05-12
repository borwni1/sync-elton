package Observer;

public class NotificationMensuelle implements Observer {

    @Override
    public void notifier(String message) {
        System.out.println("[Notification] : " + message);
    }
}