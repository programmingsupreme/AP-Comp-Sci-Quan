
public class Magic_Square_Tester {

	public static void main(String[] args){
		
		MagicSquare ms = new MagicSquare(3);
		if (ms.isMagic())
		System.out.println (ms + "\nis a Magic Square");
		else
		System.out.println (ms + "\nis not a Magic Square");
		System.out.println ();
		MagicSquare durer = new MagicSquare(4);
		if (durer.isA4x4Durer() )
		System.out.println (durer + "\nis a Durer Magic Square");
		else
		System.out.println (durer + "\nis not a Durer Magic Square");
		
		
	}
	
}
