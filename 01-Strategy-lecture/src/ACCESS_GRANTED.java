public class ACCESS_GRANTED implements PLAYER_STATUS {

	@Override
	public String joinMethod() {
		return "Joining a server....";
	}

    public boolean getStatus(){
        return true;
    }
}
