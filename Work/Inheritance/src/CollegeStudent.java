
public class CollegeStudent extends Student implements Employable{

	private int projectedYearOfGraduation;
	private String major,year;
	
	public CollegeStudent(String n, int age, char gender, String ID, double gpa, String year , String Major, int projectedYearOfGraduation) {
		super(n, age, gender, ID, gpa);
		this.year = year;
		this.projectedYearOfGraduation = projectedYearOfGraduation;
		major = Major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getProjectedYearOfGraduation() {
		return projectedYearOfGraduation;
	}

	public void setProjectedYearOfGraduation(int projectedYearOfGraduation) {
		this.projectedYearOfGraduation = projectedYearOfGraduation;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String toString(){
		return super.toString() + " year:" + year + " major:" + major + " projected year of graduation:" + projectedYearOfGraduation;
	}

	@Override
	public boolean isEmployable() {
		
		if(this.getGPA() > 2.5 && this.getAge()>17)
			if(this.getAge()<23) return true;
		
		
		return false;
	}

}
