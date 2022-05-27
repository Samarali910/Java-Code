
public class Vowels {

	public static void main(String[] args) {
		 String str="my nme is samar momin aaa";
//		 int vow=0;
//		 int con=0;
		 int count=0;
//		 for(int i=0;i<str.length();i++)
//		 {
//			 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
//				 vow++;
//			 else
//				 con++;
//		 }
//		 System.out.println("Vow="+vow);
//		 System.out.println("con="+con);
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)==' ')
				 count++;
		 }
		 System.out.println(count);


	}

}
