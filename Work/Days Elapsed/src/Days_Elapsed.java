import java.util.Scanner;
public class Days_Elapsed {

	
	static int month,day,year,endmonth,endday;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
//Checks if user wants to continue
		System.out.println("To find the days between dates enter 'days' ");
		System.out.println("To exit enter 'exit' ");
		
		char ans = sc.next().charAt(0);
		//Checks what option the user picked
		if(ans == 'd'){
			elapsed();
		}
		else{
			System.out.println("Have a good day!");
			sc.close();
			System.exit(0);
		}
		
	}
//Checks that the user inputs valid input
	private static void elapsed(){
		int a =1;
		try{
			
			System.out.println("Enter the year");
			year = sc.nextInt();
			if(checkyear(year) != true){
				System.out.println("Please try again an error occured");
				main(null);
			}
			System.out.println("Enter the starting month");
			month = sc.nextInt();
			if(checkmonth(month) != true){
				System.out.println("Please try again an error occured");
				main(null);
			}
			System.out.println("Enter the starting day");
			day = sc.nextInt();
			if(checkday(day) != true){
				System.out.println("Please try again an error occured");
				main(null);
			}
			System.out.println("Enter the end month");
			endmonth =sc.nextInt();
			if(checkmonth(endmonth) != true){
				System.out.println("Please try again an error occured");
				main(null);
			}
			else if(endmonth<month){
				System.out.println("The endmonth is less than the start month. Please try again");
				main(null);
			}
			System.out.println("Enter the end day");
			endday = sc.nextInt();
			if(checkday(endday) != true){
				System.out.println("Please try again an error occured");
				main(null);
			}
			if(endmonth == month && endday<day){
				System.out.println("The end day is less than the start day. Please try again");
				main(null);
			}
		}catch(Exception e){
			System.out.println("A Error occured please try again");
			main(null);
		}
		
		System.out.println("The number of elapsed days are " + (ElapsedDays(month,endmonth,day,endday) + a));
		main(null);
	}
	//Checks if the year is valid and returns true or false
	private static boolean checkyear(int year) {
		if(year >= 0)
			return true;
		
		return false;
	}
	//Checks if the month is valid and returns true or false
	private static boolean checkmonth(int month) {
		for(int i=0; i<13 ; i++){
			if(month == i)
				return true;
			else if(month!=i)
				continue;
		}
		return false;
	}
	/*
	 * Checks if the month is a month with 31 days and chacks if the month is valid
	 * Otherwise if the month has 30 days it checks if the day is valid
	 * lastly the month must have 28 days unless it is a leap year then it has 29
	 */
	private static boolean checkday(int day) {
		
		if(day<=0) return false;
		
		if(month ==  1  || month == 3 || month ==  5  || month ==  7 || month ==  8  || month ==  10  || month ==  12 && isLeapYear() == false){
			if(day<=31) return true;
		}
		else if (day <= 30) return true;
		else if(isLeapYear()){
			if(month == 2 && day<=29) return true;
		}
		
		else if(month == 2){
			
			if(day<=28) return true;
		}
		
		return false;
	}

	private static boolean isLeapYear() {
		boolean isleapyear=false;
		if(year%400 == 0 && year%4 == 0) isleapyear = true;
		else if(year%400 == 0 && year%100 == 0) isleapyear = false;
		else if(year%4 == 0 && year%100 != 0) isleapyear = true;
		return isleapyear;
		
	}

	/*
	 * Uses a pre-set array with the number of days in each month and 0 to avoid writing month-1
	 * Checks if the days are in the same month and then subtracts the two days
	 * Checks if the days have one month in between and adds the days for that month
	 * Checks if the days passes 2 or more months and adds the days for the months passed
	 * Adds a leap day if the leap year is true
	 */
	private static int ElapsedDays(int startmonth, int endmonth, int startday, int endday){
		int montharray[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(startmonth == endmonth){
			return endday-startday;
		}
		
		if(endmonth-startmonth == 1){
			int days = montharray[startmonth]-startday + endday;
			 return addLeapDay(startmonth,endmonth,days);
		}
		
		if(endmonth-startmonth>=2){
			int days = montharray[startmonth]-startday + endday;
			for(int start = startmonth+1; start<endmonth; start++){
				days += montharray[start];
			}
			
			return addLeapDay(startmonth,endmonth,days);
		}
		
		else return -1;
	}
	//Checks whether the range of days pass through February and adds a leap day.
	// in a leap year it adds a day if needed otherwise returns total days.
	private static int addLeapDay(int startmonth, int endmonth, int totaldays){
		if(isLeapYear()){
			
			if(startmonth <=2 && endmonth>2){
				if(day!=29) // user already figured out its a leap year!
					return totaldays+1;
			}
		}
		
		return totaldays;
	}
	
}
