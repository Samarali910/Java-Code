package Array.java;

public class Insert_Element {

	public static void main(String[] args) {
		 int arr[]= {10,20,30,40,50,60,70};
		  int k=arr[4];
		  int insert=100;
		  int a;
		  a=arr[4];
		  arr[4]=insert;
		  insert=a;
		  System.out.println(arr[4]);
		  for(int x=0;x<arr.length;x++)
		  {
			  System.out.println(arr[x]);
		  }
		 
		 
 

}
}
