package zhaobailei;

//public class Test3 {
//	public static void main(String[] args) {
//		 for (int i = 1 ; i <= 100; i++) {
//		 if(i%3 == 0){		 System.out.println("i=" + i );
//
//		 continue;
//		 
//		 }
//		 }
//		int f = 0;
//		for(float i = 0.001f; i<=5; i+=0.001){
//			System.out.println("i=" + i);
//			
//			if( f == 5 ){
//				break;
//			}
//		f++;
//		}
//		boolean sex = false;
//		if( sex ==false){
//			System.out.println("�����е�");
//		 }else{
//			 System.out.println("����Ů��");
//		 
//		}
//		boolean flag = true;
//		if(flag==false)
//		{
//		System.out.println("�ҵ�ֵ����true");
//		}else
//		{
//		System.out.println("�ҵ�ֵ�Ǽ�fasle");
//		}
//	    for(int i = 101;  i<=200; i+=2){}
//	    	if
//		int f =0;
//		for(int i = 1; i<=10 ;i++){
//			f+= i ;
//				
//	    }
//		System.out.println("i=" + f);	
//	    for(int i = 101;  i<=200; i+=2){
//	    	if( i% 3==0){
//	    		continue;}
//	    		if(i%5==0){
//	    			continue;
//	    		}	    		
//	    	
//	    	System.out.println("i=" +i);
//
//	    }
//		int a = 1;
//		for( int b = 1; b<=10; b++){
//			a+=a*b ;
//			System.out.println(""+a);
//	}
//		int i;
//		for(i=9 ; i>0; i=i-2){
//			for(int j = i; j>0; j--){
//				System.out.print(""+j);
//			}
//			System.out.println("");
//		}

//		int b = 1;
//		for( int a=1; a<=9; a++){
//for ( int i = 1; i<=9; i++ ){
//
//            b=a * i;
//			System.out.print("  " +a+"*"+ i +"="+b) ;	
//	if(a==i)
//		break;
//		}
//		System.out.println(" ");
//}
//	    }

//}
//}
//public class Test3 {
//    public static void main(String[] arg) {
//
//        Cal cal = new Cal();  //ʵ����Cal��
//        int result1 = cal.add(1, 3);  //����add����
//        System.out.println(result1);  //���������
//        int result2 = cal.minutes(1, 3);
//        System.out.println(result2);
//        int result3 = cal.mul(2, 3);
//        System.out.println(result3);
//        float result4 = cal.division(1, 3);
//        System.out.println(result4);
//    }
//}

///** 
// * ����˵��������һ���Ӽ��˳��ļ����� 
// */
//class Cal { 
//    /**
//     * ����˵�����ӷ�����
//     */
//    public int add(int a, int b) {  //����Ƿ��� 
//        int c = a + b;
//        return c;
//    }
//    /**
//     * ����˵������������
//     */
//    public int minutes(int a, int b) {//����Ƿ��� 
//        int c = a - b;
//        return c;
//    }
//    /**
//     * ����˵�����˷�����
//     */
//    public int mul(int a, int b) {//����Ƿ��� 
//        int c = a * b;
//        return c;
//    }
//    /**
//     * ����˵������������
//     */
//    public float division(int a, int b) {//����Ƿ��� 
//        float c = (float)a / b;
//        return c;    //return �Ƿ��ص���˼ 
//    }
//}

public class Test3 {
	public static void main(String[] args) {
		// Cal i = new Cal();
		int c = Cal.zxc();

		System.out.print(" " + c);
	}
}
