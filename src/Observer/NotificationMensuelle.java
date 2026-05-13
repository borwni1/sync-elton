package Observer;

import State.NotificationContext;

public class NotificationMensuelle implements Observer {
	
	private NotificationContext context = new NotificationContext();

    @Override
    public void notifier(String message) {
        System.out.println("[Notification] : " + message);
        context.executer();
    }
}