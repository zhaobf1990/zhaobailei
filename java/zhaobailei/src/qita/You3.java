package qita;

import java.util.Random;
import java.util.Scanner;

public class You3 {
	public static void main(String[] args) {
		System.out.println("��ӭ����δ��");
		System.out.println("�㷢��һֻBOSS,Ѫ��100,��ʹ�ÿ�ݼ�������");
		System.out.println("�����ּ�1��ʹ����ͨ����");
		System.out.println("�����ּ�2ʹ�ô���չ�ṥ��");
		System.out.println("�����ּ�3ʹ�÷������칥��");
		System.out.println("�����ּ�4ʹ���������ƹ���");
		String[] jineng = { "��ͨ����", "����չ��", "��������", "��������" };
		int a = 1000;
		int b = 20;
		for (;;) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			Random random = new Random();
			int attack = (random.nextInt(10) + 1) * t;
			int guaixue = a - attack;
			int attack1 = random.nextInt(10) + 1;
			// int rxue = b - attack1;
			int rxue = b-=1;
		
			if (t == 1 || t == 2 || t == 3 || t == 4) {
				a = guaixue;
				b = rxue;
				if (guaixue > 0) {
					if (t > 0) {
						System.out.println("��ʹ����" + jineng[t - 1]
								+ "������boss,��boss�ܵ�" + attack + "���˺�����bossѪ����ʣ"
								+ guaixue);
					} 
					if (t == 4) {
						rxue = b+=1;
						System.out.println("boSSѣ����");
						System.out.println("Bossδ�����㻹ʣѪ��" + rxue + "��");
						continue;
					}

					if (rxue > 0) {
						System.out.println("��boss��������˷��������" + attack1
								+ "���˺��㻹ʣѪ��" + rxue + "��");

					} else if (rxue < 0) {
						rxue = 0;
						System.out.println("���ź� ���Ѫ��Ϊ0 �㱻��boss ������");
						break;
					}

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
