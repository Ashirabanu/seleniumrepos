package homeassign.week1;

public class IsPrimeOrNot {
	public void isPrimeNum(int num) {
		boolean prime=false;
		if(num<=1)
		{
			prime=false;
			System.out.println("this number is :"+prime);
		}
	
		for (int i = 2; i < (num/2)-1; i++) {
			if(num%i==0)
			{
				
				System.out.println("its not prime number"+num);
			}
			else
			{
				System.out.println("its  a prime number"+num);
			}
			
		}
	}

	public static void main(String[] args) {
	IsPrimeOrNot primeNumber=new IsPrimeOrNot();
	primeNumber.isPrimeNum(17);
	}

}
