
public class TopScoreBracketsAPI extends BracketsAPI {

	public TopScoreBracketsAPI() {
		super();
	}

    @Override
    public void customStatus1(int number) {
        System.out.println(number+" //TopScore TM");
        System.out.println("No bets for this player yet");
    }

    @Override
    public void customStatus2(int number) {
        System.out.println(number+" //TopScore TM");
        System.out.println("No bets for this player yet");
    }
}
