
package sortieren;

public class QuickSort {

// 

	static int[] zahlen = { 4, 2, 5, 9, 6, 10, 9, 7 };

// 

	public static void main(String[] args) {
		for (int i : zahlen) {
			System.out.println(i);
		}

		{
			quicksort(0, zahlen.length - 1);
		}
		for (int i : zahlen) {
			System.out.println(i);
		}
// unsortierte Zahlen ausgeben 

// sortieren 

// quicksort(0,6) // zahlen.length -1 

// sortierte zahlen ausgegebn 

	}

	static void quicksort(int links, int rechts) {

		if (links < rechts) {
			int teiler = teile(links, rechts);
			quicksort(links, teiler - 1);
			quicksort(teiler + 1, rechts);
		}
	}

private static int teile(int links, int rechts) { 

// variablen 

	int i=links;
	int j=rechts-1;
	int pivot=zahlen [rechts];
// 

do { 

// Suche von links ein Element, welches größer als das Pivotelement ist 

	while (i < rechts -1 && zahlen[i] < pivot) {
		i = i+1;
	}


// Suche von rechts ein Element, welches gleich oder kleiner als das Pivotelement ist 

 

 

if (i < j)  {

// tauschen 

} 

 

} while (i<j); 

 

 falls daten[i] > pivot dann 

         tausche daten[i] mit pivot 

         ende 

          

         return i; 

 

}

}