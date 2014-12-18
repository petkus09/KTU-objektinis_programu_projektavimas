import java.util.ArrayList;
import java.util.List;

public class Server {
    private static List<Participant> serverMembers;

    public static void main(String[] args) {
        serverMembers = new ArrayList<Participant>();

		Participant player1 = new BannedPlayer();
        player1.setName("Player1");
        player1.setConnectionStatus(new BAN());
        serverMembers.add(player1);
        System.out.println(player1.join());

        Participant player2 = new Player();
        player2.setConnectionStatus(new ACCESS_GRANTED());
        player2.setName("Player2");
        serverMembers.add(player2);
        System.out.println(player2.join());

        Participant player3 = new Player();
        player3.setConnectionStatus(new ACCESS_GRANTED());
        player3.setName("Player3");
        serverMembers.add(player3);
        System.out.println(player3.join());

        Participant player4 = new Player();
        player4.setConnectionStatus(new ACCESS_GRANTED());
        player4.setName("Player4");
        serverMembers.add(player4);
        System.out.println(player4.join());

        Participant player5 = new Player();
        player5.setConnectionStatus(new ACCESS_GRANTED());
        player5.setName("Player5");
        serverMembers.add(player5);
        System.out.println(player5.join());

        Participant player6 = new Player();
        player6.setConnectionStatus(new ACCESS_GRANTED());
        player6.setName("Player6");
        serverMembers.add(player6);
        System.out.println(player6.join());

        displayCurrentPlayers();
        dismissBannedMembers();
        displayCurrentPlayers();
	}

    private static void dismissBannedMembers(){
        for(Participant participant: serverMembers){
            if (!participant.getStatus()){
                serverMembers.remove(participant);
            }
        }
    }

    private static void displayCurrentPlayers(){
        for(Participant participant: serverMembers){
            System.out.println(participant.getName());
        }
    }

}
