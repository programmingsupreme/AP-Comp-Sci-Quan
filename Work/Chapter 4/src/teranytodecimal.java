import java.util.Scanner;

public class teranytodecimal {

	public static void main(String[] args) {
		int ans =0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		String base3 = sc.next();

		for(int start = base3.length();start>0;start--){
			System.out.println("Start is : " + start + " The string length is " + base3.length());
			int end = start;
			System.out.println("start is " + start + " end is " + end);
			int num = Integer.parseInt(base3.substring(start-1, end));
			ans+= num * Math.pow(3.0, start*1.0);
		}
		System.out.println("The answer is " + ans);
		sc.close();
	}
	

}
