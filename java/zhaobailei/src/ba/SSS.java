package ba;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 0;
		
		FileReader in = null;
		try {
			in = new FileReader("D:\\Workspaces\\MyEclipse 2015 CI\\zhaobailei\\src\\ba\\TestFileInputStream.java");
		}catch (FileNotFoundException e ){
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}
		
		try{
			long num = 0;
			while ((b = in.read()) !=-1 ){
				System.out.print((char)b);
				num++;
			}
			in.close();
			System.out.println();
			System.out.println("����ȡ��"+num+ "���ֽ�");
		} catch(IOException e1) {
			System.out.println("�ļ���ȡ����");
			System.exit(-1);
		}
	}

}
