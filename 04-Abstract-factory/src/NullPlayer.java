/**
 * Created by petkus on 12/11/14.
 */
public class NullPlayer extends ParticipantPlayer {
    public NullPlayer(){
        setName("No Player type found");
    }

    @Override
    public boolean isNull(){
        return true;
    }
}
