package Integet;

public class IiInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer  i = new Integer(100);
		Double d = new Double("123.456");
		int j = i.intValue()+d.intValue();
		System.out.println(j);
		System.out.println(i.MAX_VALUE);//int类型最大数
		System.out.println(i.MIN_VALUE);//int类型最小数
		System.out.println(i.parseInt("5"));//
		System.out.println(i.valueOf("0"));

	}

}
