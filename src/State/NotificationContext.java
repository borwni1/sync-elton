package State;

public class NotificationContext {

    private NotificationState state;

    public NotificationContext() {
        state = new WaitingState();
    }

    public void setState(NotificationState state) {
        this.state = state;
    }

    public void executer() {
        state.gerer(this);
    }
}