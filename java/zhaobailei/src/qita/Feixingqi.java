package qita;

import java.util.Random;
import java.util.Scanner;

public class Feixingqi {
	static int yihao = 20;
	static int erhao = 20;
	static int sanhao = 20;
	static int sihao = 20;
	static int yihaosheng = -1;
	static int erhaosheng = -1;
	static int sanhaosheng = -1;
	static int sihaosheng = -1;

	public static void main(String[] aegs) {
		System.out.println("������");
		for (int i = 0; i < 100; i++) {
			zifu("������������������������������������������������������������");
			System.out.println("�������" + (i + 1) + "�غ�");

			for (int u = 4; u < 8; u++) {
				if (u % 4 == 0) {
					zifu("----------------------------");
					zifu("���һ���밴���ּ�1ҡ��ɸ��\n�������������غ�");
					int yi = Anjian();
					if (yi == 1) {
						int a = Shuiji(0);
						yihaosheng = yihao - a;
						if (yihaosheng < 0) {
							yihaosheng = yihaosheng * (-1);
							yihao = yihaosheng;
							zifu("һ�����ǰ����" + a + "���ڲ��������յ㣬");
							zifu("��ô��ǰ������*��-1��Ϊ�����������Ϸ");
							zifu("ʣ�ಽ��Ϊ" + yihaosheng + "��");
						} else if (yihaosheng == 0) {
							zifu("һ�����ǰ����" + a + "���ȵ����յ㣬һ��" + "��һ�����ȵ�ʤ������Ϸ����");
							break;
						} else if (yihaosheng > 0) {
							zifu("һ�����ǰ����" + a + "�����յ㻹ʣ��" + yihaosheng + "��");
							yihao = yihaosheng;
						}
						zifu("");
					} else {
						zifu("�������һҡ��ɸ��\n" + "���һ�������غ�");
					}
				} else if (u % 4 == 1) {
					zifu("----------------------------\r" + "��Ҷ����밴���ּ�2ҡ��ɸ��\n"
							+ "�������������غ�");
					int er = Anjian();
					if (er == 2) {
						int a = Shuiji(0);
						erhaosheng = erhao - a;

						if (erhaosheng < 0) {
							erhaosheng = erhaosheng * (-1);
							erhao = erhaosheng;
							zifu("�������ǰ����" + a + "���ڲ��������յ㣬");
							zifu("��ô��ǰ������*��-1��Ϊ�����������Ϸ");
							zifu("ʣ�ಽ��Ϊ" + erhaosheng + "��");
						} else if (erhaosheng == 0) {
							zifu("�������ǰ����" + a + "���ȵ����յ㣬����" + "��һ�����ȵ�ʤ������Ϸ����");
							break;
						} else if (erhaosheng > 0) {
							zifu("�������ǰ����" + a + "�����յ㻹ʣ��" + erhaosheng + "��");
							erhao = erhaosheng;
						}
					} else {
						zifu("������Ҷ�ҡ��ɸ��\n" + "��Ҷ��������غ�");
					}
					zifu("");
				} /*
				 * else if (u % 4 == 2) { zifu("----------------------------\r"
				 * + "��������밴���ּ�3ҡ��ɸ��\n" + "�������������غ�"); int san = Anjian(); if
				 * (san == 3) { int a = Shuiji(0); sanhaosheng = sanhao - a;
				 * 
				 * if (sanhaosheng < 0) { sanhaosheng = sanhaosheng * (-1);
				 * sanhao = sanhaosheng; zifu("�������ǰ����" + a + "���ڲ��������յ㣬");
				 * zifu("��ô��ǰ������*��-1��Ϊ�����������Ϸ"); zifu("ʣ�ಽ��Ϊ" + sanhaosheng +
				 * "��"); } else if (sanhaosheng == 0) { zifu("�������ǰ����" + a +
				 * "���ȵ����յ㣬����" + "��һ�����ȵ�ʤ������Ϸ����"); break; } else if
				 * (sanhaosheng > 0) { zifu("�������ǰ����" + a + "�����յ㻹ʣ��" +
				 * sanhaosheng + "��"); sanhao = sanhaosheng; } } else {
				 * zifu("���������ҡ��ɸ��\n" + "������������غ�");
				 * 
				 * } zifu(""); }/*else if (u % 4 == 3) {
				 * zifu("----------------------------\r" + "����ĺ��밴���ּ�4ҡ��ɸ��\n" +
				 * "�������������غ�"); int si = Anjian(); if (si == 4) { int a =
				 * Shuiji(0); sihaosheng = sihao - a;
				 * 
				 * if (sihaosheng < 0) { sihaosheng = sihaosheng * (-1); sihao =
				 * sihaosheng; zifu("�ĺ����ǰ����" + a + "���ڲ��������յ㣬");
				 * zifu("��ô��ǰ������*��-1��Ϊ�����������Ϸ"); zifu("ʣ�ಽ��Ϊ" + sihaosheng +
				 * "��"); } else if (sihaosheng == 0) { zifu("�ĺ����ǰ����" + a +
				 * "���ȵ����յ㣬�ĺ�" + "��һ�����ȵ�ʤ������Ϸ����"); break; } else if (sihaosheng
				 * > 0) { zifu("�ĺ����ǰ����" + a + "�����յ㻹ʣ��" + sihaosheng + "��");
				 * sihao = sihaosheng; } } else { zifu("���������ҡ��ɸ��\n" +
				 * "����Ľ������غ�");
				 * 
				 * } zifu(""); }
				 */

			}
			zifu("���غϽ���\n\n");

			if (yihaosheng == 0 || erhaosheng == 0 || sanhaosheng == 0 ) {
				break;
			}

		}
	}

	public static int Shuiji(int a) {
		Random random = new Random();
		int shuiji = random.nextInt(6) + 1;
		return shuiji;

	}

	public static void zifu(String a) {
		System.out.println(a);
	}

	public static int Anjian() {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		return t;
	}

	public static void yi() {

	}
}
