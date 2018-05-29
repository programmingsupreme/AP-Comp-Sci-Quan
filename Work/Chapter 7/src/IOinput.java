import java.util.Scanner;
import java.lang.NumberFormatException;

public class IOinput {
	
	Scanner sc = new Scanner(System.in);
	
	public IOinput(){
		
	}
	
	public int IOinputInt(String prompt){
		
		try {
			System.out.print(prompt);
			int ans = sc.nextInt();
		} catch (Exception e) {
			
			if(e.equals(NumberFormatException)){
				
			}
			
		}
		
	}
	
}
