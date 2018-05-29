import java.util.Scanner;

public class done_loop {
	public static void main(String[] args) {
		
		//Initalize  vars and create scanner
		Scanner sc = new Scanner(System.in);
	    String max = "AAAAAAAAAAAAAAA";
		
		String min = "zzzzzzzzzzzzzzzz";
		String userword;

		// Ask user for word
		do{
		System.out.println("Enter a word");
		//Use compareTo to alphabetize the words
		userword= sc.next();
	
		//
		   if(userword.compareTo("done") != 0 ) 
		    {
			     if(userword.compareTo(max) > max.compareTo(userword))
			     {
			    	     max = userword;
			     }
			     if(userword.compareTo(min) < min.compareTo(max));{
			    	 min = userword;
			     }
		    }
	//	}
	}while(userword.compareTo("done") != 0);		//check to see if its is 'done'
		
		
		System.out.println("The firstword is " + min);
		System.out.println("The last word is " + max);
		

		// Put the program in a do-while loop
		
		
		sc.close();
	}
}
