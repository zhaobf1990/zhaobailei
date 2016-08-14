package fangfa;

public class Testlianxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "<name>赵佰枫</name><data>我是数据我是数据wtwtwewwrw我是数据</data><sex>男</sex>";
		String b = "<name>赵佰磊</name><data>r23t23tgrg34tgwerf2f32trf23</data><sex>男</sex>";
		
		A(a);
		A(b);
	}
	public static void A(String a ) {
		String c1 = "<data>";
		int c =a.indexOf(c1);	
		int d =a.indexOf("</data>", c);
		System.out.println(a.substring(c+c1.length(), d));
	}

}
