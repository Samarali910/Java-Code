package Array.java;

public class First_Duplicate {

	public static void main(String[] args) {
		 int arr[]= {1,2,2,7,8,9,9};
		 int j=0;
		 int temp=0;
		  for(int i=0;i<arr.length-1;i++)
		  {
			  if(arr[i]!=arr[i+1])
			  {
				  arr[j++]=arr[i];
				  temp=temp++;
				  break;
			  }
			  if(temp>0)
				  break;
		  }
		  
		  System.out.println("First duplicate element is:"+arr[j]);

	}

}
