package Array.java;

import java.util.Arrays;

public class Method_Java {

	public static void main(String[] args) {
		  int arr1[]= {1,2,3,4};
		  int arr2[]=  arr1;
		  if(arr1.equals(arr2))
			  System.out.println("Both are equal");
		  if(arr1==arr2)
		  {
			  System.out.println("Both are Equal");
		  }
		 if(Arrays.equals(arr1,arr2))
		 {
			 System.out.println("Equal");
		 }
		 Arrays.fill(arr1, 72);
		 System.out.println(Arrays.toString(arr1));
			   
	}

}
