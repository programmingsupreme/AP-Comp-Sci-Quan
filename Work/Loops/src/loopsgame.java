import java.util.Random;

public class loopsgame {

	public static void main(String[] args) {
		// Get random numbers & initialize score
		int userscore = 0,compscore =0; // Scores initialized
		
		while(userscore != 10 && compscore != 10){ // Main game loop
		Random rand = new Random();
		int userrandomnumber = rand.nextInt(20) +1; // Generates users random number
		
		Random random = new Random();
		int comprandomnumber = random.nextInt(20) +1; // Generates computers random number
		
		//Show Your number and the computers number
		System.out.println("Your number is " + userrandomnumber + ". The computers number is " + comprandomnumber + ".");
		
		//Check if both numbers are the same
		if(userrandomnumber == comprandomnumber){
			compscore -= compscore;
		}
		//Update score
		else if(userrandomnumber > comprandomnumber){
			userscore++;
		}
		else{
			compscore++;
		}
	}
		// Print out score
		if(userscore > compscore){
			System.out.println("Congratulations you won! " + "Your score was " + userscore +". The computers score was " + compscore + ".");
		}
		else{
			System.out.println("Try again the computer won. " + "Your score was " + userscore +". The computers score was " + compscore + ".");
		}
	}

}
