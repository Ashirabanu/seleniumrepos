package homeassign.week3;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] word = test.split(" ");
		for (int i = 0; i < word.length; i++) {
			if(i%2==1) {
				char[] charArray = word[i].toCharArray();
				for (int j = charArray.length-1; j >=0; j--) {
					System.out.print(charArray[j]);
					
				}
				System.out.print(" ");
			}
			else {
				System.out.print(word[i]+" ");
			}
		}
	}

}
