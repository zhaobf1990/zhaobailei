package qita;

import java.util.Scanner;

import javax.swing.InputMap;

public class You {
	public static void main(String[] aegs) {
		System.out.println("��ӭ����δ��");
		
		int z = 10-1;
		System.out.println("�㷢��һֻBOSS,Ѫ��10�������ּ�1������");
		for (int i = 0; i < 999; i++) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			if (t == 1) {				
				int q = z;
				z--;
				System.out.println("������˴�boss,��bossѪ����ʣ" + q);

				if (q == 0) {
					System.out.print("��ϲ��ʤ����");
					break;
				}
			} else {
				System.out.println("������Ч");
			}
		}

	}
}
