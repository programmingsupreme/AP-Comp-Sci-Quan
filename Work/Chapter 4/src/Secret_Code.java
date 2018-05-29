import java.util.Scanner;

public class Secret_Code {

	public static void main(String[] args) {

		//try{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter letters to convert");
			String input = sc.next();
			if(isValidLength(input)==false) main(args); //Checks if string is valid
			//Converting to ASCII
			
			int acsiiinput = charToAscii(input);
			System.out.println("The ascii code is " + acsiiinput);
			
			//Getting number of digits
			
			int numofdigits = getNumDigits(acsiiinput);
			//System.out.println("The number of digits is " + numofdigits);
		
			//Checking if number of digits is odd or even; if odd multiplying by 10
			
			if(numofdigits%2==1) acsiiinput = acsiiinput*10;
			
			//if the number is less than or equal to 4000 multiplying by 4
			
			if(acsiiinput<=4000) acsiiinput = acsiiinput*4;
			
			System.out.println("The 4 digit number is " + acsiiinput);
			
			//Prints the secret code
			
			System.out.println("The secret code is " + getSecretCode(acsiiinput));
			sc.close();
			/*}catch(Exception e){
			
			System.out.println("A error occurred");
			main(args);
			
		}*/
		

	}

	private static boolean isValidLength(String input) {
		if(input.length() >1 && input.length() < 13) return true; //Checks if the input is between 2 and 12 charathers
		else return false;
	}
	
	private static int charToAscii (String inputtoconvert){
		int asciiinput = 0;
		
		for(int start = inputtoconvert.length(); start>0; start--){
			
			asciiinput += (int) inputtoconvert.charAt(start-1);
			
		}

		return asciiinput;
	}
	
	private static int getNumDigits (int number) {
		
		int i=number;
		int numofdigits = 0;

		while(i>0){
			
			i=i/10;
			numofdigits++;
		
		}
		
		return numofdigits;
	}

	private static String getSecretCode (int fourdigitnumber){
		
		String part = Integer.toString(fourdigitnumber);
		
		//System.out.println("Part is " + part);
		
		//seperate in to two parts
		
		String  parta = part.substring(0,2);
		String partb = part.substring(2,4);
		
	//	System.out.println("Part a is " + parta + " Part b is " + partb);
	
		int part1 = Integer.parseInt(parta);
		int part2 = Integer.parseInt(partb);
		
	//	System.out.println("Part 1 is " + part1 + " part 2 is " + part2 + " part a is " + parta + " part b is " + partb);
		
		
		if(part1<=65) part1+=61;
		if(part2<=65) part2+=61;
		
		String secretcode = "";
		secretcode += (char) part1;
		secretcode += (char) part2;
		
		return secretcode;
		
	}

}
