package ba;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 *��ӡ
 */
public class TestPrintStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;  //ps���ڿ�
		try{
			FileOutputStream fos = new FileOutputStream("d:\\zbl\\long.txt");//newһ��fos+·��
		ps = new PrintStream(fos);//�ڹܵ��������PrintStream
		}catch(IOException e){
			e.printStackTrace();
		}
		if(ps != null){ 
			System.setOut(ps);			
		}
		int ln = 0;//����
		for(char c= 0;c<= 60000;c++){
			System.out.print(c+" ");
			if(ln++>=100){//ln����100�ͻ��� ln ����0
				System.out.println();
				ln = 0;
			}
		}

	}

}
