
public class FunnyFraction {

	private int num,denom;
	
	public FunnyFraction(){
		this.num = 0;
		this.denom = 1;
	}
	
	public FunnyFraction(int numerator, int denominator){
		this.num = numerator;
		if(denominator!=0)
			this.denom = denominator;
		else
			this.denom =1;
	}

	public int getDenominator(){
		return this.denom;
	}
	
	public int getNumerator(){
		return this.num;
	}
	
	public String toString(){
		return this.num + "/" + this.denom;
	}
	
	private void checkdenom(){
		if(denom == 0)
			this.denom = -1;
	}
	
	private void checkdenom(FunnyFraction f){
		if(f.getDenominator() == 0)
			f.denom = -1;
	}
	
	public FunnyFraction funnyAdd (FunnyFraction f){
		
		int finalnum = this.getNumerator() + f.getNumerator() + this.getDenominator() + f.getDenominator();
		int finaldenom = (this.getNumerator() + f.getNumerator()) * (this.getDenominator() + f.getDenominator());
		FunnyFraction finalans = new FunnyFraction(finalnum,finaldenom);
		checkdenom();
		checkdenom(finalans);
		return finalans
;	}
	
	public FunnyFraction funnySubtract (FunnyFraction f){
		
		int finalnum = f.getDenominator() - this.getDenominator() - f.getNumerator() - this.getNumerator();
		int finaldenom = (f.getDenominator() - this.getDenominator()) * (f.getNumerator() - this.getNumerator());
		FunnyFraction finalans = new FunnyFraction(finalnum,finaldenom);
		checkdenom();
		checkdenom(finalans);
		return finalans;
		
	}
	
	public FunnyFraction funnyMult(FunnyFraction f){
		
		int finalnum = (int) Math.sqrt((Math.pow(this.getNumerator() - f.getNumerator(), 2)) + this.getDenominator()); 
		int finaldenom = (int) (Math.pow(this.getDenominator() - f.getDenominator(),2) - f.getNumerator());
		FunnyFraction finalans = new FunnyFraction(finalnum,finaldenom);
		checkdenom();
		checkdenom(finalans);
		return finalans;
		
	}
	
	public FunnyFraction funnyDivide (FunnyFraction f){
		
		int finalnum = this.getNumerator() * f.getDenominator();
		int finaldenom = this.getDenominator() * f.getNumerator();
		FunnyFraction finalans = new FunnyFraction(finalnum,finaldenom);
		checkdenom();
		checkdenom(finalans);
		return finalans;
		
	}
	
}
