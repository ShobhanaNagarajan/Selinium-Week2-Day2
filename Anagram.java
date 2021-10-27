package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "stops";
		String s2 = "potss";

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean status =Arrays.equals(arr1, arr2);
		if(status) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are not Anagram");
		}

	}

}
