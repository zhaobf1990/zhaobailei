package fangfa;

import java.util.ArrayList;
import java.util.List;

public class AArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		for(int i = 0;i<list.size();i++){
			/*Object o = list.get(i);
			if(o instanceof String ){
				String s = (String)o;
				System.out.println(s.toUpperCase());
				}*/
			String s = (String) list.get(i);
			System.out.println(s.toUpperCase());
			}
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
		List.add("one");// ����
		List.add(1);
		List.add("two");
		List.add("two");
		List.add("true");
		List.add("two");
		List.add(null);
		List.add("two");
		List.add(1, "firat");// ��1λ�ò���

	/*	for (int i = 0; i < List.size(); i++) {// size ����
			System.out.print(List.get(i) + " ");// gei����ָ������
		}
		System.out.println();
		System.out.println(List.set(1, "second"));// set���ص�ǰ�������滻
		for (int i = 0; i < List.size(); i++) {
			System.out.print(List.get(i) + " ");
		}
		System.out.println();

		List.remove("two");//ɾ��two
		for(int i = 0;i<List.size();i++){
		
			System.out.print(List.get(i)+" ");
		}
		System.out.println();
		List.remove(new Integer(1));//new Int��װ��ɾ������1
		for(int i = 0;i<List.size();i++){
			System.out.print(List.get(i)+" ");
		}*/
		for(int  i=0;i<List.size();i++){
		List.remove("two");
		System.out.print(List.get(i)+" ");

		}
			
		
	}

}