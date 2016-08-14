package zhaobailei;

import javax.swing.text.AbstractDocument.BranchElement;

public class A {
	public static void main(String[] aegs) {
		/*
		 * int shu = 100; int java = 105; int yuwen = 102; int i =
		 * (shu>java?shu:java)>yuwen?(shu>java?shu:java):yuwen;
		 * 
		 * 
		 * 
		 * System.out.print(i);
		 */
		int c = 0;
		int a = 0;
		for (int A1 = 1; A1 < 33; A1++) {

			for (int A2 = 1; A2 < 33; A2++) {
				if (A2 == A1) {
					continue;
				}

				for (int A3 = 1; A3 < 33; A3++) {
					if (A3 == A2 || A3 == A1) {
						continue;
					}

					for (int A4 = 1; A4 < 33; A4++) {
						if (A4 == A3 || A4 == A2 || A4 == A1) {
							continue;
						}

						for (int A5 = 1; A5 < 33; A5++) {
							if (A5 == A4 || A5 == A3 || A5 == A2 || A5 == A1) {
								continue;
							}

							for (int A6 = 1; A6 < 33; A6++) {
								if (A6 == A5 || A6 == A4 || A6 == A3 || A6 == A2 || A6 == A1) {
									continue;
								}

								System.out.println(A1 + " " + A2 + " " + A3 + " " + A4 + " " + A5 + " " + A6 + " ");
								c++;
								a++;
								System.out.println(c);

							}

						}

					}

				}

			}

		}
		System.out.println(c);
	}

}
