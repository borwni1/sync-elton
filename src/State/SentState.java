package State;

public class SentState implements NotificationState{

	@Override
	public void gerer(NotificationContext context) {
		System.out.println("Notification envoyée avec succès !");
		
	}
	
}
