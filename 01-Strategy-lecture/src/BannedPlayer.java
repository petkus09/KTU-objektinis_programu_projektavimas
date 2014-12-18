
public class BannedPlayer extends Participant {
	public BannedPlayer(){
		super();
		setConnectionStatus(new BAN());
	}
}
