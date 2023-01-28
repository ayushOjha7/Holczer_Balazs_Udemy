package Section_6;

import java.util.ArrayList;
import java.util.List;

public class Wildcards1 {

	public static void main(String[] args) {

		Integer a=2,b=3;
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		Wildcards1.printName(list);
		
	}

	public static void printName(List<?> list) {			/// List<Number> become exception here so wildcard is used
		
		System.out.println(list);
	}
}
