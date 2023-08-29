
public class GetRidOfMultipleSpacesInAString {

	public static void main(String[] args) throws Exception {

		   String str = "This  is    a   string    with   multiple   spaces";
	       str = str.replaceAll("\\s+", " "); // Replace one or more whitespace characters with a single space
	       System.out.println(str);
	
	}

}
