
import java.util.Scanner;

public class MagicSquare {

	private short[][] magic_square;
	private short[] checkme;
	boolean iseven = false;

	public MagicSquare(int num){

			if(num<3){
				System.out.println("An error occurred please try again.");
				System.exit(1);
			}

		magic_square = new short[num][num];

		checkme = new short[num*num];

		Scanner sc = new Scanner(System.in);

		if(num%2 == 0){
			iseven = true;
		}
		
		System.out.println("Enter the " + magic_square.length*magic_square.length + " values seperated by spaces." + "\n" + "The first value goes to [0][0]");
		
		for(int rows=0;rows<magic_square.length;rows++){

			for(int cols=0;cols<magic_square[0].length;cols++){

				magic_square[rows][cols] = sc.nextShort();

			}

		}

	}
	
		//returns true if the 2-dim array is a magic square
		public boolean isMagic() {
			
			for(int rows=0;rows<magic_square.length;rows++){
				
				for(int cols=0; cols<magic_square.length;cols++){
					
					if(colSum(cols) != rowSum(cols)){
						
						return false;
						
					}
					
					if(colSum(cols) != diag1()){
						
						return false;
						
					}
					
					if(colSum(cols) != diag2()){
						
						return false;
						
					}
					
					if(rowSum(cols) != diag1()){
						
						return false;
						
					}
					
					if(rowSum(cols) != diag2()){
						
						return false;
						
					}
					
					if(diag1() != diag2()){
						
						return false;
						
					}
					
				}
			}
			
			if(valuesCheck() != true){
				return false;
			}
			
			return true;
			
		}

	/*
	 * returns true if it isMagic() and it holds
	 * properties of a Dürer magic square. It should verify that the array is a 4 x 4 array.
	 */

	public boolean isA4x4Durer() {

		//Checks for a array length
		if(magic_square.length != 4){
			
			return false;
			
		}
		
		for(int i=0;i<magic_square.length-1;i++){
		
			if(cornerSum() != rowSum(i)){
				return false;
			}
			
			if(cornerSum() != colSum(i)){
				
				return false;
				
			}
		
		}
		
		if(cornerSum() != diag1()){
			
			return false;
			
		}
		
		if(cornerSum() != diag2()){
			return false;
		}
		
		//Statement 1 is done
		
		if(centerSum() != diag1()){
			return false;
		}
		
		if(centerSum() != diag2()){
			return false;
		}
		
		for(int i=0;i<magic_square.length;i++){
			
			if(rowSum(i) != centerSum()){
				return false;
			}
			
			if(colSum(i) != centerSum()){
				return false;
			}
			
		}
		
		//Statement 2 is done
		
		if(topBottomCenterColSum() != diag1()){
			return false;
		}
		
		if(topBottomCenterColSum() != diag2()){
			return false;
		}
		
		for(int i=0; i<magic_square.length;i++){
			
			if(topBottomCenterColSum() != colSum(i)){
				return false;
			}
			
			if(topBottomCenterColSum() != rowSum(i)){
				return false;
			}
			
		}
		
		//Statement 3 is done
		
		if(leftRightCenterRowSum() != diag1()){
			return false;
		}
		
		if(leftRightCenterRowSum() != diag2()){
			return false;
		}
		
		for(int i=0;i<magic_square.length;i++){
			
			if(leftRightCenterRowSum() != rowSum(i)){
				return false;
			}
			
			if(leftRightCenterRowSum() != colSum(i)){
				return false;
			}
			
		}
		
		//Statement 4 is done
		
		if(clockwiseSum() != diag1()){
			return false;
		}
		
		if(clockwiseSum() != diag2()){
			return false;
		}
		
		for(int i=0;i<magic_square.length;i++){
		
			if(clockwiseSum() != colSum(i)){
				return false;
			}
			
			if(clockwiseSum() != rowSum(i)){
				return false;
			}
			
		}
		
		//Statement 5 is done
		
		return true;
		
	}

	//returns the sum of the corners of the 2-dim array
	private int cornerSum(){
		
		int sum=0,col=0,row=0;
		
		sum+=magic_square[row][col];
		
		while(col<magic_square.length-1){
			
			col++;
			
		}

		sum+=magic_square[row][col];
		
		col=0;
		row=magic_square.length-1;
		
		sum+=magic_square[row][col];
		
		while(col<magic_square.length-1){
			
			col++;
			
		}
		
		sum+=magic_square[row][col];
		
		return sum;
		
	}

	//returns the sum of the 4 inner cells of the 2-dim array
	private int centerSum() {
		
		int sum=0;
		
		if(iseven == false){
		
			int col = (int) Math.round(magic_square.length/2);
			sum+= magic_square[col][col];
			
		}
		else{
			
			int cell1r,cell1c,cell2r,cell2c,cell3r,cell3c,cell4r,cell4c;
			
			//Add cell1
			cell1r =  (magic_square.length/2)-1;
			cell1c = cell1r;
			sum= sum + magic_square[cell1r][cell1c];
			
			//Add cell2
			cell2r = cell1r;
			cell2c = cell1c+1;
			sum = magic_square[cell2r][cell2c] + sum;
			
			//Add cell3
			cell3c = cell2c-1;
			cell3r = cell2r+1;
			sum = magic_square[cell3r][cell3c] + sum;
			
			//Add cell4
			cell4r = cell3r;
			cell4c = cell3c+1;
			sum = magic_square[cell4r][cell4c] + sum;
		
		}
		
		return sum;

	}

	//returns the sum of column c
	private int colSum(int col) {
		
		int sum=0;

		for(int i=0; i<magic_square[col].length;i++){
			sum += magic_square[i][col];
		}

		return sum;

	}

