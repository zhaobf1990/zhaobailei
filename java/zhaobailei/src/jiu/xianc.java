package jiu;

public class xianc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
		for(int i = 0;i<100;i++){
			System.out.println(i);
		}
	}

}
class Runner1  implements Runnable{
	public void run(){
		for(int i = 0;i<100;i++){
			System.out.println("~~~~~"+i);
		}
	}
}
