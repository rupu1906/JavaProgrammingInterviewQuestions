class ConvertStringArrayIntoSring {

	public static void main(String[] args) {
		
//		##### Approach 1
		String[] strArray = {"Hello","how","are","you"};
		String str ="";
//		String test = String.join(" ", strArray);
//		System.out.println(test);
		for(String st:strArray) {
			str=str+ " "+st;
		}
		System.out.println(str);
		
//		##### Approach 2
		String[] strArray2 = {"Hello","how","are","you"};
		StringBuffer sb = new StringBuffer();
		for(String st: strArray2) {
			sb.append(st+ " ");
		}
		System.out.println(sb);
		
//		##### Approach 3
		String[] strArray3 = {"Hello","how","are","you"};
		String str3 = String.join(" ", strArray3);
		System.out.println(str3);
		
//		##### Approach 4
		int[] intArray = {1,2,3,4};
		String s="";
		
		for(int a: intArray) {
			s =s+a;
		}
		System.out.println(Integer.parseInt(s));
		
		
		String x ="abc";
		String y ="xyz";
		x.concat(y);
		System.out.println(x);
		
		String capString = "hello how are you";
		System.out.println(upperCase(capString));
		
	}
	
	public static String upperCase(String str) {
		return str.toUpperCase();
	}
	
}
