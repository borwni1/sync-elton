package State;

public class NotificationContext {

    private NotificationState state;

    public NotificationContext() {
        state = new SentState();
    }

    public void setState(NotificationState state) {
        this.state = state;
    }

    public void executer() {
        state.gerer(this);
    }
}