package fangfa1;  //这里也得改     包名变了

public class IiInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer  i = new Integer(100);
		Double d = new Double("123.456");
		int j = i.intValue()+d.intValue();
		System.out.println(j);
		System.out.println(i.MAX_VALUE);//最大值
		System.out.println(i.MIN_VALUE);//最小值
		System.out.println(i.parseInt("5"));
		System.out.println(i.valueOf("0"));

	}

}
