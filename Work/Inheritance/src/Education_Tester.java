
public class Education_Tester {

	public static void main(String[] args) {
		
		Person jay = new Person ("Jay", 35, 'M');
		System.out.println(jay);
		Student amy = new Student ("Amy", 15, 'F', "123321",3.4);
		System.out.println(amy);
		Teacher james = new Teacher ("Gosling", 53, 'M', "Computer Science",35);
		CollegeStudent aaron = new CollegeStudent
		("Aaron",18, 'M', "99099",3.9,"Senior", "Computer Engineering",2016);
		
		CollegeStudent c1 = new CollegeStudent 
				("Aaron",18, 'M', "99099",3.9,"Freshman", "Computer Engineering",2016);
				CollegeStudent c2 = new CollegeStudent 
				("Baron",19, 'M', "19191",3.9,"Sophomore", "Computer Engineering",2016);
				CollegeStudent c3 = new CollegeStudent 
				("Caren",20, 'F', "54321",3.9,"Junior", "Computer Engineering",2016);

	
		Employable c = new CollegeStudent ( "Mary", 20 , 'F' , "349587" , 3.6, "2016", "Bio Chemical Engineering" , 2020 );
		Employable t = new Teacher ("John", 35 ,'M' , "Chemistry" , 10);
		System.out.println (((Person) c).getName() + ", Birth year: " + getBirthYear(c,2016));
		System.out.println (((Person) t).getName() + ", Birth year: " + getBirthYear(t,2016));
				
	}

	private static int getBirthYear(Employable e, int currYr) {
		
		//curr year - age;
		
		 return currYr - ((Person) e).getAge();
		
	}
	

}
