package qita;

import java.util.Scanner;

public class You1 {
	public static void main(String[] args){
System.out.println("��ӭ����δ��");		
		int z = 10;
		System.out.println("�㷢��һֻBOSS,Ѫ��10�������ּ�1������");
		for (int i = 10; i >0; i--) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			if (t == 1) {				
				
				System.out.println("������˴�boss,��bossѪ����ʣ" + (i-1));

				if (i-1== 0) {
					System.out.print("��ϲ��ʤ����");
					
				}
			} else {
				i++;
				System.out.println("�밴1������");
			}
		}

	}

}
