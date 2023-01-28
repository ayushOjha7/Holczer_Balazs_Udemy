package section_3;

///////////////////////////////////////////
//////////////////////////////////////////
/////////  Generic Arrays	/////////////
////////////////////////////////////////
///////////////////////////////////////

public class Generic4 {

	public static void main(String[] args) {

		GeneFunction function=new GeneFunction();
		
		String[] arr={"Ayush","Gaurav","Goldi"};
		Integer[] arra={1,2,6,2,8};
		
		function.show(arr);
		System.out.println();
		function.show(arra);
	}

}

class GeneFunction{
	
	public <T> void show(T[] items) {				///// Array of generic type

		for(T item : items) {
			System.out.print(item+", ");
		}
	}
	
}