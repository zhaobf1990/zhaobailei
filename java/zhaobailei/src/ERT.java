
public class ERT {
	
	public static void main(String[] args){
		int a[] = {55,57,59,61,63,65,67,69,70,72,74,75};		
		int i = 70;
//		System.out.println(binarySearch(a,i));
		System.out.println(A1(a,i));
		System.out.println(B1(a,i));
	}
	
		public static int A1(int[] a,int i ){
			int qw = 0;
			int as = a.length;
			
			for( int c = 0;c<a.length;c++){
			int zx = (qw+as)/2;
				if(zx == i ){
					return zx;
				}else if(zx<i){
					qw = zx+1;
				}else if(zx>i){
					as = zx-1;
				}
				
			}
			return i;
		}
		
	
	
	public static int B(int[]a ,int i){
		int q= 0;//变量
		int w = a.length-1;//数组长度-1
		int m ;
		for(int e = 0;e<a.length;e++){
			m = (q+w)/2;//计算中间值
			if(i==a[m]) {				
//			System.out.println(m+"");
			return m;//找到需要的数 返回
			}
			if(i>a[m]){//如果找的数大于中间值(m)
				q= m+1;//吧q的值变成中间值（m）+1
			}
			if(i<a[m]){//如果找的数小于中间值（m）
				w =m-1;//就吧w变成中间值（m）-1
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[]a ,int i ){
		if(a.length ==0) return -1;
		
		int spos = 0;
		int epos = a.length-1;
		int m = (spos+epos)/2;
		 while(spos <= epos){
			 if(i ==a[m]) return m;
			 if(i>a[m]){
				 spos = m+1;
			 }
			 if(i<a[m]){
				 epos = m-1;
			 }
			 m = (spos + epos)/2;
		 }
		return m;
		
	}
		public static int B1(int[] a,int i){
			int as = 0;
			int sd = a.length-1;
			for(int df = 0; df<a.length;df++){
				int qw = (as+sd)/2;
				if(i== a[qw]){
					System.out.println(qw	+ "  ");
					return qw;
				}
				if(i>a[qw]){
					as= qw+1;
				}
				if(i<a[qw]){
					sd = qw-1;
				}
			}	
			return -1;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
