
public class NumberOfLowerCaseAndUpperCase {

	public static void main(String[] args) {
		String s="Welcome To Automation Test Interview";
		
		System.out.println(s.contains("To"));
		
		int smallLetters =0;
		int CapitalLetters =0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >=65 && c<=96) {
				smallLetters++;
			}
			
			if(c>=97) {
				CapitalLetters++;
						}
		}
		
		System.out.println("Number of small letters = "+smallLetters);
		System.out.println("Number of Captital letters = "+CapitalLetters);
	}

}
