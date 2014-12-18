
public abstract class ParticipantPlayer implements Participant {
	
	private String name;
	private double amountDamage;
	
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void setPoints(double newPoints){
		amountDamage = newPoints;
	}
	public double getPoints() {
		return amountDamage;
	}

    @Override
    public boolean isNull(){
        return true;
    }
}
