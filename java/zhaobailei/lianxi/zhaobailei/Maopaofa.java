package zhaobailei;

public class Maopaofa {
	public static void main(String[] rgs) {
		int[] a = { 7, 4, 1, 8, 5, 2, 9, 6, 3 };
		for (int i = 0; i < a.length; i++) {
			for (int c = 0; c < a.length - i - 1; c++) {
				if(a[c]>a[c+1]){
					int z = a[c+1];
					a[c+1] = a[c];
					a[c] = z;
				}
			}
		}		
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]);
		}

	}

}
