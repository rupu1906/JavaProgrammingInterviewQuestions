import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertAStringIntoCapital {
	
	
	public static String capitalizeString(String str) {
		String[] strArray= str.split(" ");
		String capString ="";

		for(String s: strArray) {
			String temp ="";
			for(int i=0;i< s.toCharArray().length;i++) {
				if(i==0) {
					temp= temp+ Character.toUpperCase(s.toCharArray()[i]);
				}
				else {
					temp += s.toCharArray()[i];
				}
			}
			capString = capString+ temp+ " ";
		}
		return capString;
	}
	
	public static String capitalizeString2(String str) {
		
		String[] strArray = str.split("\\s");
		String result="";
		for(String s:strArray) {
		String firstLetter = s.substring(0,1).toUpperCase();
		String restString = s.substring(1);
		result = result +firstLetter + restString+ " ";
				
		}
		
		return result;
	}
	public static void main(String[] args) {
		String capString = "hello how are you";
		List<String> list =Arrays.stream(capString.split(" "))
				.map(e -> e.substring(0,1).toUpperCase()+e.substring(1)).collect(Collectors.toList());
		String cap= String.join(" ", list);
		
		System.out.println(cap);
		System.out.println(capitalizeString(capString));
		System.out.println(capitalizeString2(capString));

	}

}
