import java.util.Arrays;

public class Duplicate_chr {

	public static void main(String[] args) {
		 String str="programming";
		 char[]chr=str.toCharArray();
		 for(int i=0;i<str.length();i++)
		 {
			 for(int j=i+1;j<str.length();j++)
			 {
				 if(chr[i]==chr[j])
					 System.out.println(chr[j]);
			 }
		 }
	
	}

}
