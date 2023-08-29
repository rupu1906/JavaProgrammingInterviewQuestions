import java.util.Arrays;
import java.util.Collections;

public class ReverseAStringWithoutUsingStringBuffer {

	public static void main(String[] args) {

		String s = "Hello how are you";
		String revString ="";
		for(int i=0;i<s.length();i++) {
			revString = s.charAt(i)+revString;
		}
		System.out.println(revString);
		
		//Reverse a string using StingBuilder
		String input = "Hello how are you";
		String rev = new StringBuilder(input).reverse().toString();
		System.out.println(rev);
		
		//Reverse a string using Stream API
		Arrays.stream(input.split(" ")).sorted(Collections.reverseOrder()).forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println("#####################");

	}

}
