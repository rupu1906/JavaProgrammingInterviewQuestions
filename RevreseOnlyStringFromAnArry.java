import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RevreseOnlyStringFromAnArry {
	
	  public static void main(String[] args) {
	        // Tests
//	        String[] samples = { "123ABC458", "123ABC458XYZ", "123ABC458XYZ367", "ABC123XYZ", "ABC123XYZ" };
	        
		  String[] sample = {"toBeVery123$$Honest2369##CantDo"};
		  for (String s : sample)
	            System.out.println(numbersInverted(s));

	    }

	    static String numbersInverted(String str) {
	        StringBuilder sb = new StringBuilder();
	        Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher(str);
	        System.out.println(Pattern.compile("[a-zA-Z]+"));
	        System.out.println(matcher);
	        System.out.println(matcher.find());
	        int lastInitialPos = 0;
	        while (matcher.find()) {
	        	System.out.println("lastInitialPos "+lastInitialPos);
	            int start = matcher.start();
	            System.out.println(start);
	            String inverted = new StringBuilder(matcher.group()).reverse().toString();
	            System.out.println(inverted);
	            System.out.println(str.substring(lastInitialPos, start));
	            sb.append(str.substring(lastInitialPos, start)).append(inverted);
	            lastInitialPos = matcher.end();
	        }
	        if (sb.length() == 0) // If no number was found
	            return str;
	        else
	            return sb.append(str.substring(lastInitialPos)).toString();
	    }
	
	
	
//public static void main(String[] args) {
//	String s = "test12pop90java989python";
//	
//	
//	
//	
//	  StringBuilder digits = new StringBuilder();
//	    StringBuilder result = new StringBuilder();
//
//	    boolean start = false;
//
//	    for (int i = 0; i < s.length(); i++) {
//	        Character c = s.charAt(i);
//
//	        if (Character.isDigit(c)) {
//	            start = true;
//	            digits.append(c);
//	        }else {
//	            start = false;
//	            if (digits.length() > 0) {
//	                result.append(digits.reverse().toString());
//	                digits = new StringBuilder();
//	            }
//	            result.append(c);
//	        }
//	    }
//
//	    System.out.println(result);
//	    ////	String[] str = s.split("[0-9]");
////	ArrayList<String> reverse = new ArrayList<String>();
////	
////	for(int i =0;i<str.length;i++) {
////		int size = str[i].length();
////		String temp ="";
////		for(int j=size-1;j>=0;j--) {
////			temp +=str[i].charAt(j);
////		}
////		reverse.add(temp);
////		
////	}
////	
////	char [] ch = s.toCharArray();
////	
////	for(String c:reverse) {
////		System.out.print(c);
////	}
//}
}
