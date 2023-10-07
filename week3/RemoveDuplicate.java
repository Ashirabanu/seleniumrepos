package homeassign.week3;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text="We learn Java basics as part of java sessions in java week1";
		
		
		String[] split1 =text.split(" ");
		for (int i = 0; i < split1.length; i++) {
			//System.out.println(split[i]);
			//char[] charArray = split[i].toCharArray();
			for (int j = i+1; j <split1.length ; j++) {
				if(split1[i].equals(split1[j])) {
					
					split1[j]=" ";
				}
			
		}

	}
for (int i = 0; i < split1.length; i++) {
	if(!split1[i].equals(" ")) {
		System.out.println(split1[i]);
	}
}
	}
}
