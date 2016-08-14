package fangfa1;

import java.util.ArrayList;

public class SSSS {
	public static void main(String[] args) {
		/*
		 * String s = "abc,efj,hij"; String[] a = s.split(","); for (int i = 0;
		 * i < a.length; i++) { System.out.println(a[i]); ArrayList List = new
		 * ArrayList(); List.add(1); List.add(2); List.add(3); Int32[] values =
		 * (Int32[])List.Toarray(typeof(Int32));
		 * 
		 * 
		 * }
		 */
		ArrayList List = new ArrayList();
		List.add("one");// 增加
		List.add(1);
		List.add("two");
		List.add("two");
		List.add("true");
		List.add("two");
		List.add(null);
		List.add("two");
		List.add(1, "firat");// 在1位置插入

	/*	for (int i = 0; i < List.size(); i++) {// size 长度
			System.out.print(List.get(i) + " ");// gei返回指定的数
		}
		System.out.println();
		System.out.println(List.set(1, "second"));// set返回当前的数并替换
		for (int i = 0; i < List.size(); i++) {
			System.out.print(List.get(i) + " ");
		}
		System.out.println();

		List.remove("two");//删除two
		for(int i = 0;i<List.size();i++){
		
			System.out.print(List.get(i)+" ");
		}
		System.out.println();
		List.remove(new Integer(1));//删除数字1
		for(int i = 0;i<List.size();i++){
			System.out.print(List.get(i)+" ");
		}*/
		for(int  i=0;i<List.size();i++){
		List.remove("two");
		System.out.print(List.get(i)+" ");

		}
	}

}
