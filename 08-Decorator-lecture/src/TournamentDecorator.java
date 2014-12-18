
public class TournamentDecorator implements Tournament {

	Tournament basicTournament = null;
	
	public TournamentDecorator(Tournament someTournament) {
		basicTournament = someTournament;
	}
	
	@Override
	public String getRequirements() {
		// TODO Auto-generated method stub
		return basicTournament.getRequirements();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return basicTournament.getCost();
	}

}
