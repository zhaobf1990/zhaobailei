package zhaobailei;

public class XuanZhepaixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,7,2,5,8,9,6,3};
		for(int i = 0;i<a.length;i++){
			for(int c = i+1;c<a.length;c++){
				if(a[i]>a[c]){
					int x = a[c];
					a[c] = a[i];
					a[i ] = x;
				}
			}
		}
		for(int i =0;i<a.length;i++){
		System.out.print(a[i]);
		}

	}

}
