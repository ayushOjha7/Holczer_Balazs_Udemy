package section_4;

public class BoundedTypes3_HW {

	public static void main(String[] args) {

		Integer num1=7;
		Float num2= 2.3f;
		System.out.println(add(num1,num2));
	}

	public static <T extends Number> Double add(T num1, T num2) {
		
		 double result=num1.doubleValue()+ num2.doubleValue();
		 return result;
	}
}
