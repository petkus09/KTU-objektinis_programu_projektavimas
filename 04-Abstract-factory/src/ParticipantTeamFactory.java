import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ParticipantTeamFactory implements ParticipantFactory {


	public Participant createTeam(){
		//Scanner sc = new Scanner(System.in);
		System.out.println("Make a choise: L/S");
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
		if(userOption.equals("L")){
			participantUnit = new TeamAdapter(new TeamLiquid());
		}else
		if(userOption.equals("S")){
			participantUnit = new TeamAdapter(new TeamSolid());
		}
        else{
            participantUnit = new TeamAdapter(new NullTeam());
        }
//		sc.close();
		return participantUnit;
	}

	@Override
	public Participant createParticipant() {
		// TODO Auto-generated method stub
		return createTeam();
	}
	
}

