package homeassign.week3;

public class OddIndextoUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		for (int i = charArray.length; i >=0; i--) {
			if(i%2!=0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
		String test1=new String(charArray);
				System.out.println("converted string is :"+test1);
				
					
				}
				
				
				//String upperCase = test.toUpperCase();
				//System.out.println(upperCase);
			}
		}

	


