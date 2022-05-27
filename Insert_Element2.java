package Array.java;

public class Insert_Element2 {

	public static void main(String[] args) {
		 int arr[]= {10,25,45,24,54,36,48};
	        int index_Pos=3;
	        int insert=100;
	        for(int i=arr.length-1;i>index_Pos;i--)
	        {
	        	arr[i]=arr[i-1];
	        }
	        arr[index_Pos]=insert;
	        for(int k=0;k<arr.length;k++)
	        {
	        	System.out.println(arr[k]);
	        }
	        
	       
        
}
}
