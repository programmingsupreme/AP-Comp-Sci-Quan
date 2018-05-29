
public class Book {

	private String auth;
	private String title;
	
	public Book(String auth , String title){
		
		this.auth = auth;
		this.title = title;
		
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getAuthor(){
		return this.auth;
	}
	

	public String toString(){
		return this.auth + " " + this.title;
	}
}
