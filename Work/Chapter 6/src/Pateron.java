
public class Pateron {

	private String pateronName;
	private Book b1;
	private Book b2;
	private Book b3;
	
	
	public Pateron(String name) {
		pateronName = name;
	}

	public boolean canBorrow() {

			if(b1 == null || b2 == null || b3 == null) return true;

		return false;

	}

	//precondition: Book b is a book reference
	//postcondition: If Book b equals one of the book variables, display a message 
	//such as “Thank you for returning bookTitle by bookAuthor” and return true.  
	//If Book b does not equal any of the book variables returns false  
	public boolean returnBook(Book b){

		if(b.equals(b1)) {
			System.out.println("Thank you for returning " +b.getAuthor() + " by " + b.getTitle());
			b1 = null;
			return true;
		}
		else if(b.equals(b2)){
			System.out.println("Thank you for returning " +b.getAuthor() + " by " + b.getTitle());
			b2 = null;
			return true;
		}
		else if(b.equals(b3)){
			System.out.println("Thank you for returning " +b.getAuthor() + " by " + b.getTitle());
			b3 = null;
			return true;
		}
		else{
			System.out.println("You can't return the book " + b.getAuthor() + " " + b.getTitle());
			return false;
		}
	}

	//precondition :  Book b is a book reference
	//postcondition: If there is a null book instance variable, set it to b, display a
	//message such as ”You have borrowed bookTitle by bookAuthor” and returns true.
	//If there is no book instance variable that is null returns false
	public boolean borrowBook (Book b){

		if(canBorrow() == false){
			System.out.println("Can not borrow book " + b.getAuthor() + " " + b.getTitle());
			return false;
		}
		else{
				if(b1 == null){
					b1 = b;
					System.out.println("You have borrowed " + b.getTitle() + " by " + b.getAuthor() );
					return true;
				}
				else if(b2 == null){
					b2 = b;
					System.out.println("You have borrowed " + b.getTitle() + " by " + b.getAuthor() );
					return true;
				}
				else if (b3 == null){
					b3 = b;
					System.out.println("You have borrowed " + b.getTitle() + " by " + b.getAuthor() );
					return true;
			}
		}
		
		System.out.println("Can not borrow book " + b.getAuthor() + b.getTitle());
		return false;

	}

	//precondition: Book b is book reference
	//postcondition: Verifies whether Book b is the same as any of the book
	//instance variables. Display a message such as 
	//“patronName has bookTitle by bookAuthor” and returns true
	//If book instance variable is not equal to b, method returns false 
	public boolean hasBook(Book b){

			if(b1 == b){
				System.out.println( pateronName + " has " + b.getTitle() + " by Author " + b.getAuthor());
				return true;
		}
			else if(b2 == b){
				
				System.out.println( pateronName + " has " + b.getTitle() + " by Author " + b.getAuthor());
				return true;
		}
			else if(b3 == b){
				
				System.out.println( pateronName + " has " + b.getTitle() + " by Author " + b.getAuthor());
				return true;
		}
		return false;
	}
	
	//work on toString with this. and check if toString need args
	public String toString(){
		return this.b1 + " " + this.b2 + " " + this.b3 + " " + pateronName;
		}
	}


