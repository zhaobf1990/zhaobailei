package zhaobailei;

public class as {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AA a = new AA();
	a.add(4, 4);
		System.out.print(a.add(4, 4));
		
	}

} 


		class AA { 
		    /**
		     * ����˵�����ӷ�����
		     */
		    public int add(int a, int b) {  //����Ƿ��� 
		        int c = a + b;
		        return c;
		    }
		    /**
		     * ����˵������������
		     */
		    public int minutes(int a, int b) {//����Ƿ��� 
		        int c = a - b;
		        return c;
		    }
		    /**
		     * ����˵�����˷�����
		     */
		    public int mul(int a, int b) {//����Ƿ��� 
		        int c = a * b;
		        return c;
		    }
		    /**
		     * ����˵������������
		     */
		    public float division(int a, int b) {//����Ƿ��� 
		        float c = (float)a / b;
		        return c;    //return �Ƿ��ص���˼ 
		    }
		}
