
public class Teacher extends Person implements Employable{

	private String sub;
	private int years_exp;
	
	public Teacher(String n, int age, char gender, String subject, int years_expirance){
		super(n,age,gender);
		sub=subject;
		years_exp = years_expirance;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getYears_exp() {
		return years_exp;
	}

	public void setYears_exp(int years_exp) {
		this.years_exp = years_exp;
	}
	
	public String toString(){
		return super.toString() + " years expireance:" + years_exp + " subject:" + sub;
	}

	@Override
	public boolean isEmployable() {
		
		if(this.getYears_exp() >5 && this.getAge()>22)
			return true;
		
		return false;
	}
	
}
