import java.util.ArrayList;

public class FindTheLengthOfLargestSubStringWithOutRepetation {

	public static void main(String[] args) {
//		  6- Write a Java program to find the longest substring from a given string which doesn’t contain any duplicate characters?
		
		String str ="howareyoudoingHopeyouarefile";
		String test ="";
		int maxNumber =0;
		ArrayList<String> list= new ArrayList<String>();
		for(char c:str.toCharArray()) {
			
			String current = Character.toString(c);
			if(test.contains(current)) {
				list.add(test);
				test = test.substring(test.indexOf(c)+1);
			}
			test = test+ current;
			maxNumber = Math.max(test.indexOf(c), maxNumber);
			
		}
		System.out.println(list);
		
        System.out.println();
		System.out.println(maxNumber);
				
	}
	
	
	
	

}
