public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i = { 9, 6, 3, 2, 5, 8, 7, 4, 1 };
//		AS(i);
		// p(i);
		 SD(i);
	}

	public static void AS(int[] i) {
		for (int a = 0; a < i.length; a++) {

			for (int c = a + 1; c < i.length; c++) {

				if (i[a] > i[c]) {
					int q = i[a];
					i[a] = i[c];
					i[c] = q;
				}
				p(i);
			}
			System.out.println("================");
		}
	}

	public static void p(int[] i) {
		for (int a = 0; a < i.length; a++) {
			System.out.print(i[a] + " ");
		}
		System.out.println();
	}

	public static void SD(int[] i) {
		for (int a = 8; a >=0; a--) {
			System.out.print(i[a] + " ");
//			if(a<0){
//				break;
//			}
		}
		System.out.println();
	}
}
