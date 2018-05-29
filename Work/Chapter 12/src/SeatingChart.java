
import java.util.List;

public class SeatingChart {

	private Student[][] seating;
	
	public SeatingChart (List <Student> studentList, int rows, int cols){
		
		int listcount=0;		
		seating = new Student[rows][cols];
		System.out.println(rows + " " + cols);
		
		outerloop:
			for(int row=0;row<rows;row++){
				for(int col=0;col<cols;col++){
					
					if(listcount >= studentList.size())
						break outerloop;
					
					if(studentList.get(listcount) == null) break outerloop;
					
					else{
					seating[row][col] = studentList.get(listcount);
					System.out.println("Added at loc"+ row + " "+ col);
					listcount++;
					}					
					System.out.println(seating[row][col]+"*");
				}			
			
			}
		//System.out.println("End of constructor");	
	}
	
	public int removeAbsentStudents (int allowedAbs){
		
		int removed =0;
		
		for(int rows=0;rows<seating.length;rows++){
			
			for(int cols=0;cols<seating[0].length;cols++){
				
				//System.out.println("Seating[0].lenght:" + seating[0].length);
				if(seating[rows][cols] == null) continue;
				else if(seating[rows][cols].getAbsenceCount()>allowedAbs){
					//System.out.println("Rows:" + rows + " Cols:" + cols);
					seating[rows][cols] = null;
					removed++;
					
				}
			}
		}
		
		return removed;
	}
	
	public boolean switchSeats(int RowA, int ColA, int RowZ, int ColZ){
		
		if(seating[RowA][ColA] == null && seating[RowZ][ColZ] == null) return false;
		else{
			
			Student seat1 = seating[RowA][ColA];
			seating[RowA][ColA] = seating[RowZ][ColZ];
			seating[RowZ][ColZ] = seat1;
			return true;
			
		}
		
	}
	
	public boolean isValidRow(int r){
		
		if(r<seating.length){
			return true;
		}
		
		return false;
	}
	
	public boolean isValidCol(int c){
		
		if(c<seating[0].length){
			return true;
		}
		
		return false;
		
	}
	
	public String toString(){
		
		String ans="";
		
		for(int rows=0;rows<seating.length;rows++){
			for(int cols=0;cols<seating[0].length;cols++){
				ans+=(seating[rows][cols]) + " ";
			}
			ans+=("\n");
		}
		
		return ans;
	}
	
	
}
