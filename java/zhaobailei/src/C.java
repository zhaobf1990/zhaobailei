
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] a =  {45,5798,75,434,657,235};
//		int max =a[0];//最大数
//		int min =a[0];//最小
//		for(int i =1;i<a.length;i++){
//			if(a[i]>max){//如果a[i]>max
//				max = a[i];//就吧a[i]的值赋予给max 循环下一次比较
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
