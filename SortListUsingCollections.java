import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListUsingCollections {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Volvo");
		list.add("BMW");
		list.add("Ford");
		list.add("Mazda");
		System.out.println(list);
		System.out.println(sortListUsingCollection(list));
		
		
	}
	
//	  2- Write code to sort the list of strings using Java collection?
	
	public static List<String> sortListUsingCollection(List<String> list) {
		Collections.sort(list);
		return list;
	}

}
