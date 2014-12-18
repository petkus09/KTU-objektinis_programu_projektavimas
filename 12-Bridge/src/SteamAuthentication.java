
public class SteamAuthentication extends ClientAuthentication {

    public SteamAuthentication(BracketsAPI bracketProfile, String username, String alias, String avatarUrl, String status, int number1, int number2) {
        super(bracketProfile, username, alias, avatarUrl, status, number1, number2);
    }

    @Override
	public void customStatus1(int number) {
        System.out.println("Player since "+number+" year");
        bracketProfile.customStatus1(number);
	}

	@Override
	public void customStatus2(int number) {
        System.out.println("Playing hours on record: "+number);
        bracketProfile.customStatus2(number);
	}

}
