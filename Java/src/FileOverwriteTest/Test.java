package FileOverwriteTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		String[] files = {"123.txt", "456.txt", "789.txt"};

		for(String file_nm : files) {
			
			String file_path = findFile(file_nm);
			System.out.print(file_path + "  ###############  ");
			System.out.println(overwriteFile(file_path));
		}
	}
	
	public static String findFile(String file_nm) throws IOException {
		String filePath = "D://test//upload";
		
		File file = new File(filePath + "1//" + file_nm);
		
		int i = 1;
		
		while(!file.exists()) {
			i++;
			file = new File(filePath + i + "//" + file_nm);
		}
		
		return file.getPath();
	}
	
	public static String overwriteFile(String file_path) {
		String result = null;
		
		try {
			FileOutputStream fos = new FileOutputStream(file_path, true);
			
			String s = "파일 덮어쓰기 테스트\n";

			fos.write(s.getBytes());
			fos.close();
			
			result = "Y";
		}catch (Exception e) {
			result = "N";
		}
		
		return result;
	}
}
