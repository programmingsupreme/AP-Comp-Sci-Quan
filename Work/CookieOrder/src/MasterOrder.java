
import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

	private List<CookieOrder> orders;
	public MasterOrder() { orders=new ArrayList(); }
	public void addOrder (CookieOrder theOrder) { this.orders.add(theOrder); }
	public int getTotalBoxes() { 
		
		int boxsum = 0;
		for(int start = 0; start<orders.size();start++){
			boxsum += orders.get(start).getNumBoxes();
		}
		
		return boxsum;
	}
	public int removeVariety (String cookieVar) { 

		int removed=0;
		
		for(int i=0; i<orders.size();i++){
			
			if(orders.get(i).getVariety() == cookieVar){
				orders.remove(i);
				i--;
				removed++;
			}
			
			
		}
		
		return removed;
		
	}
	public String toString() { return "The orders are " + orders; }

	
}
