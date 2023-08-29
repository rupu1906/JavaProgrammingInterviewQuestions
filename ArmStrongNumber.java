
public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int num = 9474;
		int temp = num;
		int length =(""+num).length();
		int sum =0;
		while(num>0) {
			int rem = num %10;
			sum =(int) (Math.pow(rem, length) +sum);
			num= num/10;
		}
		
		if(temp== sum) {
			System.out.println("Number is Armstrong number");
		}
		else {
			System.out.println("Number is  Not Armstrong number");
		}
		armstronNumber(temp);
	}

	
	public static void armstronNumber(int number) {	
		int sum =0;
		int temp = number;
		while(number>0) {
			sum = (int) (sum +Math.pow(number%10,Integer.toString(temp).length()));
			number = number/10;
		}
		if(temp==sum) {
			System.out.println("Given number is a Armstrong number");
		}
		else {
			System.out.println("It's not a Armstrong number");
		}
	}

}
