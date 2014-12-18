
public class TeamTournament extends TournamentDecorator {

	public TeamTournament(Tournament someTournament) {
		super(someTournament);
		// TODO Auto-generated constructor stub
	}
	
	public String getRequirements(){
		return super.getRequirements() + ", 5 team members";
	}
	
	public double getCost(){
		return super.getCost() + 50;
	}

}
