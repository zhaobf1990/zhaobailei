package qita;

import java.util.Scanner;

public class You1 {
	public static void main(String[] args){
System.out.println("欢迎来到未来");		
		int z = 10;
		System.out.println("你发现一只BOSS,血量10，按数字键1击败他");
		for (int i = 10; i >0; i--) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			if (t == 1) {				
				
				System.out.println("你击中了大boss,大boss血量还剩" + (i-1));

				if (i-1== 0) {
					System.out.print("恭喜你胜利了");
					
				}
			} else {
				i++;
				System.out.println("请按1建攻击");
			}
		}

	}

}
