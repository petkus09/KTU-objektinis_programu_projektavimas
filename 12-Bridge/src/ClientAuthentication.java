
public abstract class ClientAuthentication {

	protected BracketsAPI bracketProfile = null;
    protected String username;
    protected String alias;
    protected String avatarUrl;
    protected String Status;
    protected int number1;
    protected int number2;


    protected ClientAuthentication(BracketsAPI bracketProfile, String username, String alias, String avatarUrl, String status, int number1, int number2) {
        this.bracketProfile = bracketProfile;
        this.alias = alias;
        this.username = username;
        Status = status;
        this.avatarUrl = avatarUrl;
        this.number1 = number1;
        this.number2 = number2;
    }

    public void username(String username){
        bracketProfile.username(username);
	}
	public void alias(String alias){
        bracketProfile.alias(alias);
	}
	public void avatarURL(String avatar){
        bracketProfile.avatarURL(avatar);
	}
	public void status(String status){
        bracketProfile.status(status);
	}
	abstract public void customStatus1(int number);
	abstract public void customStatus2(int number);

    public void getCompleteUserProfile(){
        username(username);
        alias(alias);
        avatarURL(avatarUrl);
        status(Status);
        customStatus1(number1);
        customStatus2(number2);
    }
}
