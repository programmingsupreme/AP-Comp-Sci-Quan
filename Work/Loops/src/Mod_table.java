
public class Mod_table {
	public static void main(String[] args) {

		//generate table
		/*for (int rows = 1; rows <= 10; rows++) {
			for (int cols = 1; cols <= 10; cols++) {
				int rmc = rows%cols;
				
				//print out the mod of each num
				System.out.print(rows + " ");
				System.out.println(cols + " ");
				System.out.print(rmc + " ");
			}
		}*/
		for (int c1 = 1; c1 <= 10; c1++) {
			for (int c2 = 1; c2 <= 10; c2++) {
				int pr = c2 %c1;

				if (pr < 10) {
					System.out.print(" " + pr + " ");
				} 
				else {
					System.out.print(pr + " ");
				}

			}
			System.out.println("  ");
		}
		
	}
}
