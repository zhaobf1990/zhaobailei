public class NumSort {
	public static void main(String[] args) {
//		int[] a = new int[args.length];// int�����͵����飨args.length���ȣ�
//		for (int i = 0; i < args.length; i++) {//��������
//			a[i] = Integer.parseInt(args[i]);//int���͵İ�װ��
//		}		
//		selectionSort(a);
//		print(a);//����print(a)�ķ���
//	}
////ѡ������
//	private static void selectionSort(int[] a) {//���� ��int[]a ��������
//		for (int i = 0; i < a.length; i++) {//����		
//			for (int j = i + 1; j < a.length; j++) {//����һ�����Ƚ�	
//				if (a[j] < a[i]) {//���a[j]С��a[i]
//					int q = a[i];//��ʱ����  �Ȱ�a[i]����a[j]
//					a[i] = a[j];//��j��ֵ�����i
//					a[j] = q;//��q��ֵ�����i
//				}
//			}
//		}
//	}
//
//	private static void print(int[] a) {//��ӡһ������
//		for (int i = 0; i < a.length; i++) {//��ӡint���͵�����
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
