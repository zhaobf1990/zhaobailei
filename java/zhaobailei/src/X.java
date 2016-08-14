public class X {

	// public static void main(String[] args) {
	// int[] a = new int[args.length];// int的类型的数组（args.length长度）
	// for (int i = 0; i < args.length; i++) {//挨着排序
	// a[i] = Integer.parseInt(args[i]);//int类型的包装类
	// }
	// selectionSort(a);
	// print(a);//调用print(a)的方法
	// }
	 //选择排序
	 private static void selectionSort(int[] a) {//方法 对int[]a 进行排序
	 for (int i = 0; i < a.length; i++) {//数组
	 for (int j = i + 1; j < a.length; j++) {//找下一个数比较
	 if (a[j] < a[i]) {//如果a[j]小于a[i]
	 int q = a[i];//临时变量 先吧a[i]赋予a[j]
	 a[i] = a[j];//吧j的值赋予给i
	 a[j] = q;//吧q的值赋予给i
	// }
	// }
	// }
	// }
	//
	// private static void print(int[] a) {//打印一个数组
	// for (int i = 0; i < a.length; i++) {//打印int类型的数组
	// System.out.print(a[i] + " ");
	// }
	// System.out.println();

	// int[] a ={3,6,9,8,7,4,1,2,5};
	// for(int i= 0;i<a.length;i++){
	// }
	// st(a);
	// print(a);
	// }
	//
	// private static void st(int[]a){
	// for(int c=0;c<a.length ;c++){
	// for(int d=c+1;d<a.length ;d++){
	// if(a[c]>a[d]){
	// int e;
	// e=a[c];
	// a[c]=a[d];
	// a[d]=e;
	// }
	// }
	// }
	// }
	//
	// private static void print(int[]a){
	// for(int b = 0;b<a.length;b++){
	// System.out.print(a[b]+" ");
	// }
	// System.out.println();
	// }

	public static void main(String[] args) {
		int[] a = { 6, 9, 8, 7, 5, 3, 1, 2, 4 };

		for (int i = 0; i < a.length; i++) {
		}
		sa(a);
		print(a);
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] + " ");
		}
	}

	public static void sa(int[] a) {
		for (int q = 0; q < a.length; q++) {
			for (int e = q + 1; e < a.length; e++) {
				if (a[q] > a[e]) {
					int s = a[q];
					a[q] = a[e];
					a[e] = s;
				}
			}
		}
	}

	public static void print(int[] a) {
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] + " ");

		}
		System.out.println();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		for (int z = 0; z < a.length; z++) {
			System.out.print(b[z] + " ");
			b[8] = 5;
			System.out.print(" b.z " + b[z]);
			System.out.print(" a.z " + a[z]);
		}
		System.out.println();
	}
}
