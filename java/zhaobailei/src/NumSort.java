public class NumSort {
	public static void main(String[] args) {
//		int[] a = new int[args.length];// int的类型的数组（args.length长度）
//		for (int i = 0; i < args.length; i++) {//挨着排序
//			a[i] = Integer.parseInt(args[i]);//int类型的包装类
//		}		
//		selectionSort(a);
//		print(a);//调用print(a)的方法
//	}
////选择排序
//	private static void selectionSort(int[] a) {//方法 对int[]a 进行排序
//		for (int i = 0; i < a.length; i++) {//数组		
//			for (int j = i + 1; j < a.length; j++) {//找下一个数比较	
//				if (a[j] < a[i]) {//如果a[j]小于a[i]
//					int q = a[i];//临时变量  先吧a[i]赋予a[j]
//					a[i] = a[j];//吧j的值赋予给i
//					a[j] = q;//吧q的值赋予给i
//				}
//			}
//		}
//	}
//
//	private static void print(int[] a) {//打印一个数组
//		for (int i = 0; i < a.length; i++) {//打印int类型的数组
//			System.out.print(a[i] + " "); 
//		}
//		System.out.println();
		
		
		
		
		
		
		
		int[] a =new int [args.length];
		for(int i= 1;i<args.length;i++){
			a[i]= Integer.parseInt(args[i]);
			st(a);
			print(a);
			
		}												
	} 	
	
	private static void st(int[]a){
		for(int c=0;c<a.length ;c++){
			for(int d=0;d<a.length ;d++){
				if(a[c]>a[d]){
					int e;
					e=a[c];
					a[c]=a[d];
					a[d]=e;
				}
			}
		}
	}
	
	private  static void print(int[]a){
		for(int b = 0;b<a.length;b++){
			System.out.println(a[b]+" ");
		}
	}
		
	
}
