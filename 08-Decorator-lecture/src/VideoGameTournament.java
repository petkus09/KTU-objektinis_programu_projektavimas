
public class VideoGameTournament extends TournamentDecorator {

	public VideoGameTournament(Tournament someTournament) {
		super(someTournament);
		// TODO Auto-generated constructor stub
	}
	
	public String getRequirements(){
		return super.getRequirements() + ", a video game";
	}
	
	public double getCost(){
		return super.getCost() + 15;
				
	}

}
