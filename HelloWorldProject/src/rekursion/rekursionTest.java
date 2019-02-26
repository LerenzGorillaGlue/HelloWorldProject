package rekursion;

public class rekursionTest {
	public static void main(String[] args) {
 rekursiv(1);}
public static void rekursiv(int zahl) {
		if (zahl>1000000)
			return;
		int ergebnis = zahl * 5;
		System.out.println(ergebnis);
		 
		rekursiv (ergebnis);
	}
	}
