import java.util.HashMap;

public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a =10;
//		int b = 15;
//		
//		int c = a>b? a:b;
//		System.out.println("Max of two numbers is "+ c);
		
		
		String s= "hellayeuoHowaryou";
		char[] ch = s.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		
		
		for (char c: ch ) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		
		System.out.println(hm);
//		for(Map.Entry entry: hm.entrySet()) {
//			System.out.println(entry.getKey()+" -"+ entry.getValue());
//		}
//		
		
		
	}

}
