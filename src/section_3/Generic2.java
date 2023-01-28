package section_3;


///////////////////////////////////////////
//////////////////////////////////////////
//////	Multiple Generic types	/////////
////////////////////////////////////////
///////////////////////////////////////


public class Generic2 {

	public static void main(String[] args) {

		Hashtable<String, Integer> hastable = new Hashtable<>("Hello", 5);
		System.out.println(hastable);

	}

}

class Hashtable<K, V> {

	K key;
	V value;

	Hashtable(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Hastable [key=" + key + ", value=" + value + "]";
	}

}
