package basics;

public class ArrayTest {

	public static void main(String[] args) {
		int[] zahlen = { 3, 1, 9, 5, 2, 8, 6, 5 };
		//
		System.out.println(zahlen[0]);
		System.out.println(zahlen[1]);
		//
		System.out.println(zahlen.length);
		//
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}

	}

}
