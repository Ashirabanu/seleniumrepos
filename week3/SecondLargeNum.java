package homeassign.week3;

import java.util.Arrays;

public class SecondLargeNum {

	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7};
		Arrays.sort(num);
	if(num.length>=2)
	{
		int secondlargestnum=num[num.length-2];
		System.out.println("the secondlargest number :"+secondlargestnum);
	}
	else {
System.out.println("doesnt have secondlargest num :");
	}

	}}
