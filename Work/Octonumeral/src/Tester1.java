import java.util.Arrays;

public class Tester1{
	
	
	
	public static void main(String[] args){
		
		char[] tosort = {'5', '2' , '7', '6'};
		
		String[] rerun = {"asdasd"};
		
		
		
		for(int i =0 ; i<intarr.length;i++)
			System.out.println(i+ " " + intarr[i]);
		
		int min = intarr[0],temp=0;
		
		for(int i=1; i<intarr.length;i++){
			
			if(intarr[i]>min){
				temp = intarr[i];
				intarr[i] = min;
				intarr[0] = temp;
				min =temp;
				
			}
			
		}
		
		for(int i =0 ; i<intarr.length;i++)
			System.out.println(i+ " " + intarr[i]);
		
		for(int i=0;i<intarr.length;i++){
			
			tosort[i] = (char) intarr[i];
			
		}
		
		
		
		Arrays.sort(tosort);
		for(int i=0;i<tosort.length;i++){
			System.out.print("tosort: " + tosort[i]);
		}
		
		
	}
	
	
	
	
}