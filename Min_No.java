package Array.java;

public class Min_No {

	public static void main(String[] args) {
		 int arr[]= {5,8,2,1,7,4};
		 int min=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]<min)
				 min=arr[i];
		 }
		 System.out.println("Minimum Element is:"+min);

	}

}
