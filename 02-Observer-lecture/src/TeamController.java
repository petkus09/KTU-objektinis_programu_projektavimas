import java.util.ArrayList;
import java.util.List;

public class TeamController implements Controller {
    private List<TeamObserver> members;

    public TeamController() {
        this.members = new ArrayList<TeamObserver>();
    }

    @Override
    public void addMember(TeamObserver member) {
        this.members.add(member);
        notifyMembers("A new member has been added to the team");
    }

    @Override
    public void removeMember(TeamObserver member) {
        this.members.remove(member);
        notifyMembers("A member has been disbanded from the team");
    }

    @Override
    public void notifyMembers(String message) {
        for(TeamObserver observer: this.members){
            observer.notifyWithChanges(message);
        }
    }
}
