
public class Library {

	public static void main(String[] args) throws Exception{
	
		Pateron p = new Pateron("Vikram");
		Book b1 = new Book("George Orwell", "Animal Farm");
		Book b2 = new Book("George Orwell" , "1984");
		Book b3 = new Book("Dr.Suess" , "The Cat In The Hat");
		Book b4 = new Book("Anne Frank","The Dairy Of Anne Frank");
		
		p.borrowBook(b1);
		p.borrowBook(b2);
		p.borrowBook(b3);
		p.borrowBook(b4);
		
		p.returnBook(b2);
		System.out.println(p); 
		
		System.out.println(p.hasBook(b1));
		System.out.println(p.hasBook(b4));
		
		System.out.println(p.returnBook(b4)); 
		System.out.println(p.borrowBook(b4));
		
		System.out.println(p.canBorrow());
	}

}
