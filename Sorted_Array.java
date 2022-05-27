package Array.java;

public class Sorted_Array {
//Bubble sort
	public static void main(String[] args) {
		 int arr[]= {10,2,3,6,9,5};
		 int temp;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 for(int k=0;k<arr.length;k++)
			 System.out.println(arr[k]);

	}

}
