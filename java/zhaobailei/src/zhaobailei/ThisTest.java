package zhaobailei;

public class ThisTest {	
	    private int i=0;
	    //��һ������������һ��int���β�
	    ThisTest(int i){
	       this.i=i+1;//��ʱthis��ʾ���ó�Ա�����飬���Ǻ���������
	       System.out.println("Int constructor i����this.i:  "+i+"����"+this.i);
	       System.out.println("i-1:"+(i-1)+"this.i+1:"+(this.i+1));
	       //���������������֤����i��this.i�ǲ�һ���ģ�
	    }
	    //  �ڶ�������������һ��String���β�
//	    ThisTest(String s){
//	       System.out.println("String constructor:  "+s);
	    }
	    //  ����������������һ��int���βκ�һ��String���β�
//	    ThisTest(int i,String s){
//	       this(s);//this���õڶ���������
//	       //this(i);
//	      
//	       this.i=i++;//this�����ø���ĳ�Ա����
//	       System.out.println("Int constructor:  "+i+"/n"+"String constructor:  "+s);
//	    }
	    public ThisTest increment(){
	       this.i++;
	       return this;//���ص��ǵ�ǰ�Ķ��󣬸ö������ڣ�ThisTest��
	    }
	    public static void main(String[] args){
	       ThisTest tt0=new ThisTest(10);
//	       ThisTest tt1=new ThisTest("ok");
//	       ThisTest tt2=new ThisTest(20,"ok again!");
	      
	       System.out.println(tt0.increment());
	       //tt0.increment()����һ����tt0�����ϣ�++��ThisTest����
	       //�����ַ��������淵�صĶ��������i++��ThisTest����
	    }
	}

