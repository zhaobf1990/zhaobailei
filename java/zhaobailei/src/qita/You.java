package qita;

import java.util.Scanner;

import javax.swing.InputMap;

public class You {
	public static void main(String[] aegs) {
		System.out.println("欢迎来到未来");
		
		int z = 10-1;
		System.out.println("你发现一只BOSS,血量10，按数字键1击败他");
		for (int i = 0; i < 999; i++) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			if (t == 1) {				
				int q = z;
				z--;
				System.out.println("你击中了大boss,大boss血量还剩" + q);

				if (q == 0) {
					System.out.print("恭喜你胜利了");
					break;
				}
			} else {
				System.out.println("攻击无效");
			}
		}

	}
}
