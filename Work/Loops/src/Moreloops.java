import java.util.Random;
import java.util.Scanner;

public class Moreloops {

	public static void main(String[] args) {

		//Generate Scanner
		Scanner sc= new Scanner(System.in);
		//think of a number between 1 &100
		Random rand = new Random();
		int randomnumber = rand.nextInt(100) +1;
		int guess=1;
	//	System.out.println(randomnumber); // test output
		do{
		//Ask for user input
		System.out.print("Try to guess the number");
		 guess = sc.nextInt();
		//Evaluate input
		
			
			if(guess == randomnumber){
				System.out.println("You guessed the number right! It was " + randomnumber);
				break;
			}
			else if(guess == 4673){
				break;
			}
			else if(guess>randomnumber){
				System.out.println("Guess lower");
			}
			else{
				System.out.println("Guess higher");
			}
		//	System.out.print("Try to guess the number");
		//	int guess = sc.nextInt();
			
		}while(guess != randomnumber);
		//If input is wrong continue loop
		//If right break
		// If the password number is entered break
		
	}

}