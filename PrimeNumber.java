import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime number is a number which can be divide by 1 or itself
		// 1 is not a prime number
		
		for(int i=1;i<30;i++) {
			int counter = 0;
				for(int j =1;j<=i;j++) {
					if(i%j==0) { 
						counter =counter+1;
					}
				}
				
				if(counter==2) {
					System.out.print(i+" ");
			}
		}
		
		System.out.println();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			boolean flag = false;
			if(num==1) {
				flag = true;
			}
			else {
				for(int j=2;j<num;j++) {
					if(num%j==0) {
						flag =true;
						break;
					}
				}
			}
			
			if(flag==true) {
				System.out.println("It's not a prime number");
			}
			else {
				System.out.println("It's a prime number");
			}
		}
	}
}
