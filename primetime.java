import java.util.Scanner;

public class PrimeTime {
	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Put in a number: ");
		int a = input.nextInt();
		input.close();
  
		boolean ifPrime = false;
		
		for(int i = 2; i <= a; i++) {
			//	hereby, we asume that all numbers are prime numbers
			ifPrime = true;
			
				/*	this loop calculates the remainder of an integer division
				 	go to (*) */
				for(int j = 2; j < i && ifPrime; j++) {
					
				/*	
				 *	Optional step to check 
				 *	how the loop works.
				 *	5 mod 2 = 1
				 *	5 mod 3 = 2
				 *	5 mod 4 = 1
				 *	5 is a prime
				 */	
				System.out.println(i + " mod " + j + " = " + (i % j));
					/*
					* (*)	if the remainder is zero, the entered number
					* cannot be a prime number
					*/
					if((i % j) == 0) { 
						ifPrime = false;
					}
				}
				//	print out, whether all entered numbers are primes
				if(ifPrime) {
					System.out.println(i + " is prime!");
				}
				else {
					System.out.println(i + " is not prime!");
				}
		}
		//	print out, whether the entered number is a prime number
		if(ifPrime) {
			System.out.println(a + " is prime!");
		}
		else {
			System.out.println(a + " is not prime!");
		}
	}
}
