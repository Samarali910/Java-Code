package Array.java;

public class Max_no {

	public static void main(String[] args) {
		 int arr[]= {1,6,5,8,9,8,14};
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++)
			 if(arr[i]>max)
			 {
				 max=arr[i];
			 }
		 System.out.println("Maximum no in an Array;"+max);
			 

	}

}
