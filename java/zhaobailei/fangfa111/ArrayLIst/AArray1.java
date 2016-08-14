package ArrayLIst;

import java.util.ArrayList;

public class AArray1 {
	public static void main(String[] args){
		ArrayList a =new ArrayList();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add(2,"d");//添加到第2个字符后面
		a.add("c");
		a.add("a");
		
	
		System.out.println(a.contains("b"));//是否有字符串b
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("c"));//返回字符串c的位置，没有者返回-1
		System.out.println(a.remove(1));//删除1位置上的数
		System.out.println(a.remove("c"));//删除c出现的第一个位置的数
		System.out.println(a.set(0, "e"));//替换
		
		
		System.out.println("~~~~~~~~~~~~~~~");
		for(int i = 0; i<a.size();i++){
			System.out.println(a.get(i));//get()方法返回指定位置上的数
		}
	}

}
