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
	/*	System.out.println(s.charAt(10));//�����ַ����е�10����		
		System.out.println(s.toUpperCase());//�����д
		System.out.println(s.toLowerCase());//���Сд
		System.out.println(s.length());//����ַ����ĳ���
		System.out.println(s.substring(54));//����ַ�����55λ�������
		System.out.println(s.substring(20, 30));//����ַ�����20λ����30λ�����ַ�
		System.out.println(s.endsWith("d"));//�Ƿ���d��β
		System.out.println(s.startsWith("t"));//�Ƿ���t��ͷ
		System.out.println(s.trim());//ȥ��ͷβ�Ŀո�
		System.out.println(s.indexOf("t"));//�����ַ�����t��λ��
		System.out.println(s.indexOf("t",3));//�����ַ�����3λ������t��λ��
		System.out.println(s.equalsIgnoreCase("  this  "));//�Ƚ��ַ����Ƿ�һ����
		System.out.println(s.replace('2', '1'));//���ַ�������A�ַ��滻B�ַ�
		int j = 1234567;
		String d = String.valueOf(j);//��int����ת���ַ���
		System.out.println(d.length());//���int�����ַ����ĳ���
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
