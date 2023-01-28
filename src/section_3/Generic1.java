package section_3;


///////////////////////////////////////////
//////////////////////////////////////////
//////////   Generic types	/////////////
////////////////////////////////////////
///////////////////////////////////////


public class Generic1 {

	public static void main(String[] args) {

		Store store = new Store<>();

		Integer item1 = 23;
		store.setItem(item1);
		System.out.println(store.getItem());

		String item2 = "Ayush";
		store.setItem(item2);
		System.out.println(store.getItem());
	}

}

class Store<T> {

	private T item;

	T getItem() {
		return this.item;
	}

	void setItem(T item) {
		this.item = item;
	}
}
