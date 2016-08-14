public class MAX1 {
	public static void main(String[] aegs) {
		int[] a = { 4, 8, 9, 6, 5, 4, 2, 3, 4, 8, };
		int q = 0;
		Z(a);
		System.out.println(q + "");

	}

	public static int Z(int[] a) {
		int q = 0;
		for (int i = 0; i < a.length - 1; i++) {
			// for(int w = 0; w < a.length - 1; q++){
			// if(q<a[]){
			//
			// }

			if (a[i] > q) {
				q = a[i];

			}

		}
		return q;
	}
}
