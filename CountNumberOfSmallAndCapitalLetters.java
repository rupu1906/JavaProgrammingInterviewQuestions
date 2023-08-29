public class CountNumberOfSmallAndCapitalLetters {

	public static void main(String[] args) {
		String inputStr = "abAbdTRAEEEl";
		int capLetters =0;
		int smallLetters = 0;
		//Approach 1:
		countAlphabetApproach1(inputStr,capLetters,smallLetters);
		//Approach 2:
		countAlphabetApproach2(inputStr,capLetters,smallLetters);
}
public static void countAlphabetApproach1(String str, int capLetters, int smallLetters){
	for(char c:str.toCharArray()) {
			String test = String.valueOf(c);
			if(test.matches("[a-z]+")) {
				smallLetters++;
			}
			else if(Character.toString(c).matches("[A-Z]+")) {
				capLetters++;
			}
		}
		System.out.println("Capital Letters in a String are : "+capLetters);
		System.out.println("Small Letters in a String are : "+smallLetters);
}
public static void countAlphabetApproach2(String str, int capLetters, int smallLetters){
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<97) {
				capLetters++;
			}
			else if(str.charAt(i)>=97){
				smallLetters++;
			}
			
		}
	System.out.println("Capital Letters in a String are : "+capLetters);
	System.out.println("Small Letters in a String are : "+smallLetters);
}


}
