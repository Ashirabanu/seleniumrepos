package homeassign.week3;

import java.util.ArrayList;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
	int[] a= {3,2,11,4,6,7};
  int[]  b= {1,2,8,4,9,7};
  List<Integer> num1=new ArrayList<Integer>();
  List<Integer> num2=new ArrayList<Integer>();
  
  for (Integer input1 : a) {
	  num1.add(input1);	
	  //System.out.println(input);
}
  for (Integer input2 : b) {
	num2.add(input2);
	//System.out.println(input);
}	
  List<Integer> intersection=new ArrayList<Integer>();
  intersection.retainAll(num2);
  System.out.println(intersection);
 
	}
	
	
	
	
	
	

	}



