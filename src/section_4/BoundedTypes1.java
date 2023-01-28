package section_4;

public class BoundedTypes1 {

	public static void main(String[] args) {

		System.out.println(findMin(21, 47));
	}

	public static <T extends Comparable<T>> T findMin(T num1, T num2) {	
		//need to implement Comparable Interface // ***Interface is extended ***

		if (num1.compareTo(num2)<0)			// the "<" do nbot work on generic types without bound
			return num1;
		else
			return num2;
	}

}

