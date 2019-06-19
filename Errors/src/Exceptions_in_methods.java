
public class Exceptions_in_methods {

	public static void main(String[] args) {
		
		try {
			getArrayItem();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array item was out of bounds");
		}

	}

	private static void getArrayItem()
		throws ArrayIndexOutOfBoundsException {
		String[] strings = {"Welcome!"};
		System.out.println(strings[1]);
	}

}
