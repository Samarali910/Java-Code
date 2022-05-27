package Array.java;

public class Selection_Sort {

	public static void main(String[] args) {
		 int arr[]= {38,52,9,18,6,62,13};
		 int temp=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]<arr[j])
				 {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				 }
			 }
		 }
		 for(int k=0;k<arr.length;k++)
		 {
			 System.out.println(arr[k]);
		 }

	}

}
