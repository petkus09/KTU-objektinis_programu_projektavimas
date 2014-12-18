public class LanagerTeamsApplication{

	public static void main(String[] args){
        TournamentSingleton tournament = TournamentSingleton.getInstance(new ParticipantPlayerFactory());
		tournament.createParticipant();
		tournament.createParticipant();
		tournament.createParticipant();
		tournament.createParticipant();
		tournament.createParticipant();
		tournament.createParticipant();
        System.out.println(tournament.getTournamentParticipants());
        tournament.finishTournament();

        tournament = TournamentSingleton.getInstance(new ParticipantTeamFactory());
        tournament.createParticipant();
        tournament.createParticipant();
        tournament.createParticipant();
        tournament.createParticipant();
        tournament.createParticipant();
        tournament.createParticipant();
        System.out.println(tournament.getTournamentParticipants());
        tournament.finishTournament();
	}
}
