package Bit_manipulation;

public class XorArray {
	public static void main(String[] args) {
		int start=0;
		
		int xor=start;
	     int []arr= {0,2,4,6,8};
	     for(int i=1;i<arr.length;i++)
	     {
	    	 xor=xor^(2*i);
	    	  
	     }
	     System.out.println(xor);
	      
		
	}

}
