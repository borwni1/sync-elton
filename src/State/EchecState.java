package State;

public class EchecState implements NotificationState{

	@Override
	public void gerer(NotificationContext context) {
		System.out.println("Une erreur est survenue. Echec de l'envoi.");
		
	}

}
