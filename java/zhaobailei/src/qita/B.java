package qita;

import java.util.Arrays;
import java.util.Scanner;

public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("������༶����");
				int o =s.nextInt();;
		String[] a = new String[o];
		String[] aa = new String[o];
		for (int i = 0; i < a.length; i++) {
			System.out.println("������ѧ������");
			String name = s.nextLine();
			a[i]  = name;
			System.out.println("������ѧ��ѧ��");
			String xuehao = s.nextLine();

			aa[i]  = xuehao;
			
			
		}
		String name = s.nextLine();
		print(Arrays.toString(a));
		print(Arrays.toString(aa));
		for (int i = 0; i < a.length; i++) {
			if(a[i].equals( name)){
				System.out.println(aa[i]);
				break;
			}
		}

	}

	/**
	 * ��ӡ
	 * 
	 * @param c
	 */
	public static void print(String c) {
		System.out.println(c);
	}

}
