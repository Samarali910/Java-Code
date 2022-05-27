package Array.java;

public class Duplicassy {
	//Brute force method

	public static void main(String[] args) {
		 int arr[]= {10,12,13,12,15,15};
		 int []temp=new int[arr.length];
		 int k=0;
		 for(int i=0;i<arr.length-1;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if((arr[i]==arr[j])&&(i!=j))
				 {
					 
				 System.out.println("Duplicate Element is="+arr[i]);
				
				 }
				 
			 }
			 
		 }
	}

}
