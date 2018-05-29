
public class Test {

	public static void main(String[] args) {
		//Random Number 10-20
		
		for(int j = 0; j<3000; j++){
			
			
			double num = (int)(Math.ceil(Math.random() *100 +100));
			if(num == 100.00 || num ==200.00 )
				System.out.print("Fuck Quan");
			
			print(num);
		}
	
	}
	public static void print(String s){
		System.out.println(s);
	}
	public static void print(int i){
		System.out.println(i);
	}
	public static void print(double a){
		System.out.println(a);
	}
}
