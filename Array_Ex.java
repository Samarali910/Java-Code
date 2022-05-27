package Array.java;

import java.util.Arrays;

public class Array_Ex {

	public static void main(String[] args) {
		 int []arr= {8,6,7,2,3,5};
		 int temp=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp	;	
				 }
			 }
		 }
		 
		  

	}

}
