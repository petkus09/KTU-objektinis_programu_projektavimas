import java.io.UnsupportedEncodingException;

/**
 * Created by petkus on 12/12/14.
 */
public class PlayerAdapter extends ParticipantPlayer{
    ParticipantPlayer player;

    public PlayerAdapter(ParticipantPlayer player) {
        this.player = player;
    }

    public void setName(String newName){
        byte ptext[] = newName.getBytes();
        String value = null;
        try {
            value = new String(ptext, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.player.setName(value);
    }
    public String getName(){
        return player.getName();
    }
    public void setPoints(double newPoints){
        if (newPoints > 0 && newPoints < 100){
            player.setPoints(newPoints);
        }
        else{
            player.setPoints(0);
        }
    }
    public double getPoints() {
        return player.getPoints();
    }

    @Override
    public boolean isNull(){
        return player.isNull();
    }
}
