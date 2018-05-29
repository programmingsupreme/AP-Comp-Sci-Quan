
public class ConstantBlendTester extends BlendMaker{

	public static void main(String[] args) {
		
		ConstantBlend a = new BlendMaker('b', 'l');
		System.out.println(a);

		a.getNextBlend();
		System.out.println(a);
		
		a.getNextBlend();
		System.out.println(a);
		
		ConstantBlend e = new BlendMaker ('s','c');
		System.out.println(e);				
		
		e.getNextBlend();
		e.getNextBlend();
		e.getNextBlend();
		
		System.out.println(e);
		
		ConstantBlend i = new BlendMaker('w','r');
		System.out.println (i);
		
		i.getNextBlend();
		System.out.println(i);

		ConstantBlend u = new BlendMaker('q','u');
		System.out.println (u);	
		
		u.getNextBlend();
		System.out.println(u);
		
	}

}
