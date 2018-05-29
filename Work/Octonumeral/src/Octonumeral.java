
import java.util.Arrays;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		/*int test = 3418;
		int b = getoctal(test);
		System.out.println(b);//returns 6532*/
		
		int sorted,unsorted,diff,converted;
		String toconvertstring;
		Scanner sc = new Scanner(System.in);
		
		//Get user input
		int[] toconvert = new int[1];
		//System.out.println("Enter the number to convert:");
		toconvert[0] = 3418;//sc.nextInt();
		
		for(int i = 0; i<5; i++){

			toconvertstring = toconvert[0] + "";
			System.out.println("Toconvert string is " + toconvertstring);
			converted = getoctal(Integer.parseInt(toconvertstring));
			System.out.println("Toconvert string after octal conversion is " + converted);
			sorted = vikramsort(getchararray(Integer.toString(converted)));
			System.out.println("sorted is " + sorted);
			//convert to decimal
			unsorted = getdecimal(converted);
			sorted = getdecimal(sorted);
			System.out.println("Unsorted decimal is " + unsorted + "Sorted decimal is " + sorted);
			//Subtracting
			
			System.out.println(unsorted + " - " + sorted);
			diff = sorted-unsorted;
			diff = Math.abs(diff);
			//System.out.println("diff is " + diff);
			//Print out answer
			diff = getoctal(diff);
			System.out.println("diff in octal is " + diff);
			
			System.out.println("-------------------------------------------------");
			
			toconvert[0] = getdecimal(diff);	
		}
		
		System.out.println("***************************************************");
		int ans = getoctal(toconvert[0]);
		int newans = getdecimal(ans);
		System.out.println("The answer is " + newans);
		
	}

	//pre-cond: the chars in the array are all integers
	private static int vikramsort(char[] myarray) {
		
		int[] intarr = new int[myarray.length];
		
			for(int i=0;i<myarray.length;i++){
				intarr[i] = (int) myarray[i];
			}
			
			Arrays.sort(intarr);
			
			for(int i = 0;i<intarr.length;i++){
				myarray[i] = (char) intarr[i];
			}
			
			String a = "";
			
			for(int i=0;i<intarr.length;i++){
				
				a += (char) myarray[i];

			}
			
			return Integer.parseInt(a);
		
	}

	private static char[] getchararray(String toconvertstring) {
		
		char[] ans  = new char[toconvertstring.length()];
		
		for(int i=0; i < toconvertstring.length(); i++){
			
			ans[i] = toconvertstring.charAt(i);
			
		}
		
		return ans;
	}

	//Pre-cond: diff>0 && diff<Integer.MAX_VALUE
	//Code modeled from https://beginnersbook.com/2014/07/java-program-for-decimal-to-octal-conversion/
	private static int getoctal(int diff) {
		
		int num = Math.abs(diff),rem;

		String str = "";
		
		char dig[]={'0','1','2','3','4','5','6','7'};
		
	    while(num>0)
	    {
	       rem=num%8; 
	       str=dig[rem]+str; 
	       num=num/8;
	    }
	    
	    return Integer.parseInt(str);
		
	}

	//Pre-cond : i>0 && i<Integer.MAX_VALUE;
	//Code Modeled from https://codescracker.com/java/program/java-program-convert-octal-to-decimal.htm
	private static int getdecimal(int i) {
		

		String test = Integer.toString(i);
		
		for(int k =0; k < test.length(); k++){
			if(test.charAt(k) == 8){
				System.out.println("Invalid Number");
				return 0;
			}
		}
		
        int octnum, decnum=0, i1=0, orig;
        
        octnum = i;
		
        orig = octnum;
		
        while(octnum != 0)
        {
            decnum = decnum + (octnum%10) * (int) Math.pow(8, i1);
            i1++;
            octnum = octnum/10;
        }
		
        return (decnum);
		
	}

}
