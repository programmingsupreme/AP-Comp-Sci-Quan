
import java.util.ArrayList;

public class Student_Tester {
	
	public static void main(String[] args){
		
		Student amy = new Student("Amy",1);
		Student jeff = new Student("Jeff",2);
		Student john = new Student("John",3);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(amy);
		list.add(jeff);
		list.add(john);
		System.out.println("List: " +list);
		SeatingChart s = new SeatingChart(list, 3, 3);
		
		System.out.println(s);
		
		System.out.println(s.removeAbsentStudents(0) + " Students removed.");
		
		System.out.println(s);
		
		//Test 2
		
		list.add(new Student("Tej",20));
		list.add(new Student("Billy",14));
		list.add(new Student("Corner",24));
		list.add(new Student("James",15));
		list.add(new Student("Jimmy",13));
		list.add(new Student("Madhav",18));
		
		SeatingChart room213 = new SeatingChart(list, 3, 3);
		
		System.out.println("\n" + "List: " + list);
		
		System.out.println("Chart");
		System.out.println(room213);
		
		room213.switchSeats(0, 0, 0, 2);
		
		System.out.println(room213);
		
		System.out.println(room213.isValidCol(5));
		System.out.println(room213.isValidRow(2));
		
	}
	
	
}
