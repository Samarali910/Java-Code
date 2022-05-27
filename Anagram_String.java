import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) {
		 String str="Silent";
		 String str1="Listen";
		 str=str.toLowerCase();
		 str1=str1.toLowerCase();
		 char[]c=str.toCharArray();
		 char[]c1=str1.toCharArray();
		 Arrays.sort(c);
		 Arrays.sort(c1);
		 boolean result=Arrays.equals(c, c1);
		 if(result==true)
			 System.out.println("String is Anagram");
		 else
			 System.out.println("String is not Anagram");

	}

}
