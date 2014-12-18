
public class Participant {
	
	private String name;
	private PLAYER_STATUS connectionStatus;
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setConnectionStatus(PLAYER_STATUS newConnectionStatus){
        connectionStatus = newConnectionStatus;
	}
	
	public String join(){
		return connectionStatus.joinMethod();
	}
	
    public boolean getStatus(){
        return connectionStatus.getStatus();
    }
}
