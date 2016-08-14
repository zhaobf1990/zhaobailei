package diliu;

public class A1 {

	public static void main(String[] args) {
		int[] a = { 5, 4, 9, 8, 7, 6, 1, 2, 3 };

		B(a);
		Z(a);
		System.out.println();
	}

	/**
	 * ×î´óÊý
	 * 
	 * @param a
	 */
	public static void A(int[] a) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > c) {
				c = a[i];
			}
		}
		System.out.println(c);

	}

	public static void B(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int c = i + 1; c < a.length; c++) {
				if (a[i] > a[c]) {
					int b = a[c];
				
					a[c] = a[i];
					a[i] = b;
				}
			}
		}
	}

	public static void Z(int[] a) {
		for (int c = 0; c < a.length; c++) {
			System.out.println(a[c]);
		}
	}
}
