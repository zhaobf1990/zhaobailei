
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] a =  {45,5798,75,434,657,235};
//		int max =a[0];//�����
//		int min =a[0];//��С
//		for(int i =1;i<a.length;i++){
//			if(a[i]>max){//���a[i]>max
//				max = a[i];//�Ͱ�a[i]��ֵ�����max ѭ����һ�αȽ�
//			}
//			
//		}
//		for(int q = 1 ;q<a.length; q++){
//			if(a[q]<min){
//				min = a[q];
//			}
//		}
//		System.out.println(max+" "+min+" ");
		
		int a[] = {5,6,8,7,9,3,2,1,4};
		
		int i = a[0];
		for(int q =0;q<a.length;q++){
			if(a[q]<i){
				i=a[q];
			}
			
		}
		System.out.println(i+"");
		
		
		
	}

}
