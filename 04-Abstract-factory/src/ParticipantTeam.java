
public abstract class ParticipantTeam implements Participant {
	
	private String name;
	private double amountPoints;

	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void setPoints(double newPoints){
		amountPoints = newPoints;
	}
	public double getPoints() {
		return amountPoints;
	}

    @Override
    public boolean isNull(){
        return true;
    }
}

