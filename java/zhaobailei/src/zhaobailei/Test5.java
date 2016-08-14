package zhaobailei;

import java.sql.Date;
import java.util.Scanner;

public   class Test5{

	private static final char[] Test = null;
	private int a = 0;
	private int b;

	Test5(int a ){
		this.a = a+1;
		System.out.print(""+a);
	}
	
	public void Test(int b){
		this.b = b+1;
		System.out.print(""+b);
	}
	
	public Test5 in(){
		this.a+=2;
		return this ;
	}
	
	public  static void main(String[] args) {
		Test5 i = new Test5(10 );
		Test5.Teat;
		System.out.print(i.Test);
		
		}

	
}			
		
	


//public class Test5 {
//	public  static void main(String[] args) {
//		A i = new A( 0);
//		i.A(0);
//		}
		
		
	}


//		Scanner s =new Scanner(System.in);
//		int t = s.nextInt();
//		System.out.println("»ñÈ¡¼üÅÌÊäÈë:"+t);
//		if (t<=5000){
//			System.out.print(""+t*0.05);
//		}else if (t<=10000){
//			System.out.print(""+t*0.1);
//		}else if (t<=30000){
//			System.out.print(""+t*0.2);
//		}
//		int a = 100%10;
//		;
//		
		
//		for(int i = 100; i<=999;i++){
//		int	a = i%10;
//		int b = i/10%10;
//		int c = i/100%10;
//			if(a*a*a+b*b*b+c*c*c==i){
//				System.out.println("" + i +" a="+a+" b="+b+" c="+c);
//			}


