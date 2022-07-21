package Bit_manipulation;

public class Find_Unique {
      public static void main(String[] args) {
		int []arr= {2,3,4,1,2,1,3,16,4};
		System.out.println(ans(arr));
	}

	 static int ans(int[] arr) {
		 int unique=0;
		 for(int n:arr)
		 {
		      //System.out.println(n);
			 unique=unique^n;
			 
		 }
		 
		return unique;
	}
}
