public class MainNotifications {
	
	public static void main(String[] args){
		TeamController team = new TeamController();

        TeamObserver observer1 = new TeamMemberObserver();
        TeamObserver observer2 = new TeamMemberObserver();
        TeamObserver observer3 = new TeamMemberObserver();
        TeamObserver observer4 = new TeamMemberObserver();
        TeamObserver observer5 = new TeamMemberObserver();
        TeamObserver observer6 = new TeamMemberObserver();
        TeamObserver observer7 = new TeamMemberObserver();
        TeamObserver observer8 = new TeamMemberObserver();
        TeamObserver observer9 = new TeamMemberObserver();
        TeamObserver observer10 = new TeamMemberObserver();

        team.addMember(observer1);
        team.addMember(observer2);
        team.addMember(observer3);
        team.addMember(observer4);
        team.addMember(observer5);
        team.removeMember(observer1);
        team.removeMember(observer2);
        team.removeMember(observer5);
        team.addMember(observer6);
        team.addMember(observer7);
        team.addMember(observer8);
        team.addMember(observer9);
        team.addMember(observer10);
        team.removeMember(observer9);
        team.removeMember(observer4);
        team.removeMember(observer10);
	}
}