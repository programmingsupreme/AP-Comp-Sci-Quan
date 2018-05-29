
public class Student {

	private String name="";
	private int numofabs=0; 
	
	public Student(String name,int a){
		this.name = name;
		this.numofabs = a;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAbsenceCount(){
		return this.numofabs;
	}
	
	public String toString(){
		return "Name:" + this.name + " Num of Absences:" + this.getAbsenceCount();
	}
}
