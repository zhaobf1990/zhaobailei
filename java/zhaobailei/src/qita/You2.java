package qita;

import java.util.Random;
import java.util.Scanner;

public class You2 {
	// private static final String RandomTools = null;

	public static void main(String[] args) {
		System.out.println("��ӭ����δ��");
		System.out.println("�㷢��һֻBOSS,Ѫ��100�������ּ�1������");
		int a = 100;
		

		for (;;) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			Random random = new Random();
			int attack = random.nextInt(10)+1;
			int guaixue = a - attack;
			if (t == 1) {
				a = guaixue;
				if (guaixue > 0) {
					System.out.println("������˴�boss,��boss�ܵ�"+attack+"���˺�����bossѪ����ʣ" + guaixue);

				} else {
					guaixue = 0;
					System.out.println("������˴�boss,��bossѪ����ʣ0");
					System.out.print("��ϲ��ʤ����,�ɹ����ܴ�boss");
					break;
				}
			} else {

				System.out.println("�밴1������");
			}
		}
	}
}
