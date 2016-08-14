package ba;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 *打印
 */
public class TestPrintStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;  //ps等于空
		try{
			FileOutputStream fos = new FileOutputStream("d:\\zbl\\long.txt");//new一个fos+路径
		ps = new PrintStream(fos);//在管道的外层套PrintStream
		}catch(IOException e){
			e.printStackTrace();
		}
		if(ps != null){ 
			System.setOut(ps);			
		}
		int ln = 0;//计数
		for(char c= 0;c<= 60000;c++){
			System.out.print(c+" ");
			if(ln++>=100){//ln等于100就换行 ln 等于0
				System.out.println();
				ln = 0;
			}
		}

	}

}
