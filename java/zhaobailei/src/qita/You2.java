package qita;

import java.util.Random;
import java.util.Scanner;

public class You2 {
	// private static final String RandomTools = null;

	public static void main(String[] args) {
		System.out.println("欢迎来到未来");
		System.out.println("你发现一只BOSS,血量100，按数字键1击败他");
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
					System.out.println("你击中了大boss,大boss受到"+attack+"点伤害，大boss血量还剩" + guaixue);

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
