import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		Object[] obj = {'a','b','b','c',"are","hello","how","are","you","hello"
				,"are",1,4,5,8,2,7,4};
		
		Arrays.stream(obj).filter(e -> Arrays.stream(obj).filter(x -> x==e).count()==0).forEach(e -> System.out.println(e));
		List<Object> l=noDuplicateValues(obj);
		List<Object> l2 =duplicateValues(obj);
		List<Object> l3 = notDuplicateValues(obj);
		System.out.println(l);
		System.out.println(l2);System.out.println(l3);
		
		
		Object[] obj2 = {'a','b','b','c',"are","hello","how","are","you","hello"
				,"are",1,4,5,8,2,7,4,'b','a'};
		
		
		Arrays.stream(obj2).filter(x -> Arrays.stream(obj2).filter(y -> (x==y)).count()>1).collect(Collectors.toSet()).forEach(e -> System.out.print(" "+e+" "));
		
		System.out.println("###################");
		
	}
	
	public static List<Object> noDuplicateValues(Object[] arr) {
		ArrayList<Object> list = new ArrayList<Object>();
		for(Object s:arr) {
			if(!list.contains(s)) {
				list.add(s);
			}
		}
		return list;
	}
	
	public static List<Object> duplicateValues(Object[] arr) {
		ArrayList<Object> list = new ArrayList<Object>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j <arr.length;j++) {
				if(arr[i]==arr[j]) {
					if(!list.contains(arr[i])) {
						list.add(arr[i]);
					}
				}
			}
		}
		return list;
	}
	
	public static List<Object> notDuplicateValues(Object[] arr) {
		ArrayList<Object> list = new ArrayList<Object>();
		HashMap<Object, Integer> hm = new HashMap<Object,Integer>();
		
		for(Object a:arr) {
			if(hm.containsKey(a)) {
				hm.put(a,hm.get(a)+1);
			}
			else {
				hm.put(a, 1);
			}
		}
		for(Map.Entry<Object,Integer> entry:hm.entrySet()) {
			if((int)entry.getValue()==1) {
				list.add(entry.getKey());
			}
		}
		return list;
	}

}