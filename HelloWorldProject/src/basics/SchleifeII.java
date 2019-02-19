package basics;

public class SchleifeII {

	public static void main(String[] args) {
		// vor der schleife
		System.out.println("vor");
		// während der schleife
		for (int i = 0; i < 3; i++) {
			System.out.println("während");
		}
		// nach der schleife
		System.out.println("nach");
		//
		// inneren und äußeren schleife
		for (int i = 0; i < 3; i++) {
			System.out.println("wie oft hier vor?" + i);
			//
			for (int x = 0; x < 4; x ++) {
				System.out.println("wie oft?" + (x+1));
			}
			//
			System.out.println("wie oft hier nach?" + i);
		}
		//
		

	}

}
