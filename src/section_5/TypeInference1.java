package section_5;

import java.util.ArrayList;
import java.util.List;

public class TypeInference1 {

	public static void main(String[] args) {
		
		List<Bucket> list=new ArrayList<>();			// Known by type inference
		
		System.out.println(TypeInference1.addItem(list, 3));
		System.out.println("======================");
		TypeInference1.<String>addItem(list, "ayush");		
					// type witness		// no need to write <String> as Type Inference handles conversion
	
		System.out.println(list);
	}

	public static <T> List<T> addItem(List list, T item) {
		
		list.add(item);
		System.out.println(item+" has been added to the list");

		return list;
	}
}

class Bucket<T> {
	
	private T item;
	
	public T getItem(){
		return this.item ;
	}
	
	public T setItem(T item){
		 this.item =item;
		 return item;
	}
}
