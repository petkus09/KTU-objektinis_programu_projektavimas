
public class BattleNetAuthentication extends ClientAuthentication {

    public BattleNetAuthentication(BracketsAPI bracketProfile, String username, String alias, String avatarUrl, String status, int number1, int number2) {
        super(bracketProfile, username, alias, avatarUrl, status, number1, number2);
    }

    @Override
	public void customStatus1(int number) {
        System.out.println("Owned "+number+" games");
        bracketProfile.customStatus1(number);
	}

	@Override
	public void customStatus2(int number) {
        System.out.println("Currently in "+number+" winstreak");
        bracketProfile.customStatus2(number);
	}

}
