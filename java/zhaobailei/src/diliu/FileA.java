package diliu;

import java.io.File;
import java.io.IOException;

public class FileA {
	public static void main(String[] ages){
		String separator = File.separator;
		String filename = "myfile.t.t";
		String directory  = " mydir1"+ separator + "mtdir2";
		File f = new File(directory, filename);
		if(f.exists()){
			System.out.print("�ļ�����"+f.getAbsolutePath());	
			System.out.print("�ļ���С��" + f.length());
		}else{
			f.getParentFile().mkdirs();
			try{
				f.createNewFile();
				
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
