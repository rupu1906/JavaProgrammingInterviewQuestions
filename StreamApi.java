import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
//		1. map: The map method is used to return a stream consisting of the results 
//				of applying the given function to the elements of this stream.
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
//		2. filter: The filter method is used to select elements as per the Predicate 
//		passed as an argument.
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = names.stream().filter(s->(s).startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		
//		3. sorted: The sorted method is used to sort the stream.
		List<String> names1 = Arrays.asList("Reflection","Collection","Stream");
		List<String> result1 = names1.stream().sorted().collect(Collectors.toList());
		System.out.println(result1);
		
//		Terminal Operations
//		1. collect: The collect method is used to return the result of the intermediate operations performed on the stream.
		List<Integer> number3 = Arrays.asList(2,3,4,5,3);
		Set<Integer> square3 = number3.stream().map(x-> x*x).collect(Collectors.toSet());
		System.out.println(square3);
		
		System.out.println("#####################3");
//		2. forEach: The forEach method is used to iterate through every element of the stream.
		List<Integer> number4 = Arrays.asList(2,3,4,5,2,3,5);
		number4.stream().map(x->x*x).forEach(y->System.out.println(y));
		System.out.println("#####################3");
		number4.stream().map(x->x*x).collect(Collectors.toSet()).forEach(y->System.out.println(y));
		System.out.println("#####################3");
//		3. reduce: The reduce method is used to reduce the elements of a stream to a single value. The reduce method takes a BinaryOperator as a parameter.
		List<Integer> number5 = Arrays.asList(2,3,4,5,7,8,3);
		int even =number5.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
		int odd = number5.stream().filter(x ->x%2 !=0).reduce(0,(an,i) -> an+i);
		System.out.println(odd);
		
		
		String s= "hello how are you hEllo";
		//Convert it into capital
		List<String> demo =Arrays.stream(s.split(" ")).map(word -> word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase())
			.collect(Collectors.toList());
		Arrays.stream(s.split(" ")).map(word -> word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase())
		.forEach(e -> System.out.print(e +" "));
		System.out.println();
		System.out.println(demo);
		System.out.println(String.join(" ", demo));
		System.out.println("#####################");
//		#####################################################	
		
//		1) Get the sum of all the elements in the array	
		int[] arr = {1,2,3,4,5,6,8,9};
		int sumOfArray=Arrays.stream(arr).reduce(0,(sum,i) ->sum+i);
		System.out.println(sumOfArray);
		
		System.out.println("#####################");
//		2) Print Avg of all Numbers
		System.out.println("Avg: "+sumOfArray/arr.length);
		double avg =Arrays.stream(arr).average().getAsDouble();
		System.out.println(avg);
		System.out.println((int)(Arrays.stream(arr).average().getAsDouble()));
		
		System.out.println("#####################");
//		3) Print Number square avg of all Numbers
		int sqAvg=(int)Arrays.stream(arr).map(e -> e*e).average().getAsDouble();
		System.out.println("Square Average: "+sqAvg);
		
		System.out.println("#####################");
//		4)Print Odd and Even number, Also number of odd and even number
		List<Integer> li =  Arrays.asList(1,2,3,4,5,6,7,8,9,20,10,5,90,100);
		
		li.stream().filter(e -> e%2==0).forEach(e ->System.out.print(e+" "));
		System.out.println();
		System.out.println(li.stream().filter(e -> e%2==0).count());
		
		List<Integer> evenList =li.stream().filter(e -> e%2!=0).collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println(evenList.size());
		
//		5)Print Numbers Starts With Prefix 2 using Streams
//		2, 222,234,567,890,765,345,236,211,22 
		List<Integer> prefix2 = Arrays.asList(2,222,234,567,890,765,345,345,236,211,22,34,66,22,765);
		
		int prefixSum =prefix2.stream().filter(e -> e.toString().startsWith("2")).reduce(0, (sum, i)-> sum+i);
		System.out.println(prefixSum);
		System.out.println("#####################");
		
//		6)Print Duplicate numbers
		prefix2.stream().filter(first -> Collections.frequency(prefix2, first)>1).collect(Collectors.toSet()).forEach( e -> System.out.println(e));
		System.out.println("#####################");
		
//		7)Find out Max and Min in a given List
		int max =Collections.max(prefix2);
		System.out.println(max);
		System.out.println(Collections.min(prefix2));
		
		int max1 =prefix2.stream().map(e -> e).reduce(1,(m, i) -> m > i? m:i);
		System.out.println(max1);
		System.out.println(prefix2.stream().map(e -> e).reduce(prefix2.get(0),(m, i) -> m > i? i:m));

		System.out.println(prefix2.stream().min(Comparator.comparing(Integer::valueOf)).get());
		System.out.println("#####################");
		
//		8)Sort Numbers in an Array
		int[] num ={1,8,9,20,10,5,90,100,2,3,4,5,6};
		Arrays.sort(num);
		Arrays.stream(num).forEach(e -> System.out.print(e+ " "));
		System.out.println();
		Arrays.stream(num).sorted().forEach(e -> System.out.print(e + " "));
		System.out.println();
		prefix2.stream().sorted(Collections.reverseOrder()).forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println("#####################");
		
//		9) Reverse a String	
		String input = "Hello how are you";
		String rev = new StringBuilder(input).reverse().toString();
		System.out.println(rev);
		Arrays.stream(input.split(" ")).sorted(Collections.reverseOrder()).forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println("#####################");
		
//		10) Sum of first few numbers from array using stream apis
//		int[] num ={1,8,9,20,10,5,90,100,2,3,4,5,6};
//		Get first 5 numbers and print sum of it
		int[] num1 ={1,8,9,20,10,5,90,100,2,3,4,5,6};
		int sumOf5Number=Arrays.stream(num1).limit(2).reduce(0, (a,b) -> a+b);
		System.out.println(sumOf5Number);
		System.out.println("#####################");
//		Skip first 5 numbers
		int sumOfNumbers=Arrays.stream(num1).skip(12).reduce(0, (a,b) -> a+b);
		System.out.println(sumOfNumbers);
		System.out.println("#####################");
		
//		11) Get Second higest or lowest Number
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,20,75,10,5,90,100,100);
		int sh=list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).sorted().findFirst().get();
		System.out.println(sh);
		
		int th=list.stream().sorted(Collections.reverseOrder()).distinct().limit(3).sorted().findFirst().get();
		System.out.println(th);
	}
	
	
	

}
