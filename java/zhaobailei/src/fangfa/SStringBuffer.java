package fangfa;

public class SStringBuffer {
	public static void main(String[] args){
		String s = "sfajkf";
		StringBuffer sb1 = new StringBuffer(s);
		sb1.append('1').append('2').append(3);//最后面添加
		System.out.println(sb1);
		sb1.insert(0,"a");
		System.out.println(sb1);

	}

}
