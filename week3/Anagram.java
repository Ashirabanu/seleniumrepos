package homeassign.week3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
	int tx1 = text1.length();
	System.out.println("length of text1 :"+tx1);
	int tx2 = text2.length();
	System.out.println("length of text2 :"+tx2);
	
	if (tx1==tx2) {
		System.out.println("its equal");
	}else
	{
System.out.println("lengths mismatches,strings r not anagram");
	}
	char[] charArray = text1.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	char[] charArray2 = text2.toCharArray();
	for (int i = 0; i < charArray2.length; i++) {
		System.out.println(charArray2[i]);
	}
	Arrays.sort(charArray);
	System.out.println(charArray);
	Arrays.sort(charArray2);
	System.out.println(charArray2);
	if(tx1==tx2)
	{
		System.out.println("the given strings r anagram");
	}else
	{
		System.out.println("its not a anagram ");
	}
	}
	
	
	
	
	}


