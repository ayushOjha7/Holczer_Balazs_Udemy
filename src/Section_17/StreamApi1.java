package Section_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamApi1 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(23,34,12,78,34,67);
		
		list.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println("=====================");
		list.stream().distinct().forEach(x -> System.out.println(x));
		System.out.println("=====================");
		IntStream.range(1, 10).sorted().forEach(x -> System.out.println(x));
		
	}

}
