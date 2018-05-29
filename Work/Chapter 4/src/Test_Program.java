
public class Test_Program {

	
	public int NumDaysInYear (int year) {
		int days= 100;
		if(year%5==0){ //Checks for specail year
			// we have a special year
			days += year%6; //vs 0/6
			return days-5;
		}
		
		return days; //returns 100
		//precondition:  year is a positive number, 0 <= year <= Integer.MAX_VALUE
		//postcondition:NumDaysInYear returns the number of days in the year.
//		              The number of days is 100 if year is not divisible by 5.
//		              Otherwise, the number of days is 100, increased by the remainder
//		              of year divided by 6 and decreased by 5

	}
	
	public boolean StartDateIsBeforeEndDate (int sMon, int sDay, int eMon, int eDay) {
		if(sMon == eMon) { //Checks for same month
			if(sDay<eDay) 
				return true;
		}
		else if(sMon<eMon) {
			return true;
		} //Checks for different month
		else {
			return false;
		}
						
		//return false;
		//precondition:  sMon, sDay, eMon and eDay represent the start date and end date
//		               from a “non special year” where each month is 20 days long
		//postcondition: The method will return true if the start date is before end date
//		               and false if the start date is on or after the end date

	}
}
