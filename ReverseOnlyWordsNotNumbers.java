public class ReverseOnlyWordsNotNumbers {

    public static void main(String[] args) {
		//Reverse only alphabets not numbers or special characters
		String str = "Hello123How90Are$$Welcome345AB%";
		String revSring=reverseStringNotNumbersApproach1(str);
		System.out.println("Approach 1: "+ revSring);
		String approch2RevString =reverseStringNotNumbersApproach2(str);
		System.out.println("Approach 2: "+ approch2RevString);
		
}
    public static String reverseStringNotNumbersApproach1(String st){
        String [] strArray = st.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)|(?<=\\W)(?=\\w)|(?<=\\w)(?=\\W)");
        String revSring="";
        for (String s1: strArray) {
            String rev = "";
            for (char c:s1.toCharArray()) {
                if(Character.isAlphabetic(c)) {
                    rev =c + rev;
                }
                else {
                        rev =rev+c;
                    }
            }
            revSring = revSring + rev;
        
            }
        return revSring;
        }
    
    public static String reverseStringNotNumbersApproach2(String str){
        String [] strArray = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)|(?<=\\W)(?=\\w)|(?<=\\w)(?=\\W)");
        String revSring="";
        for(String st: strArray) {
            String rev = "";
            if(st.matches("[a-zA-Z]+")){
                System.out.println("Letters are :"+ st);
                StringBuilder sb = new StringBuilder(st);
                sb.reverse();
                rev =sb.toString();
            }
            else if(st.matches("[0-9]+")){
                System.out.println("Digits are :"+ st);
                rev =st;
            }	
            else{
                System.out.println("Special Characters:"+ st);
                rev =st;
            }
            revSring = revSring +rev;
        }
        return revSring;
        }
}
