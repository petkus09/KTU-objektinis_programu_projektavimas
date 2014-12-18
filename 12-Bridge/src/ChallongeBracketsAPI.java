
public class ChallongeBracketsAPI extends BracketsAPI {

	public ChallongeBracketsAPI() {
		super();
	}

	@Override
	public void customStatus1(int number) {
        System.out.println("<<C<< "+number+" >>C>>");
		System.out.println("All player calculations and game information are trademarked under Challonge");
	}

	@Override
	public void customStatus2(int number) {
        System.out.println("<<C<< "+number+" >>C>>");
		System.out.println("Trademark of Challonge");
	}

}
