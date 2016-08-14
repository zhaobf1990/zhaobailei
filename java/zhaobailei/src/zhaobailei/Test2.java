package zhaobailei;

public class Test2 {
	public static void main(String[] args) {

		// int num = 0, i = 1 ;//num等于0 i等于1
		// while (i<= 100){ //当i小于100进行循环从1到100
		// if (i % 3 == 0){//如果对i取值 i余数为零可以被三整除
		// System.out.print(i + " ");
		// num++;//计数器
		// }
		// if (num == 5) {
		// break;//找到第5个终止循环
		// }
		// i++;//循环变量不断上增
		// }
		// for (int i =101; i<200; i+=2){//i等于101 小于200，+2只算奇数
		// boolean f = true; //假设他是质素
		// for (int j = 2 ; j < i; j++){//j2小于200取false右边j++
		// if (i % j == 0 ) {
		// f= false;
		// break;//能被J2整除说明不是质素 结束
		// }
		// }
		// if (!f) {continue;}//如果不是质素外成循环下一个 如果是质素循环下一次
		// System.out.print(" " + i );
		// }

		 
//		int f = 0;
//		for (int i = 1; i <= 100; i += 2) {
//			if (i % 3 == 0) {
//				System.out.println("i=" + i);
//				f++;
//				if (f == 5)
//					break;
//			}
//
//		}

//		int a = 0;
//		for (int i = 1; i <= 200; i++) {
//			if (i % 3 == 1) {
//				System.out.println("i = " + i);
//				a++;
//				if (a == 5) {
//
//					break;
//		 }
//		
//		 }
//		 }
//			int a = 0;
//			for (float i = 1.1f; i <= 5; i += 0.1) {
//
//				System.out.println("i=" + i);
//}
//		boolean f = false;
//		if (f == false) {
//			System.out.println("     ========="+false);
//		for(int i = 9; i>0; i-= 2 ){
//			for(int j = i; j>0; j--){
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		} 
//		for(int a = 2; a<200;a++ ){
//			for(int i=101; i<=200; i+=2){
//				int a=2;
//				for(  a = 2; a<i; a++){	
//					if(i%a==0){
//						break;
//					}	
//				}
//					if(i==a){
//					System.out.println(" "+i);
//				
//				}										
//		}
//		int a = 1;
//		int b = 1;
//		int c = 1;
//		for(a = 1; a<=9;a++){
//			for(b = 1; b<=9; b++){
//				c= a * b;
//				System.out.print(" "+ a + "*"+ b +"=" + c );
//				if(a == b){
//					break;
//				}		
//			}
//			System.out.println();
//		}
		
//		for(int i = 9; i>0; i-=2){
//			for(int a = i; a>0; a--){
//				System.out.print("*");
//			}		
//			System.out.println(" ");
//		}
//		   String str3 = new String("天峨"); 
//		    String str4 = new String("天峨"); 
//		    System.out.println(str3!=str4);//false
		
		
		int c = Cal.zxc();

		System.out.print(" " + c);
	}
}