	//returns the sum of row r
	private int rowSum (int row) {
		
		int sum=0;
		for(int i =0; i<magic_square[row].length;i++){

			sum+= magic_square[row][i];

		}

		return sum;

	}

	//returns the sum of upper-left to lower-right diagonal
	private int diag1() {
		
		int sum =0,rows=0,cols=0;
		
		while(rows<magic_square.length && cols<magic_square.length){
			
			sum+=magic_square[rows][cols];
			
			rows++;
			cols++;
			
		}
		
		return sum;

	}

	//returns the sum of lower-left to upper-right diagonal
	private int diag2() {
		
		int sum=0,rows= magic_square.length-1,cols = 0;
		
		while(rows>-1 && cols<magic_square.length){
			
			sum+=magic_square[rows][cols];
			rows--;
			cols++;
			
		}
		
		return sum;

	}

	//each number is between 1 and s^2 and used only once
	//change to private
	private boolean valuesCheck(){

		//int read=0,num=1,temp=0;
		//String to_convert = "";
		int rows=0,i=0;

		while(rows<magic_square.length){

			int cols=0;
			while(cols<magic_square.length){

				checkme[i++] = magic_square[rows][cols];

				cols++;

			}

			rows++;

		}
		
		for(i=0; i<checkme.length;i++){

			for(int j=i+1;j<checkme.length;j++){
				
				if(checkme[i] == checkme[j]){
					return false;
				}
				
			}

		}

		/*
		while(read<Math.pow(numbers.length(), 2)){

			while(num<numbers.length()){

				if(numbers.charAt(num) == 'a'){
					to_convert = Character.toString(numbers.charAt(num+1)) + Character.toString(numbers.charAt(num+2));
					num+=1;
					temp = Integer.parseInt(to_convert);

					if(temp == numbers.charAt(read)){
						return false;
					}

				}
				else if(numbers.charAt(read) == numbers.charAt(num)){
					return false;
				}

				System.out.println("Num: " + num);

				num++;

			}

			read++;

			System.out.println("Read: " + read);
		}

		 */
		return true;

	}


	//returns the sum of the values indicated below
	private int topBottomCenterColSum() {
		
		int sum=0,rows=0,cols=0;
		
		if(iseven == true){
			
			cols = (magic_square.length-1)/2;
			sum+=magic_square[rows][cols];
			
			cols++;
			sum+=magic_square[rows][cols];
			
			rows=magic_square.length-1;
			cols = (magic_square.length-1)/2;
			sum+=magic_square[rows][cols];
			
			cols++;
			sum += magic_square[rows][cols];
			
	
			return sum;
		}
		else{
			
			cols=Math.round((magic_square.length-1)/2);
			sum+=magic_square[rows][cols];
			
			rows=magic_square.length-1;
			cols=Math.round((magic_square.length-1)/2);
			sum+=magic_square[rows][cols];
		
			return sum;
			
		}
		
		
	}

	//returns the sum of the values indicated below
	private int leftRightCenterRowSum() {

		int sum=0,col=0,row;
		
		if(iseven){
			
			row = (magic_square.length-1)/2;
			sum+= magic_square[row][col];
			
			row++;
			sum+=magic_square[row][col];
			
			row = (magic_square.length-1)/2;
			col = (magic_square.length-1);
			sum+=magic_square[row][col];
			
			row++;
			sum+=magic_square[row][col];
			
			return sum;
			
		}
		
		row = Math.round(magic_square.length-1)/2;
		sum+=magic_square[row][col];
		
		col = magic_square.length-1;
		sum+=magic_square[row][col];
		
		return sum;
		
	}

	/*
	 * compares the sum of the values of the four cells
		traveling clockwise around the square that start in cell b with the sum of the values of the
		four cells that start in cell c (see Illustration of a Dürer Magic Square below). Return the sum
		or -1 if not equal.
	 */
	
	//do caclulations for b+h+o+i and c+l+n+e. if they are eqaul return the sum of ethier otherwise return -1.
	private int clockwiseSum() {
		
		int sum1=0, sum2=0, row=0, col = ((magic_square.length)/2)-1;
		
		if(iseven == false || magic_square.length != 4){
			System.out.println("Clockwise sum can only be called on a even square.");
		}
		else{
			// start with bhoi
			// Cell1
			sum1 += magic_square[row][col];
			
			//Cell 2
			row= (magic_square.length/2)-1;
			col = magic_square.length -1;
			sum1+= magic_square[row][col];
			
			//Cell 3
			row = magic_square.length-1;
			col = ((magic_square.length)/2);
			sum1+= magic_square[row][col];
			
			// Cell 4
			row=(magic_square.length/2);
			col = 0;
			sum1+= magic_square[row][col];
			

			//clne
			//Cell 1
			row = 0; col = magic_square.length/2;
			sum2+=magic_square[row][col];
			
			//Cell 2
			row = magic_square.length/2;
			col = magic_square.length-1;
			sum2+=magic_square[row][col];
			
			//Cell 3
			row = magic_square.length-1;
			col= (magic_square.length/2)-1;
			sum2+=magic_square[row][col];
			
			//Cell 4
			row = (magic_square.length/2)-1;
			col = (magic_square.length/2)-2;
			sum2+=magic_square[row][col];	
			
		}
		
		if(sum1 == sum2){
			return sum1;
		}
		
		return -1;
	}
	//displays the contents of 2-dim array in grid format
	public String toString() {

		String ans="";

		for(int row=0;row<magic_square.length;row++){
			for(int col=0;col<magic_square[0].length; col++){

				ans += (Short.toString(magic_square[row][col]));
				ans+=" ";

			}
			ans += ("\n");
		}

		return ans;

	}

}
