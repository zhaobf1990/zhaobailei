package qita;

import java.util.Random;
import java.util.Scanner;

public class Caishu {
	public static void main(String[] aegs) {
		System.out.println("��������Ϸ");
		 Random random = new Random();
		 int attack = random.nextInt(100);
		 for(int i=0;i<=20;i++){
			 System.out.println("��"+(i+1)+"��");
		 Scanner s = new Scanner(System.in);
		 int t = s.nextInt();
		
		 if(t>attack){
		System.out.println("�´���");
		 }
		 if(t<attack){
				System.out.println("��С��");
		 }
		 if(t==attack){
				System.out.println("��ϲ��¶���");
				break;
		 }
		 }
		 System.out.println("����20����Ϸ����");
//		String str = new String("sdfw");
//		str.charAt(0);
//		System.out.println(Long.MAX_VALUE);
		 
	}
 
}
