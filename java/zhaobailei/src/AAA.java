
public class AAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,8,9,6,3,7,1,2,4};
		B(a);
		dayin(a);
	
		}
	
	public static void B(int[] a ){
		for(int i = 0;i<a.length-1;i++){
			for(int c = 0;c<a.length-1-i;c++){
				if(a[c]>a[c+1]){
					int s = a[c+1];
					a[c+1] = a[c];
					a[c]=s;
				}
			}
		}
	}
	
	public static void A(int[] a){
			for(int i = 0;i<a.length-1;i++){
			for(int c = 0;c<a.length-1-i;c++){
				if(a[c]>a[c+1]){
					int s = a[c+1];
					a[c+1] = a[c];
					a[c] = s;
				}
			}
		}
	}
	public static void dayin(int[]a){
		for(int i= 0;i<a.length;i++){
			System.out.print(a[i]);
	}
	}
}
