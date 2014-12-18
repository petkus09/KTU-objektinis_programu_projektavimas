
public abstract class BracketsAPI {
	
	public BracketsAPI(){
	}
	
	public void username(String username){
        System.out.println("Username is " + username);
	}
	
	public void alias(String alias){
        System.out.println("Alias: " + alias);
	}
	
	public void avatarURL(String avatar){
		System.out.println("Avatar URL: " + avatar);
	}
	
	public void status(String status){
		System.out.println("User is currently " + status);
	}
	
	public abstract void customStatus1(int number);
	
    public abstract void customStatus2(int number);

}
