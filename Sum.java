package Array.java;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		 int arr[]= {12,13,76,98,23};
		 int sum=Arrays.stream(arr).sum();
		 System.out.println(sum);

	}

}
