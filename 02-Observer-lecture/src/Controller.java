
public interface Controller {
	
	public void addMember(TeamObserver member);
	
	public void removeMember(TeamObserver member);
	
	public void notifyMembers(String message);
}
