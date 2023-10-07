package homeassign.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
	List<String> company=new ArrayList<String>();
	company.add("HCL");
	company.add("Wipro");
	company.add("Aspire systems");
	company.add("CTS");
	System.out.println(company);
	Collections.sort(company);
	System.out.println(company);
	Collections.reverse(company);
		System.out.println(company);
		for (String str: company) {
			System.out.println("reversed strings are :"+str);
			
		}
		

	}

}
