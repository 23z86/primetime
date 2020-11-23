import java.util.Scanner;

public class PrimeTimeShort {
		public static void main(String... args) {

			Scanner input = new Scanner(System.in);
			System.out.print("Put in a number: ");
			int a = input.nextInt();
			input.close();
			boolean ifPrime = true;
	        /*               |     i must be a-1
           *               |     otherwise a will be divided by itself 
           *               V     and this results a remainder = zero */
					for(int i = 2; i < a && ifPrime; i++) {
						if((a % i) == 0) { 
							ifPrime = false;
						}
           // Optional step
					 System.out.println(a + " mod " + i + " = " + (a % i));
					}

			if(ifPrime) {
				System.out.println(a + " is a prime!");
			}
			else {
				System.out.println(a + " is not a prime!");
			}
		}
	}
