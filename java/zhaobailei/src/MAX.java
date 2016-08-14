public class MAX {
	public static void mian(String[] aegs) {
		int[] a = { 4, 8, 9, 6, 5, 4, 2, 3, 4, 8, };
//		Z(a);
		System.out.println();

	}

	public static void Z(int[] a) {
		for (int i = 0; i < a.length -1; i++) {
			int q;
			if (a[i] < a[i + 1]) {
				q = a[i + 1];
				System.out.println(q);
			}
		}
	}
}
