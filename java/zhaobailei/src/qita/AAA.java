package qita;

public class AAA {
	 public static void main(String[] args) {
	 System.out.println(A(5));
	 B(5);
	 }

	public static int A(int a) {
		if (a == 1 || a == 0) {
			return 1;
		} else {
//			 System.out.println(a);

			return A(a - 1) + A(a - 2);
		}
	}

	public static void B(int n) {
		int[] a = new int[n];
		int c;
		for (c = 0; c <n; c++) {
			if (c == 0 || c == 1) {
				a[c] = 1;
			} else {
				a[c] = a[c - 1] + a[c - 2];
			}
			System.out.println(a[c]);

		}

	}
}
