package qita;

public class Shengdanshu {
	public static void main(String[] args) {
		int n = 9;
		A(n);
		A(n);
		A(n);
		B(n);
	}

	public static void A(int n) {

		for (int i = 0; i < n; i++) {
			for (int c = 0; c < n - 1 - i; c++) {
				System.out.print(" ");
			}
			for (int a = 0; a < (2 * i + 1); a++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void B(int n ) {
		for (int i = 0; i < n; i++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(" ");
			}
			for (int a = 0; a < 7; a++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}
}