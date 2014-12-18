// Represents each Observer that is monitoring changes in the subject

public class TeamMemberObserver implements TeamObserver {


    @Override
    public void notifyWithChanges(String message) {
        System.out.println("Notification:" + message);
    }
}