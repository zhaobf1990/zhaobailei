public class X {

	// public static void main(String[] args) {
	// int[] a = new int[args.length];// int�����͵����飨args.length���ȣ�
	// for (int i = 0; i < args.length; i++) {//��������
	// a[i] = Integer.parseInt(args[i]);//int���͵İ�װ��
	// }
	// selectionSort(a);
	// print(a);//����print(a)�ķ���
	// }
	 //ѡ������
	 private static void selectionSort(int[] a) {//���� ��int[]a ��������
	 for (int i = 0; i < a.length; i++) {//����
	 for (int j = i + 1; j < a.length; j++) {//����һ�����Ƚ�
	 if (a[j] < a[i]) {//���a[j]С��a[i]
	 int q = a[i];//��ʱ���� �Ȱ�a[i]����a[j]
	 a[i] = a[j];//��j��ֵ�����i
	 a[j] = q;//��q��ֵ�����i
	// }
	// }
	// }
	// }
	//
	// private static void print(int[] a) {//��ӡһ������
	// for (int i = 0; i < a.length; i++) {//��ӡint���͵�����
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
