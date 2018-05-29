import java.util.Random;

public class Game_of_Chance {

	static short pts, userbet,bet2=0;
	static byte roll,winningset;
	static boolean firstrun = true;
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		
		if(firstrun){
			userpts();
			firstrun = false;
		}
		
		userbet();
		roll = roll();
		System.out.println("You rolled a " + roll);
		if(roll == 7 || roll == 11){
			userwin();
			wannaplay();
		}
		else if(roll == 2 || roll == 3 || roll == 12){
			userlose();
			wannaplay();
		}
		else{
			
			roll = winningset;
			while(roll != 7 || roll != winningset){
			
				roll = roll();
				System.out.println("You rolled a " + roll);
				if(roll == 7){
					break;
				}
				else if(roll == winningset){
					break;
				}
			}
			
			if(roll == 7){
				
				userlose();
				wannaplay();
			
			}
			else if(roll == winningset){
				
				userwin();
				wannaplay();
				
			}
		}
		
		
	}
	
	public static byte roll(){
		
		Random r = new Random();
		byte ans = (byte) (r.nextInt(11) + 1);
		return ans;
		
	}
	
	public static void userpts(){
		
		try {
			System.out.println("Enter the total number of points");
			pts = sc.nextShort();
			if(pts<=0){
				System.out.println("Please enter a higher point value");
				userpts();
			}
		} catch (Exception InputMismatchExecption) {
			
			System.out.println("An incorrect value was entered please rerun the program.");
			System.exit(0);
			
		}
		
		
	}
	
	public static void userbet(){
		
		try {
			System.out.println("Enter the number of points to bet");
			userbet = sc.nextShort();
			
			if(userbet <= 0){
				System.out.println("Please enter a higher bet");
				userbet();
			}
			else if(userbet > pts){
				System.out.println("Please enter a lower bet. You have " + pts + " points.");
				userbet();
			}
		} catch (Exception InputMismatchException) {
			System.out.println("An error occured please rerun the program.");
			System.exit(0);
		}
		
	}
	
	public static void userwin(){
		
		pts+=userbet;
		
	}
	
	public static void userlose(){
		
		pts-=userbet;
		
	}
	
	public static void wannaplay(){
		
		try {
			
			if(pts == 0 || pts < 0){
				System.out.println("You have 0 points. Goodbye");
				System.exit(0);
			}
			
			System.out.println("Your total points are " + pts +"." + " To continue playing enter continue otherwise enter quit");
			char ans = sc.next().toLowerCase().charAt(0);
			
			if(ans == 'c'){
				main(null);
			}
			else if (ans == 'q'){
				userlose();
				System.out.println("Your point total is " + pts);
				System.out.println("Have a good day!");
				System.exit(0);
			}
			else{
				
				System.out.println("An incorrect input was entered. Please try again");
				wannaplay();
				
			}
		} catch (Exception InputMismatchException) {
			
			System.out.println("An error occured please re run the program.");
			System.exit(0);
		}
		
	}

}
