
public class NullTeam extends ParticipantTeam {

    public NullTeam(){
        setName("No Team type found");
    }

    @Override
    public boolean isNull(){
        return true;
    }
}
