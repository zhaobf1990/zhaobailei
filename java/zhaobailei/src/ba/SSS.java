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
			System.out.println("找不到指定文件");
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
			System.out.println("共读取了"+num+ "个字节");
		} catch(IOException e1) {
			System.out.println("文件读取错误");
			System.exit(-1);
		}
	}

}
