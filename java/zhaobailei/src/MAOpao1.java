public class MAOpao1 {
	public static void main(String[] args) {
		int[] a = { 11, 13, 15, 17, 19, 21, 23, 25, 27, 29 };
		int q = 15;
		Maopaofa(a);
		xuanzhepaixufa(a);
		System.out.println(A(a, q));
	}

	public static int A(int[] a, int q) {
		int start = 0;
		int ends = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			int mid = (start + ends) / 2;
			if (a[mid] == q) {
				return mid;
			} else if (q > a[mid]) {
				start = mid + 1;
			} else if (q < a[mid]) {
				ends = mid - 1;
			}
		}
		return -1;
	}

	public static void xuanzhepaixufa(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int c = i + 1; c < a.length; c++) {
				if (a[i] > a[c]) {
					int q = a[c];
					a[c] = a[i];
					a[i] = q;
				}
			}
		}
		daying(a, "—°‘Ò≈≈–Ú∑®");

	}

	/**
	 * √∞≈›∑®
	 * 
	 * @param a
	 */
	public static void Maopaofa(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int z = 0; z < a.length - i - 1; z++) {
				if (a[z] > a[z + 1]) {
					int q = a[z];
					a[z] = a[z + 1];
					a[z + 1] = q;
				}
			}
		}
		daying(a, "√∞≈›∑®");

	}

	/**
	 * ¥Ú”°
	 * 
	 * @param a
	 */
	public static void daying(int[] a, String c) {
		System.out.print(c);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

	}

	public static int erfengfa(int[] a, int q) {
		int x = a.length;
		int w = 0;
		for (int i = 0; i < a.length; i++) {

			int z = (w + x) / 2;
			if (z == q) {
				return z;
			} else if (q > z) {
				x = z - 1;
			} else if (q < z) {
				w = z + 1;
			}
		}
		return -1;

	}
}
