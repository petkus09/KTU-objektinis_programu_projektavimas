
public class LanPartyEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TournamentDecorator tournament = new TeamTournament(new VideoGameTournament(new BasicTournament()));
		
		System.out.println(tournament.getRequirements());
		System.out.println(tournament.getCost());
		

	}

}
