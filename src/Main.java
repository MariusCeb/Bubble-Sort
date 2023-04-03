
public class Main {

	public static void main (String[] args) {
		
		int[] array = {3, 5, 1, 6, 8, 7};
		
		for (int i : array) System.out.print(i + " ");
		System.out.println();
		Main.bubbleSort(array);
		for (int i : array) System.out.print(i + " ");
		System.out.println();

	}
	
	static void bubbleSort (int[] v) {
		
		boolean swapped;
		int len = v.length - 1;
		
		do {
			swapped = false;
			for (int i = 0; i < len; i++) {
				if (v[i] > v[i + 1]) {
					int temp = v[i];
					v[i] = v[i + 1];
					v[i + 1] = temp;
					swapped = true;
				}
			}
			len--;
		} while (swapped);
	}

}
