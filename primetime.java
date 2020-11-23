import java.util.Scanner;

public class PrimeTime {
	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Put in a number: ");
		int a = input.nextInt();
		input.close();
  
		boolean ifPrime = false;
		
		for(int i = 2; i <= a; i++) {
			ifPrime = true;
				System.out.println();
				for(int j = 2; j < i && ifPrime; j++) {
				System.out.println(i + " mod " + j + " = " + (i % j));
					if((i % j) == 0) { 
						ifPrime = false;
					}
				}
				
				if(ifPrime) {
					System.out.println(i + " is prime!");
				}
				else {
					System.out.println(i + " is not prime!");
				}
		}
		
		if(ifPrime) {
			System.out.println(a + " is prime!");
		}
		else {
			System.out.println(a + " is not prime!");
		}
	}
}
