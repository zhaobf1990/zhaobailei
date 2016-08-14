package qita;

import java.util.Random;
import java.util.Scanner;

public class Caishu {
	public static void main(String[] aegs) {
		System.out.println("猜数字游戏");
		 Random random = new Random();
		 int attack = random.nextInt(100);
		 for(int i=0;i<=20;i++){
			 System.out.println("第"+(i+1)+"次");
		 Scanner s = new Scanner(System.in);
		 int t = s.nextInt();
		
		 if(t>attack){
		System.out.println("猜大了");
		 }
		 if(t<attack){
				System.out.println("猜小了");
		 }
		 if(t==attack){
				System.out.println("恭喜你猜对了");
				break;
		 }
		 }
		 System.out.println("超过20次游戏结束");
//		String str = new String("sdfw");
//		str.charAt(0);
//		System.out.println(Long.MAX_VALUE);
		 
	}
 
}
