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
		     * 功能说明：加法运算
		     */
		    public int add(int a, int b) {  //这个是方法 
		        int c = a + b;
		        return c;
		    }
		    /**
		     * 功能说明：减法运算
		     */
		    public int minutes(int a, int b) {//这个是方法 
		        int c = a - b;
		        return c;
		    }
		    /**
		     * 功能说明：乘法运算
		     */
		    public int mul(int a, int b) {//这个是方法 
		        int c = a * b;
		        return c;
		    }
		    /**
		     * 功能说明：除法运算
		     */
		    public float division(int a, int b) {//这个是方法 
		        float c = (float)a / b;
		        return c;    //return 是返回的意思 
		    }
		}
