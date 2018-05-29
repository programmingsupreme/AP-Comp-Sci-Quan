
import java.util.Random;
import java.util.Scanner;

public class MemoryGame {

	
	static String[][] memcards = new String[6][6];
	static int score= 0,user_row=-1,user_col=-1,user_row1=-1,user_col1=-1;
	static boolean eg = false,open = false;
	
	public static void main(String[] args) {

		
		
			
		Create();
		Shuffle(memcards);
		System.out.println("Welcome to The memory game.");
		System.out.println("Pick a card by entering the row and col with a space with a space in between, if the card matches you win a point, if not you lose a point.");
		System.out.println("The first card is at [1][1]. To quit enter a 0 for all the rows and columns.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		do{
			game();
		}while(endgame() == false);
		
		if(endgame() == true){
			
			System.out.println("The number of turns used is " + score);
			System.out.println("Have a good day!");
			System.exit(0);
			
		}
		

	}
	
	private static boolean endgame() {
		
		int numx = 0;
		
		for(int row = 0; row<memcards.length; row++){
			
			for(int col = 0; col<memcards[0].length; col++){
				
				if(memcards[row][col].equals("x")){
					numx++;
				}
				
			}
			
		}
		
		if(numx == 36){
			return true;
		}
		
		if(eg == true){
			return true;
		}
		
		return false;
		
	}

	public static void game(){
		
		Scanner sc = new Scanner(System.in);
		
		Display(memcards);
		
		System.out.println("Enter row1 and col1");
		
		user_row = sc.nextInt()-1;
		user_col = sc.nextInt()-1;
		
		System.out.println("Enter row2 and col2");
		user_row1 = sc.nextInt()-1;
		user_col1 = sc.nextInt()-1;	
		open = true;
		if(user_row == -1){
			eg = true;
			System.out.println("The number of turns used is " + score);
			System.out.println("Have a good day!");
			System.exit(0);
		}
		
		if(checkcard(user_row,user_col, user_row1, user_col1, memcards) == false){
			System.out.println("Card 1 is " + memcards[user_row][user_col] + " Card 2 is " + memcards[user_row1][user_col1]);
			score++;
			System.out.println("You didn't make a match. Try again! :)");
			System.out.println("The number of turns used is " + score);
			game();
		}
		
		game();
		
	}
	
	
	//Instantiate a one-dimensional array of 36 String objects.  This will represent the “cards” that will be used.  You may determine what the String objects will contain.  There should be 18 pairs. Instantiate the array using an initializer list.
	public static String[][] Create(){
		
		memcards[0][0] = "West Orange";		
		memcards[0][1] = "West Orange";
		memcards[0][2] = "Edison";
		memcards[0][3] = "Edison";
		memcards[0][4] = "Egg Harbor";
		memcards[0][5] = "Egg Harbor";
		memcards[1][0] = "Summit";
		memcards[1][1] = "Summit";
		memcards[1][2] = "Plainfield";
		memcards[1][3] = "Plainfeild";
		memcards[1][4] = "Clark";
		memcards[1][5] = "Clark";
		memcards[2][0] = "Metuchen";
		memcards[2][1] = "Metuchen";
		memcards[2][2] = "Piscataway";
		memcards[2][3] = "Piscataway";
		memcards[2][4] = "Sayerville";
		memcards[2][5] = "Sayerville";
		memcards[3][0] = "Old Bridge";
		memcards[3][1] = "Old Bridge";
		memcards[3][2] = "New Brunswick";
		memcards[3][3] = "New Brunswick";
		memcards[3][4] = "South Brunswick";
		memcards[3][5] = "South Brunswick";
		memcards[4][0] = "Cherry Hill";
		memcards[4][1] = "Cherry Hill";
		memcards[4][2] = "Atlantic City";
		memcards[4][3] = "Atlantic City";
		memcards[4][4] = "Newark";
		memcards[4][5] = "Newark";
		memcards[5][0] = "Ho Ho Kus";
		memcards[5][1] = "Ho Ho Kus";
		memcards[5][2] = "Ocean City";
		memcards[5][3] = "Ocean City";
		memcards[5][4] = "Colonia";
		memcards[5][5] = "Colonia";
			
		return memcards;
	}
	  

	//Use a loop to shuffle the deck by generating 2 unique random numbers between 0 and 36.   Swap each card that has these numbers as subscripts.  Return a shuffled deck.
	public static String[][] Shuffle (String[][] cards){
		
		Random r = new Random();
		
		for(int i=0; i<cards.length* cards.length; i++){
			
			int row1 = r.nextInt(6), col1 = r.nextInt(6), row2 = r.nextInt(6), col2 = r.nextInt(6);
			String tempword = cards[row1][col1];
			
			cards[row1][col1] = cards[row2][col2];
			cards[row2][col2] = tempword;
			
			
		}
		
		return cards;
		
	}
	
	//Returns true if the parameters represent a row and column of a card that is not null
	public static boolean checkcard ( int r, int c, int r2 , int c2 , String[][] cards){
		
		String card1= cards[r][c].toString(), card2 = cards[r2][c2].toString();
		
		if(card1.length() == card2.length()){
			
			//card1 =card1.substring(0, card2.length()-2);
			
			if(card2.startsWith(card1)){
				
				System.out.println("Card 1 is " + cards[r][c] + " Card 2 is " + cards[r2][c2]);
				
				cards[r][c] = "x";
				cards[r2][c2] = "x";
				score++;
				System.out.println("You made a match!");
				System.out.println("The number of turns used is " + score);
				return true;
				
			}
			
		}
			
		return false;
		
	}
	

	//Displays grid, an 6 X 6 two dimensional array.  Display “X” for cards that have already been matched and display the category of the cards, ie “Dinosaur” for the cards that have not yet been matched.
	public static void Display ( String[][] cards ){
		
		//memcards[user_row][user_col].concat("1");
		//memcards[user_row1][user_col1].concat("1");
		
		for(int row =0; row<cards.length; row++){
			
			for(int cols=0; cols<cards[0].length;cols++){
				
				if(row == user_row && cols == user_col){
					System.out.print(cards[row][cols] + "\t\t");
				}
				else if(row == user_row1 && cols == user_col1){
					System.out.print(cards[row][cols] + "\t\t");
				}
				
				else if(cards[row][cols].equals("x")){
					System.out.print("No Card" + "\t" + "\t" + "\t");
				}
				else{
					
					System.out.print("Town/City" + "\t\t");
				}
			}
			
			System.out.print("\n");
		}
		//open = false;
		
		/*
		for(int rows =0 ;rows<memcards.length;rows++){
			
			for(int cols=0; cols<memcards[0].length;cols++){
				
				if(memcards[rows][cols].endsWith("1")){
					memcards[rows][cols] = memcards[rows][cols].substring(0, memcards[rows][cols].length());
				}
				
			}
		}*/
		
	}
	



}
