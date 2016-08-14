public class Maopao {
	public static void main(String[] ages) {
		int[] a = { 9, 6, 3, 5, 8, 2, 7, 1, 4 };

		B2(a);
		A(a);

	}

	public static void B(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				A(a);
				if (a[j] > a[j + 1]) {
					int q = a[j];
					a[j] = a[j + 1];
					a[j + 1] = q;
				}

			}
		}

	}

	public static void B1(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int q = 0; q < a.length - 1 - i; q++) {
				if (a[q] > a[q + 1]) {
					int t = a[q];
					a[q] = a[q + 1];
					a[q+1] = t;
				}
			}
		}

	}

	public static void A(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "");

		}
		System.out.println();
	}

	
	public static void B2(int[] a){
		for(int i = 0;i<a.length-1;i++){
			for(int q = 0;q<a.length-1-i;q++){
				if(a[q]>a[q+1]){
					A(a);
					int zx = a[q];
					a[q] = a[q+1];
					a[q+1] = zx;
							
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
