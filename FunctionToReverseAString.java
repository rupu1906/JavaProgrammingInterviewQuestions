public class FunctionToReverseAString {

	public static void main(String[] args) {
		String s = "Hello How are you";
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer(s);
		sb1.reverse();
		
		System.out.println(sb1);

	}

}
