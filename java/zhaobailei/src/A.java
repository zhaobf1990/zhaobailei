public class A {
	public static void main(String[] args) {
//		int [] a = new int[20];
//		for(int q= 0; q<20;q++){
//			if(q==0|| q==1)
//				a[q]=1;
//				else
//					a[q]= a[q-1]+a[q-2]	;
//							System.out.println(a[q]+" ");
//				
//			
//		}	
//		int [] a = new int[20];
//		for(int i = 0;  i <20;i++){
//			if(i ==0||i==1)
//				a[i]= 1;
//			else
//				a[i] = a[i-1]+a[i-2];
//			System.out.println(a[i]+" ");
//		}
		
		
//		int a[] = new int[20];
//		for(int i = 0; i<a.length;i++){
//			if(i==0||i==1){
//				a[i]= 1;
//			}else{
//				a[i] =a[i-1]+a[i-2];
//			}
//			System.out.println(a[i]+"");
//		}
		
		int a[] = new int[20];
		for(int i = 0; i<a.length;i++){
			if(i==0||i==1){
				a[i]=1;
			}else{
				a[i]= a[i-1]+a[i-2];
			}
			System.out.println(a[i]+" ");
		}
		
		
		int c[] =new  int[20];
		for(int i = 0;i<c.length;i++){
			if(i==0||i==1){
				c[i]=1;
			}else{
				c[i]=c[i-1]+c[i-2];
				System.out.print(c+" ");
			}
		}
		
		
		
		
		
		
	}
}
