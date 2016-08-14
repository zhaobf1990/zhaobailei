package fangfa;

public class SString {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "  this 123456789s JSHFDSUOI a demo of the getChars method"  ;
	/*	System.out.println(s.charAt(10));//返回字符串中第10个数		
		System.out.println(s.toUpperCase());//输出大写
		System.out.println(s.toLowerCase());//输出小写
		System.out.println(s.length());//输出字符串的长度
		System.out.println(s.substring(54));//输出字符串第55位后面的数
		System.out.println(s.substring(20, 30));//输出字符串第20位数到30位数的字符
		System.out.println(s.endsWith("d"));//是否以d结尾
		System.out.println(s.startsWith("t"));//是否以t开头
		System.out.println(s.trim());//去掉头尾的空格
		System.out.println(s.indexOf("t"));//返回字符串中t的位置
		System.out.println(s.indexOf("t",3));//返回字符串第3位数后面t的位置
		System.out.println(s.equalsIgnoreCase("  this  "));//比较字符串是否一样；
		System.out.println(s.replace('2', '1'));//在字符串中用A字符替换B字符
		int j = 1234567;
		String d = String.valueOf(j);//吧int类型转出字符串
		System.out.println(d.length());//输出int类型字符串的长度
		String z= "mart,f,1976";
		String[] a = z.split(",");
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();*/
		System.out.println(s.trim());
		System.out.println(s.charAt(10));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.substring(30));
		System.out.println(s.substring(30,50));
		System.out.println(s.endsWith("d"));
		System.out.println(s.startsWith(" "));
		System.out.println(s.indexOf("t"));
	}
}
