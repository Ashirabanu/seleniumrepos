package homeassign.week1;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[]args)
	 {
		int[] num={1, 4,3,2,8, 6, 7};
		Arrays.sort(num);
		int x=num.length +1;
		int add=(x*(x+1))/2;
		for (int i = 0; i < num.length; i++) {
			add=add-num[i];
		}
		System.out.println("missing number is :"+add);		
		}
	}
