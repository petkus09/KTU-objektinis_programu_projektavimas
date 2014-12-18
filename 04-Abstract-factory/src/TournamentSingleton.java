import java.util.ArrayList;
import java.util.List;

public class TournamentSingleton implements Singleton {

	private static TournamentSingleton instance = null;
	
	private List<Participant> participants;

    private ParticipantFactory factory;
	
	private TournamentSingleton(ParticipantFactory fac){
		this.participants = new ArrayList<Participant>();
        this.factory = fac;
	}
	
	public static TournamentSingleton getInstance(ParticipantFactory fac){
		if(instance == null){
			instance = new TournamentSingleton(fac);
		}
		return instance;
	}
	
	public void createParticipant(){
        this.participants.add(this.factory.createParticipant());
	}
	
	public String getTournamentParticipants(){
        String res = "";
        for(Participant participant : this.participants){
            if (!participant.isNull()){
                res += participant.getName();
                res += "\n";
            }
        }
		return res;
	}

    public void finishTournament(){
        this.participants.clear();
    }
	
}
