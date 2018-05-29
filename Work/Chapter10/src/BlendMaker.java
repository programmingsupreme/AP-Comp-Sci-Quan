
public class BlendMaker extends ConstantBlend{

	private String myblend;
	
	public BlendMaker(char let1, char let2){
		
		myblend=""+let1+let2;
		
	}
	


	public String getNextBlend() {
		
		int c =0;
		while(c<constantBlends.length){
		//try{
			//for(int count=0;count<constantBlends.length; count++){
				
				if(constantBlends[c].equals(myblend)){
					
					if(c+1>=constantBlends.length){
						myblend=null;
						return myblend;
					}
					
					myblend = constantBlends[c+1];
					return myblend;
				}
				
				c++;
			}
		myblend= null; 
		return myblend;
		//} catch(java.lang.ArrayIndexOutOfBoundsException e){
		//	return null;
		//}
	}
	
	public String toString(){
		
		return myblend;
		
	}

}
