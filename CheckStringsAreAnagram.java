import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckStringsAreAnagram {

	public static void main(String[] args) {
			String str1="hello";
			String str2 ="ehlol";
			anagraMethod1(str1,str2);
			anagramMethod2(str1,str2);
			System.out.println(reverseAStringMethod1(str1));
			System.out.println(reverseAStringMethod2(str1));
			System.out.println(convertAStringToCapital("hello hOW are You?"));
			System.out.println(convertAStringArrayToString("hello hOW are You?"));
			countNumberOfSmallAndCapitalLetterInAString("hello hOW are You");
			Object[] obj = {'a','b','b','c',"are","hello","how","are","you","hello"
					,"are",1,4,5,8,2,7,4};
			findDuplicateInArray(obj);
			Arrays.stream(obj).filter(e -> Arrays.stream(obj).filter(x -> x==e).count()==0).forEach(e -> System.out.println(e));
			
		 }
	
	public static void findDuplicateInArray(Object c[]) {
		
		HashMap<Object, Integer> hm = new HashMap<Object, Integer>();
		Set<Object> s = new HashSet<Object>();
		for(Object ch: c) {
			if(hm.containsKey(ch)) {
				s.add(ch);
				hm.put(c,hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println(s);
		
	}
	
	public static void countNumberOfSmallAndCapitalLetterInAString(String input) {
		String newString = input.replace(" ", "");
		int lowerCase =0;
		int upperCase =0;
		for(Character ch: newString.toCharArray()) {
			if(Character.isLowerCase(ch)) {
				lowerCase++;
			}
			else {
				upperCase++;
			}
		}
		System.out.println("Number of Lowercase Letter are: "+lowerCase+", and Uppercase are: "+upperCase);
	}
	
	public static StringBuffer convertAStringToCapital(String input) {
		String[] list = input.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(String word: list) {
			char first=Character.toUpperCase(word.charAt(0));
			String remaining = word.substring(1).toLowerCase();
			sb.append(first+remaining+ " ");
		}
		return sb;		
	}
	
	public static String convertAStringArrayToString(String input) {
		String[] list = input.split(" ");
		String output = String.join(" ", list);
		return output;
			
	}
	
	public static String reverseAStringMethod1(String input) {
		return new StringBuffer(input).reverse().toString();
	}
	public static String reverseAStringMethod2(String input) {
		String revString="";
		for(Character c: input.toCharArray()) {
			revString = c+ revString;
		}
		return revString;
	}
	
	public static void anagraMethod1(String str1, String str2) {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			 if(str1.length() == str2.length()) {
				 char[] charArray1 = str1.toCharArray();
			     char[] charArray2 = str2.toCharArray();
	
			      Arrays.sort(charArray1);
			      Arrays.sort(charArray2);
			      
			      boolean result = Arrays.equals(charArray1, charArray2);
			      if(result) {
			          System.out.println(str1 + " and " + str2 + " are anagram.");
			        }
			        else {
			          System.out.println(str1 + " and " + str2 + " are not anagram.");
			        }
			      }
			      else {
			        System.out.println(str1 + " and " + str2 + " are not anagram.");
			      }
	}
	
	public static void anagramMethod2(String input1, String input2) {
			
			String firstString = sortString(input1);
			String secondString = sortString(input2);
			if(firstString.equals(secondString)) {
				System.out.println("It's an Anagram");
			}
			else {
				System.out.println("It's not an Anagram");
			}
		}
	
	public static String sortString(String input) {
		char[] c =input.toCharArray();
		Arrays.sort(c);
		String output="";
		for(Character ch:c) {
			output = output+ch;
		}
		return output;
	}
	
	
}


