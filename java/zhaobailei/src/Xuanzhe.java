public class Xuanzhe {
	public static void main(String[] aegs) {
		int[] a = { 5, 8, 9, 6, 3, 1, 2, 4, 7 };
		A(a);
		Z(a);
		B(a);
	}
	
	public static void B(int[] a ){
		for(int i = 0 ; i<a.length;i++){
			for(int c= i+1;c<a.length;c++){
				if(a[i]>a[c]){
					int q = a[c];
					a[c] = a[i];
					a[i] = q;
				}
			}
			
		}
	}
	
	public static void A(int[] a){
		for(int i=0;i<a.length;i++){
			for(int c=i+1;c<a.length;c++){
				if(a[i]>a[c]){
					int q= a[c];
					a[c]=a[i];
					a[i]=q;
				}
			}
		}
	}
	
/*	public static void A(int[] a ){
		for(int i=0; i<a.length;i++){
			for(int c= i+1;i<a.length;c++){
				if(a[i]>a[c]){
					int q = a[i];
					a[i]= a[c];
					a[c] = q;
				}
			}
		}
	}
	*/

	public static void Z(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
