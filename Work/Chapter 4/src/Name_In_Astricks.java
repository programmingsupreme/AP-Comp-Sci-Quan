import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Name_In_Astricks {

	public static void main(String[] args) throws FileNotFoundException {
		int numread;
		Scanner sc = new Scanner (new File ("/Users/3004226/Desktop/Ap cs file data.txt"));
		PrintWriter  writer = new PrintWriter (new File ("/Users/3004226/Desktop/Program Output.txt") );  
		while (sc.hasNext() )  {   // reads until EOF 
			  numread = sc.nextInt();
			  if(numread>0){
				for(int start = numread; start>0; start--)
				  writer.print ('*');  
				}
			  else if(numread<0){
				  for(int start = numread; start<0;start++){
					  writer.print(' ');
				  }
			  }
			  else{
				 writer.print('\n');
			  }
		}
		writer.close();
		sc.close();


	}

}
