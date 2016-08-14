package qita;

import java.util.Random;
import java.util.Scanner;

public class You3 {
	public static void main(String[] args) {
		System.out.println("欢迎来到未来");
		System.out.println("你发现一只BOSS,血量100,请使用快捷键攻击他");
		System.out.println("按数字键1建使用普通攻击");
		System.out.println("按数字键2使用大鹏展翅攻击");
		System.out.println("按数字键3使用飞龙在天攻击");
		System.out.println("按数字键4使用如来神掌攻击");
		String[] jineng = { "普通攻击", "大鹏展翅", "飞龙在天", "如来神掌" };
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
						System.out.println("你使用了" + jineng[t - 1]
								+ "攻击大boss,大boss受到" + attack + "点伤害，大boss血量还剩"
								+ guaixue);
					} 
					if (t == 4) {
						rxue = b+=1;
						System.out.println("boSS眩晕了");
						System.out.println("Boss未攻击你还剩血量" + rxue + "点");
						continue;
					}

					if (rxue > 0) {
						System.out.println("大boss对你进行了反击造成了" + attack1
								+ "点伤害你还剩血量" + rxue + "点");

					} else if (rxue < 0) {
						rxue = 0;
						System.out.println("很遗憾 你的血量为0 你被大boss 击败了");
						break;
					}

				} else {
					guaixue = 0;
					System.out.println("你击中了大boss,大boss血量还剩0");
					System.out.print("恭喜你胜利了,成功击败大boss");
					break;
				}

			} else {

				System.out.println("请按1建攻击");
			}
		}
	}
}
