import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		//Palindrom number is a number which remaining same when its 
		//digits are revered
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			
			int num = sc.nextInt();
			int temp = num;
			int rev = 0;
			while (num > 0) {
				rev = (rev*10) +(num % 10);
				num = num/10;
			}
			
			if(temp==rev) {
				System.out.println("It's a palindrom number");
			}
			else {
				System.out.print("It's not a prime number");
			}
		}
		
	}

}
