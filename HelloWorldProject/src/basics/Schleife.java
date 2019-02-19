package basics;

public class Schleife {

	public static void main(String[] args) {
		// FOR-Schleife - 3 Teilen
		// 1. Variablen Init
		// 2. Bedingung
		// 3. In/De-Krement
		for (int i = 0; i < 10; i = i+1) {
			System.out.println("Zahl ist " + i);
		}
		// eine Schleife die von 100-1 zählt
		// Zahl ist 100
		// Zahl ist 99
		// ...
		// Zahl ist 1
		for (int i = 100; i > 0; i = i-1) {
			System.out.println("Zahl ist " + i);
		}
		//
		
		//
	}

}
