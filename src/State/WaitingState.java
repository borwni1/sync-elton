package State;

public class WaitingState implements NotificationState {

    @Override
    public void gerer(NotificationContext context) {
        System.out.println("Notification en attente...");
        context.setState(new SentState());
    }
}