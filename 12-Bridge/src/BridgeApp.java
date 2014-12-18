
public class BridgeApp {

	public static void main(String[] args){
		ClientAuthentication player1 = new BattleNetAuthentication(new ChallongeBracketsAPI(), "Player1", "Captain", "url...", "active", 50, 500);
		ClientAuthentication player2 = new SteamAuthentication(new TopScoreBracketsAPI(), "Player2", "Lead member", "url...", "offline", 25, 135);
        ClientAuthentication player3 = new BattleNetAuthentication(new ChallongeBracketsAPI(), "Player3", "Member", "url...", "online", 50, 70);
        ClientAuthentication player4 = new SteamAuthentication(new TopScoreBracketsAPI(), "Player4", "Recruit", "url...", "idle", 75, 25);
        ClientAuthentication player5 = new BattleNetAuthentication(new ChallongeBracketsAPI(), "Player5", "Captain", "url...", "idle", 100, 30);
        ClientAuthentication player6 = new SteamAuthentication(new TopScoreBracketsAPI(), "Player6", "Support", "url...", "active", 90, 50);
        ClientAuthentication player7 = new SteamAuthentication(new TopScoreBracketsAPI(), "Player7", "Disabled", "url...", "active", 60, 30);
        ClientAuthentication player8 = new BattleNetAuthentication(new ChallongeBracketsAPI(), "Player8", "Spare", "url...", "active", 40, 100);
        ClientAuthentication player9 = new SteamAuthentication(new TopScoreBracketsAPI(), "Player9", "Member", "url...", "offline", 30, 135);
        ClientAuthentication player10 = new BattleNetAuthentication(new ChallongeBracketsAPI(), "Player10", "Member", "url...", "active", 80, 50);


        player1.getCompleteUserProfile();
        System.out.println("---------------");
        player2.getCompleteUserProfile();
        System.out.println("---------------");
        player3.getCompleteUserProfile();
        System.out.println("---------------");
        player4.getCompleteUserProfile();
        System.out.println("---------------");
        player5.getCompleteUserProfile();
        System.out.println("---------------");
        player6.getCompleteUserProfile();
        System.out.println("---------------");
        player7.getCompleteUserProfile();
        System.out.println("---------------");
        player8.getCompleteUserProfile();
        System.out.println("---------------");
        player9.getCompleteUserProfile();
        System.out.println("---------------");
        player10.getCompleteUserProfile();
        System.out.println("---------------");
	}
	
}
