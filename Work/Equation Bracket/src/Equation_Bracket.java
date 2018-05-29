import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Equation_Bracket {

	static String eq1,eq2,eq3,eq4,eq5;
	static Scanner sc;
	static byte brace,squarebrace,curlybrace;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			sc = new Scanner(new File("/Users/3004226/Desktop/Test Equations.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		readfile();
		
		System.out.println(eq1);
		System.out.println(eq2);
		System.out.println(eq3);
		System.out.println(eq4);
		System.out.println(eq5);
		
		getnumbraces();
		
		System.out.println("brace: " + brace + " square: " + squarebrace + " curly: " + curlybrace);
		
		
		
	}

	public static void getnumbraces() {
		
		System.out.println("Get Braces entered");
		
		for(byte j = 0; j<=eq1.length() -1; j++){
			
			System.out.println(j);
			
			if(eq1.charAt(j) == ' '){
				sc.next();
			}
			
			else if(eq1.charAt(j) == '(' || eq1.charAt(j) == ')') brace++;
			
			else if(eq1.charAt(j) == '[' || eq1.charAt(j) == ']') squarebrace++;
			
			else if(eq1.charAt(j) == '{' || eq1.charAt(j) == '}') curlybrace++;
			
			else sc.next();
		}
		
	}

	public static void readfile(){
		
		eq1 = sc.nextLine();
		eq2 = sc.nextLine();
		eq3 = sc.nextLine();
		eq4 = sc.nextLine();
		eq5 =sc.nextLine();
		
	}
}
