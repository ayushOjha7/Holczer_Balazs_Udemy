package Section_6;

import java.util.Arrays;
import java.util.List;

public class Wildcards2 {

	public static void main(String[] args) {

		List list=Arrays.asList(2,3.5,4,6);
		
		System.out.println(addAll(list));
	}

	
	public static <T> Double addAll(List<? extends Number> list) {

		double sum =0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}

}
