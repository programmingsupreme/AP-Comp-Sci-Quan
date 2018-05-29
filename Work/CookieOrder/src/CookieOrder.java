
public class CookieOrder {

	private String cookieVariety;
	private int boxes;
 	public CookieOrder (String variety, int numBoxes) { this.boxes = numBoxes; this.cookieVariety = variety; }
	public String getVariety() { return this.cookieVariety; }
	public int getNumBoxes() { return this.boxes; }
	public String toString() { return ("Cookie Variety: " + this.cookieVariety + " Number of boxes: " + this.boxes); }

	
}
