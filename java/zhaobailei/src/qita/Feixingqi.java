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
		System.out.println("飞行棋");
		for (int i = 0; i < 100; i++) {
			zifu("——————————————————————————————");
			System.out.println("飞行棋第" + (i + 1) + "回合");

			for (int u = 4; u < 8; u++) {
				if (u % 4 == 0) {
					zifu("----------------------------");
					zifu("玩家一号请按数字键1摇动筛子\n按错者跳过本回合");
					int yi = Anjian();
					if (yi == 1) {
						int a = Shuiji(0);
						yihaosheng = yihao - a;
						if (yihaosheng < 0) {
							yihaosheng = yihaosheng * (-1);
							yihao = yihaosheng;
							zifu("一号玩家前进了" + a + "由于步数超出终点，");
							zifu("那么当前步行数*（-1）为正数后继续游戏");
							zifu("剩余步数为" + yihaosheng + "步");
						} else if (yihaosheng == 0) {
							zifu("一号玩家前进了" + a + "最先到达终点，一号" + "玩家获得最先的胜利，游戏结束");
							break;
						} else if (yihaosheng > 0) {
							zifu("一号玩家前进了" + a + "距离终点还剩余" + yihaosheng + "步");
							yihao = yihaosheng;
						}
						zifu("");
					} else {
						zifu("由于玩家一摇错筛子\n" + "玩家一结束本回合");
					}
				} else if (u % 4 == 1) {
					zifu("----------------------------\r" + "玩家二号请按数字键2摇动筛子\n"
							+ "按错者跳过本回合");
					int er = Anjian();
					if (er == 2) {
						int a = Shuiji(0);
						erhaosheng = erhao - a;

						if (erhaosheng < 0) {
							erhaosheng = erhaosheng * (-1);
							erhao = erhaosheng;
							zifu("二号玩家前进了" + a + "由于步数超出终点，");
							zifu("那么当前步行数*（-1）为正数后继续游戏");
							zifu("剩余步数为" + erhaosheng + "步");
						} else if (erhaosheng == 0) {
							zifu("二号玩家前进了" + a + "最先到达终点，二号" + "玩家获得最先的胜利，游戏结束");
							break;
						} else if (erhaosheng > 0) {
							zifu("二号玩家前进了" + a + "距离终点还剩余" + erhaosheng + "步");
							erhao = erhaosheng;
						}
					} else {
						zifu("由于玩家二摇错筛子\n" + "玩家二结束本回合");
					}
					zifu("");
				} /*
				 * else if (u % 4 == 2) { zifu("----------------------------\r"
				 * + "玩家三号请按数字键3摇动筛子\n" + "按错者跳过本回合"); int san = Anjian(); if
				 * (san == 3) { int a = Shuiji(0); sanhaosheng = sanhao - a;
				 * 
				 * if (sanhaosheng < 0) { sanhaosheng = sanhaosheng * (-1);
				 * sanhao = sanhaosheng; zifu("三号玩家前进了" + a + "由于步数超出终点，");
				 * zifu("那么当前步行数*（-1）为正数后继续游戏"); zifu("剩余步数为" + sanhaosheng +
				 * "步"); } else if (sanhaosheng == 0) { zifu("三号玩家前进了" + a +
				 * "最先到达终点，三号" + "玩家获得最先的胜利，游戏结束"); break; } else if
				 * (sanhaosheng > 0) { zifu("三号玩家前进了" + a + "距离终点还剩余" +
				 * sanhaosheng + "步"); sanhao = sanhaosheng; } } else {
				 * zifu("由于玩家三摇错筛子\n" + "玩家三结束本回合");
				 * 
				 * } zifu(""); }/*else if (u % 4 == 3) {
				 * zifu("----------------------------\r" + "玩家四号请按数字键4摇动筛子\n" +
				 * "按错者跳过本回合"); int si = Anjian(); if (si == 4) { int a =
				 * Shuiji(0); sihaosheng = sihao - a;
				 * 
				 * if (sihaosheng < 0) { sihaosheng = sihaosheng * (-1); sihao =
				 * sihaosheng; zifu("四号玩家前进了" + a + "由于步数超出终点，");
				 * zifu("那么当前步行数*（-1）为正数后继续游戏"); zifu("剩余步数为" + sihaosheng +
				 * "步"); } else if (sihaosheng == 0) { zifu("四号玩家前进了" + a +
				 * "最先到达终点，四号" + "玩家获得最先的胜利，游戏结束"); break; } else if (sihaosheng
				 * > 0) { zifu("四号玩家前进了" + a + "距离终点还剩余" + sihaosheng + "步");
				 * sihao = sihaosheng; } } else { zifu("由于玩家四摇错筛子\n" +
				 * "玩家四结束本回合");
				 * 
				 * } zifu(""); }
				 */

			}
			zifu("本回合结束\n\n");

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
