package qita;

public class Xin {
	public static void main(String[] args) {
		D();
	}

	public static void A() {
		for (int i = 0; i < 5; i++) {
			for (int a = 0; a <= i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void B() {
		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < 5 - i; a++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void C() {
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int a = 0; a < 5 - i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void D() {
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5 - i-1; k++) {
				System.out.print(" ");
			}
			for (int a = 0; a <=i; a++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
