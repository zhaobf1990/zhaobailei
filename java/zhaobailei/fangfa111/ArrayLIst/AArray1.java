package ArrayLIst;

import java.util.ArrayList;

public class AArray1 {
	public static void main(String[] args){
		ArrayList a =new ArrayList();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add(2,"d");//��ӵ���2���ַ�����
		a.add("c");
		a.add("a");
		
	
		System.out.println(a.contains("b"));//�Ƿ����ַ���b
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("c"));//�����ַ���c��λ�ã�û���߷���-1
		System.out.println(a.remove(1));//ɾ��1λ���ϵ���
		System.out.println(a.remove("c"));//ɾ��c���ֵĵ�һ��λ�õ���
		System.out.println(a.set(0, "e"));//�滻
		
		
		System.out.println("~~~~~~~~~~~~~~~");
		for(int i = 0; i<a.size();i++){
			System.out.println(a.get(i));//get()��������ָ��λ���ϵ���
		}
	}

}
