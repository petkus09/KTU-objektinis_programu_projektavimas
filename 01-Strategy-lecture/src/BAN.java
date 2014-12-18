public class BAN implements PLAYER_STATUS {

	@Override
	public String joinMethod() {
		return "Rejected. Reason: banned";
	}

    public boolean getStatus(){
        return false;
    }
}
