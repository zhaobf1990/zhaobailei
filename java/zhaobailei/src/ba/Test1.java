package ba;

public class Test1 {
	public static void main(String[] args){
		Runner1 r = new Runner1();//new一个对象 
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i<100;i++){
			System.out.println("!!!!!!!!"+i);
		}
		
	}

}

/**
 * @author 多线程
 *
 */
class Runner1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<100;i++){
			System.out.println(i);
		}
	}
	
}