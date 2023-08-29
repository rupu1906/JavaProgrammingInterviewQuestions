import java.util.Arrays;

public class MaxOfTwoFromArray {

	public static void main(String[] args) {
		
		//Write a Java program to find out the first two max values from an array?
		int[] arr = {100,101,99,104,109,34};
		int[] arr2 = {100,101,99,104,109,106};
		Arrays.sort(arr);
		System.out.println("The max number in an array is "+arr[arr.length-1]);
		System.out.println("The max number in an array is "+arr[arr.length-2]);
		
		 int maxOne =0;
		 int maxTwo =0;
		 
		 for (int temp:arr2) {
			 if(maxOne<temp) {
				 maxTwo = maxOne; //0
				 maxOne =temp; //100
			 }
			 else if(maxTwo < temp) {
				 maxTwo = temp;
			 }
		 }
		System.out.println(maxOne);
		System.out.println(maxTwo);
		
		
	}

}
