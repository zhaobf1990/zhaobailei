package fangfa;

public class AAAAAAAAA {
	public static void main(String[] args) {
		double[][] d;
		String s = "1,2;3,4,5;6,7,8";
		String[] a = s.split(";");
		d = new double[a.length][];

		for (int i = 0; i < a.length; i++) {
			String[] a2 = a[i].split(",");
			d[i] = new double[a2.length];
			for (int z = 0; z < a2.length; z++) {
				d[i][z] = Double.parseDouble(a2[z]);
				System.out.print(d[i][z]+" ");

			}
	System.out.println();

		}
//		for (int i = 0; i < a.length; i++) {
//			for (int z = 0; z < a.length; z++) {
//				System.out.print(d[i][z]);
//			}
//			System.out.println();
//		}

	}
}
