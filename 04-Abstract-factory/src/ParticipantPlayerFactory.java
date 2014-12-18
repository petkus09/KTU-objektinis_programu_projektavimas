import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ParticipantPlayerFactory implements ParticipantFactory {


	public Participant createPlayer(){
//		Scanner sc = new Scanner(System.in);
		System.out.println("Make a choise: A/B");
		String userOption = "";
//		if(sc.hasNextLine()){
//			userOption = sc.nextLine();
//		}
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            userOption = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Participant participantUnit = null;
		if(userOption.equals("A")){
			participantUnit = new PlayerAdapter(new PlayerA());
		}else
		if(userOption.equals("B")){
			participantUnit = new PlayerAdapter(new PlayerB());
		}
        else{
            participantUnit = new PlayerAdapter(new NullPlayer());
        }
//		sc.close();
		return participantUnit;
	}

	@Override
	public Participant createParticipant() {
		// TODO Auto-generated method stub
		return createPlayer();
	}
	
}
