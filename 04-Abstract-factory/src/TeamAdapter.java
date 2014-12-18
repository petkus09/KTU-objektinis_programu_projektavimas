import java.io.UnsupportedEncodingException;

/**
 * Created by petkus on 12/12/14.
 */
public class TeamAdapter extends ParticipantTeam{
    ParticipantTeam team;

    public TeamAdapter(ParticipantTeam team) {
        this.team = team;
    }

    public void setName(String newName){
        byte ptext[] = newName.getBytes();
        String value = null;
        try {
            value = new String(ptext, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.team.setName(value);
    }
    public String getName(){
        return team.getName();
    }
    public void setPoints(double newPoints){
        if (newPoints > 0 && newPoints < 100){
            team.setPoints(newPoints);
        }
        else{
            team.setPoints(0);
        }
    }
    public double getPoints() {
        return team.getPoints();
    }

    @Override
    public boolean isNull(){
        return team.isNull();
    }
}
