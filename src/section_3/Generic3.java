package section_3;

///////////////////////////////////////////
//////////////////////////////////////////
///////  Generic Functions	/////////////
////////////////////////////////////////
///////////////////////////////////////

public class Generic3 {

	public static void main(String[] args) {

		GenFunction function=new GenFunction();
		function.show("Hello");
		
		System.out.println("==========================");
		System.out.println(function.showAndReturn('\u0950'));
		
	}

}

class GenFunction{
	
	public <T> void show(T t) {				///// No return type
		System.out.println("Value Passed is : "+t.toString());
	}
	
	public <T> T showAndReturn(T t) {				///// No return type
		System.out.println("Value Passed is : "+t.toString());
		return t;
	}
}
