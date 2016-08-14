package ba;

import java.util.Date;

public class TestInterrupt {
	public static void main(String[] args ){
		MyThread thread = new MyThread();
		thread.start();
		try{thread.sleep(10000);}
		catch (InterruptedException e ){}
				
	}
}

class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("==="+new Date()+"===");
			try{
				sleep(1000);
			}catch(InterruptedException e){
				return;
			}
		}
	}
}